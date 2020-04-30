package com.mds2.foro;

import com.vaadin.navigator.View;
import com.vaadin.ui.Layout;

//import Package2.iModerador;

public class Moderador extends Usuario_registrado implements View{
	//public iModerador _iModerador;
	public Lista_Mensaje_V_Moderador _mensaje_vista_moderador;
	public Lista_Tema_V_Moderador _tema_vista_moderador;
	public Lista_Seccion_V_Moderador _unnamed_Lista_Seccion_V_Moderador_;
	
	
	
	
	public Moderador() {
		

		Menu_moderador menu = new Menu_moderador();
		Banner_Usuario_registrado ban = new Banner_Usuario_registrado();
		Lista_Seccion_V_Moderador sec = new Lista_Seccion_V_Moderador();
	
	    
		this.panelMenu.setContent(menu);
		
		this.panelMain.setContent(sec);
		
		this.bannerAbajo.addComponent(ban);
		
		
	}
	

	public Moderador(Layout ventana ) {
		
		
	
		Menu_moderador menu = new Menu_moderador();
		Banner_Usuario_registrado ban = new Banner_Usuario_registrado();
		
	
	    
		this.panelMenu.setContent(menu);
		
		this.panelMain.setContent(ventana);
		
		this.bannerAbajo.addComponent(ban);
	
		
	}
	
}