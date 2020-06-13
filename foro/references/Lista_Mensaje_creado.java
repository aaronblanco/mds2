package com.mds2.foro;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.ui.Component;
//import Package.Mensaje_UR_creado;

public class Lista_Mensaje_creado extends Lista_Mensaje_V_Usuario_Reg {
	public Vector<Mensaje_UR_creado> _list_Mensaje_UR_creado = new Vector<Mensaje_UR_creado>();
	iUsuario_creador_de_mensaje iUsr = new DB_Main();
	
	
	public Lista_Mensaje_creado(int idTema) throws PersistentException {
		super(idTema);
		
		List<Mensaje> m = iUsr.cargarMensajeCreado(idTema, Sesion.getIDSESION());
		
		if(!m.isEmpty()) {
			for(Mensaje me : m) {
				MensajeClase msg = new MensajeClase(me);
				listaMensajeAdmin.addComponent(msg);
			}
		}
		
		
		
	}
	
}