package basededatos;

import DB_DCL.Administrador;

public interface iAdministrador extends iBanner_general, iMenu_UR {

	public ListaSeccionesUNR[] cargarSeccionesUNR();

	public ListaSeccionesUR[] cargarSeccionesUR();

	public ListaSeccionesMod[] cargarSeccionesMod();

	public List cargarSeccionesAdmin();

	public ListaTemasUNR[] cargarTemasUNR();

	public ListaTemasUR[] cargarTemasUR();

	public List cargarTemasAdmin(int aIdSeccion);

	public List cargarMensajeAdmin(int aIdTema, String aAccesibilidadPub, String aAccesibilidadElim);

	public List cargarAnuncioDisponible(boolean aEstado);

	public List cargarUsuarioAmonestadoAdmin();

	public boolean cerrarTicket(int aIdTicket);

	public boolean notificarAdministrador(int aIdTema, int aIdUser);

	public boolean eliminarTema(int aIdTema);

	public boolean cerrarTema(int aIdTema);

	public boolean eliminarSeccion(int aIdSeccion);

	public boolean notificarMensaje(int aIdMensaje, int aIdUSer);

	public boolean eliminarMensajeAdmin(int aIdMensaje);

	public boolean sancionarUsuario(int aIdUsuario);

	public boolean quitarSancion(int aIdUsuario);

	public boolean promocionarAMod(int aIdUsuario);

	public boolean degradarAUsuarioRegistrado(int aIdUsuario);

	public List cargarMensajeCreado(int aIdTema, int aIdUsuario);

	public List cargarRespuestas(int aIdMensaje);

	public Administrador obtenerPerfilAdmin(int aIdUser);

	public boolean subirAnuncio(String aAnuncioURL);

	public boolean anadirAnuncio(int aIdAnuncio, boolean aPublicado);

	public boolean eliminarAnuncio(int aIdAnuncio, boolean aPublicado);
}