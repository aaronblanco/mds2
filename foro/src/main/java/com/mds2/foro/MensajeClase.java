package com.mds2.foro;

import com.vaadin.navigator.View;
import com.vaadin.ui.*;
import com.vaadin.ui.Button.ClickEvent;

public class MensajeClase extends Mensaje_ventana implements View {
	private int idMensaje;
	private Image _foto;
	private TextField _cuerpoMsg;
	private Label _fechaPost;
	private Button _verPerfil;
	private Listener _listaMsg;
	public Lista_Mensaje _unnamed_Lista_Mensaje_;
	iAdministrador iAd = new DB_Main();
	
	public MensajeClase() {
		
		this._foto = fotoPerfil;
		this._cuerpoMsg = contenidoMensaje;
		this._fechaPost = fechaCreacionMsg;
		this._verPerfil = irPerfil;
		 
		
		
		Inicializar();
		
		irPerfil.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				verPerfil();
			}
		});	
		
			
		idMensaje = Integer.parseInt(getId());
		
		
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