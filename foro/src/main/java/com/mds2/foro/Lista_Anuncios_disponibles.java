package com.mds2.foro;

import java.io.File;
import java.util.List;
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
	
	public Lista_Anuncios_disponibles() throws PersistentException {
		
		this._anadirAnuncio = anadirAnuncio;
		
		
		
		
	/*	
		List<Anuncio> anunc = iAd.cargarAnuncioDisponible(false);
		
		for( Anuncio it : anunc) {
			String url = it.getImagen();
			
			FileResource resource = new FileResource(new File(url));
 

			Image image = new Image("", resource);
			
		
			AnuncioClase anun= new AnuncioClase(image);
			
			 _list_Anuncio.add(anun);
			 
		
		}
		*/
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
		


		//Image as a file resource
		
		//In a Maven based Vaadin project the image file should be located inside src/main/webapp/WEB-INF/images/image.png.
		
		
	}
	
	public void anadirAnuncio() throws NumberFormatException, PersistentException {
		iAd.anadirAnuncio(Integer.parseInt(this.getId()), true);
	}
}