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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class imagenesCriteria extends AbstractORMCriteria {
	public final IntegerExpression idMedia;
	public final StringExpression url;
	
	public imagenesCriteria(Criteria criteria) {
		super(criteria);
		idMedia = new IntegerExpression("idMedia", this);
		url = new StringExpression("url", this);
	}
	
	public imagenesCriteria(PersistentSession session) {
		this(session.createCriteria(imagenes.class));
	}
	
	public imagenesCriteria() throws PersistentException {
		this(db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession());
	}
	
	public imagenes uniqueImagenes() {
		return (imagenes) super.uniqueResult();
	}
	
	public imagenes[] listImagenes() {
		java.util.List list = super.list();
		return (imagenes[]) list.toArray(new imagenes[list.size()]);
	}
}

