package com.mds2.foro;

import java.util.Vector;

import com.vaadin.ui.Component;
//import Package.Mensaje_UR_creado;

public class Lista_Mensaje_creado extends Lista_Mensaje_V_Usuario_Reg {
	public Vector<Mensaje_UR_creado> _list_Mensaje_UR_creado = new Vector<Mensaje_UR_creado>();
	iUsuario_creador_de_mensaje iUsr = new DB_Main();
	
	
	public Lista_Mensaje_creado() {
		super();
		//LAS IDS
		listaMensajeAdmin.addComponent((Component) iUsr.cargarMensajeCreado(1, 1));
		
	}
	
}