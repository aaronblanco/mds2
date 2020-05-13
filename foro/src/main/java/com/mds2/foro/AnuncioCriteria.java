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
		this(session.createCriteria(AnuncioBD.class));
	}
	
	public AnuncioCriteria() throws PersistentException {
		this(com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession());
	}
	
	public AnuncioBD uniqueAnuncio() {
		return (AnuncioBD) super.uniqueResult();
	}
	
	public AnuncioBD[] listAnuncio() {
		java.util.List list = super.list();
		return (AnuncioBD[]) list.toArray(new AnuncioBD[list.size()]);
	}
}

