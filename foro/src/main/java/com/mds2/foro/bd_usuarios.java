package com.mds2.foro;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.PersistentTransaction;
import org.orm.criteria.CollectionExpression;

public class bd_usuarios {
	public Bd_principal _bd_principal_usuario;
	public Vector<Usuarios> _contiene_usuarios = new Vector<Usuarios>();

	public List cargarListaAmigos(int aIdUsuario) throws PersistentException {
		
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		UsuariosCriteria uc = new UsuariosCriteria();
		List amigos = new ArrayList();
		Usuarios a = com.mds2.foro.UsuariosDAO.getUsuariosByORMID(aIdUsuario);

		for(Usuarios u : uc.listUsuarios()) {
			if(u.usuariosAmigos.contains(a))
				amigos.add(u);
		}
		
		return _contiene_usuarios;
	}

	public List cargarSolicitudes(int aIdUsuario) throws PersistentException {
		List solicitudes = new ArrayList();
		
		UsuariosCriteria uc = new UsuariosCriteria();
		Usuarios u = com.mds2.foro.UsuariosDAO.getUsuariosByORMID(aIdUsuario);
		for(Notificacion o : u.notificaciones.toArray())
			solicitudes.add(o);
		
		return solicitudes;
		
	}

	public boolean cambiarDatos(int aIdUsuario, String aUsername, String aPassword, String aDescription, String aFotoURL) throws PersistentException {
		Usuarios u = com.mds2.foro.UsuariosDAO.getUsuariosByORMID(aIdUsuario);
		
		try {
			u.setNombreUsuario(aUsername);
			u.setContraseña(aPassword);
			u.setDescripcion(aDescription);
			u.setFotoPerfil(aFotoURL);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean darseDeBaja(int aIdUsuario) throws PersistentException {
		Usuarios u = com.mds2.foro.UsuariosDAO.getUsuariosByORMID(aIdUsuario);
		return com.mds2.foro.UsuariosDAO.delete(u);
	}

	public void ocultarPerfil(int aIdUsuario, boolean aPublico, boolean aOculto) throws PersistentException {
		Usuarios u = com.mds2.foro.UsuariosDAO.getUsuariosByORMID(aIdUsuario);
		u.setPublico(aPublico);
		u.setOculto(aOculto);
	}

	public int iniciarSesion(String aUsername, String aPassword) throws PersistentException {
	PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
	
		int id = -1;
		try {
			
			String condition;
			String orderBy;
			AdministradorCriteria cr = new AdministradorCriteria();
		
			cr.add(Restrictions.eq("nombreUsuario", aUsername));
			
			
			com.mds2.foro.Usuarios u =  (Usuarios) com.mds2.foro.UsuariosDAO.queryUsuarios(cr.toString(), null);
			id = u.getIdUsuario();
		
			
			com.mds2.foro.UsuariosDAO.save(u);
			t.commit();
			
		}catch(Exception e) {
			t.rollback();
		}
	
		return id;
	}

	public List cargarAmigos() {
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