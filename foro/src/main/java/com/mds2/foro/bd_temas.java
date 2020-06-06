package com.mds2.foro;

import java.util.List;
import java.util.Vector;

public class bd_temas {
	public Bd_principal _bd_principal_temas;
	public Vector<Tema> _contiene_temas = new Vector<Tema>();

	public List cargarTemasUNR(int aIdSeccion, boolean aPublico, boolean aPrivado, boolean aOculto, boolean aEliminado) {
		throw new UnsupportedOperationException();
	}

	public List cargarTemasUR(int aIdSeccion, String aAccesibilidadPub, String aAccesibilidadPriv) {
		throw new UnsupportedOperationException();
	}

	public List cargarTemasMod(int aIdSeccion, String aAccesibilidadPub, String aAccesibilidadPriv, String aAccesibilidadOc) {
		throw new UnsupportedOperationException();
	}

	public List cargarTemasAdmin(int aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public List cargarTemasSeccionPrivada(int aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public boolean crearTema(String aTitulo, String aSubtitulo, String aDescripcion, int aIdSeccionPropietaria, int aIdTemaPropietario) {
		throw new UnsupportedOperationException();
	}

	public boolean darMeGustaTema(int aIdTema, int aIdUser) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarTema(int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public boolean cerrarTema(int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public boolean cambiarAccesibilidad(boolean aPublico, boolean aPrivado, boolean aOculto) {
		throw new UnsupportedOperationException();
	}

	public List buscarTema(String aKeyword, int aIdSeccion) {
		throw new UnsupportedOperationException();
	}
}