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


public class Menu_UNR extends Menu_UNR_ventana implements View, Foro_desplegable {

	public Iniciar_sesion _unnamed_Iniciar_sesión_;
	public Registrarse _unnamed_Registrarse_;

	public Menu_UNR() {
		
		Tree<String> var = listaDesplegable();
		
		var.addItemClickListener(event -> UI.getCurrent().getNavigator().navigateTo(event.getItem().toString()));
	    
	    this.addComponent(var);
	    
	    
	    
	}

	@Override
	public Tree<String> listaDesplegable() {
		// TODO Auto-generated method stub
		Tree<String> var = new Tree<String>();
		TreeData<String> datos = var.getTreeData();
	    datos.clear();
	  
		datos.addItems(null, "Iniciar sesion", "Registrarse", "Pagina principal"); 
		TreeDataProvider<String> inMemoryDataProvider = new TreeDataProvider<String>(datos);
		var.setDataProvider( inMemoryDataProvider);
		
		
		return var;
	}
}