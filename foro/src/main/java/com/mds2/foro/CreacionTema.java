package com.mds2.foro;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

//import Package.Lista_Tema_V_Usuario_Reg;

public class CreacionTema extends Creacion_tema_ventana implements View {
	//private TextField _tituloTema;
	//private TextLabel _descripcionTema;
	//private Button _enviar;
//	private Button _cancelar;
	public Lista_Tema_V_Usuario_Reg _unnamed_Lista_Tema_V_Usuario_Reg_;

	
	
	public CreacionTema() {
		
		crearTema.addClickListener(new Button.ClickListener() {
			
			//cancelar();
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("cancelarCreacionTema");
			}
			
		});	
		
		cancelarCreacionTema.addClickListener(new Button.ClickListener() {
			
			//cancelar();
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("cancelarCreacionTema");
			}
			
		});	
		
		
	}
	
	
	public void enviar() {
		throw new UnsupportedOperationException();
	}

	public void cancelar() {
		throw new UnsupportedOperationException();
	}
}