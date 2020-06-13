package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class CreacionTicket extends CreacionTicket_ventana implements View{
	
	iUsuario iUsr = new DB_Main();
	private TextField cuerpoText;
	
	public CreacionTicket() {
		
		this.cuerpoText = cuerpoTicket;
		
		enviarTicket.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					enviar();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				UI.getCurrent().getNavigator().navigateTo("sistemaTickets");
			}
			
		});
		
		cancelarTicket.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("sistemaTickets");
			}
		});
	}
	

	public void enviar() throws PersistentException {
		System.out.println("estas creando un ticket");
		iUsr.crearTicket(cuerpoText.getValue(), Sesion.getIDSESION());
		System.out.println("has creado un ticket");
	}

	public void cancelarTicket() {
		throw new UnsupportedOperationException();
	}
	
}
