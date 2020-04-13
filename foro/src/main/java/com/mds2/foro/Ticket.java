package com.mds2.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

//import Package.Sistema_de_tickets;

public class Ticket extends Sistema_Tickets_Admin_ventana{
//	private Button _enviar;
//	private TextField _cuerpoTicket;
//	private Button _cerrarTicket;
//	private Listener _listaTicket;
	public Sistema_de_tickets _unnamed_Sistema_de_tickets_;
	public Lista_Ticket _unnamed_Lista_Ticket_;

	public Ticket() {
		
		responderTicket.addClickListener(new Button.ClickListener() {
			
			//cancelar();
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("crearTicket");
			}
			
		});	
		
		cerrarTicket.addClickListener(new Button.ClickListener() {
			
			//cancelar();
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("crearTicket");
			}
			
		});	
		
		cerrarTicket.setVisible(false);
		
	}
	
	public void responderTicket() {
		throw new UnsupportedOperationException();
	}
	
}