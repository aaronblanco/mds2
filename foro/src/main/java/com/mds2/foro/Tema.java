package com.mds2.foro;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

//import DCLv3.Tipo;

public class Tema extends Tema_ventana implements View{
//	private Tipo _tipo = DCLv3.Tipo.Publico;
//	private Label _titulo;
//	private Label _fechaCreacion;
//	private Label _creador;
//	private Label _meGustas;
//	private Label _numMensajes;
//	private Listener _listaTema;
	public Lista_Tema _unnamed_Lista_Tema_;
	public Lista_Mensaje _mensajes;
	
	public Tema() {
		
			irTema.addClickListener(new Button.ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {
					// TODO Auto-generated method stub
					UI.getCurrent().getNavigator().navigateTo("irTema");
				}
			});	
			
			darMG.addClickListener(new Button.ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {
					// TODO Auto-generated method stub
					UI.getCurrent().getNavigator().navigateTo("darMG");
				}
			});	
			
			notificarAdmin.addClickListener(new Button.ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {
					// TODO Auto-generated method stub
					UI.getCurrent().getNavigator().navigateTo("notificarAdmin");
				}
			});	
			
			cerrarTema.addClickListener(new Button.ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {
					// TODO Auto-generated method stub
					UI.getCurrent().getNavigator().navigateTo("cerrarTema");
				}
			});	
			
			eliminarTema.addClickListener(new Button.ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {
					// TODO Auto-generated method stub
					UI.getCurrent().getNavigator().navigateTo("eliminarTema");
				}
			});	
			
			cerrarTema.setVisible(false);
			
			darMG.setVisible(false);
			
			notificarAdmin.setVisible(false);
			
			cambiarAcc.setVisible(false);
			
			eliminarTema.setVisible(false);
		}
	
}