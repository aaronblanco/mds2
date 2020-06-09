package com.mds2.foro;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;

public class bd_anuncios {
	public Bd_principal _bd_principal_anuncios;
	public Vector<Anuncio> _contiene_anuncios = new Vector<Anuncio>();

	public List cargarAnuncioDisponible(boolean aEstado) throws PersistentException {
		AnuncioCriteria ac = new AnuncioCriteria();
		
		Anuncio[] ad = com.mds2.foro.AnuncioDAO.listAnuncioByQuery("Estado = '"+aEstado+"'", null);
		List anDi = new ArrayList();
		for(Anuncio a : ad)
			anDi.add(a);
		return anDi;
	}

	public List cargarAnuncioPublicado(boolean aEstado) throws PersistentException {
		return cargarAnuncioDisponible(aEstado);
	}

	public boolean subirAnuncio(String aAnuncioURL) throws PersistentException {
		
		Anuncio a = com.mds2.foro.AnuncioDAO.createAnuncio();
		a.setImagen(aAnuncioURL);
		a.setPublicado(false);
		com.mds2.foro.AnuncioDAO.save(a);
		
		return true;
		
	}

	public boolean anadirAnuncio(int aIdAnuncio, boolean aPublicado) throws PersistentException {
		
		Anuncio a = AnuncioDAO.getAnuncioByORMID(aIdAnuncio);
		a.setPublicado(true);
		return a.getPublicado();
	}

	public boolean eliminarAnuncio(int aIdAnuncio, boolean aPublicado) throws PersistentException {
		Anuncio a = AnuncioDAO.getAnuncioByORMID(aIdAnuncio);
		a.setPublicado(false);
		return !a.getPublicado();
	}
}