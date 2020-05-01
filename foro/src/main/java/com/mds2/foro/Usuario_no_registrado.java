package com.mds2.foro;

import com.vaadin.navigator.View;
import com.vaadin.ui.Layout;
import com.vaadin.ui.VerticalLayout;

//import Package2.iUsuario_no_registrado;

public class Usuario_no_registrado extends PaginaPrincipal_ventana implements View{
	//public iUsuario_no_registrado _iUsuario_no_registrado;
	public Lista_Seccion _secciones;
	
	
	
		
		
		public Usuario_no_registrado() {
			
			
			Lista_Seccion sec = new 	Lista_Seccion();
			Menu_UNR menu = new Menu_UNR();
			Banner_general ban = new Banner_general();
	
		
		    
			this.panelMenu.setContent(menu);
			
			this.panelMain.setContent(sec);
			
			this.bannerAbajo.addComponent(ban);
	
			
		}

	public Usuario_no_registrado(Layout ventana ) {
		
		
	
		Menu_UNR menu = new Menu_UNR();
		Banner_general ban = new Banner_general();
	
	
	    
		this.panelMenu.setContent(menu);
		
		this.panelMain.setContent(ventana);
		
		this.bannerAbajo.addComponent(ban);
	
		
	}
	

}