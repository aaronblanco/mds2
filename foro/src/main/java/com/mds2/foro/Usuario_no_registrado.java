package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.ui.Layout;
import com.vaadin.ui.VerticalLayout;

public class Usuario_no_registrado extends Banner_general implements View{
	//public iUsuario_no_registrado _iUsuario_no_registrado;
	public Lista_Seccion _secciones;
	
	
	
		
		
		public Usuario_no_registrado() throws PersistentException {
			
			
			Lista_Seccion sec = new Lista_Seccion();
			Menu_UNR menu = new Menu_UNR();
		
		
		    
			this.panelMenu.setContent(menu);
			
			this.panelMain.setContent(sec);
			
	
	
			
		}

	public Usuario_no_registrado(Layout ventana ) {
		
		
	
		Menu_UNR menu = new Menu_UNR();
	
	
	
	    
		this.panelMenu.setContent(menu);
		
		this.panelMain.setContent(ventana);
		
	
		
	}
	

}