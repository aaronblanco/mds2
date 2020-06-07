package com.mds2.foro;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.TextField;

public class Iniciar_sesión extends Iniciar_sesion_ventana implements View{
	private String _nombreUsuario;
	private String _contrasena;
//	private Button _recordar;
//	private Button _registrarse;
//	private Button _iniciarSesion;
	
	public Menu_UNR _unnamed_Menu_UNR_;
	public Recuperar_contrasena _recuperar_contraseña;

	iUsuario iUsr = new DB_Main();
	
	public Iniciar_sesión() {
		this._nombreUsuario = userName.toString();
		this._contrasena = password.toString();
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
				UI.getCurrent().getNavigator().navigateTo("Registrarse");
			}
		});	
		
		iniSesion.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				iniciarSesion();
			}
		});	
		
	}
	
	public void recordar() {
		throw new UnsupportedOperationException();
	}

	public void iniciarSesion() {
		
		int idU = iUsr.iniciarSesion(_nombreUsuario, _contrasena);
		
	}

	public void registrarse() {
		throw new UnsupportedOperationException();
	}
}