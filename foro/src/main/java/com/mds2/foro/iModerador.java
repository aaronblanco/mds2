package com.mds2.foro;

import java.util.List;

import org.orm.PersistentException;

public interface iModerador extends iBanner_Usuario_registrado, iMenu_moderador {

	public List cargarUsuarioAmonestado() throws PersistentException;

	public boolean crearSeccion(String aTitulo, String aSubtitulo, String aFotoURL, int aIdUserCreador) throws PersistentException;

	public boolean cambiarAccesibilidad(boolean aPublico, boolean aPrivado, boolean aOculto, int idTema) throws PersistentException;

	public boolean amonestarUsuario(int aIdUsuario) throws PersistentException;

	public List cargarRespuestas(int aIdMensaje)throws PersistentException;

	public List cargarMensajePropio(int aIdTema, int aIdUsuario) throws PersistentException;

	public boolean ocultarMensaje(int aIdMensaje) throws PersistentException;
}