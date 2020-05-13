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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class imagenesDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idMedia;
	public final StringExpression url;
	
	public imagenesDetachedCriteria() {
		super(db_dcl.imagenes.class, db_dcl.imagenesCriteria.class);
		idMedia = new IntegerExpression("idMedia", this.getDetachedCriteria());
		url = new StringExpression("url", this.getDetachedCriteria());
	}
	
	public imagenesDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, db_dcl.imagenesCriteria.class);
		idMedia = new IntegerExpression("idMedia", this.getDetachedCriteria());
		url = new StringExpression("url", this.getDetachedCriteria());
	}
	
	public imagenes uniqueImagenes(PersistentSession session) {
		return (imagenes) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public imagenes[] listImagenes(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (imagenes[]) list.toArray(new imagenes[list.size()]);
	}
}

