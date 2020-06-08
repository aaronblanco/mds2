package com.mds2.foro;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

/** 
 * !! DO NOT EDIT THIS FILE !!
 * 
 * This class is generated by Vaadin Designer and will be overwritten.
 * 
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class PerfilUsuarioRegGenerico_ventana extends VerticalLayout {
	protected HorizontalLayout datosVisitaPerfil;
	protected Image fotoPerfilUsuario;
	protected Label userName;
	protected Label description;
	protected Button addFriend;
	protected Button eliminarAmigo;
	protected Button sancionar;
	protected Button eliminarSancion;
	protected Button ascender;
	protected Button degradar;
	protected Label visibilidad;

	public PerfilUsuarioRegGenerico_ventana() {
		Design.read(this);
	}
}
