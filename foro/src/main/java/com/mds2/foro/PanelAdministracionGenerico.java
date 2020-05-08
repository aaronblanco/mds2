package com.mds2.foro;

import com.vaadin.navigator.View;

public class PanelAdministracionGenerico extends PanelAdministracionGenerico_ventana implements View{
	//private TextField _panelAdministracion;
	
	public PanelAdministracionGenerico() {
		
		buscador.setVisible(false);
		
		configPubliAdmin.setVisible(false);
		
		modNumUM.setVisible(false);
		
	}
	
}