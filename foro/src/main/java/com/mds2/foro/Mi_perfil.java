package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.navigator.View;

//import DCLv3.Lista_UsuarioReg;

import com.vaadin.ui.*;
import com.vaadin.ui.Button.ClickEvent;

public class Mi_perfil extends Mi_Perfil_ventana implements View {
	private Button _darseDeBaja;
	private Button _ocultarPerfil;
	private Button _cambiarDatos;
	private TextField _nombre;
	private TextField _contrasena;
	private TextField _descripcion;
	private Label _fotoPerfil;
	private TextField _listaNoti;
	private TextField _listaSoli;
	private TextField _listaAmi;
	private Image _foto;
	private Label _anadirAmigo;
	public Menu_UR _unnamed_Menu_UR_;
	public Lista_Notificación _notificación;
	public Lista_Amigo _amigos;
	public Lista_Solicitud _solicitud;
	public Lista_UsuarioReg _unnamed_Lista_UsuarioReg_;

	iUsuario iUsr = new DB_Main();
	
	
	public Mi_perfil() {
		_darseDeBaja = darseDeBaja;
		_ocultarPerfil = ocultarMiPerfil;
		_cambiarDatos = modificarPerfil;
		_nombre = nombreUsuarioPerfil;
		_contrasena = passwordMiPerfil;
		_descripcion = descripcionMiPerfil;
	
		
		
		
		
		
		_darseDeBaja.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					darseDeBaja();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		_cambiarDatos.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				cambiarDatos();
			}
		});
		
		buscar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("buscar");
			}
		});
		
		_ocultarPerfil.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				ocultarPerfil();
			}
		});
		
	}
	
	
	public void darseDeBaja() throws PersistentException {
		iUsr.darDeBaja(Sesion.getIDSESION());
	}

	public void ocultarPerfil() {
		iUsr.ocultarPerfil(Sesion.getIDSESION(), aPublico, aOculto);
	}

	public void cambiarDatos() {
		iUsr.cambiarDatos(Sesion.getIDSESION(), aUsername, aPassword, aDescription, aFotoURL);
	}

	public void buscarUsuario() {
		throw new UnsupportedOperationException();
	}
}