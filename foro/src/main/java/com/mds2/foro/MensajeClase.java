package com.mds2.foro;

import com.vaadin.navigator.View;
import com.vaadin.ui.*;
import com.vaadin.ui.Button.ClickEvent;

public class MensajeClase extends Mensaje_ventana implements View {
	private int _idMensaje;
	private String _foto;
	private TextField _cuerpoMsg;
	private Label _fechaPost;
	private Button _verPerfil;
	private Listener _listaMsg;
	public Lista_Mensaje _unnamed_Lista_Mensaje_;
	iAdministrador iAd = new DB_Main();
	
	public MensajeClase() {
		
		
		
		
		Inicializar();
		
		irPerfil.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				verPerfil();
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
		
		
		
	}
	
	
	private void Inicializar() {
		// TODO Auto-generated method stub
		meGustaB.setVisible(false);
		
		responderMensaje.setVisible(false);
		
		eliminarMensaje.setVisible(false);
		
		irPerfil.setVisible(true);
		
		notificarAdminB.setVisible(false);
	}

	public void verPerfil() {
		UI.getCurrent().getNavigator().navigateTo("irPerfil");
	}
}