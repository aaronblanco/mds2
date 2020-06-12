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

public class imagenesDAO {
	public static imagenes loadImagenesByORMID(int idMedia) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadImagenesByORMID(session, idMedia);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static imagenes getImagenesByORMID(int idMedia) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return getImagenesByORMID(session, idMedia);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static imagenes loadImagenesByORMID(int idMedia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadImagenesByORMID(session, idMedia, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static imagenes getImagenesByORMID(int idMedia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return getImagenesByORMID(session, idMedia, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static imagenes loadImagenesByORMID(PersistentSession session, int idMedia) throws PersistentException {
		try {
			return (imagenes) session.load(com.mds2.foro.imagenes.class, new Integer(idMedia));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static imagenes getImagenesByORMID(PersistentSession session, int idMedia) throws PersistentException {
		try {
			return (imagenes) session.get(com.mds2.foro.imagenes.class, new Integer(idMedia));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static imagenes loadImagenesByORMID(PersistentSession session, int idMedia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (imagenes) session.load(com.mds2.foro.imagenes.class, new Integer(idMedia), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static imagenes getImagenesByORMID(PersistentSession session, int idMedia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (imagenes) session.get(com.mds2.foro.imagenes.class, new Integer(idMedia), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryImagenes(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return queryImagenes(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryImagenes(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return queryImagenes(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static imagenes[] listImagenesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return listImagenesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static imagenes[] listImagenesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return listImagenesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryImagenes(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds2.foro.imagenes as imagenes");
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
	
	public static List queryImagenes(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds2.foro.imagenes as imagenes");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("imagenes", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static imagenes[] listImagenesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryImagenes(session, condition, orderBy);
			return (imagenes[]) list.toArray(new imagenes[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static imagenes[] listImagenesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryImagenes(session, condition, orderBy, lockMode);
			return (imagenes[]) list.toArray(new imagenes[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static imagenes loadImagenesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadImagenesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static imagenes loadImagenesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadImagenesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static imagenes loadImagenesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		imagenes[] imageneses = listImagenesByQuery(session, condition, orderBy);
		if (imageneses != null && imageneses.length > 0)
			return imageneses[0];
		else
			return null;
	}
	
	public static imagenes loadImagenesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		imagenes[] imageneses = listImagenesByQuery(session, condition, orderBy, lockMode);
		if (imageneses != null && imageneses.length > 0)
			return imageneses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateImagenesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return iterateImagenesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateImagenesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return iterateImagenesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateImagenesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds2.foro.imagenes as imagenes");
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
	
	public static java.util.Iterator iterateImagenesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds2.foro.imagenes as imagenes");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("imagenes", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static imagenes createImagenes() {
		return new com.mds2.foro.imagenes();
	}
	
	public static boolean save(com.mds2.foro.imagenes limagenes) throws PersistentException {
		try {
			MDS11920PFBlancoRoblesPersistentManager.instance().saveObject(limagenes);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.mds2.foro.imagenes limagenes) throws PersistentException {
		try {
			MDS11920PFBlancoRoblesPersistentManager.instance().deleteObject(limagenes);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mds2.foro.imagenes limagenes)throws PersistentException {
		try {
			if (limagenes.getMensaje_imagen() != null) {
				limagenes.getMensaje_imagen().contiene_imagenes.remove(limagenes);
			}
			
			return delete(limagenes);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mds2.foro.imagenes limagenes, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (limagenes.getMensaje_imagen() != null) {
				limagenes.getMensaje_imagen().contiene_imagenes.remove(limagenes);
			}
			
			try {
				session.delete(limagenes);
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
	
	public static boolean refresh(com.mds2.foro.imagenes limagenes) throws PersistentException {
		try {
			MDS11920PFBlancoRoblesPersistentManager.instance().getSession().refresh(limagenes);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.mds2.foro.imagenes limagenes) throws PersistentException {
		try {
			MDS11920PFBlancoRoblesPersistentManager.instance().getSession().evict(limagenes);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static imagenes loadImagenesByCriteria(imagenesCriteria imagenesCriteria) {
		imagenes[] imageneses = listImagenesByCriteria(imagenesCriteria);
		if(imageneses == null || imageneses.length == 0) {
			return null;
		}
		return imageneses[0];
	}
	
	public static imagenes[] listImagenesByCriteria(imagenesCriteria imagenesCriteria) {
		return imagenesCriteria.listImagenes();
	}
}
