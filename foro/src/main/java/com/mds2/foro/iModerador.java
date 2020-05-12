package com.mds2.foro;

import DB_DCL.Moderador;

public interface iModerador extends iBanner_Usuario_registrado, iMenu_moderador {

	public List cargarSeccionesMod(String aAccesibilidadPub, Object aAccesibilidadPriv, String aAccesibilidadOc);

	public List cargarTemasMod(int aIdSeccion, String aAccesibilidadPub, String aAccesibilidadPriv, String aAccesibilidadOc);

	public List cargarMensajeMod(int aIdTema, String aAccesibilidadPub);

	public List cargarUsuarioAmonestado();

	public boolean crearSeccion(String aTitulo, String aSubtitulo, String aFotoURL, int aIdUserCreador);

	public boolean cambiarAccesibilidad(boolean aPublico, boolean aPrivado, boolean aOculto);

	public boolean amonestarUsuario(int aIdUsuario);

	public List cargarRespuestas(int aIdMensaje);

	public List cargarMensajePropio(int aIdTema, int aIdUsuario);

	public Moderador obtenerPerfilModerador(int aIdUser);

	public boolean ocultarMensaje(int aIdMensaje);
}