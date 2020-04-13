package com.mds2.foro;

import java.util.Vector;
//import Package.Anuncio;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Lista_Anuncios_publicados extends SP_Anuncios_Publicados_lista{
//	private Button _eliminarAnuncio;
	public Sistema_de_publicidad _unnamed_Sistema_de_publicidad_;
	public Vector<Anuncio> _list_Anuncio = new Vector<Anuncio>();

	
	public Lista_Anuncios_publicados() {
		
		eliminarAnuncio.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("irTema");
			}
		});
		
	}
	
	public void eliminarAnuncio() {
		throw new UnsupportedOperationException();
	}
}