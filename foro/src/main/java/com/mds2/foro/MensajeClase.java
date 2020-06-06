package com.mds2.foro;

import com.vaadin.navigator.View;
import com.vaadin.ui.*;
import com.vaadin.ui.Button.ClickEvent;

public class MensajeClase extends Mensaje_ventana implements View {
//	private Image _foto;
//	private TextField _cuerpoMsg;
//	private Label _fechaPost;
//	private Button _verPerfil;
//	private Listener _listaMsg;
	public Lista_Mensaje _unnamed_Lista_Mensaje_;

	public MensajeClase() {
		
		meGustaB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("meGustaB");
			}

		});	
		
		responderMensaje.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("responderMensaje");
			}
		});	
		
		eliminarMensaje.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("eliminarMensaje");
			}
		});	
		
		irPerfil.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("irPerfil");
			}
		});	
		
		notificarAdminB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("notificarAdminB");
			}
		});	
		
		meGustaB.setVisible(false);
		
		responderMensaje.setVisible(false);
		
		eliminarMensaje.setVisible(false);
		
		irPerfil.setVisible(true);
		
		notificarAdminB.setVisible(false);
		
	}
	
	public void verPerfil() {
		throw new UnsupportedOperationException();
	}
}