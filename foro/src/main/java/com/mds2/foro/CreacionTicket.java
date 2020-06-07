package com.mds2.foro;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class CreacionTicket extends CreacionTicket_ventana implements View{
	
	iUsuario iUsr = new DB_Main();
	private TextField cuerpoText;
	
	public CreacionTicket() 
	{
	this.cuerpoText = cuerpoTicket;
		
		
		
		enviarTicket.addClickListener(new Button.ClickListener() {
			
			
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				enviar();
			
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
	

	public void enviar() {
		
		iUsr.crearTicket(cuerpoText, aIdUsuarioPropietarioTicket);
		
	}

	public void cancelarTicket() {
		throw new UnsupportedOperationException();
	}
	
}
