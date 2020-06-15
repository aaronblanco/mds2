package com.mds2.foro;

import java.util.Vector;
//import Package.PefilUsuarioRegAdmin;

import org.orm.PersistentException;

public class Lista_Usuario_Amonestado_V_Administrador extends Lista_Usuario_Amonestado {
	public Panel_de_administracion_vista_administrador _unnamed_Panel_de_administración_vista_administrador_;
	public Vector<PerfilUsuarioRegAdmin> _list_Usuario_registrado = new Vector<PerfilUsuarioRegAdmin>();
	
	public Lista_Usuario_Amonestado_V_Administrador() throws PersistentException {
		super();
		
	}
	
}