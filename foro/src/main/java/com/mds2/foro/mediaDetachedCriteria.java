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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class mediaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idMedia;
	public final StringExpression url;
	
	public mediaDetachedCriteria() {
		super(com.mds2.foro.media.class, com.mds2.foro.mediaCriteria.class);
		idMedia = new IntegerExpression("idMedia", this.getDetachedCriteria());
		url = new StringExpression("url", this.getDetachedCriteria());
	}
	
	public mediaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.mds2.foro.mediaCriteria.class);
		idMedia = new IntegerExpression("idMedia", this.getDetachedCriteria());
		url = new StringExpression("url", this.getDetachedCriteria());
	}
	
	public media uniqueMedia(PersistentSession session) {
		return (media) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public media[] listMedia(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (media[]) list.toArray(new media[list.size()]);
	}
}

