package com.mds2.foro;

import java.util.List;
import java.util.Vector;
//import Package.PefilUsuarioRegAdmin;
//import DCLv3.UsuarioAmonestado;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.ui.Component;

public class Lista_Usuario_Amonestado extends Lista_Usuario_Amonestado_ventana implements View {
	public Panel_de_administración_vista_moderador _unnamed_Panel_de_administración_vista_moderador_;
	public Vector<PerfilUsuarioRegAdmin> _list_Usuario_registrado = new Vector<PerfilUsuarioRegAdmin>();
	public UsuarioAmonestado _unnamed_UsuarioAmonestado_;

	iModerador iUsr = new DB_Main();
	public Lista_Usuario_Amonestado() throws PersistentException {
		List<PerfilUsuarioRegAdmin> u = iUsr.cargarUsuarioAmonestado();
		
		if(!u.isEmpty()) {
			for(PerfilUsuarioRegAdmin p : u) {
				usuAmonestadoLista.addComponent(p);
			}
		}
		
	}
	
	
}