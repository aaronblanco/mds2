package com.mds2.foro;

import java.io.File;
import java.util.List;
import java.util.Vector;
//import Package.Anuncio;

import org.orm.PersistentException;

import com.vaadin.server.FileResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Image;

public class Lista_Anuncios_publicados extends Lista_Anuncios_publicados_ventana{
	private Button _eliminarAnuncio;
	public Sistema_de_publicidad _unnamed_Sistema_de_publicidad_;
	public Vector<AnuncioClase> _list_Anuncio = new Vector<AnuncioClase>();

	iAdministrador iUsr = new DB_Main();
	iAdministrador iAd = new DB_Main();
	public Lista_Anuncios_publicados() throws PersistentException {
		this._eliminarAnuncio = eliminarAnuncio;
		
		
		/*
	
		List<Anuncio> anunc = iAd.cargarAnuncioDisponible(true);
		
		for( Anuncio it : anunc) {
			String url = it.getImagen();
			
			FileResource resource = new FileResource(new File(url));
 

			Image image = new Image("", resource);
			
			AnuncioClase anun= new AnuncioClase(image);
			 _list_Anuncio.add(anun);
			 
		
		}
		*/
		
		
		_eliminarAnuncio.addClickListener(new Button.ClickListener() {
			
			
			
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					eliminarAnuncio();
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
	}
	
	public void eliminarAnuncio() throws NumberFormatException, PersistentException {
		iUsr.eliminarAnuncio(Integer.parseInt(this.getId()), false);
	}
}