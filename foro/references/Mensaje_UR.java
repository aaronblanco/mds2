package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Mensaje_UR extends MensajeClase {
	private Button _darMeGusta;
	private Button _responder;
	private boolean _meGusta;
	private Button _notificarAdministrador;
	public Lista_Mensaje_V_Usuario_Reg _unnamed_Lista_Mensaje_V_Usuario_Reg_;
	public Lista_Ultimo_mensaje _unnamed_Lista_Ultimo_mensaje_;
	iUsuario iUsr = new DB_Main();
	iAdministrador iA = new DB_Main();
	protected int idM;
	
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
					darMeGusta(idM);
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
				try {
					notificarAdministrador();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
	}
	
	public Mensaje_UR(Mensaje me) {
		// TODO Auto-generated constructor stub
		super(me);
		idM = me.getIdMensaje();
		
		meGustaB.setVisible(true);
		
		responderMensaje.setVisible(true);
		
		notificarAdminB.setVisible(true);
		
		_darMeGusta = meGustaB;
		_responder = responderMensaje;
		_notificarAdministrador = notificarAdminB;
		

		
				
		_darMeGusta.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					darMeGusta(idM);
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
				try {
					notificarAdministrador();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		_verPerfil.addClickListener(new Button.ClickListener() {
	
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					verPerfil();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

	@Override
	public void verPerfil() throws PersistentException {
		int idSenor = idUser;
		if(Sesion.getIDSESION() != idSenor) {
			UI.getCurrent().getNavigator().addView("irPerfil", new Usuario_no_registrado(new PerfilUsuarioRegGenerico(idSenor)));
			UI.getCurrent().getNavigator().navigateTo("irPerfil");
		}else {
			UI.getCurrent().getNavigator().navigateTo("Mi perfilUsr");
		}
		
		
		
	}
	
	public void darMeGusta(int idMG) throws PersistentException {
		iUsr.darMeGustaMensaje(idMG, Sesion.getIDSESION());
	}

	public void responderMsg() {
		UI.getCurrent().getNavigator().navigateTo("responderMensaje");
	}

	public void notificarAdministrador() throws PersistentException {
		iA.notificarMensaje(idM, Sesion.getIDSESION());
	}
}