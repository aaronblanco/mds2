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

public class AdministradorDAO {
	public static AdministradorBD loadAdministradorByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadAdministradorByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministradorBD getAdministradorByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return getAdministradorByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministradorBD loadAdministradorByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadAdministradorByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministradorBD getAdministradorByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return getAdministradorByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministradorBD loadAdministradorByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (AdministradorBD) session.load(com.mds2.foro.AdministradorBD.class, new Integer(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministradorBD getAdministradorByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (AdministradorBD) session.get(com.mds2.foro.AdministradorBD.class, new Integer(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministradorBD loadAdministradorByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (AdministradorBD) session.load(com.mds2.foro.AdministradorBD.class, new Integer(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministradorBD getAdministradorByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (AdministradorBD) session.get(com.mds2.foro.AdministradorBD.class, new Integer(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrador(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return queryAdministrador(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrador(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return queryAdministrador(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministradorBD[] listAdministradorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return listAdministradorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministradorBD[] listAdministradorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return listAdministradorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrador(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From db_dcl.Administrador as Administrador");
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
	
	public static List queryAdministrador(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From db_dcl.Administrador as Administrador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Administrador", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministradorBD[] listAdministradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAdministrador(session, condition, orderBy);
			return (AdministradorBD[]) list.toArray(new AdministradorBD[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministradorBD[] listAdministradorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAdministrador(session, condition, orderBy, lockMode);
			return (AdministradorBD[]) list.toArray(new AdministradorBD[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministradorBD loadAdministradorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadAdministradorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministradorBD loadAdministradorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadAdministradorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministradorBD loadAdministradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		AdministradorBD[] administradors = listAdministradorByQuery(session, condition, orderBy);
		if (administradors != null && administradors.length > 0)
			return administradors[0];
		else
			return null;
	}
	
	public static AdministradorBD loadAdministradorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		AdministradorBD[] administradors = listAdministradorByQuery(session, condition, orderBy, lockMode);
		if (administradors != null && administradors.length > 0)
			return administradors[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAdministradorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return iterateAdministradorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministradorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return iterateAdministradorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From db_dcl.Administrador as Administrador");
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
	
	public static java.util.Iterator iterateAdministradorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From db_dcl.Administrador as Administrador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Administrador", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministradorBD createAdministrador() {
		return new com.mds2.foro.AdministradorBD();
	}
	
	public static boolean save(com.mds2.foro.AdministradorBD administrador) throws PersistentException {
		try {
			com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().saveObject(administrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.mds2.foro.AdministradorBD administrador) throws PersistentException {
		try {
			com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().deleteObject(administrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mds2.foro.AdministradorBD administrador)throws PersistentException {
		try {
			com.mds2.foro.TicketBD[] lPro_ticketss = administrador.pro_tickets.toArray();
			for(int i = 0; i < lPro_ticketss.length; i++) {
				lPro_ticketss[i].setUsuarios(null);
			}
			com.mds2.foro.MensajeBD[] lPro_mensajess = administrador.pro_mensajes.toArray();
			for(int i = 0; i < lPro_mensajess.length; i++) {
				lPro_mensajess[i].setUsuarios(null);
			}
			com.mds2.foro.UsuariosBD[] lUsuarioss = administrador.usuarios.toArray();
			for(int i = 0; i < lUsuarioss.length; i++) {
				lUsuarioss[i].usuariosAmigos.remove(administrador);
			}
			com.mds2.foro.TemaBD[] lPro_temass = administrador.pro_temas.toArray();
			for(int i = 0; i < lPro_temass.length; i++) {
				lPro_temass[i].setUsuarios(null);
			}
			com.mds2.foro.SeccionBD[] lPro_seccioness = administrador.pro_secciones.toArray();
			for(int i = 0; i < lPro_seccioness.length; i++) {
				lPro_seccioness[i].setUsuarios(null);
			}
			com.mds2.foro.NotificacionBD[] lNotificacioness = administrador.notificaciones.toArray();
			for(int i = 0; i < lNotificacioness.length; i++) {
				lNotificacioness[i].setUsuarios(null);
			}
			com.mds2.foro.UsuariosBD[] lUsuariosAmigoss = administrador.usuariosAmigos.toArray();
			for(int i = 0; i < lUsuariosAmigoss.length; i++) {
				lUsuariosAmigoss[i].usuarios.remove(administrador);
			}
			return delete(administrador);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mds2.foro.AdministradorBD administrador, org.orm.PersistentSession session)throws PersistentException {
		try {
			com.mds2.foro.TicketBD[] lPro_ticketss = administrador.pro_tickets.toArray();
			for(int i = 0; i < lPro_ticketss.length; i++) {
				lPro_ticketss[i].setUsuarios(null);
			}
			com.mds2.foro.MensajeBD[] lPro_mensajess = administrador.pro_mensajes.toArray();
			for(int i = 0; i < lPro_mensajess.length; i++) {
				lPro_mensajess[i].setUsuarios(null);
			}
			com.mds2.foro.UsuariosBD[] lUsuarioss = administrador.usuarios.toArray();
			for(int i = 0; i < lUsuarioss.length; i++) {
				lUsuarioss[i].usuariosAmigos.remove(administrador);
			}
			com.mds2.foro.TemaBD[] lPro_temass = administrador.pro_temas.toArray();
			for(int i = 0; i < lPro_temass.length; i++) {
				lPro_temass[i].setUsuarios(null);
			}
			com.mds2.foro.SeccionBD[] lPro_seccioness = administrador.pro_secciones.toArray();
			for(int i = 0; i < lPro_seccioness.length; i++) {
				lPro_seccioness[i].setUsuarios(null);
			}
			com.mds2.foro.NotificacionBD[] lNotificacioness = administrador.notificaciones.toArray();
			for(int i = 0; i < lNotificacioness.length; i++) {
				lNotificacioness[i].setUsuarios(null);
			}
			com.mds2.foro.UsuariosBD[] lUsuariosAmigoss = administrador.usuariosAmigos.toArray();
			for(int i = 0; i < lUsuariosAmigoss.length; i++) {
				lUsuariosAmigoss[i].usuarios.remove(administrador);
			}
			try {
				session.delete(administrador);
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
	
	public static boolean refresh(com.mds2.foro.AdministradorBD administrador) throws PersistentException {
		try {
			com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().refresh(administrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.mds2.foro.AdministradorBD administrador) throws PersistentException {
		try {
			com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().evict(administrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministradorBD loadAdministradorByCriteria(AdministradorCriteria administradorCriteria) {
		AdministradorBD[] administradors = listAdministradorByCriteria(administradorCriteria);
		if(administradors == null || administradors.length == 0) {
			return null;
		}
		return administradors[0];
	}
	
	public static AdministradorBD[] listAdministradorByCriteria(AdministradorCriteria administradorCriteria) {
		return administradorCriteria.listAdministrador();
	}
}
