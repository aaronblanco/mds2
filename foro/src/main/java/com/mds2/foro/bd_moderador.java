package com.mds2.foro;

import java.util.Vector;

public class bd_moderador {
	public Bd_principal _bd_principal_moderador;
	public Vector<ModeradorBD> _contiene_moderador = new Vector<ModeradorBD>();

	public boolean degradarAUsuarioRegistrado(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public ModeradorBD obtenerPerfilMod(int aIdUser) {
		throw new UnsupportedOperationException();
	}
}