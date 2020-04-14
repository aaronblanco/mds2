package com.mds2.foro;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

//import Package.Lista_Seccion_V_Moderador;

public class CreacionSeccion extends Creacion_Seccion_vista implements View {
	//private TextField _tituloSeccion;
//	private TextField _descipcionSeccion;
//	private Button _adjuntarImagen;
	//private Button _enviar;
//	private Button _cancelar;
//	private Image _imagenSeccion;
	public Lista_Seccion_V_Moderador _unnamed_Lista_Seccion_V_Moderador_;

	public CreacionSeccion() {
		
		crearSeccionB.addClickListener(new Button.ClickListener() {
			
			//cancelar();
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("cancelarCreacionTema");
			}
			
		});	
		
		cancelarSeccionB.addClickListener(new Button.ClickListener() {
			
			//cancelar();
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("cancelarCreacionTema");
			}
			
		});	
		
		
		//Esto es un upload, no un boton hay que ver como funciona
//		cargarImagenSeccionB.addClickListener(new Button.ClickListener() {
//			
//			//cancelar();
//			
//			@Override
//			public void buttonClick(ClickEvent event) {
//				// TODO Auto-generated method stub
//				UI.getCurrent().getNavigator().navigateTo("cancelarCreacionTema");
//			}
//			
//		});	
		
	}
	
	public void enviar() {
		throw new UnsupportedOperationException();
	}

	public void cancelar() {
		throw new UnsupportedOperationException();
	}

	public void adjuntarImagen() {
		throw new UnsupportedOperationException();
	}
}