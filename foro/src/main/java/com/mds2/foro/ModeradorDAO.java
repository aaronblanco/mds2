/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: trm187(University of Almeria)
 * License Type: Academic
 */
package com.mds2.foro;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class ModeradorDAO {
	public static Moderador loadModeradorByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadModeradorByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderador getModeradorByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return getModeradorByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderador loadModeradorByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadModeradorByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderador getModeradorByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return getModeradorByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderador loadModeradorByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Moderador) session.load(com.mds2.foro.Moderador.class, new Integer(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderador getModeradorByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Moderador) session.get(com.mds2.foro.Moderador.class, new Integer(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderador loadModeradorByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Moderador) session.load(com.mds2.foro.Moderador.class, new Integer(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderador getModeradorByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Moderador) session.get(com.mds2.foro.Moderador.class, new Integer(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryModerador(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return queryModerador(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryModerador(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return queryModerador(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderador[] listModeradorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return listModeradorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderador[] listModeradorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return listModeradorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryModerador(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds2.foro.Moderador as Moderador");
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
	
	public static List queryModerador(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds2.foro.Moderador as Moderador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Moderador", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderador[] listModeradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryModerador(session, condition, orderBy);
			return (Moderador[]) list.toArray(new Moderador[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderador[] listModeradorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryModerador(session, condition, orderBy, lockMode);
			return (Moderador[]) list.toArray(new Moderador[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderador loadModeradorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadModeradorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderador loadModeradorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadModeradorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderador loadModeradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Moderador[] moderadors = listModeradorByQuery(session, condition, orderBy);
		if (moderadors != null && moderadors.length > 0)
			return moderadors[0];
		else
			return null;
	}
	
	public static Moderador loadModeradorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Moderador[] moderadors = listModeradorByQuery(session, condition, orderBy, lockMode);
		if (moderadors != null && moderadors.length > 0)
			return moderadors[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateModeradorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return iterateModeradorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateModeradorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return iterateModeradorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateModeradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds2.foro.Moderador as Moderador");
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
	
	public static java.util.Iterator iterateModeradorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds2.foro.Moderador as Moderador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Moderador", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderador createModerador() {
		return new com.mds2.foro.Moderador();
	}
	
	public static boolean save(com.mds2.foro.Moderador moderador) throws PersistentException {
		try {
			MDS11920PFBlancoRoblesPersistentManager.instance().saveObject(moderador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.mds2.foro.Moderador moderador) throws PersistentException {
		try {
			MDS11920PFBlancoRoblesPersistentManager.instance().deleteObject(moderador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mds2.foro.Moderador moderador)throws PersistentException {
		try {
			com.mds2.foro.Ticket[] lPro_ticketss = moderador.pro_tickets.toArray();
			for(int i = 0; i < lPro_ticketss.length; i++) {
				lPro_ticketss[i].setUsuarios(null);
			}
			com.mds2.foro.Mensaje[] lPro_mensajess = moderador.pro_mensajes.toArray();
			for(int i = 0; i < lPro_mensajess.length; i++) {
				lPro_mensajess[i].setUsuarios(null);
			}
			com.mds2.foro.Usuarios[] lUsuarioss = moderador.usuarios.toArray();
			for(int i = 0; i < lUsuarioss.length; i++) {
				lUsuarioss[i].usuariosAmigos.remove(moderador);
			}
			com.mds2.foro.Tema[] lPro_temass = moderador.pro_temas.toArray();
			for(int i = 0; i < lPro_temass.length; i++) {
				lPro_temass[i].setUsuarios(null);
			}
			com.mds2.foro.Seccion[] lPro_seccioness = moderador.pro_secciones.toArray();
			for(int i = 0; i < lPro_seccioness.length; i++) {
				lPro_seccioness[i].setUsuarios(null);
			}
			com.mds2.foro.Notificacion[] lNotificacioness = moderador.notificaciones.toArray();
			for(int i = 0; i < lNotificacioness.length; i++) {
				lNotificacioness[i].setUsuarios(null);
			}
			com.mds2.foro.Usuarios[] lUsuariosAmigoss = moderador.usuariosAmigos.toArray();
			for(int i = 0; i < lUsuariosAmigoss.length; i++) {
				lUsuariosAmigoss[i].usuarios.remove(moderador);
			}
			return delete(moderador);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mds2.foro.Moderador moderador, org.orm.PersistentSession session)throws PersistentException {
		try {
			com.mds2.foro.Ticket[] lPro_ticketss = moderador.pro_tickets.toArray();
			for(int i = 0; i < lPro_ticketss.length; i++) {
				lPro_ticketss[i].setUsuarios(null);
			}
			com.mds2.foro.Mensaje[] lPro_mensajess = moderador.pro_mensajes.toArray();
			for(int i = 0; i < lPro_mensajess.length; i++) {
				lPro_mensajess[i].setUsuarios(null);
			}
			com.mds2.foro.Usuarios[] lUsuarioss = moderador.usuarios.toArray();
			for(int i = 0; i < lUsuarioss.length; i++) {
				lUsuarioss[i].usuariosAmigos.remove(moderador);
			}
			com.mds2.foro.Tema[] lPro_temass = moderador.pro_temas.toArray();
			for(int i = 0; i < lPro_temass.length; i++) {
				lPro_temass[i].setUsuarios(null);
			}
			com.mds2.foro.Seccion[] lPro_seccioness = moderador.pro_secciones.toArray();
			for(int i = 0; i < lPro_seccioness.length; i++) {
				lPro_seccioness[i].setUsuarios(null);
			}
			com.mds2.foro.Notificacion[] lNotificacioness = moderador.notificaciones.toArray();
			for(int i = 0; i < lNotificacioness.length; i++) {
				lNotificacioness[i].setUsuarios(null);
			}
			com.mds2.foro.Usuarios[] lUsuariosAmigoss = moderador.usuariosAmigos.toArray();
			for(int i = 0; i < lUsuariosAmigoss.length; i++) {
				lUsuariosAmigoss[i].usuarios.remove(moderador);
			}
			try {
				session.delete(moderador);
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
	
	public static boolean refresh(com.mds2.foro.Moderador moderador) throws PersistentException {
		try {
			MDS11920PFBlancoRoblesPersistentManager.instance().getSession().refresh(moderador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.mds2.foro.Moderador moderador) throws PersistentException {
		try {
			MDS11920PFBlancoRoblesPersistentManager.instance().getSession().evict(moderador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderador loadModeradorByCriteria(ModeradorCriteria moderadorCriteria) {
		Moderador[] moderadors = listModeradorByCriteria(moderadorCriteria);
		if(moderadors == null || moderadors.length == 0) {
			return null;
		}
		return moderadors[0];
	}
	
	public static Moderador[] listModeradorByCriteria(ModeradorCriteria moderadorCriteria) {
		return moderadorCriteria.listModerador();
	}
}
