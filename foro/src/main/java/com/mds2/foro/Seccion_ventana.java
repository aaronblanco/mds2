package com.mds2.foro;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.HorizontalLayout;
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
public class Seccion_ventana extends VerticalLayout {
	protected VerticalLayout seccionAdminLista;
	protected HorizontalLayout seccion;
	protected Button irSeccion;
	protected ComboBox<java.lang.String> statusTema;
	protected Button eliminarSeccion;
	protected HorizontalLayout seccionDatos;
	protected Label subtitleSection;
	protected Label userCreadorSeccion;
	protected Label fechaCreacionSeccion;
	protected Label numMsgSection;

	public Seccion_ventana() {
		Design.read(this);
	}
}