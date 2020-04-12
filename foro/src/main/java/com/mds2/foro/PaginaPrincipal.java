package com.mds2.foro;

import com.vaadin.data.TreeData;
import com.vaadin.data.provider.TreeDataProvider;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class PaginaPrincipal extends PaginaPrincipal_ventana implements View{
	
	public PaginaPrincipal() {
		
		
			Lista_Seccion_V_administrador sec = new Lista_Seccion_V_administrador  ();
			Menu_UR menu = new Menu_UR();
			
	
		
		    
			this.panelMenu.setContent(menu);
			this.panelMain.setContent(sec);

	
			
	}
	

}
