package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Mensaje_UR_creado extends Mensaje_UR {
	private Button _eliminarMensaje;
	public Lista_Mensaje_creado _unnamed_Lista_Mensaje_creado_;
	public Usuario_creador_de_mensaje _unnamed_Usuario_creador_de_mensaje_;
	iUsuario_creador_de_mensaje iUsr = new DB_Main();
	
	public Mensaje_UR_creado() {
		super();
		
		eliminarMensaje.setVisible(true);
		
		_eliminarMensaje = eliminarMensaje;
		_eliminarMensaje.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					eliminarMensaje(idM);
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});	
	}
	
	public Mensaje_UR_creado(Mensaje m) {
		// TODO Auto-generated constructor stub
		super(m);
		
		
		eliminarMensaje.setVisible(true);
		
		_eliminarMensaje = eliminarMensaje;
		_eliminarMensaje.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					eliminarMensaje(idM);
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

	public void eliminarMensaje(int idm) throws PersistentException {
		iUsr.eliminarMensajePropio(idm);
		Mensaje msj = com.mds2.foro.MensajeDAO.getMensajeByORMID(idm);
		
		Tema t =com.mds2.foro.TemaDAO.getTemaByORMID( msj.getIdTemaPropietario());
	
		Seccion sec = t.getSeccion_tema();
		
		UI.getCurrent().getNavigator().addView(sec.getTitulo()+"Usr/"+t.getTitulo(), new Usuario_registrado(new Lista_Mensaje_V_Usuario_Reg(t.getIdTema())));
	}
}