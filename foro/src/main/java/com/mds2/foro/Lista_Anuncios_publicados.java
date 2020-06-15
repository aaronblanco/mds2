package com.mds2.foro;

import java.io.File;
import java.util.List;
import java.util.Vector;
//import Package.Anuncio;

import javax.swing.ImageIcon;

import org.orm.PersistentException;

import com.vaadin.event.MouseEvents;
import com.vaadin.server.ClassResource;
import com.vaadin.server.FileResource;
import com.vaadin.server.Resource;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.themes.ValoTheme;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Image;

public class Lista_Anuncios_publicados extends Lista_Anuncios_publicados_ventana{
	private Button _eliminarAnuncio;
	public Sistema_de_publicidad _unnamed_Sistema_de_publicidad_;
	public Vector<AnuncioClase> _list_Anuncio = new Vector<AnuncioClase>();
	private int _id;
	iAdministrador iUsr = new DB_Main();
	iAdministrador iAd = new DB_Main();
	public Lista_Anuncios_publicados() throws PersistentException {
		//this._eliminarAnuncio = eliminarAnuncio;

		this.listaAnunciosPublicados.removeAllComponents();
		List<Anuncio> anun = iUsr.cargarAnuncioDisponible(true);
		
		for(Anuncio it : anun) {
			FileResource resource = new FileResource(new File(it.getImagen()));
			Image img = new Image("",resource);
			
			
			img.setHeight("100px");
			img.setWidth("100px");
		
	
			img.addStyleName("link");
		
			img.addClickListener(e -> {
				try {
				
					eliminarAnuncio(it.getIdAnuncio());

					UI.getCurrent().getNavigator().addView("sistemaPublicidadMod", new AdministradorClase(new Sistema_de_publicidad()));
					UI.getCurrent().getNavigator().navigateTo("sistemaPublicidadMod");
			
				} catch (NumberFormatException | PersistentException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} );
			
	
			
			
			this.listaAnunciosPublicados.addComponent(img);
			AnuncioClase an = new AnuncioClase( img	);
			_list_Anuncio.add(an);
		}
		
		

		
	}
	
	public void eliminarAnuncio(int id) throws NumberFormatException, PersistentException {
		iUsr.eliminarAnuncio(id, false);
	}
}