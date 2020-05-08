package com.mds2.foro;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class CreacionTicket extends CreacionTicket_ventana implements View{

	public CreacionTicket() {
enviarTicket.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("enviarTicket");
			}
		});
		
		cancelarTicket.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("cancelarTicket");
			}
		});
	}
	

	public void enviar() {
		throw new UnsupportedOperationException();
	}

	public void cancelarTicket() {
		throw new UnsupportedOperationException();
	}
	
}
