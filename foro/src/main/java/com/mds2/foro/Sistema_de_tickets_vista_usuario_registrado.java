package com.mds2.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Sistema_de_tickets_vista_usuario_registrado extends Sistema_de_tickets {
	//private Button _elimnarTicket;
	//private Button _crearTicket;
	public Banner_Usuario_registrado _unnamed_Banner_Usuario_registrado_;
	//public Crear_ticket _crear_ticket;

	public Sistema_de_tickets_vista_usuario_registrado() {
		
		crearTicket.addClickListener(new Button.ClickListener() {
			
			//cancelar();
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("crearTicket");
			}
			
		});	
		
	}
	
	
	public void eliminarTicket() {
		throw new UnsupportedOperationException();
	}

	public void crearTicket() {
		throw new UnsupportedOperationException();
	}
}