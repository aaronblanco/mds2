package com.mds2.foro;

//import DCLv3.Lista_UsuarioReg;

import com.vaadin.ui.*;
import com.vaadin.ui.Button.ClickEvent;

public class Mi_perfil extends Mi_Perfil_ventana{
//	private Button _darseDeBaja;
//	private Button _ocultarPerfil;
//	private Button _cambiarDatos;
//	private Label _nombre;
//	private Label _contrasena;
//	private Label _descripcion;
//	private Label _fotoPerfil;
//	private Label _listaNoti;
//	private Label _listaSoli;
//	private Label _listaAmi;
//	private Image _foto;
//	private Label _anadirAmigo;
	public Menu_UR _unnamed_Menu_UR_;
	public Lista_Notificación _notificación;
	public Lista_Amigo _amigos;
	public Lista_Solicitud _solicitud;
	public Lista_UsuarioReg _unnamed_Lista_UsuarioReg_;

	public Mi_perfil() {
		
		darseDeBaja.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("darseDeBaja");
			}
		});
		
		modificarPerfil.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("modificarPerfil");
			}
		});
		
		buscar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("buscar");
			}
		});
		
		ocultarMiPerfil.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("ocultarMiPerfil");
			}
		});
		
	}
	
	
	public void darseDeBaja() {
		throw new UnsupportedOperationException();
	}

	public void ocultarPerfil() {
		throw new UnsupportedOperationException();
	}

	public void cambiarDatos() {
		throw new UnsupportedOperationException();
	}

	public void buscarUsuario() {
		throw new UnsupportedOperationException();
	}
}