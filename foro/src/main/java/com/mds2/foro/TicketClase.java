package com.mds2.foro;

import org.orm.PersistentException;

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
				
				try {
					responderTicket();
				} catch (PersistentException e) {
				// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			
		
			
		});	
		
		_cerrarTicket.addClickListener(new Button.ClickListener() {
			
			//cancelar();
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					responderTicket();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});	
		
		_cerrarTicket.setVisible(true);
		
	}
	
	public TicketClase(Ticket t) {
		// TODO Auto-generated constructor stub
		this._cuerpoTicket = txtTicket;
		this._enviar = responderTicket;
		this._cerrarTicket = cerrarTicket;
		
		this._cuerpoTicket.setValue(t.getTexto());
		txtTicket.setValue(t.getTexto());
		
		_enviar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
			try {
				responderTicket();
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			}
			
		
			
		});	
		
		_cerrarTicket.addClickListener(new Button.ClickListener() {
			
			//cancelar();
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					responderTicket();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});	
		
		_cerrarTicket.setVisible(true);
	}

	public void responderTicket() throws PersistentException {
		iUsr.crearTicket(_cuerpoTicket.getValue(), Sesion.getIDSESION());
	}
	
}