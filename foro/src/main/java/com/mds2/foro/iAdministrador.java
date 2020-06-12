package com.mds2.foro;

import java.util.List;

import org.orm.PersistentException;

public interface iAdministrador extends iBanner_general, iMenu_UR {


	public List cargarAnuncioDisponible(boolean aEstado) throws PersistentException;

	public List cargarUsuarioAmonestadoAdmin() throws PersistentException;

	public boolean cerrarTicket(int aIdTicket) throws PersistentException;

	public boolean notificarAdministrador(int aIdTema, int aIdUser) throws PersistentException;

	public boolean eliminarTema(int aIdTema) throws PersistentException;

	public boolean cerrarTema(int aIdTema);

	public boolean eliminarSeccion(int aIdSeccion) throws PersistentException;

	public boolean notificarMensaje(int aIdMensaje, int aIdUSer);

	public boolean eliminarMensajeAdmin(int aIdMensaje) throws PersistentException;

	public boolean sancionarUsuario(int aIdUsuario) throws PersistentException;

	public boolean quitarSancion(int aIdUsuario) throws PersistentException;

	public boolean promocionarAMod(int aIdUsuario) throws PersistentException;

	public boolean degradarAUsuarioRegistrado(int aIdUsuario) throws PersistentException;

	public List cargarMensajeCreado(int aIdTema, int aIdUsuario) throws PersistentException;

	public List cargarRespuestas(int aIdMensaje) throws PersistentException;

	public boolean subirAnuncio(String aAnuncioURL) throws PersistentException;

	public boolean anadirAnuncio(int aIdAnuncio, boolean aPublicado) throws PersistentException;

	public boolean eliminarAnuncio(int aIdAnuncio, boolean aPublicado) throws PersistentException;
}