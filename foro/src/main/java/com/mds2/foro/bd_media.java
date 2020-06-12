package com.mds2.foro;

import org.orm.PersistentException;

public class bd_media {
	public Bd_principal _bd_principal_media;
	public media _unnamed_media_;

	public boolean crearMedia(String aMediaURL, int idMsg) throws PersistentException {
		bd_imagenes bdi = new bd_imagenes();
		return bdi.crearImg(aMediaURL, idMsg);
		
	}
}