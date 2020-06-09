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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class mediaCriteria extends AbstractORMCriteria {
	public final IntegerExpression idMedia;
	public final StringExpression url;
	
	public mediaCriteria(Criteria criteria) {
		super(criteria);
		idMedia = new IntegerExpression("idMedia", this);
		url = new StringExpression("url", this);
	}
	
	public mediaCriteria(PersistentSession session) {
		this(session.createCriteria(media.class));
	}
	
	public mediaCriteria() throws PersistentException {
		this(MDS11920PFBlancoRoblesPersistentManager.instance().getSession());
	}
	
	public media uniqueMedia() {
		return (media) super.uniqueResult();
	}
	
	public media[] listMedia() {
		java.util.List list = super.list();
		return (media[]) list.toArray(new media[list.size()]);
	}
}

