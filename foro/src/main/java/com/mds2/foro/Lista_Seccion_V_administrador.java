package com.mds2.foro;

import java.util.Vector;

import com.vaadin.ui.Component;
//import Package.Sección_eliminada;
//import DCLv3.SeccionVistaAdministrador;

public class Lista_Seccion_V_administrador extends Lista_Seccion_V_Moderador {
	public AdministradorClase _unnamed_Administrador_;
	public Vector<Sección_eliminada> _list_Seccion_eliminada = new Vector<Sección_eliminada>();
	public SeccionVistaAdministrador _unnamed_SeccionVistaAdministrador_;
	
	public Lista_Seccion_V_administrador() {
		super();
		
		_list_Seccion_eliminada = (Vector<Sección_eliminada>) iUsrNR.cargarListaSecciones(false, false, false, true);
		listaSeccion.addComponent((Component) _list_Seccion_eliminada);
		
	}
	
}