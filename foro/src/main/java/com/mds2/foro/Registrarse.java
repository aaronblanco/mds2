package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Image;
import com.vaadin.ui.TextField;

public class Registrarse extends Registrarse_ventana implements View {
	private TextField _nombreUser;
	private TextField _contrasena;
	private TextField _correoElectronico;
	private TextField _nombreCompleto;
	private TextField _descripcion;
	private Button _adjuntarFotoPerfil;
	private String _foto;
	private Button _validarDatos;
	public Correo_electrónico _unnamed_Correo_electrónico_;
	public Menu_UNR _unnamed_Menu_UNR_;

	iUsuario_no_registrado iNusr = new DB_Main();
	
	
	public Registrarse() {
		this._nombreUser  = userNameRegistro;
		this._contrasena = password;
		this._correoElectronico = emailRegistro;
		this._nombreCompleto = nombreCompleto;
		this._descripcion = descripcion;
		this._validarDatos = registro;
		this._foto = "";
		
		
		
		registro.setVisible(true);
		
		_validarDatos.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					registrarse();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});	
		
		enlaceIniciarSesion.addStyleName("link");
		enlaceIniciarSesion.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub

				UI.getCurrent().getNavigator().navigateTo("Iniciar sesión");
				
				
			}
			
		});
		

	}
	public void registrarse() throws PersistentException {
		iNusr.registrarse(_nombreUser.toString(), _nombreCompleto.toString(), _contrasena.toString(), _descripcion.toString(), _correoElectronico.toString(), _foto.toString());
	}

	public void adjuntarFotoPerfil() {
		throw new UnsupportedOperationException();
	}
}