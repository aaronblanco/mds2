package com.mds2.foro;

import com.vaadin.data.TreeData;
import com.vaadin.data.provider.TreeDataProvider;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.Navigator;
import com.vaadin.ui.*;

//import Package2.iMenu_UR;

public class Menu_UR extends Menu_moderador_ventana{

	private Button _desconectarse;
	private TextField _foroDesplegable;
//	public iMenu_UR _iMenu_UR;
	public Mi_perfil _unnamed_Mi_perfil_;
	
	
	
	
	public Menu_UR(){
		
		
		
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
	
	 
	
	public void desconectarse() {
		throw new UnsupportedOperationException();
	}


}