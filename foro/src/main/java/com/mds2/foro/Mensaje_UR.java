package com.mds2.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Mensaje_UR extends MensajeClase {
//	private Button _darMeGusta;
//	private Button _responder;
	private boolean _meGusta;
//	private Listener _listaUltimoMsg;
//	private Listener _listaMsgVUsuarioReg;
//	private Button _notificarAdministrador;
	public Lista_Mensaje_V_Usuario_Reg _unnamed_Lista_Mensaje_V_Usuario_Reg_;
	public Lista_Ultimo_mensaje _unnamed_Lista_Ultimo_mensaje_;
	//public Escribir_mensaje _escribir_mensaje;
	//public Interactuar_mensaje _interactuar_mensaje;
	iUsuario iUsr = new DB_Main();
	iAdministrador iA = new DB_Main();
	
	public Mensaje_UR() {
		super();
		
		
		
		meGustaB.setVisible(true);
		
		responderMensaje.setVisible(true);
		
		notificarAdminB.setVisible(true);
		
		
		meGustaB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				darMeGusta();
			}

		});	
		
		responderMensaje.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				responderMsg();
			}
		});	
		
		
		notificarAdminB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				notificarAdministrador();
			}
		});
		
	}
	
	public void darMeGusta() {
		iUsr.darMeGustaMensaje(this.getId(), aIdUser);
	}

	public void responderMsg() {
		UI.getCurrent().getNavigator().navigateTo("responderMensaje");
	}

	public void notificarAdministrador() {
		iA.notificarMensaje(this.getId(), aIdUSer);
	}
}