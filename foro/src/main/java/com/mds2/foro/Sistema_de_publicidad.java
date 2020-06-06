package com.mds2.foro;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Sistema_de_publicidad extends Sistema_de_Publicidad_ventana implements View{
	//private Button _subirAnuncio;
	public Panel_de_administración_vista_administrador _unnamed_Panel_de_administración_vista_administrador_;
	public AnuncioClase _unnamed_Anuncio_;
	public Lista_Anuncios_publicados _anuncios_publicados;
	public Lista_Anuncios_disponibles _anuncios_disponibles;

	public Sistema_de_publicidad() {
		
		subirAnuncio.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("irTema");
			}
		});
		
	}
	
	
	public void subirAnuncio() {
		throw new UnsupportedOperationException();
	}
}