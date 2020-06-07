package com.mds2.foro;

import java.util.Vector;
//import Package.Sección_privada;
//import DCLv3.SeccionVistaUR;

import com.vaadin.ui.Component;
import com.vaadin.ui.VerticalLayout;

public class Lista_Seccion_V_Usuario_Reg extends Lista_Seccion {
	public Usuario_registrado _unnamed_Usuario_registrado_;
	public Vector<Seccion_privada> _list_Seccion_privada = new Vector<Seccion_privada>();
	public SeccionVistaUR _unnamed_SeccionVistaUR_;
	
	public Lista_Seccion_V_Usuario_Reg() {
		super();
		
		_list_Seccion_privada = (Vector<Seccion_privada>) iUsrNR.cargarListaSecciones(false, true, false, false);
		
		listaSeccion.addComponent((Component) _list_Seccion_privada);
		
	}
	
}
