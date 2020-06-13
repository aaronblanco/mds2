package com.mds2.foro;

import java.io.File;
import java.util.Vector;
//import Package.Anuncio;

import org.orm.PersistentException;

import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.Button;
import com.vaadin.ui.Image;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Lista_Anuncios_disponibles extends Lista_Anuncios_disponibles_ventana{
	private Button _anadirAnuncio;
	public Sistema_de_publicidad _unnamed_Sistema_de_publicidad_;
	public Vector<AnuncioClase> _list_Anuncio = new Vector<AnuncioClase>();
	iAdministrador iAd = new DB_Main();
	
	public Lista_Anuncios_disponibles() {
		
		this._anadirAnuncio = anadirAnuncio;
		
		_anadirAnuncio.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					anadirAnuncio();
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		String basepath = VaadinService.getCurrent()
                .getBaseDirectory().getAbsolutePath();
		System.out.println(basepath+"ey que pasa");

		//Image as a file resource
		FileResource resource = new FileResource(new File(basepath +
                      "/WEB-INF/images/image.jpg"));

		//Show the image in the application
		Image image = new Image("Image from file", resource);
		listaAnunciosDisponibles.addComponent(image);
		//In a Maven based Vaadin project the image file should be located inside src/main/webapp/WEB-INF/images/image.png.
		
		
	}
	
	public void anadirAnuncio() throws NumberFormatException, PersistentException {
		iAd.anadirAnuncio(Integer.parseInt(this.getId()), true);
	}
}