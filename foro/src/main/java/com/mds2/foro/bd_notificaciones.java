package com.mds2.foro;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class bd_notificaciones {
	public Bd_principal _bd_principal_notificaciones;
	public Vector<Notificacion> _contiene_notificaciones = new Vector<Notificacion>();

	public List cargarNotificacion(int aIdUsuario) throws PersistentException {
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		NotificacionCriteria nc = new NotificacionCriteria();
		Notificacion[] not = nc.listNotificacion();		
		
		try {
			for(Notificacion n : not) {
				if(n.getIdUsuarioPropietario() == aIdUsuario)
					_contiene_notificaciones.add(n);
			}
			t.commit();
		}catch(Exception e) {
			t.rollback();
		}
		
		return _contiene_notificaciones;
	}

	public boolean notificarAdministradorTema(int aIdTema, int aIdUser) throws PersistentException {
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		Notificacion not = com.mds2.foro.NotificacionDAO.createNotificacion();
		
		
		return false;
	}

	public boolean notificarMensaje(int aIdMensaje, Object aIdUser) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarNotificacion(int aIdNotificacion) throws PersistentException {
		return com.mds2.foro.NotificacionDAO.delete(com.mds2.foro.NotificacionDAO.getNotificacionByORMID(aIdNotificacion));
	}

	public boolean anadirAmigo(int aIdUsuario, int aIdAmigo) {
		
		//no existe?
		return true;
		
	}
}