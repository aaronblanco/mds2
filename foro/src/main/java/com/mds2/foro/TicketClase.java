package com.mds2.foro;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.TextField;

//import Package.Sistema_de_tickets;

public class TicketClase extends Ticket_ventana implements View{
	private Button _enviar;
	private TextField _cuerpoTicket;
	private Button _cerrarTicket;
//	private Listener _listaTicket;
	public Sistema_de_tickets _unnamed_Sistema_de_tickets_;
	public Lista_Ticket _unnamed_Lista_Ticket_;
	
	iUsuario iUsr = new DB_Main();
	
	
	public TicketClase() {
		this._cuerpoTicket = txtTicket;
		this._enviar = responderTicket;
		this._cerrarTicket = cerrarTicket;
		
		
		_enviar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
			responderTicket();

			}
			
		
			
		});	
		
		_cerrarTicket.addClickListener(new Button.ClickListener() {
			
			//cancelar();
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				responderTicket();
			}
			
		});	
		
		_cerrarTicket.setVisible(true);
		
	}
	
	public void responderTicket() {
		
		iUsr.crearTicket(_cuerpoTicket, aIdUsuarioPropietarioTicket)
	}
	
}