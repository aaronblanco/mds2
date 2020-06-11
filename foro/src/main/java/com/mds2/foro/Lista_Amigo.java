package com.mds2.foro;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.ui.Component;
//import Package.Amigo;

public class Lista_Amigo extends Lista_Amigo_ventana {
	public Mi_perfil _unnamed_Mi_perfil_;
	public Vector<Amigo> _list_Amigo = new Vector<Amigo>();
	iUsuario iUsr = new DB_Main();
	
	public Lista_Amigo() throws PersistentException {
		//las ids lol
		
		List<Amigo> lista = iUsr.cargarAmigos(com.mds2.foro.UsuariosDAO.getUsuariosByORMID(Sesion.getIDSESION()).getIdUsuario());
	
		for(Amigo a : lista) {
			
			Amigo am = new Amigo(a);
			
			amigosMiPerfil.addComponent(am);
			
		}
		
	}
	
}