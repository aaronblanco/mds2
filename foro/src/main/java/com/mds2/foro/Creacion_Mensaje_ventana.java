package com.mds2.foro;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.RichTextArea;
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
public class Creacion_Mensaje_ventana extends VerticalLayout {
	protected Label tituloTema;
	protected Label subtitulo;
	protected Label numTotalMensajes;
	protected Label usuarioCreador;
	protected Label fechaCreacion;
	protected RichTextArea textoTema;
	protected Button crearMensaje;
	protected Button cancelarCreacionTema;

	public Creacion_Mensaje_ventana() {
		Design.read(this);
	}
}
