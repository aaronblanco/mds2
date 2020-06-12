package com.mds2.foro;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class bd_notificaciones {
	public Bd_principal _bd_principal_notificaciones;
	public Vector<Notificacion> _contiene_notificaciones = new Vector<Notificacion>();

	public List cargarNotificacion(int aIdUsuario) throws PersistentException {
		
		List<Notificacion> lista = null;
		
		com.mds2.foro.Notificacion[] commds2foroNotificacions = com.mds2.foro.NotificacionDAO.listNotificacionByQuery("IdUsuarioPropietario = '"+aIdUsuario+"'", "IdNotificacion");
		lista = new ArrayList<Notificacion>();
		for(Notificacion n : commds2foroNotificacions) {
			lista.add(n);
		}
		
		
		return lista;
	}

	public boolean notificarAdministradorTema(int aIdTema, int aIdUser) throws PersistentException {
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		Notificacion not = com.mds2.foro.NotificacionDAO.createNotificacion();
		try {
			Usuarios u = com.mds2.foro.UsuariosDAO.getUsuariosByORMID(aIdUser);
			Tema tema = com.mds2.foro.TemaDAO.getTemaByORMID(aIdTema);
			not.setDescripcionCampo("El tema " + tema.getTitulo() + " ha sido reportado por " + u.getNombreUsuario());
			not.setTitulo(tema.getTitulo() + " reportado.");
			not.setIdUsuarioPropietario(1);
			
			com.mds2.foro.NotificacionDAO.save(not);
			t.commit();

			return true;
		}catch(Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		
		return false;
	}

	public boolean notificarMensaje(int aIdMensaje, int aIdUser) throws PersistentException {
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		Notificacion not = com.mds2.foro.NotificacionDAO.createNotificacion();
		try {
			Usuarios u = com.mds2.foro.UsuariosDAO.getUsuariosByORMID(aIdUser);
			Mensaje m = com.mds2.foro.MensajeDAO.getMensajeByORMID(aIdMensaje);
			Usuarios um = com.mds2.foro.UsuariosDAO.getUsuariosByORMID(m.getIdPropietario());
			not.setDescripcionCampo("El mensaje " + m.getIdMensaje() + " del usuario "+um.getNombreUsuario()+" ha sido reportado por " + u.getNombreUsuario());
			not.setTitulo(m.getIdMensaje() + " reportado.");
			not.setIdUsuarioPropietario(1);
			com.mds2.foro.NotificacionDAO.save(not);
			t.commit();

			return true;
		}catch(Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		
		return false;

	}

	public boolean eliminarNotificacion(int aIdNotificacion) throws PersistentException {
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		try {
			com.mds2.foro.Notificacion lcommds2foroNotificacion = com.mds2.foro.NotificacionDAO.loadNotificacionByQuery("IdNotificacion = '"+aIdNotificacion+"'", null);
			
			com.mds2.foro.NotificacionDAO.delete(lcommds2foroNotificacion);			
			
			t.commit();
			
			return true;
		}catch(Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		
		return false;
	}

	public boolean anadirAmigo(int aIdUsuario, int aIdAmigo) throws PersistentException {

		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		Notificacion not = com.mds2.foro.NotificacionDAO.createNotificacion();
		try {
			Usuarios u = com.mds2.foro.UsuariosDAO.getUsuariosByORMID(aIdUsuario);
			Usuarios amigo = com.mds2.foro.UsuariosDAO.getUsuariosByORMID(aIdAmigo);
			not.setDescripcionCampo("El usuario " + u.getNombreUsuario() + " quiere ser tu amigo.");
			not.setTitulo("Nueva solicitud de amistad.");
			not.setIdUsuarioPropietario(aIdAmigo);
			com.mds2.foro.NotificacionDAO.save(not);
			t.commit();
			return true;
		}catch(Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		
		return false;
		
	}
}