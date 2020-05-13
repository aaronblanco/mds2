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

public class videosDAO {
	public static videos loadVideosByORMID(int idMedia) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadVideosByORMID(session, idMedia);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static videos getVideosByORMID(int idMedia) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return getVideosByORMID(session, idMedia);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static videos loadVideosByORMID(int idMedia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadVideosByORMID(session, idMedia, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static videos getVideosByORMID(int idMedia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return getVideosByORMID(session, idMedia, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static videos loadVideosByORMID(PersistentSession session, int idMedia) throws PersistentException {
		try {
			return (videos) session.load(db_dcl.videos.class, new Integer(idMedia));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static videos getVideosByORMID(PersistentSession session, int idMedia) throws PersistentException {
		try {
			return (videos) session.get(db_dcl.videos.class, new Integer(idMedia));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static videos loadVideosByORMID(PersistentSession session, int idMedia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (videos) session.load(db_dcl.videos.class, new Integer(idMedia), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static videos getVideosByORMID(PersistentSession session, int idMedia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (videos) session.get(db_dcl.videos.class, new Integer(idMedia), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVideos(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return queryVideos(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVideos(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return queryVideos(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static videos[] listVideosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return listVideosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static videos[] listVideosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return listVideosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVideos(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From db_dcl.videos as videos");
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
	
	public static List queryVideos(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From db_dcl.videos as videos");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("videos", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static videos[] listVideosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryVideos(session, condition, orderBy);
			return (videos[]) list.toArray(new videos[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static videos[] listVideosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryVideos(session, condition, orderBy, lockMode);
			return (videos[]) list.toArray(new videos[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static videos loadVideosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadVideosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static videos loadVideosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadVideosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static videos loadVideosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		videos[] videoses = listVideosByQuery(session, condition, orderBy);
		if (videoses != null && videoses.length > 0)
			return videoses[0];
		else
			return null;
	}
	
	public static videos loadVideosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		videos[] videoses = listVideosByQuery(session, condition, orderBy, lockMode);
		if (videoses != null && videoses.length > 0)
			return videoses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateVideosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return iterateVideosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVideosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return iterateVideosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVideosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From db_dcl.videos as videos");
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
	
	public static java.util.Iterator iterateVideosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From db_dcl.videos as videos");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("videos", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static videos createVideos() {
		return new db_dcl.videos();
	}
	
	public static boolean save(db_dcl.videos lvideos) throws PersistentException {
		try {
			db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().saveObject(lvideos);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(db_dcl.videos lvideos) throws PersistentException {
		try {
			db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().deleteObject(lvideos);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(db_dcl.videos lvideos) throws PersistentException {
		try {
			db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().refresh(lvideos);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(db_dcl.videos lvideos) throws PersistentException {
		try {
			db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().evict(lvideos);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static videos loadVideosByCriteria(videosCriteria videosCriteria) {
		videos[] videoses = listVideosByCriteria(videosCriteria);
		if(videoses == null || videoses.length == 0) {
			return null;
		}
		return videoses[0];
	}
	
	public static videos[] listVideosByCriteria(videosCriteria videosCriteria) {
		return videosCriteria.listVideos();
	}
}