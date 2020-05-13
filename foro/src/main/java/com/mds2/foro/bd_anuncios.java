package com.mds2.foro;

import java.util.List;
import java.util.Vector;
import db_dcl.Anuncio;

public class bd_anuncios {
	public Bd_principal _bd_principal_anuncios;
	public Vector<Anuncio> _contiene_anuncios = new Vector<Anuncio>();

	public List cargarAnuncioDisponible(boolean aEstado) {
		throw new UnsupportedOperationException();
	}

	public List cargarAnuncioPublicado(boolean aEstado) {
		throw new UnsupportedOperationException();
	}

	public boolean subirAnuncio(String aAnuncioURL) {
		throw new UnsupportedOperationException();
	}

	public boolean anadirAnuncio(int aIdAnuncio, boolean aPublicado) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarAnuncio(int aIdAnuncio, boolean aPublicado) {
		throw new UnsupportedOperationException();
	}
}