/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: aba693(University of Almeria)
 * License Type: Academic
 */
package com.mds2.foro;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class UsuariosDAO {
	public static Usuarios loadUsuariosByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadUsuariosByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuarios getUsuariosByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return getUsuariosByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuarios loadUsuariosByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadUsuariosByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuarios getUsuariosByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return getUsuariosByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuarios loadUsuariosByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Usuarios) session.load(com.mds2.foro.Usuarios.class, new Integer(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuarios getUsuariosByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Usuarios) session.get(com.mds2.foro.Usuarios.class, new Integer(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuarios loadUsuariosByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuarios) session.load(com.mds2.foro.Usuarios.class, new Integer(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuarios getUsuariosByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuarios) session.get(com.mds2.foro.Usuarios.class, new Integer(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarios(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return queryUsuarios(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarios(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return queryUsuarios(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuarios[] listUsuariosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return listUsuariosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuarios[] listUsuariosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return listUsuariosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarios(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds2.foro.Usuarios as Usuarios");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarios(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds2.foro.Usuarios as Usuarios");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuarios", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuarios[] listUsuariosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuarios(session, condition, orderBy);
			return (Usuarios[]) list.toArray(new Usuarios[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuarios[] listUsuariosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuarios(session, condition, orderBy, lockMode);
			return (Usuarios[]) list.toArray(new Usuarios[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuarios loadUsuariosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadUsuariosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuarios loadUsuariosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadUsuariosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuarios loadUsuariosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Usuarios[] usuarioses = listUsuariosByQuery(session, condition, orderBy);
		if (usuarioses != null && usuarioses.length > 0)
			return usuarioses[0];
		else
			return null;
	}
	
	public static Usuarios loadUsuariosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Usuarios[] usuarioses = listUsuariosByQuery(session, condition, orderBy, lockMode);
		if (usuarioses != null && usuarioses.length > 0)
			return usuarioses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuariosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return iterateUsuariosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuariosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return iterateUsuariosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuariosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds2.foro.Usuarios as Usuarios");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuariosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds2.foro.Usuarios as Usuarios");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuarios", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuarios createUsuarios() {
		return new com.mds2.foro.Usuarios();
	}
	
	public static boolean save(com.mds2.foro.Usuarios usuarios) throws PersistentException {
		try {
			MDS11920PFBlancoRoblesPersistentManager.instance().saveObject(usuarios);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.mds2.foro.Usuarios usuarios) throws PersistentException {
		try {
			MDS11920PFBlancoRoblesPersistentManager.instance().deleteObject(usuarios);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mds2.foro.Usuarios usuarios)throws PersistentException {
		if (usuarios instanceof com.mds2.foro.Moderador) {
			return com.mds2.foro.ModeradorDAO.deleteAndDissociate((com.mds2.foro.Moderador) usuarios);
		}
		
		if (usuarios instanceof com.mds2.foro.Administrador) {
			return com.mds2.foro.AdministradorDAO.deleteAndDissociate((com.mds2.foro.Administrador) usuarios);
		}
		
		try {
			com.mds2.foro.Ticket[] lPro_ticketss = usuarios.pro_tickets.toArray();
			for(int i = 0; i < lPro_ticketss.length; i++) {
				lPro_ticketss[i].setUsuarios(null);
			}
			com.mds2.foro.Mensaje[] lPro_mensajess = usuarios.pro_mensajes.toArray();
			for(int i = 0; i < lPro_mensajess.length; i++) {
				lPro_mensajess[i].setUsuarios(null);
			}
			com.mds2.foro.Usuarios[] lUsuarioss = usuarios.usuarios.toArray();
			for(int i = 0; i < lUsuarioss.length; i++) {
				lUsuarioss[i].usuariosAmigos.remove(usuarios);
			}
			com.mds2.foro.Tema[] lPro_temass = usuarios.pro_temas.toArray();
			for(int i = 0; i < lPro_temass.length; i++) {
				lPro_temass[i].setUsuarios(null);
			}
			com.mds2.foro.Seccion[] lPro_seccioness = usuarios.pro_secciones.toArray();
			for(int i = 0; i < lPro_seccioness.length; i++) {
				lPro_seccioness[i].setUsuarios(null);
			}
			com.mds2.foro.Notificacion[] lNotificacioness = usuarios.notificaciones.toArray();
			for(int i = 0; i < lNotificacioness.length; i++) {
				lNotificacioness[i].setUsuarios(null);
			}
			com.mds2.foro.Usuarios[] lUsuariosAmigoss = usuarios.usuariosAmigos.toArray();
			for(int i = 0; i < lUsuariosAmigoss.length; i++) {
				lUsuariosAmigoss[i].usuarios.remove(usuarios);
			}
			return delete(usuarios);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mds2.foro.Usuarios usuarios, org.orm.PersistentSession session)throws PersistentException {
		if (usuarios instanceof com.mds2.foro.Moderador) {
			return com.mds2.foro.ModeradorDAO.deleteAndDissociate((com.mds2.foro.Moderador) usuarios, session);
		}
		
		if (usuarios instanceof com.mds2.foro.Administrador) {
			return com.mds2.foro.AdministradorDAO.deleteAndDissociate((com.mds2.foro.Administrador) usuarios, session);
		}
		
		try {
			com.mds2.foro.Ticket[] lPro_ticketss = usuarios.pro_tickets.toArray();
			for(int i = 0; i < lPro_ticketss.length; i++) {
				lPro_ticketss[i].setUsuarios(null);
			}
			com.mds2.foro.Mensaje[] lPro_mensajess = usuarios.pro_mensajes.toArray();
			for(int i = 0; i < lPro_mensajess.length; i++) {
				lPro_mensajess[i].setUsuarios(null);
			}
			com.mds2.foro.Usuarios[] lUsuarioss = usuarios.usuarios.toArray();
			for(int i = 0; i < lUsuarioss.length; i++) {
				lUsuarioss[i].usuariosAmigos.remove(usuarios);
			}
			com.mds2.foro.Tema[] lPro_temass = usuarios.pro_temas.toArray();
			for(int i = 0; i < lPro_temass.length; i++) {
				lPro_temass[i].setUsuarios(null);
			}
			com.mds2.foro.Seccion[] lPro_seccioness = usuarios.pro_secciones.toArray();
			for(int i = 0; i < lPro_seccioness.length; i++) {
				lPro_seccioness[i].setUsuarios(null);
			}
			com.mds2.foro.Notificacion[] lNotificacioness = usuarios.notificaciones.toArray();
			for(int i = 0; i < lNotificacioness.length; i++) {
				lNotificacioness[i].setUsuarios(null);
			}
			com.mds2.foro.Usuarios[] lUsuariosAmigoss = usuarios.usuariosAmigos.toArray();
			for(int i = 0; i < lUsuariosAmigoss.length; i++) {
				lUsuariosAmigoss[i].usuarios.remove(usuarios);
			}
			try {
				session.delete(usuarios);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(com.mds2.foro.Usuarios usuarios) throws PersistentException {
		try {
			MDS11920PFBlancoRoblesPersistentManager.instance().getSession().refresh(usuarios);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.mds2.foro.Usuarios usuarios) throws PersistentException {
		try {
			MDS11920PFBlancoRoblesPersistentManager.instance().getSession().evict(usuarios);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuarios loadUsuariosByCriteria(UsuariosCriteria usuariosCriteria) {
		Usuarios[] usuarioses = listUsuariosByCriteria(usuariosCriteria);
		if(usuarioses == null || usuarioses.length == 0) {
			return null;
		}
		return usuarioses[0];
	}
	
	public static Usuarios[] listUsuariosByCriteria(UsuariosCriteria usuariosCriteria) {
		return usuariosCriteria.listUsuarios();
	}
}
