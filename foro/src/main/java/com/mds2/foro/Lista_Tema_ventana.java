package com.mds2.foro;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.TextField;
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
public class Lista_Tema_ventana extends VerticalLayout {
	protected ComboBox<java.lang.String> statusTema;
	protected Button crearTemaB;
	protected Button buscarTemaB;
	protected TextField buscarTemaTF;
	protected VerticalLayout listaTemas;

	public Lista_Tema_ventana() {
		Design.read(this);
	}
}