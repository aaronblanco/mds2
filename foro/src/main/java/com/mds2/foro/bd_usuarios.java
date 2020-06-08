package com.mds2.foro;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

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

	public AdministradorClase obtenerPerfilAdmin(int aIdUser) {
		throw new UnsupportedOperationException();
	}

	public ModeradorClase obtenerPerfilMod(int aIdUser) {
		throw new UnsupportedOperationException();
	}

	public Usuario_registrado obtenerPerfilUsuario(int aIdUser) {
		throw new UnsupportedOperationException();
	}
	
	public boolean registrarse(String aUsername, String aFullname, String aPassword, String aDescription, String aEmail, String aFotoURL) throws PersistentException {
		
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		
		try {
			
			com.mds2.foro.Usuarios u = com.mds2.foro.UsuariosDAO.createUsuarios();
			u.setNombreUsuario(aUsername);
			u.setAmonestado(false);
			u.setContraseña(aPassword);
			u.setDescripcion(aDescription);
			u.setEmail(aEmail);
			u.setFotoPerfil(aFotoURL);
			u.setNombre(aFullname);
			u.setOculto(false);
			u.setPublico(true);
			com.mds2.foro.UsuariosDAO.save(u);
			t.commit();
			
		}catch(Exception e) {
			t.rollback();
		}
	
		return true;
	}
}