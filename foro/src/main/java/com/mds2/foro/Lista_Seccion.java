package com.mds2.foro;

import java.util.List;
import java.util.Vector;
//import Package.Sección;
//import Package.Buscador_sección;
import java.util.function.Consumer;

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
				try {
					buscarSeccion();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
//		crearNuevaSeccion.addClickListener(new Button.ClickListener() {
//			@Override
//			public void buttonClick(ClickEvent event) {
//				// TODO Auto-generated method stub
//				crearSeccion();
//			}
//		});
	}
	

	
	
	private void Inicializar() throws PersistentException {
		buscarSeccionB.setVisible(true);
		crearNuevaSeccion.setVisible(false);
		
		listaSeccion.removeAllComponents();
		
		List<Seccion> cosa = iUsrNR.cargarListaSecciones(true, false, false, false);
		
		for(Seccion it : cosa ) {
			SeccionClase tal = new SeccionClase(it);
		//	_list_Seccion.add(tal);
			listaSeccion.addComponent(tal);
			listaSeccion.toString();
		}
		
		
	}


	public void buscarSeccion() throws PersistentException {
		List<Seccion> sb = iUsrNR.buscarSeccion(keywordBS.getValue());
		listaSeccion.removeAllComponents();
		if(!sb.isEmpty()) {
			//listaSeccion.removeAllComponents();
			
			for(Seccion s:sb) {
				SeccionClase sc = new SeccionClase(s);
				listaSeccion.addComponent(sc);
			}
			
		}else {
				List<Seccion> cosa = iUsrNR.cargarListaSecciones(true, false, false, false);
				
				for(Seccion it : cosa ) {
					
					SeccionClase tal = new SeccionClase(it);

					listaSeccion.addComponent(tal);
					listaSeccion.toString();
				}
		}
	}
	
//	public void crearSeccion() {
//		UI.getCurrent().getNavigator().navigateTo("crearSeccion");
//	}
}