package com.mds2.foro;

import java.io.File;
import java.util.List;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.server.FileResource;
import com.vaadin.ui.Image;
import com.vaadin.ui.Layout;
import com.vaadin.ui.VerticalLayout;

public class Usuario_no_registrado extends Banner_general implements View{
	public Lista_Seccion _secciones;
	iAdministrador iUsr = new DB_Main();
		
		public Usuario_no_registrado() throws PersistentException {

			List<Anuncio> anun = iUsr.cargarAnuncioDisponible(true);
			if(!anun.isEmpty()) {
				Anuncio a = anun.get((int) (Math.random()*anun.size()) );
		
			FileResource resource = new FileResource(new File(a.getImagen()));
			Image img = new Image("",resource);
			img.setHeight("100%");
			img.setWidth("100%");
			this.panelPublicidad.setContent(img);
			}
			
			
			Lista_Seccion sec = new Lista_Seccion();
			Menu_UNR menu = new Menu_UNR();
			
		    
			this.panelMenu.setContent(menu);
			
			this.panelMain.setContent(sec);
			
	
	
			
		}

	public Usuario_no_registrado(Layout ventana )throws PersistentException {
	

		List<Anuncio> anun = iUsr.cargarAnuncioDisponible(true);
		if(!anun.isEmpty()) {
			Anuncio a = anun.get((int) (Math.random()*anun.size()) );
	
		FileResource resource = new FileResource(new File(a.getImagen()));
		Image img = new Image("",resource);
		img.setHeight("100%");
		img.setWidth("100%");
		this.panelPublicidad.setContent(img);
		}
		
		Menu_UNR menu = new Menu_UNR();
	    
		this.panelMenu.setContent(menu);
		
		this.panelMain.setContent(ventana);
		
	}
	

}