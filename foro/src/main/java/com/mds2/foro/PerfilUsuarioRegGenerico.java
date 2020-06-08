package com.mds2.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;

//import Package.Lista_Ultimo_mensaje;

public class PerfilUsuarioRegGenerico extends PerfilUsuarioRegGenerico_ventana{
	private Label _nombre;
	private Label _descripcion;
//	private Image _foto;
//	private TextField _ultimosMsg;
	private Button _anadirAmigo;
	private Button _eliminarAmigo;
	private Label _estado;
	protected Button _sancionarUsuario;
	protected Button _quitarSancion;
	protected Button _promocionarAModerador;
	protected Button _degradarAUsuarioRegistrado;
	public Lista_Ultimo_mensaje _unnamed_Lista_Ultimo_mensaje_;
	iUsuario iUsr = new DB_Main();
	
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
		
		
		_anadirAmigo.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
			
				anadirAmigo();
			}
			
		});
		
		
		_eliminarAmigo.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
			
				eliminarAmigo();
			}
			
		});
		
		
		
		
		
	}
	
	public void anadirAmigo() {
		iUsr.anadirAmigo(aIdUsuario, aIdAmigo);
	}

	public void eliminarAmigo() {
		iUsr.eliminarAmigo(aIdUsuario, aIdAmigo);
	}
}