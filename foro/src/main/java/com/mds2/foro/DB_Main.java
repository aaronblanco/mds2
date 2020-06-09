package com.mds2.foro;

import java.util.List;

import org.orm.PersistentException;

public class DB_Main implements iAdministrador, iBanner_general, iBanner_Usuario_registrado, iCorreo_electronico, iMenu_moderador, iMenu_UNR, iModerador, iMenu_UR, iUsuario_creador_de_mensaje, iUsuario, iUsuario_no_registrado {

	bd_usuarios bdUsr = new bd_usuarios();
	bd_secciones bdSec = new bd_secciones();
	bd_administrador bdAdmin = new bd_administrador();
	bd_anuncios bdAn = new bd_anuncios();
	bd_imagenes bdIm = new bd_imagenes();
	bd_media bdMed = new bd_media();
	bd_mensajes bdMsg = new bd_mensajes();
	bd_moderador bdMod = new bd_moderador();
	bd_notificaciones bdNot = new bd_notificaciones();
	bd_temas bdTema = new bd_temas();
	bd_tickets bdTick = new bd_tickets();
	bd_videos bdVid = new bd_videos();
	
	public List cargarAnuncioDisponible(boolean aEstado) throws PersistentException {
		return bdAn.cargarAnuncioDisponible(aEstado);
	}

	public List cargarUsuarioAmonestadoAdmin() throws PersistentException {
		return bdUsr.cargarUsuarioAmonestadoAdmin();
	}

	public boolean cerrarTicket(int aIdTicket) throws PersistentException {
		return bdTick.cerrarTicket(aIdTicket);
	}

	public boolean notificarAdministrador(int aIdTema, int aIdUser) throws PersistentException {
		return bdNot.notificarAdministradorTema(aIdTema, aIdUser);
	}

	public boolean eliminarTema(int aIdTema) throws PersistentException {
		return bdTema.eliminarTema(aIdTema);
	}

	public boolean cerrarTema(int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarSeccion(int aIdSeccion) throws PersistentException {
		return bdSec.eliminarSeccion(aIdSeccion);
	}

	public boolean notificarMensaje(int aIdMensaje, int aIdUSer) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarMensajeAdmin(int aIdMensaje) throws PersistentException {
		return bdMsg.eliminarMensajeAdmin(aIdMensaje);
	}

	public boolean sancionarUsuario(int aIdUsuario) throws PersistentException {
		return bdUsr.sancionarUsuario(aIdUsuario);
	}

	public boolean quitarSancion(int aIdUsuario) throws PersistentException {
		return bdUsr.quitarSancion(aIdUsuario);
	}

	public boolean promocionarAMod(int aIdUsuario) throws PersistentException {
		return bdUsr.promocionarAMod(aIdUsuario);
	}

	public boolean degradarAUsuarioRegistrado(int aIdUsuario) throws PersistentException {
		return bdMod.degradarAUsuarioRegistrado(aIdUsuario);
	}

	public List cargarMensajeCreado(int aIdTema, int aIdUsuario) throws PersistentException {
		return bdMsg.cargarMensajeCreado(aIdTema, aIdUsuario);
	}

	public List cargarRespuestas(int aIdMensaje) throws PersistentException {
		return bdMsg.cargarRespuestas(aIdMensaje);
	}

	public Administrador obtenerPerfilAdmin(int aIdUser) {
		//return bdUsr.obtenerPerfilAdmin(aIdUser);
		return null;
	}

	public boolean subirAnuncio(String aAnuncioURL) throws PersistentException {
		return bdAn.subirAnuncio(aAnuncioURL);
	}

	public boolean anadirAnuncio(int aIdAnuncio, boolean aPublicado) throws PersistentException {
		return bdAn.anadirAnuncio(aIdAnuncio, aPublicado);
	}

	public boolean eliminarAnuncio(int aIdAnuncio, boolean aPublicado) throws PersistentException {
		return bdAn.eliminarAnuncio(aIdAnuncio, aPublicado);
	}

//	public List cargarSeccionesMod(String aAccesibilidadPub, Object aAccesibilidadPriv, String aAccesibilidadOc) {
//		bdSec.cargar
//	}

//	public List cargarTemasMod(int aIdSeccion, String aAccesibilidadPub, String aAccesibilidadPriv, String aAccesibilidadOc) {
//		throw new UnsupportedOperationException();
//	}
//
//	public List cargarMensajeMod(int aIdTema, String aAccesibilidadPub) {
//		throw new UnsupportedOperationException();
//	}

	public List cargarUsuarioAmonestado() throws PersistentException {
		return bdUsr.cargarUsuarioAmonestado();
	}

	public boolean crearSeccion(String aTitulo, String aSubtitulo, String aFotoURL, int aIdUserCreador) throws PersistentException {
		return bdSec.crearSeccion(aTitulo, aSubtitulo, null, aIdUserCreador);
	}

	public boolean cambiarAccesibilidadSeccion(boolean aPublico, boolean aPrivado, boolean aOculto, int idSeccion) throws PersistentException {
		return bdSec.cambiarAccesibilidadSeccion(aPublico, aPrivado, aOculto, idSeccion);
	}

	public boolean amonestarUsuario(int aIdUsuario) throws PersistentException {
		return bdUsr.amonestarUsuario(aIdUsuario);
	}

	public List cargarMensajePropio(int aIdTema, int aIdUsuario) throws PersistentException {
		return bdMsg.cargarMensajeCreado(aIdTema, aIdUsuario);
	}

	public Moderador obtenerPerfilModerador(int aIdUser) {
		//poblemas con la vida
		return null;
	}

	public boolean ocultarMensaje(int aIdMensaje) throws PersistentException {
		return bdMsg.ocultarMensaje(aIdMensaje);
	}

	public boolean eliminarMensajePropio(int aIdMensaje) throws PersistentException {
		return bdMsg.eliminarMensajePropio(aIdMensaje);
	}

	//LOS IDS
	public Lista_Amigo[] cargarListaAmigos() {
		return bdUsr.cargarListaAmigos(id);
	}

	public List cargarSolicitudes(int aIdUsuario) throws PersistentException {
		return bdUsr.cargarSolicitudes(aIdUsuario);
	}

	public boolean cambiarDatos(int aIdUsuario, String aUsername, String aPassword, String aDescription, String aFotoURL) throws PersistentException {
		return bdUsr.cambiarDatos(aIdUsuario, aUsername, aPassword, aDescription, aFotoURL);
	}

	public boolean darDeBaja(int aIdUsuario) throws PersistentException {
		return bdUsr.darseDeBaja(aIdUsuario);
	}

	public void ocultarPerfil(int aIdUsuario, boolean aPublico, boolean aOculto) throws PersistentException {
		bdUsr.ocultarPerfil(aIdUsuario, aPublico, aOculto);
	}

	public int iniciarSesion(String aUsername, String aPassword) throws PersistentException {
		return bdUsr.iniciarSesion(aUsername, aPassword);
	}

//	public List cargarAmigos(int aIdUsuario) {
//		throw new UnsupportedOperationException();
//	}
//
//	public List cargarSeccionesUR(String aAccesibilidadPub, String aAccesibilidadPriv) {
//		throw new UnsupportedOperationException();
//	}
//
//	public List cargarTemasUR(int aIdSeccion, String aAccesibilidadPub, String aAccesibilidadPriv) {
//		throw new UnsupportedOperationException();
//	}
//
//	public List cargarMensajeUR(int aIdTema, String aAccesibilidadPub) {
//		throw new UnsupportedOperationException();
//	}

	public List cargarUltimoMensaje(int aIdUsuario) {
		return bdMsg.cargarUltimoMensaje(aIdUsuario);
	}

	public List cargarTemasSeccionPrivada(int aIdSeccion) {
		return bdTema.cargarTemasSeccionPrivada(aIdSeccion);
	}

	public List cargarAmigo() {
		throw new UnsupportedOperationException();
	}

	public List cargarAnuncioPublicado(boolean aEstado) throws PersistentException {
		return bdAn.cargarAnuncioPublicado(aEstado);
	}

	public List cargarNotificacion(int aIdUsuario) throws PersistentException {
		return bdNot.cargarNotificacion(aIdUsuario);
	}

	public List cargarTicket(int aIdUsuario) throws PersistentException {
		return bdTick.cargarTicket(aIdUsuario);
	}

	public List cargarUsuario() throws PersistentException {
		return bdUsr.cargarUsuario();
	}

	public boolean crearTema(String aTitulo, String aSubtitulo, int aIdSeccionPropietaria, int aIdTemaPropietario) throws PersistentException {
		return bdTema.crearTema(aTitulo, aSubtitulo, aIdSeccionPropietaria, aIdTemaPropietario);
	}

	public boolean crearMensaje(String aCuerpoMensaje, String aMediaURL, int aIdUsuario, int aIdTema) throws PersistentException {
		return bdMsg.crearMensaje(aCuerpoMensaje, aMediaURL, aIdUsuario, aIdTema);
	}

	public boolean crearTicket(String aCuerpoTicket, int aIdUsuarioPropietarioTicket) throws PersistentException {
		return bdTick.crearTicket(aCuerpoTicket, aIdUsuarioPropietarioTicket);
	}

	public boolean darMeGustaTema(int aIdTema, int aIdUser) {
		return bdTema.darMeGustaTema(aIdTema, aIdUser);
	}

	public int darMeGustaMensaje(int aIdMensaje, int aIdUser) throws PersistentException {
		return bdMsg.darMeGustaMensaje(aIdMensaje, aIdUser);
	}

	//esto creo que no deberia existir
	public boolean desconectarse() {
		throw new UnsupportedOperationException();
	}

	public boolean aceptarSolicitud(int aIdUsuario, int aIdAmigo) throws PersistentException {
		return bdUsr.aceptarSolicitud(aIdUsuario, aIdAmigo);
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

	public List buscarUsuario(String aKeyword) throws PersistentException {
		return bdUsr.buscarUsuario(aKeyword);
	}

	public Usuario_registrado obtenerPerfilUsuario(int aIdUser) {
		throw new UnsupportedOperationException();
	}

	public Moderador obtenerPerfilMod(int aIdUser) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarNotificacion(int aIdNotificacion) throws PersistentException {
		return bdNot.eliminarNotificacion(aIdNotificacion);
	}

	public boolean eliminarTicket(int aIdTicket) throws PersistentException {
		return bdTick.eliminarTicket(aIdTicket);
	}

	public boolean registrarse(String aUsername, String aFullname, String aPassword, String aDescription, String aEmail, String aFotoURL) throws PersistentException {
		return bdUsr.registrarse(aUsername, aFullname, aPassword, aDescription, aEmail, aFotoURL);
		
	}

	public List cargarListaSecciones(boolean aPublico, boolean aPrivado, boolean aOculto, boolean aEliminado) {
		Lista_Seccion s = null;
		try {
			s = (Lista_Seccion) bdSec.cargarSecciones(aPublico, aPrivado, aOculto, aEliminado);
		}catch(PersistentException e) {
			e.printStackTrace();
		}
		
		return (List) s;
	}

	public List cargarTemasUNR(int aIdSeccion, boolean aPublico, boolean aPrivado, boolean aOculto, boolean aEliminado) throws PersistentException {
		return bdTema.cargarTemasUNR(aIdSeccion, aPublico, aPrivado, aOculto, aEliminado);
	}

	public List cargarMensajeUNR(int aIdTema, boolean aPublico, boolean aPrivado, boolean aOculto, boolean aEliminado) throws PersistentException {
		return bdMsg.cargarMensajeUNR(aIdTema, aPublico, aPrivado, aOculto, aEliminado);
	}

	public boolean recuperarPassword(String aEmail) {
		throw new UnsupportedOperationException();
	}

	public List buscarSeccion(String aKeyword) throws PersistentException {
		return bdSec.buscarSeccion(aKeyword);
	}

	public List buscarTema(String aKeyword, int aIdSeccion) throws PersistentException {
		return bdTema.buscarTema(aKeyword, aIdSeccion);
	}

	public List buscarMensaje(String aKeyword, int aIdTema) throws PersistentException {
		return bdMsg.buscarMensaje(aKeyword, aIdTema);
	}
}