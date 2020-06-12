package com.mds2.foro;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class bd_moderador {
	public Bd_principal _bd_principal_moderador;
	public Vector<Moderador> _contiene_moderador = new Vector<Moderador>();

	public boolean degradarAUsuarioRegistrado(int aIdUsuario) throws PersistentException {
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		try {
			Moderador mod = com.mds2.foro.ModeradorDAO.getModeradorByORMID(aIdUsuario);
			
			com.mds2.foro.ModeradorDAO.delete(mod);
			t.commit();
			return true;
		}catch(Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		
		return false;
	}

}