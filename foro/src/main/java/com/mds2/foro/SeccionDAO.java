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

public class SeccionDAO {
	public static SeccionBD loadSeccionByORMID(int idSeccion) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadSeccionByORMID(session, idSeccion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SeccionBD getSeccionByORMID(int idSeccion) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return getSeccionByORMID(session, idSeccion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SeccionBD loadSeccionByORMID(int idSeccion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadSeccionByORMID(session, idSeccion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SeccionBD getSeccionByORMID(int idSeccion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return getSeccionByORMID(session, idSeccion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SeccionBD loadSeccionByORMID(PersistentSession session, int idSeccion) throws PersistentException {
		try {
			return (SeccionBD) session.load(com.mds2.foro.SeccionBD.class, new Integer(idSeccion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SeccionBD getSeccionByORMID(PersistentSession session, int idSeccion) throws PersistentException {
		try {
			return (SeccionBD) session.get(com.mds2.foro.SeccionBD.class, new Integer(idSeccion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SeccionBD loadSeccionByORMID(PersistentSession session, int idSeccion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (SeccionBD) session.load(com.mds2.foro.SeccionBD.class, new Integer(idSeccion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SeccionBD getSeccionByORMID(PersistentSession session, int idSeccion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (SeccionBD) session.get(com.mds2.foro.SeccionBD.class, new Integer(idSeccion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySeccion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return querySeccion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySeccion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return querySeccion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SeccionBD[] listSeccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return listSeccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SeccionBD[] listSeccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return listSeccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySeccion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From db_dcl.Seccion as Seccion");
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
	
	public static List querySeccion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From db_dcl.Seccion as Seccion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Seccion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SeccionBD[] listSeccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySeccion(session, condition, orderBy);
			return (SeccionBD[]) list.toArray(new SeccionBD[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SeccionBD[] listSeccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySeccion(session, condition, orderBy, lockMode);
			return (SeccionBD[]) list.toArray(new SeccionBD[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SeccionBD loadSeccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadSeccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SeccionBD loadSeccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadSeccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SeccionBD loadSeccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		SeccionBD[] seccions = listSeccionByQuery(session, condition, orderBy);
		if (seccions != null && seccions.length > 0)
			return seccions[0];
		else
			return null;
	}
	
	public static SeccionBD loadSeccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		SeccionBD[] seccions = listSeccionByQuery(session, condition, orderBy, lockMode);
		if (seccions != null && seccions.length > 0)
			return seccions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSeccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return iterateSeccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSeccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return iterateSeccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSeccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From db_dcl.Seccion as Seccion");
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
	
	public static java.util.Iterator iterateSeccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From db_dcl.Seccion as Seccion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Seccion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SeccionBD createSeccion() {
		return new com.mds2.foro.SeccionBD();
	}
	
	public static boolean save(com.mds2.foro.SeccionBD seccion) throws PersistentException {
		try {
			com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().saveObject(seccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.mds2.foro.SeccionBD seccion) throws PersistentException {
		try {
			com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().deleteObject(seccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mds2.foro.SeccionBD seccion)throws PersistentException {
		try {
			if (seccion.getUsuarios() != null) {
				seccion.getUsuarios().pro_secciones.remove(seccion);
			}
			
			return delete(seccion);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mds2.foro.SeccionBD seccion, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (seccion.getUsuarios() != null) {
				seccion.getUsuarios().pro_secciones.remove(seccion);
			}
			
			try {
				session.delete(seccion);
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
	
	public static boolean refresh(com.mds2.foro.SeccionBD seccion) throws PersistentException {
		try {
			com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().refresh(seccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.mds2.foro.SeccionBD seccion) throws PersistentException {
		try {
			com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().evict(seccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SeccionBD loadSeccionByCriteria(SeccionCriteria seccionCriteria) {
		SeccionBD[] seccions = listSeccionByCriteria(seccionCriteria);
		if(seccions == null || seccions.length == 0) {
			return null;
		}
		return seccions[0];
	}
	
	public static SeccionBD[] listSeccionByCriteria(SeccionCriteria seccionCriteria) {
		return seccionCriteria.listSeccion();
	}
}
