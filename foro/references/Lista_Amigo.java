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
		
		List<Usuarios> lista = iUsr.cargarAmigos(Sesion.getIDSESION());
	
		for(Usuarios u : lista) {
			
			Amigo a = new Amigo(u);
			
			amigosMiPerfil.addComponent(a);
			
		}
		
	}
	
}