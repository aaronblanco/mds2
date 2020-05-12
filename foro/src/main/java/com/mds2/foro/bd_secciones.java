package com.mds2.foro;

import java.util.Vector;
import DB_DCL.Seccion;
import DCLv3.Tipo;

public class bd_secciones {
	public Bd_principal _bd_principal_secciones;
	public Vector<Seccion> _contiene_secciones = new Vector<Seccion>();

	public List cargarSeccionUNR(boolean aPublico, boolean aPrivado, boolean aOculto, boolean aEliminado) {
		throw new UnsupportedOperationException();
	}

	public List cargarSeccionesUR(String aAccesibilidadPub, Object aAccesibilidadPriv) {
		throw new UnsupportedOperationException();
	}

	public List cargarSeccionesMod(String aAccesibilidadPub, String aAccesibilidadPriv, String aAccesibilidadOc) {
		throw new UnsupportedOperationException();
	}

	public List cargarSeccionesAdmin() {
		throw new UnsupportedOperationException();
	}

	public boolean crearSeccion(String aTitulo, String aSubtitulo, int aIdUserCreador) {
		throw new UnsupportedOperationException();
	}

	public boolean cambiarAccesibilidadSeccion(Tipo aTipoNuevo) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarSeccion(int aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public List buscarSeccion(String aKeyword) {
		throw new UnsupportedOperationException();
	}
}