package com.mds2.foro;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
//import Package.Solicitud;

import org.orm.PersistentException;

public class Lista_Solicitud extends Lista_Solicitud_ventana{
	public Mi_perfil _unnamed_Mi_perfil_;
	public Vector<Solicitud> _list_Solicitudes = new Vector<Solicitud>();
	iUsuario iUsr = new DB_Main();
	
	public Lista_Solicitud() throws PersistentException {

		com.mds2.foro.Notificacion[] commds2foroNotificacions = com.mds2.foro.NotificacionDAO.listNotificacionByQuery(null, null);

		List<NotificacionClase> lista = new ArrayList<NotificacionClase>();
		
		for(Notificacion n : commds2foroNotificacions) {
			Solicitud not = new Solicitud(n,Sesion.getIDSESION());
			soliMiPerfil.addComponent(not);
		}
		
	}
	
}