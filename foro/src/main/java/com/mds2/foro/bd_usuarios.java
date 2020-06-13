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

	public List<Usuarios> cargarListaAmigos(int aIdUsuario) throws PersistentException {
		
		Usuarios a = com.mds2.foro.UsuariosDAO.getUsuariosByORMID(aIdUsuario);

		List<Usuarios> amigos = new ArrayList<Usuarios>();
		
		for(Usuarios u : a.usuariosAmigos.toArray()) {
			if(u.usuariosAmigos.contains(a))
				amigos.add(u);
		}
		
		return amigos;
	}

	public List<Notificacion> cargarSolicitudes(int aIdUsuario) throws PersistentException {
		
		Usuarios u = com.mds2.foro.UsuariosDAO.getUsuariosByORMID(aIdUsuario);
		
		List<Notificacion> solicitudes = new ArrayList<Notificacion>();
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
			
			com.mds2.foro.Usuarios lcommds2foroUsuarios = com.mds2.foro.UsuariosDAO.loadUsuariosByQuery("NombreUsuario = '"+aUsername+"' AND Contraseña = '"+aPassword+"'", null);
			
			id = lcommds2foroUsuarios.getIdUsuario();

			t.commit();
			
		}catch(Exception e) {
			t.rollback();
		}
	
		return id;
	}

	public List cargarUsuarioAmonestado() throws PersistentException {
		List<Usuarios> lista = new ArrayList<Usuarios>();
		Usuarios[] u = null;
		
		u = com.mds2.foro.UsuariosDAO.listUsuariosByQuery("Amonestado = '"+1+"'", "NombreUsuario");
		
		
		for(Usuarios ua : u) {
			lista.add(ua);
		}
		return lista;	
		
	}

	public List cargarUsuarioAmonestadoAdmin() throws PersistentException {

		List<Usuarios> lista = new ArrayList<Usuarios>();
		Usuarios[] u = null;
		
		u = com.mds2.foro.UsuariosDAO.listUsuariosByQuery("Amonestado = '"+1+"'", "NombreUsuario");
		
		
		for(Usuarios ua : u) {
			lista.add(ua);
		}
		return lista;
	}

	public List cargarUsuario() throws PersistentException {
		List<Usuarios> lista = new ArrayList<Usuarios>();
		Usuarios[] u = null;
		
		u = com.mds2.foro.UsuariosDAO.listUsuariosByQuery("", "NombreUsuario");
		
		
		for(Usuarios ua : u) {
			lista.add(ua);
		}
		return lista;
	}

	public boolean recuperarPassword(String aEmail) throws PersistentException {
		Usuarios u = null;
		u = com.mds2.foro.UsuariosDAO.loadUsuariosByQuery("Email = '"+aEmail+"'", "Nombre");
		if(u!=null)
			return true;
		else
			return false;
	}

	public boolean aceptarSolicitud(int aIdUsuario, int aIdAmigo) throws PersistentException {
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		
		try {
			Usuarios a = com.mds2.foro.UsuariosDAO.getUsuariosByORMID(aIdUsuario);
			Usuarios b = com.mds2.foro.UsuariosDAO.getUsuariosByORMID(aIdAmigo);
			a.usuariosAmigos.add(b);
			b.usuariosAmigos.add(a);
			
			Notificacion not = com.mds2.foro.NotificacionDAO.loadNotificacionByQuery("IdUsuarioPropietario = '"+aIdUsuario+"' AND DescipcionCampo LIKE%"+b.getNombreUsuario()+"%", "Titulo");
			
			com.mds2.foro.NotificacionDAO.delete(not);
			
			com.mds2.foro.UsuariosDAO.save(a);
			com.mds2.foro.UsuariosDAO.save(b);

			t.commit();
			return true;
		}catch(Exception e) {
			t.rollback();
			e.printStackTrace();
		}

		return false;
	}

	public boolean rechazarSolicitud(int idUs, int idSol) throws PersistentException {
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();

		try {
			Usuarios a = com.mds2.foro.UsuariosDAO.getUsuariosByORMID(idSol);
			Notificacion not = com.mds2.foro.NotificacionDAO.loadNotificacionByQuery("IdUsuarioPropietario = '"+idUs+"' AND DescipcionCampo LIKE%"+a.getNombreUsuario()+"%", "Titulo");

			a.notificaciones.remove(not);
			
			com.mds2.foro.UsuariosDAO.save(a);
			com.mds2.foro.NotificacionDAO.delete(not);
			
			t.commit();
			return true;
		}catch(Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		return false;
	}

	
	public boolean eliminarAmigo(int aIdUsuario, int aIdAmigo) throws PersistentException {
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuarios a = com.mds2.foro.UsuariosDAO.getUsuariosByORMID(aIdUsuario);
			Usuarios b = com.mds2.foro.UsuariosDAO.getUsuariosByORMID(aIdAmigo);
			if(a.usuariosAmigos.contains(b)) {
				a.usuariosAmigos.remove(b);
				b.usuariosAmigos.remove(a);
			}
			com.mds2.foro.UsuariosDAO.save(a);
			com.mds2.foro.UsuariosDAO.save(b);

			t.commit();
			return !a.usuariosAmigos.contains(b);
		}catch(Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		return false; 
	}

	public boolean sancionarUsuario(int aIdUsuario) throws PersistentException {
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuarios a = com.mds2.foro.UsuariosDAO.getUsuariosByORMID(aIdUsuario);
			a.setSancionado(true);
			com.mds2.foro.UsuariosDAO.save(a);
			t.commit();
			return a.getSancionado();
			
		}catch(Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		return false;
	}

	public boolean quitarSancion(int aIdUsuario) throws PersistentException {
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuarios a = com.mds2.foro.UsuariosDAO.getUsuariosByORMID(aIdUsuario);
			a.setSancionado(false);
			com.mds2.foro.UsuariosDAO.save(a);
			t.commit();
			return !a.getSancionado();
		}catch(Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		return false;
	}

	public boolean promocionarAMod(int aIdUsuario) throws PersistentException {
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuarios u = com.mds2.foro.UsuariosDAO.getUsuariosByORMID(aIdUsuario);
			Moderador mod = com.mds2.foro.ModeradorDAO.createModerador();
			mod.setIdMod(u.getIdUsuario());
			mod.setNombre(u.getNombre());
			mod.setNombreUsuario(u.getNombreUsuario());
			mod.setContraseña(u.getContraseña());
			mod.setDescripcion(u.getDescripcion());
			mod.setEmail(u.getEmail());
			mod.setFotoPerfil(u.getFotoPerfil());
			mod.setPublico(u.getPublico());
			mod.setOculto(u.getOculto());
			mod.setAmonestado(false);
			mod.setSancionado(false);
			//com.mds2.foro.UsuariosDAO.delete(u);
			com.mds2.foro.ModeradorDAO.save(mod);
			t.commit();
			return true;
		}catch(Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		return false;
	}

	
	public boolean amonestarUsuario(int aIdUsuario) throws PersistentException {
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuarios u = com.mds2.foro.UsuariosDAO.getUsuariosByORMID(aIdUsuario);
			u.setAmonestado(true);
			com.mds2.foro.UsuariosDAO.save(u);
			Notificacion not = com.mds2.foro.NotificacionDAO.createNotificacion();
			not.setIdUsuarioPropietario(1);
			not.setTitulo("Un usuario ha sido amonestado");
			not.setDescripcionCampo("El usuario "+u.getNombreUsuario()+" ha sido amonestado por un moderador.");
			Administrador adm = com.mds2.foro.AdministradorDAO.getAdministradorByORMID(1);
			not.setUsuarios(adm);
			adm.notificaciones.add(not);
			com.mds2.foro.AdministradorDAO.save(adm);
			com.mds2.foro.NotificacionDAO.save(not);
			t.commit();
			return u.getAmonestado();
		}catch(Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		return false;
	}

	public List buscarUsuario(String aKeyword) throws PersistentException {
		List<Usuarios> lista = new ArrayList<Usuarios>();
		Usuarios[] u = null;
		
		u = com.mds2.foro.UsuariosDAO.listUsuariosByQuery("NombreUsuario LIKE ('%"+aKeyword+"%')", "NombreUsuario");
		
		for(Usuarios ua : u) {
			lista.add(ua);
		}
		return lista;
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