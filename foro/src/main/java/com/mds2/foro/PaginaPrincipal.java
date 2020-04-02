package com.mds2.foro;

import com.vaadin.data.TreeData;
import com.vaadin.data.provider.TreeDataProvider;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;

public class PaginaPrincipal extends PaginaPrincipal_ventana implements View{
	
	public PaginaPrincipal() {
		
		
			Sección sec = new Sección();
			Menu_UR menu = new Menu_UR();
			
			TreeData<String> data = new TreeData<>();
		    data.addItems(null, "Desktops", "Laptops")
		        .addItems("Desktops", "Dell GX240", "Dell GX260", "Dell GX280")
		        .addItems("Laptops", "IBM T40", "IBM T43", "IBM T60");

		    menu.menuMod.setDataProvider(new TreeDataProvider<>(data));
		    menu.menuMod.expand("Desktops", "Laptops");
		    menu.menuMod.setItemIconGenerator(item -> {
		        if (item.equals("Desktops")) {
		            return VaadinIcons.DESKTOP;
		        } else if (item.equals("Laptops")) {
		            return VaadinIcons.LAPTOP;
		        }
		        return null;
		    });
		    
		    
			this.panelMenu.setContent(menu);
			this.panelMain.setContent(sec);
	}
	

}
