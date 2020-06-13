package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.data.TreeData;
import com.vaadin.data.provider.DataProvider;
import com.vaadin.data.provider.TreeDataProvider;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.*;

//import Package2.iMenu_UR;

public class Menu_UR extends Menu_UNR_ventana implements View, Foro_desplegable{

	private Button _desconectarse;
	private TextField _foroDesplegable;
//	public iMenu_UR _iMenu_UR;
	public Mi_perfil _unnamed_Mi_perfil_;
	
	
	
	
	public Menu_UR() throws PersistentException{
		
	
		
		if(Sesion.getIDSESION() >= 1 ) {
			this.removeAllComponents();

			
			Tree<String> var = listaDesplegable();
			
		    
			var.addItemClickListener(event -> UI.getCurrent().getNavigator().navigateTo(event.getItem().toString() + "Usr"));
			this.addComponent(var);
		}


		
	}
	
	 
	
	public void desconectarse() {
		throw new UnsupportedOperationException();
	}



	@Override
	public Tree<String> listaDesplegable() {
		// TODO Auto-generated method stub
		Tree<String> var = new Tree<String>();
	    TreeData<String> datos = var.getTreeData();
	    datos.clear();
	  
		datos.addItems(null, "Mi perfil", "Pagina principal", "Cerrar sesión"); 
		TreeDataProvider<String> inMemoryDataProvider = new TreeDataProvider<String>(datos);
		var.setDataProvider( inMemoryDataProvider);
		return var;
	}
	
	

}