package com.mds2.foro;

import java.util.List;

public interface iUsuario extends iBanner_Usuario_registrado, iMenu_UR {

	public List cargarSolicitudes(int aIdUsuario);

	public boolean cambiarDatos(int aIdUsuario, String aUsername, String aPassword, String aDescription, String aFotoURL);

	public boolean darDeBaja(int aIdUsuario);

	public void ocultarPerfil(int aIdUsuario, boolean aPublico, boolean aOculto);

	public int iniciarSesion(String aUsername, String aPassword);

	public List cargarAmigos(int aIdUsuario);

	public List cargarSeccionesUR(String aAccesibilidadPub, String aAccesibilidadPriv);

	public List cargarTemasUR(int aIdSeccion, String aAccesibilidadPub, String aAccesibilidadPriv);

	public List cargarMensajeUR(int aIdTema, String aAccesibilidadPub);

	public List cargarMensajeCreado(int aIdTema, int aIdUsuario);

	public List cargarUltimoMensaje(int aIdUsuario);

	public List cargarTemasSeccionPrivada(int aIdSeccion);

	public List cargarAmigo();

	public List cargarAnuncioPublicado(boolean aEstado);

	public List cargarNotificacion(int aIdUsuario);

	public List cargarTicket(int aIdUsuario);

	public List cargarUsuario();

	public boolean crearTema(String aTitulo, String aSubtitulo, String aDescripcion, int aIdSeccionPropietaria, int aIdTemaPropietario);

	public boolean crearMensaje(String aCuerpoMensaje, String aMediaURL, int aIdUsuario, int aIdTema);

	public boolean crearTicket(String aCuerpoTicket, int aIdUsuarioPropietarioTicket);

	public boolean darMeGustaTema(int aIdTema, int aIdUser);

	public int darMeGustaMensaje(int aIdMensaje, int aIdUser);

	public boolean desconectarse();

	public boolean aceptarSolicitud(int aIdUsuario, int aIdAmigo);

	public boolean rechazarSolicitud();

	public boolean anadirAmigo(int aIdUsuario, int aIdAmigo);

	public boolean eliminarAmigo(int aIdUsuario, int aIdAmigo);

	public List buscarUsuario(String aKeyword);

	public List cargarRespuestas(int aIdMensaje);

	public Usuario_registrado obtenerPerfilUsuario(int aIdUser);

	public Administrador obtenerPerfilAdmin(int aIdUser);

	public Moderador obtenerPerfilMod(int aIdUser);

	public boolean eliminarNotificacion(int aIdNotificacion);

	public boolean eliminarTicket(int aIdTicket);
}