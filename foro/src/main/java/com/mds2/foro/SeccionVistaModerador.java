package com.mds2.foro;

//import Package.Lista_Seccion_V_Moderador;
import java.util.Vector;
//import Package.Lista_Tema_V_Moderador;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class SeccionVistaModerador extends SeccionVistaUR {
	//private Listener _listaSeccionMod;
	public Lista_Seccion_V_Moderador _unnamed_Lista_Seccion_V_Moderador_;
	public Vector<Lista_Tema_V_Moderador> _list_Tema_V_Moderador = new Vector<Lista_Tema_V_Moderador>();

	public SeccionVistaModerador(){
		
		
		crearNuevaSeccion.setVisible(true);
	
		crearNuevaSeccion.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
			
				UI.getCurrent().getNavigator().navigateTo("crearSeccion");
			}
			
	
			
			
		});
		
	}
	
	
	
	public void cambiarAccesibilidad(Tipo aTipoNuevo) {
		throw new UnsupportedOperationException();
	}
}