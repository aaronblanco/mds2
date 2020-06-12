package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.ui.*;
import com.vaadin.ui.Button.ClickEvent;

public class MensajeClase extends Mensaje_ventana implements View {
	private int _idMensaje;
	private String _foto;
	private TextField _cuerpoMsg;
	private Label _fechaPost;
	protected Button _verPerfil;
	private Listener _listaMsg;
	public Lista_Mensaje _unnamed_Lista_Mensaje_;
	iAdministrador iAd = new DB_Main();
	int idUser;
	public MensajeClase() {
		
		
		
		
		Inicializar();
		
		irPerfil.addClickListener(new Button.ClickListener() {
			
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
		
			
		_idMensaje = Integer.parseInt(getId());
		
		
	}
	
	public MensajeClase(Mensaje msj) {
		Inicializar();
		this._cuerpoMsg = contenidoMensaje;
		this._fechaPost = fechaCreacionMsg;
		this._fechaPost.setCaption("hoy"); 
		this._foto = "";
		this._verPerfil = irPerfil;
		this._verPerfil.setCaption(msj.getUsuarios().getNombreUsuario());
		this._idMensaje = msj.getIdMensaje();
		this._cuerpoMsg.setValue(msj.getContenido());
		this.meGustaB.setCaption("Me gusta: "+msj.getNumMg());
		this._verPerfil = irPerfil;
		idUser = msj.getIdPropietario();
		
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
	
	
	private void Inicializar() {
		// TODO Auto-generated method stub
		meGustaB.setVisible(false);
		
		responderMensaje.setVisible(false);
		
		eliminarMensaje.setVisible(false);
		
		irPerfil.setVisible(true);
		
		notificarAdminB.setVisible(false);
	}

	public void verPerfil() throws PersistentException {
		int idSenor = idUser;
		
		UI.getCurrent().getNavigator().addView("irPerfil", new Usuario_no_registrado(new PerfilUsuarioRegGenerico(idSenor)));
		UI.getCurrent().getNavigator().navigateTo("irPerfil");
	}
}