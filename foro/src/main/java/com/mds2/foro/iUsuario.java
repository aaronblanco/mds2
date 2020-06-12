package com.mds2.foro;

import java.util.List;

import org.orm.PersistentException;

public interface iUsuario extends iBanner_Usuario_registrado, iMenu_UR {

	public List cargarSolicitudes(int aIdUsuario) throws PersistentException;

	public boolean cambiarDatos(int aIdUsuario, String aUsername, String aPassword, String aDescription, String aFotoURL) throws PersistentException;

	public boolean darDeBaja(int aIdUsuario) throws PersistentException;

	public void ocultarPerfil(int aIdUsuario, boolean aPublico, boolean aOculto) throws PersistentException;

	public int iniciarSesion(String aUsername, String aPassword) throws PersistentException;

	public List cargarAmigos(int aIdUsuario) throws PersistentException;

	public List cargarMensajeCreado(int aIdTema, int aIdUsuario)throws PersistentException;

	public List cargarUltimoMensaje(int aIdUsuario);

	public List cargarTemasSeccionPrivada(int aIdSeccion);

	public List cargarAnuncioPublicado(boolean aEstado) throws PersistentException;

	public List cargarNotificacion(int aIdUsuario) throws PersistentException;

	public List cargarTicket(int aIdUsuario) throws PersistentException;

	public List cargarUsuario() throws PersistentException;

	public boolean crearTema(String aTitulo, String aSubtitulo, String _aDescripcion, int aIdSeccionPropietaria, int aIdTemaPropietario) throws PersistentException;

	public boolean crearMensaje(String aCuerpoMensaje, String aMediaURL, int aIdUsuario, int aIdTema) throws PersistentException;

	public boolean crearTicket(String aCuerpoTicket, int aIdUsuarioPropietarioTicket) throws PersistentException;

	public boolean darMeGustaTema(int aIdTema, int aIdUser);

	public int darMeGustaMensaje(int aIdMensaje, int aIdUser) throws PersistentException;

	public boolean desconectarse();

	public boolean aceptarSolicitud(int aIdUsuario, int aIdAmigo) throws PersistentException;

	public boolean rechazarSolicitud();

	public boolean anadirAmigo(int aIdUsuario, int aIdAmigo);

	public boolean eliminarAmigo(int aIdUsuario, int aIdAmigo);

	public List buscarUsuario(String aKeyword) throws PersistentException;

	public List cargarRespuestas(int aIdMensaje)throws PersistentException;

	public Usuario_registrado obtenerPerfilUsuario(int aIdUser);

	public AdministradorClase obtenerPerfilAdmin(int aIdUser);

	public ModeradorClase obtenerPerfilMod(int aIdUser);

	public boolean eliminarNotificacion(int aIdNotificacion) throws PersistentException;

	public boolean eliminarTicket(int aIdTicket) throws PersistentException;
}