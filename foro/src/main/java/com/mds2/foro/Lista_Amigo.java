package com.mds2.foro;

import java.util.Vector;

import com.vaadin.ui.Component;
//import Package.Amigo;

public class Lista_Amigo extends Lista_Amigo_ventana {
	public Mi_perfil _unnamed_Mi_perfil_;
	public Vector<Amigo> _list_Amigo = new Vector<Amigo>();
	iUsuario iUsr = new DB_Main();
	
	public Lista_Amigo() {
		//las ids lol
		_list_Amigo = iUsr.cargarListaAmigos(com.mds2.foro.UsuariosDAO.getUsuariosByORMID(idUsuario));
		
		for(Object o : _list_Amigo)
			amigosMiPerfil.addComponent((Component) o);
		
	}
	
}