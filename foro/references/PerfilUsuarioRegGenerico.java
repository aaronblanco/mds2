package com.mds2.foro;

import java.util.List;

import org.orm.PersistentException;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;


public class PerfilUsuarioRegGenerico extends PerfilUsuarioRegGenerico_ventana{
	private Label _nombre;
	private Label _descripcion;
	private Button _anadirAmigo;
	private Button _eliminarAmigo;
	private Label _estado;
	protected Button _sancionarUsuario;
	protected Button _quitarSancion;
	protected Button _promocionarAModerador;
	protected Button _degradarAUsuarioRegistrado;
	public Lista_Ultimo_mensaje _unnamed_Lista_Ultimo_mensaje_;
	iUsuario iUsr = new DB_Main();
	protected int idU;
	
	public PerfilUsuarioRegGenerico() {
		this._nombre = userName;
		this._descripcion = description;
		this._anadirAmigo = addFriend;
		this._sancionarUsuario = sancionar;
		this._quitarSancion = eliminarSancion;
		this._degradarAUsuarioRegistrado = degradar;
		this._estado = visibilidad;
		this._promocionarAModerador = ascender;
		this._eliminarAmigo = eliminarAmigo;
		
		
		
		_anadirAmigo.setVisible(true);
		
		_sancionarUsuario.setVisible(false);
		_quitarSancion.setVisible(false);
		_degradarAUsuarioRegistrado.setVisible(false);
		_estado.setVisible(false);
		_eliminarAmigo.setVisible(false);
		
		_anadirAmigo.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
			
				try {
					anadirAmigo();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		
		_eliminarAmigo.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
			
				try {
					eliminarAmigo();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});		
		
		
	}
	
	public PerfilUsuarioRegGenerico(int idSenor) throws PersistentException {
		// TODO Auto-generated constructor stub
		this._nombre = userName;
		this._descripcion = description;
		this._anadirAmigo = addFriend;
		this._sancionarUsuario = sancionar;
		this._quitarSancion = eliminarSancion;
		this._degradarAUsuarioRegistrado = degradar;
		this._estado = visibilidad;
		this._promocionarAModerador = ascender;
		this._eliminarAmigo = eliminarAmigo;
		this.idU = idSenor;
		
		Usuarios u = com.mds2.foro.UsuariosDAO.getUsuariosByORMID(idSenor);
		
		_nombre.setValue(u.getNombre());
		_descripcion.setValue(u.getDescripcion()); 
		
		
		
		Inicializar();
		
		List<Mensaje> m = iUsr.cargarUltimoMensaje(idSenor);

		if(!m.isEmpty()) {
			for(Mensaje me : m) {
				MensajeClase mc = new MensajeClase(me);
				perfilEntero.addComponent(mc);
			}
		}
		
	}

	private void Inicializar() throws PersistentException {
		// TODO Auto-generated method stub
		if(Sesion.getIDSESION()<0) {
			_anadirAmigo.setVisible(false);
			
			_sancionarUsuario.setVisible(false);
			_quitarSancion.setVisible(false);
			_degradarAUsuarioRegistrado.setVisible(false);
			_estado.setVisible(true);
			_eliminarAmigo.setVisible(false);
		}else {
			Usuarios amijo = com.mds2.foro.UsuariosDAO.getUsuariosByORMID(idU);
			Usuarios yo = com.mds2.foro.UsuariosDAO.getUsuariosByORMID(Sesion.getIDSESION());
			_sancionarUsuario.setVisible(false);
			_quitarSancion.setVisible(false);
			_degradarAUsuarioRegistrado.setVisible(false);
			if(yo.usuariosAmigos.contains(amijo)) {
				_eliminarAmigo.setVisible(true);
				_anadirAmigo.setVisible(false);
			}else {
				_anadirAmigo.setVisible(true);
				_eliminarAmigo.setVisible(false);
			}
			
		}
		
		
		_anadirAmigo.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
			
				try {
					anadirAmigo();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		
		_eliminarAmigo.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
			
				try {
					eliminarAmigo();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		
		
	}

	public void anadirAmigo() throws PersistentException {
		iUsr.anadirAmigo(Sesion.getIDSESION(), idU);
	}

	public void eliminarAmigo() throws PersistentException {
		iUsr.eliminarAmigo(Sesion.getIDSESION(), idU);
	}
}