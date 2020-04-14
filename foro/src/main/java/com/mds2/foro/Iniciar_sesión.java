package com.mds2.foro;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Iniciar_sesión extends Iniciar_sesion_ventana implements View{
//	private TextField _nombreUsuario;
//	private TextField _contrasena;
//	private Button _recordar;
//	private Button _registrarse;
//	private Button _iniciarSesion;
	
	public Menu_UNR _unnamed_Menu_UNR_;
	public Recuperar_contrasena _recuperar_contraseña;

	public Iniciar_sesión() {
		
		recordarPassw.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("recordarPassw");
			}
		});	
		
		registrars.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("registrars");
			}
		});	
		
		iniSesion.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("iniSesion");
			}
		});	
		
	}
	
	public void recordar() {
		throw new UnsupportedOperationException();
	}

	public void iniciarSesion() {
		throw new UnsupportedOperationException();
	}

	public void registrarse() {
		throw new UnsupportedOperationException();
	}
}