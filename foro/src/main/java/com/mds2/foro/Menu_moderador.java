package com.mds2.foro;

import com.vaadin.data.TreeData;
import com.vaadin.data.provider.TreeDataProvider;
import com.vaadin.navigator.View;
import com.vaadin.ui.Tree;

//import Package2.iMenu_moderador;

public class Menu_moderador extends Menu_UR implements View {
//	public iMenu_moderador _iMenu_moderador;
	public Panel_de_administración_vista_moderador _unnamed_Panel_de_administración_vista_moderador_;
	public Menu_moderador(){
		
	
	
		this.removeComponent(this.components.get(1));
		
		Foro_desplegable foro = new Foro_desplegable();
	    Tree<String> var = foro.listaDesplegable();
	    TreeData<String> datos = var.getTreeData();
		datos.addItem(null, "Panel de administración");
		TreeDataProvider<String> inMemoryDataProvider = new TreeDataProvider<String>(datos);
		
		var.setDataProvider( inMemoryDataProvider);
		this.addComponent(var);
		
		
	}
	
	 
		
	
	
}