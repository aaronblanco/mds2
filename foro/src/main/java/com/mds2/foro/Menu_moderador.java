package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.data.TreeData;
import com.vaadin.data.provider.TreeDataProvider;
import com.vaadin.navigator.View;
import com.vaadin.ui.Tree;
import com.vaadin.ui.UI;


public class Menu_moderador extends Menu_UR implements View{
	public Panel_de_administración_vista_moderador _unnamed_Panel_de_administración_vista_moderador_;
	public Menu_moderador()throws PersistentException{
		
	
	
		this.removeAllComponents();
		Tree<String> var = listaDesplegable();
		if(Sesion.getADMINISTRADOR())
			var.addItemClickListener( event -> UI.getCurrent().getNavigator().navigateTo(event.getItem() + "Adm") );
		else
			var.addItemClickListener( event -> UI.getCurrent().getNavigator().navigateTo(event.getItem() + "Mod") );
		this.addComponent(var);
		
		
	}
	
	@Override
	public Tree<String> listaDesplegable() {
		// TODO Auto-generated method stub
		Tree<String> var = new Tree<String>();
	    TreeData<String> datos = var.getTreeData();
	    datos.clear();
	  
		datos.addItems(null, "Mi perfil", "Pagina principal", "Panel de administración","Cerrar sesión" ); 
		TreeDataProvider<String> inMemoryDataProvider = new TreeDataProvider<String>(datos);
		var.setDataProvider( inMemoryDataProvider);
		return var;
	}
		
	
	
}