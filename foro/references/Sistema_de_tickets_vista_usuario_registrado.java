package com.mds2.foro;

import java.util.List;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Sistema_de_tickets_vista_usuario_registrado extends Sistema_de_tickets implements View{
	private Button _crearTicket;
	public Banner_Usuario_registrado _unnamed_Banner_Usuario_registrado_;
	iUsuario iUsr = new DB_Main();
	
	public Sistema_de_tickets_vista_usuario_registrado() throws PersistentException {
		
		super();
	}



}