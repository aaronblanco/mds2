package com.mds2.foro;

import java.util.List;

import db_dcl.Administrador;
import db_dcl.Moderador;

public class DB_Main implements iAdministrador, iBanner_general, iBanner_Usuario_registrado, iCorreo_electronico, iMenu_moderador, iMenu_UNR, iModerador, iMenu_UR, iUsuario_creador_de_mensaje, iUsuario, iUsuario_no_registrado {

	public List cargarAnuncioDisponible(boolean aEstado) {
		throw new UnsupportedOperationException();
	}

	public List cargarUsuarioAmonestadoAdmin() {
		throw new UnsupportedOperationException();
	}

	public boolean cerrarTicket(int aIdTicket) {
		throw new UnsupportedOperationException();
	}

	public boolean notificarAdministrador(int aIdTema, int aIdUser) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarTema(int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public boolean cerrarTema(int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarSeccion(int aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public boolean notificarMensaje(int aIdMensaje, int aIdUSer) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarMensajeAdmin(int aIdMensaje) {
		throw new UnsupportedOperationException();
	}

	public boolean sancionarUsuario(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public boolean quitarSancion(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public boolean promocionarAMod(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public boolean degradarAUsuarioRegistrado(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public List cargarMensajeCreado(int aIdTema, int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public List cargarRespuestas(int aIdMensaje) {
		throw new UnsupportedOperationException();
	}

	public Administrador obtenerPerfilAdmin(int aIdUser) {
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

	public List cargarSeccionesMod(String aAccesibilidadPub, Object aAccesibilidadPriv, String aAccesibilidadOc) {
		throw new UnsupportedOperationException();
	}

	public List cargarTemasMod(int aIdSeccion, String aAccesibilidadPub, String aAccesibilidadPriv, String aAccesibilidadOc) {
		throw new UnsupportedOperationException();
	}

	public List cargarMensajeMod(int aIdTema, String aAccesibilidadPub) {
		throw new UnsupportedOperationException();
	}

	public List cargarUsuarioAmonestado() {
		throw new UnsupportedOperationException();
	}

	public boolean crearSeccion(String aTitulo, String aSubtitulo, String aFotoURL, int aIdUserCreador) {
		throw new UnsupportedOperationException();
	}

	public boolean cambiarAccesibilidad(boolean aPublico, boolean aPrivado, boolean aOculto) {
		throw new UnsupportedOperationException();
	}

	public boolean amonestarUsuario(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public List cargarMensajePropio(int aIdTema, int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Moderador obtenerPerfilModerador(int aIdUser) {
		throw new UnsupportedOperationException();
	}

	public boolean ocultarMensaje(int aIdMensaje) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarMensajePropio(Object aIdMensaje) {
		throw new UnsupportedOperationException();
	}

	public ListaAmigos[] cargarListaAmigos() {
		throw new UnsupportedOperationException();
	}

	public List cargarSolicitudes(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public boolean cambiarDatos(int aIdUsuario, String aUsername, String aPassword, String aDescription, String aFotoURL) {
		throw new UnsupportedOperationException();
	}

	public boolean darDeBaja(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void ocultarPerfil(int aIdUsuario, boolean aPublico, boolean aOculto) {
		throw new UnsupportedOperationException();
	}

	public int iniciarSesion(String aUsername, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public List cargarAmigos(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public List cargarSeccionesUR(String aAccesibilidadPub, String aAccesibilidadPriv) {
		throw new UnsupportedOperationException();
	}

	public List cargarTemasUR(int aIdSeccion, String aAccesibilidadPub, String aAccesibilidadPriv) {
		throw new UnsupportedOperationException();
	}

	public List cargarMensajeUR(int aIdTema, String aAccesibilidadPub) {
		throw new UnsupportedOperationException();
	}

	public List cargarUltimoMensaje(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public List cargarTemasSeccionPrivada(int aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public List cargarAmigo() {
		throw new UnsupportedOperationException();
	}

	public List cargarAnuncioPublicado(boolean aEstado) {
		throw new UnsupportedOperationException();
	}

	public List cargarNotificacion(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public List cargarTicket(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public List cargarUsuario() {
		throw new UnsupportedOperationException();
	}

	public boolean crearTema(String aTitulo, String aSubtitulo, String aDescripcion, int aIdSeccionPropietaria, int aIdTemaPropietario) {
		throw new UnsupportedOperationException();
	}

	public boolean crearMensaje(String aCuerpoMensaje, String aMediaURL, int aIdUsuario, int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public boolean crearTicket(String aCuerpoTicket, int aIdUsuarioPropietarioTicket) {
		throw new UnsupportedOperationException();
	}

	public boolean darMeGustaTema(int aIdTema, int aIdUser) {
		throw new UnsupportedOperationException();
	}

	public int darMeGustaMensaje(int aIdMensaje, int aIdUser) {
		throw new UnsupportedOperationException();
	}

	public boolean desconectarse() {
		throw new UnsupportedOperationException();
	}

	public boolean aceptarSolicitud(int aIdUsuario, int aIdAmigo) {
		throw new UnsupportedOperationException();
	}

	public boolean rechazarSolicitud() {
		throw new UnsupportedOperationException();
	}

	public boolean anadirAmigo(int aIdUsuario, int aIdAmigo) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarAmigo(int aIdUsuario, int aIdAmigo) {
		throw new UnsupportedOperationException();
	}

	public List buscarUsuario(String aKeyword) {
		throw new UnsupportedOperationException();
	}

	public Usuario_registrado obtenerPerfilUsuario(int aIdUser) {
		throw new UnsupportedOperationException();
	}

	public Moderador obtenerPerfilMod(int aIdUser) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarNotificacion(int aIdNotificacion) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarTicket(int aIdTicket) {
		throw new UnsupportedOperationException();
	}

	public boolean registrarse(String aUsername, String aFullname, String aPassword, String aDescription, String aEmail, String aFotoURL) {
		throw new UnsupportedOperationException();
	}

	public List cargarListaSecciones(boolean aPublico, boolean aPrivado, boolean aOculto, boolean aEliminado) {
		throw new UnsupportedOperationException();
	}

	public List cargarTemasUNR(int aIdSeccion, boolean aPublico, boolean aPrivado, boolean aOculto, boolean aEliminado) {
		throw new UnsupportedOperationException();
	}

	public List cargarMensajeUNR(int aIdTema, boolean aPublico, boolean aPrivado, boolean aOculto, boolean aEliminado) {
		throw new UnsupportedOperationException();
	}

	public boolean recuperarPassword(String aEmail) {
		throw new UnsupportedOperationException();
	}

	public List buscarSeccion(String aKeyword) {
		throw new UnsupportedOperationException();
	}

	public List buscarTema(String aKeyword, int aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public List buscarMensaje(String aKeyword, int aIdTema) {
		throw new UnsupportedOperationException();
	}
}