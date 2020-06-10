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
		crearNuevaSeccion.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				crearSeccion();
			}
			
		});
		
		//listaSeccion.removeAllComponents();
		
		
		
		List<Seccion> cosa = iUsrNR.cargarListaSecciones(true, false, false, false);
		System.out.println(cosa.toString());
	//	listaSeccion.removeAllComponents();
		
		for(Seccion it : cosa ) {
			
			SeccionClase tal = new SeccionClase(it);
			System.out.println(tal.toString());
			
//			tal.setVisible(true);
//			tal.userCreadorSeccion.setVisible(true);
//			tal.userCreadorSeccion.setValue(it.getCreador());
//			tal.fechaCreacionSeccion.setValue(String.valueOf(it.getFecha()));
			listaSeccion.addComponent(tal);
			System.out.println("MIRA MAMA HE AÑADIDO UNA SECCION JAJAJA");
			listaSeccion.toString();
		}
		
		//listaSeccion.addComponent((Component) _list_Seccion);
		
	}
	

	
	
	private void Inicializar() {
		// TODO Auto-generated method stub
		buscarSeccionB.setVisible(true);
		crearNuevaSeccion.setVisible(true);

		
	}


	public void buscarSeccion() throws PersistentException {
		List sb = iUsrNR.buscarSeccion(keywordBS.toString());
		listaSeccion.removeAllComponents();
		for(Object it : sb) {
			listaSeccion.addComponent((Component) it);
		}
		
	}
	
	public void crearSeccion() {
		UI.getCurrent().getNavigator().navigateTo("crearSeccion");
		}
}