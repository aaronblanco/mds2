package com.mds2.foro;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentTransaction;

public class bd_notificaciones {
	public Bd_principal _bd_principal_notificaciones;
	public Vector<Notificacion> _contiene_notificaciones = new Vector<Notificacion>();

	public List cargarNotificacion(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public boolean notificarAdministradorTema(int aIdTema, int aIdUser) {
		throw new UnsupportedOperationException();
	}

	public boolean notificarMensaje(int aIdMensaje, Object aIdUser) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarNotificacion(int aIdNotificacion) {
		throw new UnsupportedOperationException();
	}

	public boolean anadirAmigo(int aIdUsuario, int aIdAmigo) {
		
		throw new UnsupportedOperationException();
		
		
	}
}