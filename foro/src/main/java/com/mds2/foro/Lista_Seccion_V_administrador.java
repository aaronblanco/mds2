package com.mds2.foro;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.ui.Component;
//import Package.Sección_eliminada;
//import DCLv3.SeccionVistaAdministrador;

public class Lista_Seccion_V_administrador extends Lista_Seccion_V_Moderador {
	public AdministradorClase _unnamed_Administrador_;
	public Vector<Seccion_eliminada> _list_Seccion_eliminada = new Vector<Seccion_eliminada>();
	public SeccionVistaAdministrador _unnamed_SeccionVistaAdministrador_;
	
	public Lista_Seccion_V_administrador() throws PersistentException {
		
		super();
		
		List<Seccion> sec = iUsrNR.cargarListaSecciones(false, false, false, true);
		if(!sec.isEmpty()) {
			for(Seccion s : sec) {
				SeccionVistaAdministrador sc = new SeccionVistaAdministrador(s);
				listaSeccion.addComponent(sc);
			}
		}
	}
	
}