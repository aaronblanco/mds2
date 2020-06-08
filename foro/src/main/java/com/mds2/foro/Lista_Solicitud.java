package com.mds2.foro;

import java.util.Vector;
//import Package.Solicitud;

public class Lista_Solicitud extends Lista_Solicitud_ventana{
	public Mi_perfil _unnamed_Mi_perfil_;
	public Vector<Solicitud> _list_Solicitudes = new Vector<Solicitud>();
	iUsuario iUsr = new DB_Main();
	
	public Lista_Solicitud() {
		
		this._list_Solicitudes = addComponent(iUsr.cargarSolicitudes(id));
		
	}
	
}