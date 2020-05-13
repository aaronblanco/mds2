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

public class AnuncioCriteria extends AbstractORMCriteria {
	public final IntegerExpression idAnuncio;
	public final StringExpression imagen;
	public final BooleanExpression publicado;
	
	public AnuncioCriteria(Criteria criteria) {
		super(criteria);
		idAnuncio = new IntegerExpression("idAnuncio", this);
		imagen = new StringExpression("imagen", this);
		publicado = new BooleanExpression("publicado", this);
	}
	
	public AnuncioCriteria(PersistentSession session) {
		this(session.createCriteria(Anuncio.class));
	}
	
	public AnuncioCriteria() throws PersistentException {
		this(db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession());
	}
	
	public Anuncio uniqueAnuncio() {
		return (Anuncio) super.uniqueResult();
	}
	
	public Anuncio[] listAnuncio() {
		java.util.List list = super.list();
		return (Anuncio[]) list.toArray(new Anuncio[list.size()]);
	}
}
