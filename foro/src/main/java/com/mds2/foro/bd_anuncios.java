package com.mds2.foro;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class bd_anuncios {
	public Bd_principal _bd_principal_anuncios;
	public Vector<Anuncio> _contiene_anuncios = new Vector<Anuncio>();

	public List cargarAnuncioDisponible(boolean aEstado) throws PersistentException {
		
		List<Anuncio> lista = new ArrayList<Anuncio>();
		com.mds2.foro.Anuncio[] commds2foroAnuncios = com.mds2.foro.AnuncioDAO.listAnuncioByQuery("Publicado = '"+0+"'", "IdAnuncio");

		for(Anuncio a : commds2foroAnuncios) {
			lista.add(a);
		}
		return lista;
	}

	public List cargarAnuncioPublicado(boolean aEstado) throws PersistentException {
		List<Anuncio> lista = new ArrayList<Anuncio>();
		com.mds2.foro.Anuncio[] commds2foroAnuncios = com.mds2.foro.AnuncioDAO.listAnuncioByQuery("Publicado = '"+1+"'", "IdAnuncio");

		for(Anuncio a : commds2foroAnuncios) {
			lista.add(a);
		}
		return lista;
	}

	public boolean subirAnuncio(String aAnuncioURL) throws PersistentException {
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		
		try {
			Anuncio a = com.mds2.foro.AnuncioDAO.createAnuncio();
			
			a.setImagen(aAnuncioURL);
			a.setPublicado(false);
			com.mds2.foro.AnuncioDAO.save(a);
			t.commit();
			
			return true;
			
		}catch(Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		
		return false;
		
	}

	public boolean anadirAnuncio(int aIdAnuncio, boolean aPublicado) throws PersistentException {
		
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		
		try {
			Anuncio a = com.mds2.foro.AnuncioDAO.loadAnuncioByQuery("IdAnuncio = '"+aIdAnuncio+"'", "IdAnuncio");
			
			a.setPublicado(true);
			com.mds2.foro.AnuncioDAO.save(a);
			t.commit();
			
			return true;
			
		}catch(Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		
		return false;
	}

	public boolean eliminarAnuncio(int aIdAnuncio, boolean aPublicado) throws PersistentException {
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		
		try {
			Anuncio a = com.mds2.foro.AnuncioDAO.loadAnuncioByQuery("IdAnuncio = '"+aIdAnuncio+"'", "IdAnuncio");
			
			a.setPublicado(false);
			com.mds2.foro.AnuncioDAO.save(a);
			t.commit();
			
			return true;
			
		}catch(Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		
		return false;
	}
}