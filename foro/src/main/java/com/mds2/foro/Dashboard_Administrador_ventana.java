package com.mds2.foro;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
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
public class Dashboard_Administrador_ventana extends VerticalLayout {
	protected Label labelPanelAdmi;
	protected Panel panelListaAmonestados;
	protected Button candidatoAmonestado;
	protected Panel panelTickets;
	protected Button irATicket;
	protected Button modNumUM;
	protected Button configPubliAdmin;
	protected TextField txtBuscador;
	protected Button buscador;

	public Dashboard_Administrador_ventana() {
		Design.read(this);
	}
}