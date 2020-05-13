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

public class TemaDAO {
	public static TemaBD loadTemaByORMID(int idTema) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadTemaByORMID(session, idTema);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TemaBD getTemaByORMID(int idTema) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return getTemaByORMID(session, idTema);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TemaBD loadTemaByORMID(int idTema, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadTemaByORMID(session, idTema, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TemaBD getTemaByORMID(int idTema, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return getTemaByORMID(session, idTema, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TemaBD loadTemaByORMID(PersistentSession session, int idTema) throws PersistentException {
		try {
			return (TemaBD) session.load(com.mds2.foro.TemaBD.class, new Integer(idTema));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TemaBD getTemaByORMID(PersistentSession session, int idTema) throws PersistentException {
		try {
			return (TemaBD) session.get(com.mds2.foro.TemaBD.class, new Integer(idTema));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TemaBD loadTemaByORMID(PersistentSession session, int idTema, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (TemaBD) session.load(com.mds2.foro.TemaBD.class, new Integer(idTema), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TemaBD getTemaByORMID(PersistentSession session, int idTema, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (TemaBD) session.get(com.mds2.foro.TemaBD.class, new Integer(idTema), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTema(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return queryTema(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTema(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return queryTema(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TemaBD[] listTemaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return listTemaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TemaBD[] listTemaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return listTemaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTema(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From db_dcl.Tema as Tema");
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
	
	public static List queryTema(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From db_dcl.Tema as Tema");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tema", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TemaBD[] listTemaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTema(session, condition, orderBy);
			return (TemaBD[]) list.toArray(new TemaBD[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TemaBD[] listTemaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTema(session, condition, orderBy, lockMode);
			return (TemaBD[]) list.toArray(new TemaBD[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TemaBD loadTemaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadTemaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TemaBD loadTemaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadTemaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TemaBD loadTemaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		TemaBD[] temas = listTemaByQuery(session, condition, orderBy);
		if (temas != null && temas.length > 0)
			return temas[0];
		else
			return null;
	}
	
	public static TemaBD loadTemaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		TemaBD[] temas = listTemaByQuery(session, condition, orderBy, lockMode);
		if (temas != null && temas.length > 0)
			return temas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTemaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return iterateTemaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTemaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return iterateTemaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTemaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From db_dcl.Tema as Tema");
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
	
	public static java.util.Iterator iterateTemaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From db_dcl.Tema as Tema");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tema", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TemaBD createTema() {
		return new com.mds2.foro.TemaBD();
	}
	
	public static boolean save(com.mds2.foro.TemaBD tema) throws PersistentException {
		try {
			com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().saveObject(tema);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.mds2.foro.TemaBD tema) throws PersistentException {
		try {
			com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().deleteObject(tema);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mds2.foro.TemaBD tema)throws PersistentException {
		try {
			if (tema.getUsuarios() != null) {
				tema.getUsuarios().pro_temas.remove(tema);
			}
			
			return delete(tema);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mds2.foro.TemaBD tema, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (tema.getUsuarios() != null) {
				tema.getUsuarios().pro_temas.remove(tema);
			}
			
			try {
				session.delete(tema);
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
	
	public static boolean refresh(com.mds2.foro.TemaBD tema) throws PersistentException {
		try {
			com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().refresh(tema);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.mds2.foro.TemaBD tema) throws PersistentException {
		try {
			com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().evict(tema);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TemaBD loadTemaByCriteria(TemaCriteria temaCriteria) {
		TemaBD[] temas = listTemaByCriteria(temaCriteria);
		if(temas == null || temas.length == 0) {
			return null;
		}
		return temas[0];
	}
	
	public static TemaBD[] listTemaByCriteria(TemaCriteria temaCriteria) {
		return temaCriteria.listTema();
	}
}
