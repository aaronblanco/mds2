package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.data.TreeData;
import com.vaadin.data.provider.TreeDataProvider;
import com.vaadin.navigator.View;
import com.vaadin.ui.Tree;
import com.vaadin.ui.UI;

//import Package2.iMenu_moderador;

public class Menu_moderador extends Menu_UR implements View{
//	public iMenu_moderador _iMenu_moderador;
	public Panel_de_administración_vista_moderador _unnamed_Panel_de_administración_vista_moderador_;
	public Menu_moderador()throws PersistentException{
		
	
	
		Tree<String> var = new Tree<String>();
		
	
		var.addItemClickListener( event -> UI.getCurrent().getNavigator().navigateTo(event.getItem() + "Adm") );

		this.addComponent(var);
		
		
	}
	
	@Override
	public Tree<String> listaDesplegable() {
		// TODO Auto-generated method stub
		Tree<String> var = new Tree<String>();
	    TreeData<String> datos = var.getTreeData();
	    datos.clear();
	  
		datos.addItems(null, "Mi perfil", "Pagina principal", "Panel de administración mod","Cerrar sesión" ); 
		TreeDataProvider<String> inMemoryDataProvider = new TreeDataProvider<String>(datos);
		System.out.println("ESTAMOS AQUI");
		var.setDataProvider( inMemoryDataProvider);
		return var;
	}
		
	
	
}