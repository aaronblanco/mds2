package com.mds2.foro;

import java.util.Vector;

import org.orm.PersistentException;

public class bd_moderador {
	public Bd_principal _bd_principal_moderador;
	public Vector<Moderador> _contiene_moderador = new Vector<Moderador>();

	public boolean degradarAUsuarioRegistrado(int aIdUsuario) throws PersistentException {
		
		Moderador mod = com.mds2.foro.ModeradorDAO.getModeradorByORMID(aIdUsuario);
		
		return com.mds2.foro.ModeradorDAO.delete(mod);
	}

	public Moderador obtenerPerfilMod(int aIdUser) {
		throw new UnsupportedOperationException();
	}
}