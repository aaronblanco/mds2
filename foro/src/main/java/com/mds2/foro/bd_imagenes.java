package com.mds2.foro;

import java.util.Vector;

import org.orm.PersistentException;

public class bd_imagenes {
	public Bd_principal _bd_principal_imagenes;
	public Vector<imagenes> _contiene_imagenes = new Vector<imagenes>();

	public boolean crearImg(String aFotoURL) throws PersistentException {
		
		imagenes i = imagenesDAO.createImagenes();
		i.setUrl(aFotoURL);
		return com.mds2.foro.imagenesDAO.save(i);
		
	}
}