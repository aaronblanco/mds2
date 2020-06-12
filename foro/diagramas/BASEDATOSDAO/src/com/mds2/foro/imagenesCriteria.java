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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class imagenesCriteria extends AbstractORMCriteria {
	public final IntegerExpression idMedia;
	public final StringExpression url;
	public final IntegerExpression mensaje_imagenId;
	public final AssociationExpression mensaje_imagen;
	
	public imagenesCriteria(Criteria criteria) {
		super(criteria);
		idMedia = new IntegerExpression("idMedia", this);
		url = new StringExpression("url", this);
		mensaje_imagenId = new IntegerExpression("mensaje_imagen.idMensaje", this);
		mensaje_imagen = new AssociationExpression("mensaje_imagen", this);
	}
	
	public imagenesCriteria(PersistentSession session) {
		this(session.createCriteria(imagenes.class));
	}
	
	public imagenesCriteria() throws PersistentException {
		this(MDS11920PFBlancoRoblesPersistentManager.instance().getSession());
	}
	
	public MensajeCriteria createMensaje_imagenCriteria() {
		return new MensajeCriteria(createCriteria("mensaje_imagen"));
	}
	
	public imagenes uniqueImagenes() {
		return (imagenes) super.uniqueResult();
	}
	
	public imagenes[] listImagenes() {
		java.util.List list = super.list();
		return (imagenes[]) list.toArray(new imagenes[list.size()]);
	}
}

