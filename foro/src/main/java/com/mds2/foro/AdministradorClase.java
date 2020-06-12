package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.ui.Layout;

//import Package2.iAdministrador;

public class AdministradorClase extends ModeradorClase implements View{
	//public iAdministrador _iAdministrador;
	public Lista_Tema_V_Administrador _tema_vista_administrador;
	public Lista_Mensaje_V_Administrador _mensaje_vista_administrador;
	public Lista_Seccion_V_administrador _unnamed_Lista_Seccion_V_administrador_;
	public Panel_de_administración_vista_administrador _unnamed_Panel_de_administración_vista_administrador_;
	
	
	
	public AdministradorClase() throws PersistentException {
		

		Menu_moderador menu = new Menu_moderador();
	
		Lista_Seccion_V_administrador sec = new Lista_Seccion_V_administrador();
	
	    
		this.panelMenu.setContent(menu);
		
		this.panelMain.setContent(sec);
		
		
	}
	

	public AdministradorClase(Layout ventana )  throws PersistentException{
		
		
	
		Menu_moderador menu = new Menu_moderador();
		
	
	    
		this.panelMenu.setContent(menu);
		
		this.panelMain.setContent(ventana);
		
		
		
	}
}