package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Mensaje_UR extends MensajeClase {
	private Button _darMeGusta;
	private Button _responder;
	private boolean _meGusta;
//	private Listener _listaUltimoMsg;
//	private Listener _listaMsgVUsuarioReg;
	private Button _notificarAdministrador;
	public Lista_Mensaje_V_Usuario_Reg _unnamed_Lista_Mensaje_V_Usuario_Reg_;
	public Lista_Ultimo_mensaje _unnamed_Lista_Ultimo_mensaje_;
	iUsuario iUsr = new DB_Main();
	iAdministrador iA = new DB_Main();
	private int idM;
	
	public Mensaje_UR() {
		super();
		
		_darMeGusta = meGustaB;
		_responder = responderMensaje;
		_notificarAdministrador = notificarAdminB;
		
		meGustaB.setVisible(true);
		
		responderMensaje.setVisible(true);
		
		notificarAdminB.setVisible(true);
		
		
		
		_darMeGusta.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					darMeGusta();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});	
		
		_responder.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				responderMsg();
			}
		});	
		
		_notificarAdministrador.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				notificarAdministrador();
			}
		});
		
	}
	
	public Mensaje_UR(Mensaje me) {
		// TODO Auto-generated constructor stub
		super(me);
		idM = me.getIdMensaje();
		_darMeGusta = meGustaB;
		_responder = responderMensaje;
		_notificarAdministrador = notificarAdminB;
		
		meGustaB.setVisible(true);
		
		responderMensaje.setVisible(true);
		
		notificarAdminB.setVisible(true);
				
		_darMeGusta.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					darMeGusta();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});	
		
		_responder.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				responderMsg();
			}
		});	
		
		
		_notificarAdministrador.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				notificarAdministrador();
			}
		});
	}

	public void darMeGusta() throws PersistentException {
		iUsr.darMeGustaMensaje(idM, Sesion.getIDSESION());
	}

	public void responderMsg() {
		UI.getCurrent().getNavigator().navigateTo("responderMensaje");
	}

	public void notificarAdministrador() {
		iA.notificarMensaje(idM, Sesion.getIDSESION());
	}
}