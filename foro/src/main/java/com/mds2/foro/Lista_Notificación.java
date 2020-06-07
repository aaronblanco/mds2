package com.mds2.foro;

import java.util.Vector;
//import Package.Notificacion;

public class Lista_Notificación extends Lista_Notificacion_ventana{
	public Mi_perfil _unnamed_Mi_perfil_;
	public Vector<NotificacionClase> _list_Notificacion = new Vector<NotificacionClase>();

	iUsuario iUsr = new DB_Main();
	public Lista_Notificación() {
		this._list_Notificacion = addComponent(iUsr.cargarNotificacion(aIdUsuario));
		
		
	}
	
}