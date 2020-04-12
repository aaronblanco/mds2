package com.mds2.foro;

//import DCLv3.Orden;
import java.util.Vector;
//import Package.Tema;
//import Package.Buscador_tema;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Lista_Tema extends Tema_Admin_lista {
	//private Orden _orden = DCLv3.Orden.Relevancia;
	public Sección _sección;
	public Vector<Tema> _list_Tema = new Vector<Tema>();
	//public Vector<Buscador_tema> _list_Buscador_tema = new Vector<Buscador_tema>();

	public Lista_Tema() {
		
		buscarTemaB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("cerrarTema");
			}
		});	
		
		crearTemaB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("crearTemaB");
			}
		});	
		
		crearTemaB.setVisible(false);
		
		statusTema.setVisible(false);
		
		buscarTemaB.setVisible(true);
	}
	
	public void buscarTema() {
		throw new UnsupportedOperationException();
	}

	public void ordenar(Orden aNuevoOrden) {
		throw new UnsupportedOperationException();
	}
}