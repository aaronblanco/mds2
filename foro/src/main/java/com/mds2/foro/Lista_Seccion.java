package com.mds2.foro;

import java.util.Vector;
//import Package.Sección;
//import Package.Buscador_sección;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Component;

public class Lista_Seccion extends Lista_Seccion_ventana implements View{
	public Usuario_no_registrado _unnamed_Usuario_no_registrado_;
	public Vector<SeccionClase> _list_Seccion = new Vector<SeccionClase>();
	//public Vector<Buscador_seccion> _list_Buscador_sección = new Vector<Buscador_seccion>();
	iUsuario_no_registrado iUsrNR  = new DB_Main();
	
	public Lista_Seccion() throws PersistentException {

		Inicializar();
		
		buscarSeccionB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				buscarSeccion();
			}
			
		});
		
		
		
		_list_Seccion = (Vector<SeccionClase>) iUsrNR.cargarListaSecciones(true, false, false, false);

		listaSeccion.addComponent((Component) _list_Seccion);
		
	}
	
	
	private void Inicializar() {
		// TODO Auto-generated method stub
		buscarSeccionB.setVisible(true);
		crearNuevaSeccion.setVisible(true);

	}


	public void buscarSeccion() {
		listaSeccion.addComponent((Component) iUsrNR.buscarSeccion(keywordBS.toString()));
	}
}