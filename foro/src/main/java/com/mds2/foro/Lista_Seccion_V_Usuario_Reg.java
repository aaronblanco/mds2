package com.mds2.foro;

import java.util.List;
import java.util.Vector;
//import Package.Sección_privada;
//import DCLv3.SeccionVistaUR;

import org.orm.PersistentException;

import com.vaadin.ui.Component;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public class Lista_Seccion_V_Usuario_Reg extends Lista_Seccion {
	public Usuario_registrado _unnamed_Usuario_registrado_;
	public Vector<Seccion_privada> _list_Seccion_privada = new Vector<Seccion_privada>();
	public SeccionVistaUR _unnamed_SeccionVistaUR_;
	
	public Lista_Seccion_V_Usuario_Reg() throws PersistentException {
		super();
		listaSeccion.removeAllComponents();
		
		if(Sesion.getIDSESION() > 0) {
			
			List<Seccion> su = iUsrNR.cargarListaSecciones(true, false, false, false);
			
			List<Seccion> sec = iUsrNR.cargarListaSecciones(false, true, false, false);
			
			
			if(!su.isEmpty()) {
				for(Seccion s : su) {
					SeccionVistaUR sur = new SeccionVistaUR(s);
					listaSeccion.addComponent(sur);
					UI.getCurrent().getNavigator().addView(s.getTitulo()+ "Usr", new Usuario_registrado(new Lista_Tema_V_Usuario_Reg(s.getIdSeccion())));
				}
			}
			
			if(!sec.isEmpty()) {
				for(Seccion s : sec) {
					SeccionVistaUR sc = new SeccionVistaUR(s);
					listaSeccion.addComponent(sc);
					UI.getCurrent().getNavigator().addView(s.getTitulo()+"Usr", new Usuario_registrado(new Lista_Tema_V_Usuario_Reg(s.getIdSeccion())));
				}
			}
		}
	}
}
