package com.mds2.foro;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.ui.Component;
//import Package.Sección_eliminada;
//import DCLv3.SeccionVistaAdministrador;
import com.vaadin.ui.UI;

public class Lista_Seccion_V_administrador extends Lista_Seccion_V_Moderador {
	public AdministradorClase _unnamed_Administrador_;
	public Vector<Seccion_eliminada> _list_Seccion_eliminada = new Vector<Seccion_eliminada>();
	public SeccionVistaAdministrador _unnamed_SeccionVistaAdministrador_;
	
	public Lista_Seccion_V_administrador() throws PersistentException {
		
		super();
		
		if(Sesion.getIDSESION() > 0) {
			
			List<Seccion> su = iUsrNR.cargarListaSecciones(true, false, false, false);
			
			List<Seccion> sec = iUsrNR.cargarListaSecciones(false, true, false, false);
			
			List<Seccion> secM = iUsrNR.cargarListaSecciones(false, false, true, false);
			
			List<Seccion> secA = iUsrNR.cargarListaSecciones(false, false, false, true);
			
			listaSeccion.removeAllComponents();
			
			if(!su.isEmpty()) {
				for(Seccion s : su) {
					SeccionVistaAdministrador sa = new SeccionVistaAdministrador(s);
					listaSeccion.addComponent(sa);
					UI.getCurrent().getNavigator().addView(s.getTitulo() + "Adm", new AdministradorClase(new Lista_Tema_V_Administrador(s.getIdSeccion())));
				}
			}
			
			if(!sec.isEmpty()) {
				for(Seccion s : sec) {
					SeccionVistaAdministrador sa = new SeccionVistaAdministrador(s);
					listaSeccion.addComponent(sa);
					UI.getCurrent().getNavigator().addView(s.getTitulo() + "Adm", new AdministradorClase(new Lista_Tema_V_Administrador(s.getIdSeccion())));
				}
			}
			
			if(!secM.isEmpty()) {
				for(Seccion s : secM) {
					SeccionVistaAdministrador sa = new SeccionVistaAdministrador(s);
					listaSeccion.addComponent(sa);
					UI.getCurrent().getNavigator().addView(s.getTitulo() + "Adm", new AdministradorClase(new Lista_Tema_V_Administrador(s.getIdSeccion())));
				}
			}
			
			if(!secA.isEmpty()) {
				for(Seccion s : secA) {
					SeccionVistaAdministrador sa = new SeccionVistaAdministrador(s);
					listaSeccion.addComponent(sa);
					UI.getCurrent().getNavigator().addView(s.getTitulo() + "Adm", new AdministradorClase(new Lista_Tema_V_Administrador(s.getIdSeccion())));
				}
			}
		}	
	}
	
}