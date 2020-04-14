package com.mds2.foro;

import com.vaadin.data.TreeData;
import com.vaadin.data.provider.TreeDataProvider;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.shared.Registration;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Tree;
import com.vaadin.ui.UI;

//import Package2.iMenu_UNR;

public class Menu_UNR extends Menu_moderador_ventana implements View {
//	private Button _iniciarSesion;
//	private Button _registrarse;
//	private TextField _foroDesplegable;
//	public iMenu_UNR _iMenu_UNR;
	public Iniciar_sesión _unnamed_Iniciar_sesión_;
	public Registrarse _unnamed_Registrarse_;

	public Menu_UNR() {
		
		
		Foro_desplegable foro = new Foro_desplegable();
	
		Tree<String> var = foro.listaDesplegable();
	    
	    
	    
	 
		
		
		 
	   
	    
	    
	    
	    this.addComponent(var);
	    
	    
	    
	}
	public void iniciarSesion() {
		throw new UnsupportedOperationException();
	}

	public void registrarse() {
		throw new UnsupportedOperationException();
	}
}