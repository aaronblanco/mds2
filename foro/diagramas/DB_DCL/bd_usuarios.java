package DB_DCL;

import java.util.Vector;
import DB_DCL.Usuarios;
import Package.Usuario_registrado;

public class bd_usuarios {
	public Bd_principal _bd_principal_usuario;
	public Vector<Usuarios> _contiene_usuarios = new Vector<Usuarios>();

	public List cargarListaAmigos(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public List cargarSolicitudes(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public boolean cambiarDatos(int aIdUsuario, String aUsername, String aPassword, String aDescription, String aFotoURL) {
		throw new UnsupportedOperationException();
	}

	public boolean darseDeBaja(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void ocultarPerfil(int aIdUsuario, boolean aPublico, boolean aOculto) {
		throw new UnsupportedOperationException();
	}

	public int iniciarSesion(String aUsername, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public List cargarAmigo() {
		throw new UnsupportedOperationException();
	}

	public List cargarUsuarioAmonestado() {
		throw new UnsupportedOperationException();
	}

	public List cargarUsuarioAmonestadoAdmin() {
		throw new UnsupportedOperationException();
	}

	public List cargarUsuario() {
		throw new UnsupportedOperationException();
	}

	public boolean recuperarPassword(String aEmail) {
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

	public boolean eliminarAmigo(int aIdUsuario, int aIdAmigo) {
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

	public boolean amonestarUsuario(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public List buscarUsuario(String aKeyword) {
		throw new UnsupportedOperationException();
	}

	public Administrador obtenerPerfilAdmin(int aIdUser) {
		throw new UnsupportedOperationException();
	}

	public Moderador obtenerPerfilMod(int aIdUser) {
		throw new UnsupportedOperationException();
	}

	public Usuario_registrado obtenerPerfilUsuario(int aIdUser) {
		throw new UnsupportedOperationException();
	}
}