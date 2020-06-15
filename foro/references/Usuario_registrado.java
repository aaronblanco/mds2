package com.mds2.foro;

import java.io.File;
import java.util.List;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.server.FileResource;
import com.vaadin.ui.Image;
import com.vaadin.ui.Layout;
import com.vaadin.ui.UI;


public class Usuario_registrado extends Banner_Usuario_registrado implements View{
	public Lista_Tema_V_Usuario_Reg _tema_vista_usuario_registrado;
	public Lista_Mensaje_V_Usuario_Reg _mensaje_vista_usuario_registrado;
	public Lista_Seccion_V_Usuario_Reg _unnamed_Lista_Seccion_V_Usuario_Reg_;
	iAdministrador iUsr = new DB_Main();
	
	public Usuario_registrado() throws PersistentException {
		List<Anuncio> anun = iUsr.cargarAnuncioDisponible(true);
		if(!anun.isEmpty()) {
		Anuncio a = anun.get((int) (Math.random()*anun.size()) );
	
		FileResource resource = new FileResource(new File(a.getImagen()));
		Image img = new Image("",resource);
		img.setHeight("100%");
		img.setWidth("100%");
		this.panelPublicidad.setContent(img);
		}
		
		

		Menu_UR menu = new Menu_UR();
		Banner_Usuario_registrado ban = new Banner_Usuario_registrado();
		Lista_Seccion_V_Usuario_Reg sec = new Lista_Seccion_V_Usuario_Reg();
	
		
	    
		this.panelMenu.setContent(menu);
		
		this.panelMain.setContent(sec);
		
		this.bannerAbajo.addComponent(ban);
		
		
	}
	

	public Usuario_registrado(Layout ventana ) throws PersistentException {
		List<Anuncio> anun = iUsr.cargarAnuncioDisponible(true);
		if(!anun.isEmpty()) {
		Anuncio a = anun.get((int) (Math.random()*anun.size()) );
	
		FileResource resource = new FileResource(new File(a.getImagen()));
		Image img = new Image("",resource);
		img.setHeight("100%");
		img.setWidth("100%");
		this.panelPublicidad.setContent(img);
		}
		
		
		Menu_UR menu = new Menu_UR();
		
		Banner_Usuario_registrado ban = new Banner_Usuario_registrado();
	    
		this.panelMenu.setContent(menu);
		
		this.panelMain.setContent(ventana);
		
		this.bannerAbajo.addComponent(ban);
	
		
	}
	

	
	
}