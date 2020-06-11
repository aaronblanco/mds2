package com.mds2.foro;

import com.vaadin.data.TreeData;
import com.vaadin.data.provider.DataProvider;
import com.vaadin.data.provider.TreeDataProvider;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.Navigator;
import com.vaadin.ui.*;

//import Package2.iMenu_UR;

public class Menu_UR extends Menu_UNR_ventana{

	private Button _desconectarse;
	private TextField _foroDesplegable;
//	public iMenu_UR _iMenu_UR;
	public Mi_perfil _unnamed_Mi_perfil_;
	
	
	
	
	public Menu_UR(){

		this.removeAllComponents();

		Foro_desplegable foro = new Foro_desplegable();
	    Tree<String> var = foro.listaDesplegable();
	    TreeData<String> datos = var.getTreeData();
		datos.removeItem("Iniciar sesion");
		datos.removeItem("Registrarse");
		datos.addItem(null, "Mi perfil");
		datos.addItem(null, "Cerrar sesión");
		TreeDataProvider<String> inMemoryDataProvider = new TreeDataProvider<String>(datos);
		
		var.setDataProvider( inMemoryDataProvider);
		var.addItemClickListener(event -> UI.getCurrent().getNavigator().navigateTo(event.getItem()));
		this.addComponent(var);
		
	}
	
	 
	
	public void desconectarse() {
		throw new UnsupportedOperationException();
	}


}