package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Sistema_de_tickets_vista_usuario_registrado extends Sistema_de_tickets {
	//private Button _elimnarTicket;
	private Button _crearTicket;
	public Banner_Usuario_registrado _unnamed_Banner_Usuario_registrado_;
	//public Crear_ticket _crear_ticket;

	
	public Sistema_de_tickets_vista_usuario_registrado() throws PersistentException {
		super();
		_crearTicket = crearTicket;
		
		
		_crearTicket.addClickListener(new Button.ClickListener() {
			
			
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				crearTicket();
			}
			
		});	
		
	}
	
	
	public void eliminarTicket() {
		throw new UnsupportedOperationException();
	}

	public void crearTicket() {
		UI.getCurrent().getNavigator().navigateTo("crearTicket");
	}
}