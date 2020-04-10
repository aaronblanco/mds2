package com.mds2.foro;

import com.vaadin.data.TreeData;
import com.vaadin.data.provider.TreeDataProvider;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.ui.Tree;

//import Package2.iMenu_UNR;

public class Menu_UNR extends Menu_moderador_ventana implements View  {
//	private Button _iniciarSesion;
//	private Button _registrarse;
//	private TextField _foroDesplegable;
//	public iMenu_UNR _iMenu_UNR;
	public Iniciar_sesión _unnamed_Iniciar_sesión_;
	public Registrarse _unnamed_Registrarse_;

	
	public Menu_UNR() {
		
		menuMod = new Tree<String>();
		
		TreeData<String> data = new TreeData<String>();
	    data.addItems(null, "Desktops", "Laptops")
	        .addItems("Desktops", "Dell GX240", "Dell GX260", "Dell GX280")
	        .addItems("Laptops", "IBM T40", "IBM T43", "IBM T60");

	    
	    
	    
	    
	    
	    TreeDataProvider<String> inMemoryDataProvider = new TreeDataProvider<String>(data);
	  
	  
	    menuMod.setDataProvider(inMemoryDataProvider);
	    menuMod.expand("Desktops", "Laptops");
	    menuMod.setItemIconGenerator(item -> {
	        if (item.equals("Desktops")) {
	            return VaadinIcons.DESKTOP;
	        } else if (item.equals("Laptops")) {
	            return VaadinIcons.LAPTOP;
	        }
	        return null;
	    });
		
		
	}
	
	public void iniciarSesion() {
		throw new UnsupportedOperationException();
	}

	public void registrarse() {
		throw new UnsupportedOperationException();
	}
}