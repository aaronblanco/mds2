package com.mds2.foro;

import java.util.List;

public interface iModerador extends iBanner_Usuario_registrado, iMenu_moderador {

	public List cargarUsuarioAmonestado();

	public boolean crearSeccion(String aTitulo, String aSubtitulo, String aFotoURL, int aIdUserCreador);

	public boolean cambiarAccesibilidad(boolean aPublico, boolean aPrivado, boolean aOculto, int idTema);

	public boolean amonestarUsuario(int aIdUsuario);

	public List cargarRespuestas(int aIdMensaje);

	public List cargarMensajePropio(int aIdTema, int aIdUsuario);

	public Moderador obtenerPerfilModerador(int aIdUser);

	public boolean ocultarMensaje(int aIdMensaje);
}