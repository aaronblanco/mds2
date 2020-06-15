package com.mds2.foro;

import java.io.File;
import java.util.List;
import java.util.Vector;
//import Package.Anuncio;

import org.orm.PersistentException;

import com.vaadin.event.MouseEvents;
import com.vaadin.server.ClassResource;
import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.Button;
import com.vaadin.ui.Image;
import com.vaadin.ui.UI;
import com.vaadin.ui.themes.ValoTheme;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class Lista_Anuncios_disponibles extends Lista_Anuncios_disponibles_ventana{
	private Button _anadirAnuncio;
	public Sistema_de_publicidad _unnamed_Sistema_de_publicidad_;
	private int _id;
	public Vector<AnuncioClase> _list_Anuncio = new Vector<AnuncioClase>();
	iAdministrador iAd = new DB_Main();
	iAdministrador iUsr = new DB_Main();
	public Lista_Anuncios_disponibles() throws PersistentException {
		
	
		this.listaAnunciosDisponibles.removeAllComponents();
		List<Anuncio> anun = iUsr.cargarAnuncioDisponible(false);
		
		for(Anuncio it : anun) {
			
			FileResource resource = new FileResource(new File(it.getImagen()));
			Image img = new Image("",resource);
			img.setWidth("100px");
			img.setHeight("100px");
			
	
	
			img.setHeight("100px");
			img.setWidth("100px");
			img.addStyleName("link");
			img.addClickListener(e -> {
				try {
				
					anadirAnuncio(it.getIdAnuncio());
				
					UI.getCurrent().getNavigator().addView("sistemaPublicidadMod", new AdministradorClase(new Sistema_de_publicidad()));
					UI.getCurrent().getNavigator().navigateTo("sistemaPublicidadMod");
				
				} catch (NumberFormatException | PersistentException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} );
			
		
			
			this.listaAnunciosDisponibles.addComponent(img);
			AnuncioClase an = new AnuncioClase( img	);
			_list_Anuncio.add(an);
		}
		
		
		
	}
	
	public void anadirAnuncio(int id) throws NumberFormatException, PersistentException {
		iAd.anadirAnuncio(id, true);
	}
}