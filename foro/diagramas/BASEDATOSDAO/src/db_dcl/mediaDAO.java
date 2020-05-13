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
package db_dcl;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class mediaDAO {
	public static media loadMediaByORMID(int idMedia) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadMediaByORMID(session, idMedia);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static media getMediaByORMID(int idMedia) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return getMediaByORMID(session, idMedia);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static media loadMediaByORMID(int idMedia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadMediaByORMID(session, idMedia, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static media getMediaByORMID(int idMedia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return getMediaByORMID(session, idMedia, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static media loadMediaByORMID(PersistentSession session, int idMedia) throws PersistentException {
		try {
			return (media) session.load(db_dcl.media.class, new Integer(idMedia));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static media getMediaByORMID(PersistentSession session, int idMedia) throws PersistentException {
		try {
			return (media) session.get(db_dcl.media.class, new Integer(idMedia));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static media loadMediaByORMID(PersistentSession session, int idMedia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (media) session.load(db_dcl.media.class, new Integer(idMedia), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static media getMediaByORMID(PersistentSession session, int idMedia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (media) session.get(db_dcl.media.class, new Integer(idMedia), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMedia(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return queryMedia(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMedia(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return queryMedia(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static media[] listMediaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return listMediaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static media[] listMediaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return listMediaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMedia(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From db_dcl.media as media");
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
	
	public static List queryMedia(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From db_dcl.media as media");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("media", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static media[] listMediaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMedia(session, condition, orderBy);
			return (media[]) list.toArray(new media[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static media[] listMediaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMedia(session, condition, orderBy, lockMode);
			return (media[]) list.toArray(new media[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static media loadMediaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadMediaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static media loadMediaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadMediaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static media loadMediaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		media[] medias = listMediaByQuery(session, condition, orderBy);
		if (medias != null && medias.length > 0)
			return medias[0];
		else
			return null;
	}
	
	public static media loadMediaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		media[] medias = listMediaByQuery(session, condition, orderBy, lockMode);
		if (medias != null && medias.length > 0)
			return medias[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMediaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return iterateMediaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMediaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return iterateMediaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMediaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From db_dcl.media as media");
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
	
	public static java.util.Iterator iterateMediaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From db_dcl.media as media");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("media", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static media createMedia() {
		return new db_dcl.media();
	}
	
	public static boolean save(db_dcl.media lmedia) throws PersistentException {
		try {
			db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().saveObject(lmedia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(db_dcl.media lmedia) throws PersistentException {
		try {
			db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().deleteObject(lmedia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(db_dcl.media lmedia) throws PersistentException {
		try {
			db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().refresh(lmedia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(db_dcl.media lmedia) throws PersistentException {
		try {
			db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().evict(lmedia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static media loadMediaByCriteria(mediaCriteria mediaCriteria) {
		media[] medias = listMediaByCriteria(mediaCriteria);
		if(medias == null || medias.length == 0) {
			return null;
		}
		return medias[0];
	}
	
	public static media[] listMediaByCriteria(mediaCriteria mediaCriteria) {
		return mediaCriteria.listMedia();
	}
}
