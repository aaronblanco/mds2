package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

//import Package2.iBanner_Usuario_registrado;

public class Banner_Usuario_registrado extends Banner_general implements View {
	private Button _soporte;
	public Sistema_de_tickets_vista_usuario_registrado _sistema_de_tickets_vista_usuario_registrado;

	public Banner_Usuario_registrado() throws PersistentException{
		super();
		_soporte = soporte;
		
		_soporte.setVisible(true);
		
		
		_soporte.addStyleName("link");
		_soporte.addClickListener(new Button.ClickListener() {
			
			
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				soporte();
			}
			
		});	
		
	}
	
	public void soporte() {
		if(Sesion.getADMINISTRADOR())
			UI.getCurrent().getNavigator().navigateTo("sisTicketsAdm");
		else
			UI.getCurrent().getNavigator().navigateTo("sistemaTickets");
	}
}