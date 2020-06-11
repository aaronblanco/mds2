package com.mds2.foro;

import org.orm.PersistentException;

public interface iUsuario_creador_de_mensaje extends iUsuario {

	public boolean eliminarMensajePropio(int aIdMensaje) throws PersistentException;
}