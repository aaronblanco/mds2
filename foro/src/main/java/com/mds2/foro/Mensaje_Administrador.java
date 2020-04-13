package com.mds2.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

//import Package.Mensaje_moderador;

public class Mensaje_Administrador extends Mensaje_moderador {
	//private Button _eliminar;
	public Lista_Mensaje_V_Administrador _unnamed_Lista_Mensaje_V_Administrador_;

	public Mensaje_Administrador() {
		super();
		
		notificarAdminB.addClickListener(new Button.ClickListener() {
			
			//cancelar();
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("cancelarCreacionTema");
			}
			
		});	
		
		eliminarMensaje.addClickListener(new Button.ClickListener() {
			
			//cancelar();
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("cancelarCreacionTema");
			}
			
		});	
		
		notificarAdminB.setVisible(false);
		
		eliminarMensaje.setVisible(true);
	}
	
	public void eliminar() {
		throw new UnsupportedOperationException();
	}
}