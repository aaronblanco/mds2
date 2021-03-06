package com.mds2.foro;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.orm.PersistentException;

import com.vaadin.data.Binder;
import com.vaadin.data.HasValue.ValueChangeEvent;
import com.vaadin.data.validator.StringLengthValidator;
import com.vaadin.navigator.View;
import com.vaadin.server.FileResource;
import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Upload;
import com.vaadin.ui.Upload.SucceededEvent;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.Image;
import com.vaadin.ui.Notification;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;

public class Registrarse extends Registrarse_ventana implements View {
	private TextField _nombreUser;
	private PasswordField _contrasena;
	private TextField _correoElectronico;
	private TextField _nombreCompleto;
	private TextField _descripcion;
	private Button _adjuntarFotoPerfil;
	private Upload _foto;
	private Button _validarDatos;
	public Correo_electronico _unnamed_Correo_electrónico_;
	public Menu_UNR _unnamed_Menu_UNR_;
	iUsuario_no_registrado iNusr = new DB_Main();
	Binder<Registrarse> binder = new Binder<>();

	
	
	    
	public Registrarse() {
	
		
		this._nombreUser  = userNameRegistro;
		this._nombreUser.setRequiredIndicatorVisible(true);
		this._nombreUser.addValueChangeListener(e->valueChange(e));
		this._contrasena = password;
		this._contrasena.setRequiredIndicatorVisible(true);	
		this._contrasena.addValueChangeListener(e->valueChange(e));
		this._correoElectronico = emailRegistro;
		this._correoElectronico.setRequiredIndicatorVisible(true);
		this._correoElectronico.addValueChangeListener(e->valueChange(e));
		this._nombreCompleto = nombreCompleto;
		this._nombreCompleto.setRequiredIndicatorVisible(true);
		this._nombreCompleto.addValueChangeListener(e->valueChange(e));
		this._descripcion = descripcion;
		this._descripcion.setRequiredIndicatorVisible(false);
		this._validarDatos = registro;
		this._foto = uploadImage;
	
		registro.setVisible(true);
		
		_validarDatos.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				
				try {
					validar();
				System.out.println("VALIDANDO");
					registrarse();
					UI.getCurrent().getNavigator().navigateTo("Iniciar sesion");
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

				UI.getCurrent().getNavigator().navigateTo("Iniciar sesion");
				
				
			}
			
		});
		

	}
	
	public String get_nombreUser() {
		return _nombreUser.getValue();
	}

	public void set_nombreUser(String _nombreUser) {
		this._nombreUser = new TextField(_nombreUser);
	}

	public String get_contrasena() {
		return _contrasena.getValue();
	}

	public void set_contrasena(String _contrasena) {
		this._contrasena = new PasswordField(_contrasena);
	}

	public String get_correoElectronico() {
		return _correoElectronico.getValue();
	}

	public void set_correoElectronico(String _correoElectronico) {
		this._correoElectronico = new TextField(_correoElectronico);
	}

	public String get_nombreCompleto() {
		return _nombreCompleto.getValue();
	}

	public void set_nombreCompleto(String _nombreCompleto) {
		this._nombreCompleto =  new TextField(_nombreCompleto);
	}


	private void validar() {
	  binder.forField(_nombreUser)
	         .asRequired("El campo nombre de usuario no puede estar vacío")
	         .withValidator(_nombreUser -> _nombreUser.length() > 0,"Code shold be atleast 1 character long").bind(Registrarse::get_nombreUser,Registrarse::set_nombreUser);
	  
	  binder.forField(_contrasena)
      .asRequired("El campo la contraseña no puede estar vacío")
      .withValidator(_contrasena -> _contrasena.length() > 0,"Code shold be atleast 1 character long").bind(Registrarse::get_contrasena,Registrarse::set_contrasena);

	  binder.forField(_correoElectronico)
      .asRequired("El campo de correo electronico no puede estar vacío")
      .withValidator(_correoElectronico -> _correoElectronico.length() > 0,"Code shold be atleast 1 character long").bind(Registrarse::get_correoElectronico,Registrarse::set_correoElectronico);

	  binder.forField(_nombreCompleto)
      .asRequired("El campo del nombre completo no puede estar vacío")
      .withValidator(_nombreCompleto -> _nombreCompleto.length() > 0,"Code shold be atleast 1 character long").bind(Registrarse::get_nombreCompleto,Registrarse::set_nombreCompleto);
	  binder.validate();
	
	}
	private void valueChange(ValueChangeEvent<String> e) {
        
  
         binder.validate();
    }
	
	public void registrarse() throws PersistentException {
		
		

		if(iNusr.registrarse(_nombreUser.getValue(), _nombreCompleto.getValue(), _contrasena.getValue(), _descripcion.getValue(), _correoElectronico.getValue(), ""))
		Notification.show("Usuario registrado correctamente.");
	}


}