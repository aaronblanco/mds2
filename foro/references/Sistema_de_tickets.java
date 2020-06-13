package com.mds2.foro;

import java.util.List;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;


public class Sistema_de_tickets extends Sistema_de_ticket_ventana implements View{
	private Button _responderTicket;
	public TicketClase _unnamed_Ticket_;
	iUsuario iUsr = new DB_Main();
	private Button _elimnarTicket;
	private Button _crearTicket;
	
	public Sistema_de_tickets() throws PersistentException {
		
		List<Ticket> lista = iUsr.cargarTicket(Sesion.getIDSESION());
		if(!lista.isEmpty()) {
			for(Ticket t : lista) {
				TicketClase tc = new TicketClase(t);
				listaTickets.addComponent(tc);
			}
		}
		
		
		_crearTicket = crearTicket;
		
		_crearTicket.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				crearTicket();
			}
			
		});	
		
	}
	public void crearTicket() {
		UI.getCurrent().getNavigator().navigateTo("crearTicket");
	}
	
}