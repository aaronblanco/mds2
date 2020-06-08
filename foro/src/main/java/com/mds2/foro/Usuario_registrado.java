package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.ui.Layout;

//import Package2.iUsuario_registrado;

public class Usuario_registrado extends Banner_Usuario_registrado implements View{
	//public iUsuario_registrado _iUsuario_registrado;
	public Lista_Tema_V_Usuario_Reg _tema_vista_usuario_registrado;
	public Lista_Mensaje_V_Usuario_Reg _mensaje_vista_usuario_registrado;
	public Lista_Seccion_V_Usuario_Reg _unnamed_Lista_Seccion_V_Usuario_Reg_;
	
	
	public Usuario_registrado() throws PersistentException {
		

		Menu_UR menu = new Menu_UR();
		Banner_Usuario_registrado ban = new Banner_Usuario_registrado();
		Lista_Seccion_V_Usuario_Reg sec = new Lista_Seccion_V_Usuario_Reg();
	
	    
		this.panelMenu.setContent(menu);
		
		this.panelMain.setContent(sec);
		
		this.bannerAbajo.addComponent(ban);
		
		
	}
	

	public Usuario_registrado(Layout ventana ) {
		
		
	
		Menu_UR menu = new Menu_UR();
		Banner_Usuario_registrado ban = new Banner_Usuario_registrado();
		
	
	    
		this.panelMenu.setContent(menu);
		
		this.panelMain.setContent(ventana);
		
		this.bannerAbajo.addComponent(ban);
	
		
	}
	

	
	
}