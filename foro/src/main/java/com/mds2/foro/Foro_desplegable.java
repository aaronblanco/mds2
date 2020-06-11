package com.mds2.foro;

import com.vaadin.data.TreeData;
import com.vaadin.data.provider.TreeDataProvider;
import com.vaadin.ui.Tree;
import com.vaadin.ui.UI;

public class Foro_desplegable {
	public Banner_general _unnamed_Banner_general_;
	
	
	
	
	
	public Foro_desplegable() {
	}
	
		
		public Tree<String> listaDesplegable(){
			Tree<String> menuMod = new Tree<String>("Menu");
		
			TreeData<String> data = new TreeData<String>();
			data.addItems(null,"Iniciar sesion", "Registrarse","Pagina principal");
			
			TreeDataProvider<String> inMemoryDataProvider = new TreeDataProvider<String>(data);
			

			inMemoryDataProvider.refreshAll();
			menuMod.setDataProvider(inMemoryDataProvider);
			menuMod.addItemClickListener(event -> UI.getCurrent().getNavigator().navigateTo(event.getItem()));

	    
	   
	    return menuMod;
		}
	
	
	
}