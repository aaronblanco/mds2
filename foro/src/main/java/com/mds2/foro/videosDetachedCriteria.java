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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class videosDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idMedia;
	public final StringExpression url;
	public final IntegerExpression mensaje_videoId;
	public final AssociationExpression mensaje_video;
	
	public videosDetachedCriteria() {
		super(com.mds2.foro.videos.class, com.mds2.foro.videosCriteria.class);
		idMedia = new IntegerExpression("idMedia", this.getDetachedCriteria());
		url = new StringExpression("url", this.getDetachedCriteria());
		mensaje_videoId = new IntegerExpression("mensaje_video.idMensaje", this.getDetachedCriteria());
		mensaje_video = new AssociationExpression("mensaje_video", this.getDetachedCriteria());
	}
	
	public videosDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.mds2.foro.videosCriteria.class);
		idMedia = new IntegerExpression("idMedia", this.getDetachedCriteria());
		url = new StringExpression("url", this.getDetachedCriteria());
		mensaje_videoId = new IntegerExpression("mensaje_video.idMensaje", this.getDetachedCriteria());
		mensaje_video = new AssociationExpression("mensaje_video", this.getDetachedCriteria());
	}
	
	public MensajeDetachedCriteria createMensaje_videoCriteria() {
		return new MensajeDetachedCriteria(createCriteria("mensaje_video"));
	}
	
	public videos uniqueVideos(PersistentSession session) {
		return (videos) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public videos[] listVideos(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (videos[]) list.toArray(new videos[list.size()]);
	}
}

