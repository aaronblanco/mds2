package com.mds2.foro;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
//import Package.Notificacion;

import org.orm.PersistentException;

public class Lista_Notificacion extends Lista_Notificacion_ventana{
	public Mi_perfil _unnamed_Mi_perfil_;
	public Vector<NotificacionClase> _list_Notificacion = new Vector<NotificacionClase>();

	iUsuario iUsr = new DB_Main();
	public Lista_Notificacion() throws PersistentException {
		
		com.mds2.foro.Notificacion[] commds2foroNotificacions = com.mds2.foro.NotificacionDAO.listNotificacionByQuery(null, null);

		List<NotificacionClase> lista = new ArrayList<NotificacionClase>();
		
		for(Notificacion n : commds2foroNotificacions) {
			NotificacionClase not = new NotificacionClase(n);
			notiMiPerfil.addComponent(not);
		}
		
	}
	
}