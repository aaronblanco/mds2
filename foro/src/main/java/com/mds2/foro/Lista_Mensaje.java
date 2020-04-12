package com.mds2.foro;

import java.util.Vector;
//import Package.Buscador_mensaje;
//import Package.Mensaje;

import com.vaadin.ui.*;
import com.vaadin.ui.Button.ClickEvent;

public class Lista_Mensaje extends Mensaje_Administrador_lista{
//	private Label _tituloTema;
//	private Label _subtituloDescripcion;
//	private Label _numTotalMensajes;
//	private Label _usuarioCreador;
//	private Label _fechaCreacion;
//	private Label _pagina;
	public Tema _unnamed_Tema_;
	//public Vector<Buscador_mensaje> _list_Buscador_mensaje = new Vector<Buscador_mensaje>();
	public Vector<Mensaje> _list_Mensaje = new Vector<Mensaje>();

	public Lista_Mensaje() {
		
		volverTema.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("volverTema");
			}
			
		});	
		
		crearMensaje.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("crearMensaje");
			}
		});	
		
		buscadorBoton.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("buscadorBoton");
			}
		});	
		
		volverTema.setVisible(true);
		
		crearMensaje.setVisible(false);
		
		buscadorBoton.setVisible(true);
	}
	
	public void buscarMensaje() {
		throw new UnsupportedOperationException();
	}
}