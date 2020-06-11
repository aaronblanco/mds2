package com.mds2.foro;

import java.util.List;
//import DCLv3.SeccionVistaAdministrador;
import java.util.Vector;
//import Package.Tema_eliminado;
//import DCLv3.Tema_vista_Admin;

import org.orm.PersistentException;

import com.vaadin.ui.Component;

public class Lista_Tema_V_Administrador extends Lista_Tema_V_Moderador {
	public AdministradorClase _administrador;
	public SeccionVistaAdministrador _unnamed_SeccionVistaAdministrador_;
	public Vector<Tema_eliminado> _list_Tema_eliminado = new Vector<Tema_eliminado>();
	public Tema_vista_Admin _unnamed_Tema_vista_Admin_;
	iUsuario_no_registrado iUsrNR  = new DB_Main();

	public Lista_Tema_V_Administrador(int idSeccion) throws NumberFormatException, PersistentException {
		
		super(idSeccion);
		
		List<Tema> t = iUsrNR.cargarTemasUNR(idSeccion, false, false, false, true);
	
		
		for(Tema it: t) {
			Tema_vista_Admin tema = new Tema_vista_Admin(it);
			listaTemas.addComponent(tema);
		
		}
		
	}
	
}