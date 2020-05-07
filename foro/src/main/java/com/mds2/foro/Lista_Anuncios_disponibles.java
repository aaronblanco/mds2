package com.mds2.foro;

import java.util.Vector;
//import Package.Anuncio;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Lista_Anuncios_disponibles extends Lista_Anuncios_disponibles_ventana{
//	private Button _anadirAnuncio;
	public Sistema_de_publicidad _unnamed_Sistema_de_publicidad_;
	public Vector<Anuncio> _list_Anuncio = new Vector<Anuncio>();

	public Lista_Anuncios_disponibles() {
		
		anadirAnuncio.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("irTema");
			}
		});
		
	}
	
	public void anadirAnuncio() {
		throw new UnsupportedOperationException();
	}
}