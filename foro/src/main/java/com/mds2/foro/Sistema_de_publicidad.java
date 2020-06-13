package com.mds2.foro;

import java.io.File;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Image;

public class Sistema_de_publicidad extends Sistema_de_Publicidad_ventana implements View{
	private Button _subirAnuncio;
	public Panel_de_administracion_vista_administrador _unnamed_Panel_de_administración_vista_administrador_;
	public AnuncioClase _unnamed_Anuncio_;
	public Lista_Anuncios_publicados _anuncios_publicados;
	public Lista_Anuncios_disponibles _anuncios_disponibles;
	iAdministrador iAd = new DB_Main();
	
	public Sistema_de_publicidad() throws PersistentException {
		this._subirAnuncio = subirAnuncio;
		
		_subirAnuncio.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					String aAnuncioURL = "";
					
					String basepath = VaadinService.getCurrent()
			                .getBaseDirectory().getAbsolutePath();
					
					for(int i = 1; i >= 4; i++) {
						aAnuncioURL = basepath +
			                    "/WEB-INF/images/image" +i +".jpg";
					}	
				 
					
					subirAnuncio(aAnuncioURL);
					anunciosLayout.addComponent(new Lista_Anuncios_publicados());
					anunciosLayout.addComponent(new Lista_Anuncios_disponibles());
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		
	
		
		
	}
	
	
	public void subirAnuncio(String aAnuncioURL) throws PersistentException {
		//iAd.subirAnuncio(aAnuncioURL);
		//esto es subir cosa
		iAd.subirAnuncio(aAnuncioURL);
		
	}
}