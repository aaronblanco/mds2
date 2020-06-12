package com.mds2.foro;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class bd_imagenes {
	public Bd_principal _bd_principal_imagenes;
	public Vector<imagenes> _contiene_imagenes = new Vector<imagenes>();

	public boolean crearImg(String aFotoURL, int idMsg) throws PersistentException {
		
	PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		
		try {
			imagenes a = com.mds2.foro.imagenesDAO.createImagenes();
			Mensaje m = com.mds2.foro.MensajeDAO.getMensajeByORMID(idMsg);
			
			a.setUrl(aFotoURL);
			m.setIdMedia(a.getIdMedia());
			
			com.mds2.foro.MensajeDAO.save(m);
			a.setMensaje_imagen(m);
			com.mds2.foro.imagenesDAO.save(a);
			t.commit();
			
			return true;
			
		}catch(Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		
		return false;
		
	}
}