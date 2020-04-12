package com.mds2.foro;

import java.util.Vector;
//import Package.Sección;
//import Package.Buscador_sección;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Lista_Seccion extends Seccion_Admin_lista{
	public Usuario_no_registrado _unnamed_Usuario_no_registrado_;
	public Vector<Sección> _list_Sección = new Vector<Sección>();
	//public Vector<Buscador_sección> _list_Buscador_sección = new Vector<Buscador_sección>();

	public Lista_Seccion() {

		
		buscarSeccionB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
			//	navigator.navigateTo("crearSeccion");
				buscarSeccion();
			}
			
		});
		
		listaSeccion.addComponent(new Sección());
		
		crearNuevaSeccion.setVisible(false);
	}
	
	
	public void buscarSeccion() {
		throw new UnsupportedOperationException();
	}
}