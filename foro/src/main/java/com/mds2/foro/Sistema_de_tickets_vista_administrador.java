package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.ui.Button;

public class Sistema_de_tickets_vista_administrador extends Sistema_de_tickets {
	public Panel_de_administracion_vista_administrador _unnamed_Panel_de_administración_vista_administrador_;

	public Sistema_de_tickets_vista_administrador() throws PersistentException {
		
		super();
		
		crearTicket.setVisible(false);
	}
	
	
}