package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

//import DCLv3.Ticket;

public class Sistema_de_tickets extends Sistema_de_ticket_ventana implements View{
//	private Button _responderTicket;
//	public Responder_ticket _responder_ticket;
	public TicketClase _unnamed_Ticket_;

	public Sistema_de_tickets() throws PersistentException {
		
		Lista_Ticket lis = new Lista_Ticket();
		
		listaTickets.addComponent(lis);
		
	}
	
	public void cerrarTicket() {
		throw new UnsupportedOperationException();
	}
	
	public void responderTicket() {
		throw new UnsupportedOperationException();
	}
}