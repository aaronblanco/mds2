 package com.mds2.foro;


import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.UI;

//import DCLv3.Tipo;

public class Sección extends Seccion_ventana implements View {
//	private Tipo _tipo = DCLv3.Tipo.Publico;
//	private Label _nombreSeccion;
//	private Image _imagenSeccion;
//	private Listener _listaSeccion;
	public Lista_Seccion _secciones;
	public Lista_Tema _temas;

	public Sección() {
		
	
		
			eliminarSeccion.addClickListener(new Button.ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {
					// TODO Auto-generated method stub
				//	navigator.navigateTo("crearSeccion");
					UI.getCurrent().getNavigator().navigateTo("eliminarSeccion");
				}
				
			});
			
			irSeccion.addClickListener(new Button.ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {
					// TODO Auto-generated method stub
					UI.getCurrent().getNavigator().navigateTo("irSeccion");
				}
			});
			
			
		statusTema.setVisible(false);
		eliminarSeccion.setVisible(false);
		
	}

}
