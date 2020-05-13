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

public class AnuncioDAO {
	public static AnuncioBD loadAnuncioByORMID(int idAnuncio) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadAnuncioByORMID(session, idAnuncio);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AnuncioBD getAnuncioByORMID(int idAnuncio) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return getAnuncioByORMID(session, idAnuncio);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AnuncioBD loadAnuncioByORMID(int idAnuncio, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadAnuncioByORMID(session, idAnuncio, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AnuncioBD getAnuncioByORMID(int idAnuncio, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return getAnuncioByORMID(session, idAnuncio, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AnuncioBD loadAnuncioByORMID(PersistentSession session, int idAnuncio) throws PersistentException {
		try {
			return (AnuncioBD) session.load(com.mds2.foro.AnuncioBD.class, new Integer(idAnuncio));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AnuncioBD getAnuncioByORMID(PersistentSession session, int idAnuncio) throws PersistentException {
		try {
			return (AnuncioBD) session.get(com.mds2.foro.AnuncioBD.class, new Integer(idAnuncio));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AnuncioBD loadAnuncioByORMID(PersistentSession session, int idAnuncio, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (AnuncioBD) session.load(com.mds2.foro.AnuncioBD.class, new Integer(idAnuncio), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AnuncioBD getAnuncioByORMID(PersistentSession session, int idAnuncio, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (AnuncioBD) session.get(com.mds2.foro.AnuncioBD.class, new Integer(idAnuncio), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAnuncio(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return queryAnuncio(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAnuncio(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return queryAnuncio(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AnuncioBD[] listAnuncioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return listAnuncioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AnuncioBD[] listAnuncioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return listAnuncioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAnuncio(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From db_dcl.Anuncio as Anuncio");
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
	
	public static List queryAnuncio(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From db_dcl.Anuncio as Anuncio");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Anuncio", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AnuncioBD[] listAnuncioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAnuncio(session, condition, orderBy);
			return (AnuncioBD[]) list.toArray(new AnuncioBD[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AnuncioBD[] listAnuncioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAnuncio(session, condition, orderBy, lockMode);
			return (AnuncioBD[]) list.toArray(new AnuncioBD[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AnuncioBD loadAnuncioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadAnuncioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AnuncioBD loadAnuncioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadAnuncioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AnuncioBD loadAnuncioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		AnuncioBD[] anuncios = listAnuncioByQuery(session, condition, orderBy);
		if (anuncios != null && anuncios.length > 0)
			return anuncios[0];
		else
			return null;
	}
	
	public static AnuncioBD loadAnuncioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		AnuncioBD[] anuncios = listAnuncioByQuery(session, condition, orderBy, lockMode);
		if (anuncios != null && anuncios.length > 0)
			return anuncios[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAnuncioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return iterateAnuncioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAnuncioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return iterateAnuncioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAnuncioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From db_dcl.Anuncio as Anuncio");
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
	
	public static java.util.Iterator iterateAnuncioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From db_dcl.Anuncio as Anuncio");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Anuncio", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AnuncioBD createAnuncio() {
		return new com.mds2.foro.AnuncioBD();
	}
	
	public static boolean save(com.mds2.foro.AnuncioBD anuncio) throws PersistentException {
		try {
			com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().saveObject(anuncio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.mds2.foro.AnuncioBD anuncio) throws PersistentException {
		try {
			com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().deleteObject(anuncio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(com.mds2.foro.AnuncioBD anuncio) throws PersistentException {
		try {
			com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().refresh(anuncio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.mds2.foro.AnuncioBD anuncio) throws PersistentException {
		try {
			com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().evict(anuncio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AnuncioBD loadAnuncioByCriteria(AnuncioCriteria anuncioCriteria) {
		AnuncioBD[] anuncios = listAnuncioByCriteria(anuncioCriteria);
		if(anuncios == null || anuncios.length == 0) {
			return null;
		}
		return anuncios[0];
	}
	
	public static AnuncioBD[] listAnuncioByCriteria(AnuncioCriteria anuncioCriteria) {
		return anuncioCriteria.listAnuncio();
	}
}
