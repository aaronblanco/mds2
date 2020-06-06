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

public class AnuncioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idAnuncio;
	public final StringExpression imagen;
	public final BooleanExpression publicado;
	
	public AnuncioDetachedCriteria() {
		super(com.mds2.foro.Anuncio.class, com.mds2.foro.AnuncioCriteria.class);
		idAnuncio = new IntegerExpression("idAnuncio", this.getDetachedCriteria());
		imagen = new StringExpression("imagen", this.getDetachedCriteria());
		publicado = new BooleanExpression("publicado", this.getDetachedCriteria());
	}
	
	public AnuncioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.mds2.foro.AnuncioCriteria.class);
		idAnuncio = new IntegerExpression("idAnuncio", this.getDetachedCriteria());
		imagen = new StringExpression("imagen", this.getDetachedCriteria());
		publicado = new BooleanExpression("publicado", this.getDetachedCriteria());
	}
	
	public Anuncio uniqueAnuncio(PersistentSession session) {
		return (Anuncio) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Anuncio[] listAnuncio(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Anuncio[]) list.toArray(new Anuncio[list.size()]);
	}
}

