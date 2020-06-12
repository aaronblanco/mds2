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

public class MensajeDAO {
	public static Mensaje loadMensajeByORMID(int idMensaje) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadMensajeByORMID(session, idMensaje);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje getMensajeByORMID(int idMensaje) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return getMensajeByORMID(session, idMensaje);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje loadMensajeByORMID(int idMensaje, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadMensajeByORMID(session, idMensaje, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje getMensajeByORMID(int idMensaje, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return getMensajeByORMID(session, idMensaje, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje loadMensajeByORMID(PersistentSession session, int idMensaje) throws PersistentException {
		try {
			return (Mensaje) session.load(com.mds2.foro.Mensaje.class, new Integer(idMensaje));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje getMensajeByORMID(PersistentSession session, int idMensaje) throws PersistentException {
		try {
			return (Mensaje) session.get(com.mds2.foro.Mensaje.class, new Integer(idMensaje));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje loadMensajeByORMID(PersistentSession session, int idMensaje, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Mensaje) session.load(com.mds2.foro.Mensaje.class, new Integer(idMensaje), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje getMensajeByORMID(PersistentSession session, int idMensaje, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Mensaje) session.get(com.mds2.foro.Mensaje.class, new Integer(idMensaje), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMensaje(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return queryMensaje(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMensaje(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return queryMensaje(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje[] listMensajeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return listMensajeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje[] listMensajeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return listMensajeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMensaje(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds2.foro.Mensaje as Mensaje");
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
	
	public static List queryMensaje(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds2.foro.Mensaje as Mensaje");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Mensaje", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje[] listMensajeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMensaje(session, condition, orderBy);
			return (Mensaje[]) list.toArray(new Mensaje[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje[] listMensajeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMensaje(session, condition, orderBy, lockMode);
			return (Mensaje[]) list.toArray(new Mensaje[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje loadMensajeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadMensajeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje loadMensajeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadMensajeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje loadMensajeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Mensaje[] mensajes = listMensajeByQuery(session, condition, orderBy);
		if (mensajes != null && mensajes.length > 0)
			return mensajes[0];
		else
			return null;
	}
	
	public static Mensaje loadMensajeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Mensaje[] mensajes = listMensajeByQuery(session, condition, orderBy, lockMode);
		if (mensajes != null && mensajes.length > 0)
			return mensajes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMensajeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return iterateMensajeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMensajeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return iterateMensajeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMensajeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds2.foro.Mensaje as Mensaje");
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
	
	public static java.util.Iterator iterateMensajeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds2.foro.Mensaje as Mensaje");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Mensaje", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje createMensaje() {
		return new com.mds2.foro.Mensaje();
	}
	
	public static boolean save(com.mds2.foro.Mensaje mensaje) throws PersistentException {
		try {
			MDS11920PFBlancoRoblesPersistentManager.instance().saveObject(mensaje);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.mds2.foro.Mensaje mensaje) throws PersistentException {
		try {
			MDS11920PFBlancoRoblesPersistentManager.instance().deleteObject(mensaje);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mds2.foro.Mensaje mensaje)throws PersistentException {
		try {
			if (mensaje.getTema_mensaje() != null) {
				mensaje.getTema_mensaje().contiene_mensajes.remove(mensaje);
			}
			
			if (mensaje.getUsuarios() != null) {
				mensaje.getUsuarios().pro_mensajes.remove(mensaje);
			}
			
			com.mds2.foro.imagenes[] lContiene_imageness = mensaje.contiene_imagenes.toArray();
			for(int i = 0; i < lContiene_imageness.length; i++) {
				lContiene_imageness[i].setMensaje_imagen(null);
			}
			if (mensaje.getContiene_videos() != null) {
				mensaje.getContiene_videos().setMensaje_video(null);
			}
			
			return delete(mensaje);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mds2.foro.Mensaje mensaje, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (mensaje.getTema_mensaje() != null) {
				mensaje.getTema_mensaje().contiene_mensajes.remove(mensaje);
			}
			
			if (mensaje.getUsuarios() != null) {
				mensaje.getUsuarios().pro_mensajes.remove(mensaje);
			}
			
			com.mds2.foro.imagenes[] lContiene_imageness = mensaje.contiene_imagenes.toArray();
			for(int i = 0; i < lContiene_imageness.length; i++) {
				lContiene_imageness[i].setMensaje_imagen(null);
			}
			if (mensaje.getContiene_videos() != null) {
				mensaje.getContiene_videos().setMensaje_video(null);
			}
			
			try {
				session.delete(mensaje);
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
	
	public static boolean refresh(com.mds2.foro.Mensaje mensaje) throws PersistentException {
		try {
			MDS11920PFBlancoRoblesPersistentManager.instance().getSession().refresh(mensaje);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.mds2.foro.Mensaje mensaje) throws PersistentException {
		try {
			MDS11920PFBlancoRoblesPersistentManager.instance().getSession().evict(mensaje);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje loadMensajeByCriteria(MensajeCriteria mensajeCriteria) {
		Mensaje[] mensajes = listMensajeByCriteria(mensajeCriteria);
		if(mensajes == null || mensajes.length == 0) {
			return null;
		}
		return mensajes[0];
	}
	
	public static Mensaje[] listMensajeByCriteria(MensajeCriteria mensajeCriteria) {
		return mensajeCriteria.listMensaje();
	}
}
