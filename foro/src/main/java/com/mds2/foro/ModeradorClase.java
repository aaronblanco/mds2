package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.ui.Layout;


public class ModeradorClase extends Usuario_registrado implements View{
	public Lista_Mensaje_V_Moderador _mensaje_vista_moderador;
	public Lista_Tema_V_Moderador _tema_vista_moderador;
	public Lista_Seccion_V_Moderador _unnamed_Lista_Seccion_V_Moderador_;
	
	
	
	
	public ModeradorClase() throws PersistentException {
		super();

		Menu_moderador menu = new Menu_moderador();
		Banner_Usuario_registrado ban = new Banner_Usuario_registrado();
		Lista_Seccion_V_Moderador sec = new Lista_Seccion_V_Moderador();
	
	    
		this.panelMenu.setContent(menu);
		
		this.panelMain.setContent(sec);
		
		this.bannerAbajo.addComponent(ban);
		
		
	}
	

	public ModeradorClase(Layout ventana ) throws PersistentException {
		super();
		
	
		Menu_moderador menu = new Menu_moderador();
		Banner_Usuario_registrado ban = new Banner_Usuario_registrado();
		
	
	    
		this.panelMenu.setContent(menu);
		
		this.panelMain.setContent(ventana);
		
		this.bannerAbajo.addComponent(ban);
	
		
	}
	
}