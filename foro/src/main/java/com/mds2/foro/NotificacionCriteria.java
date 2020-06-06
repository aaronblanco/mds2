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

public class NotificacionCriteria extends AbstractORMCriteria {
	public final IntegerExpression idNotificacion;
	public final IntegerExpression usuariosId;
	public final AssociationExpression usuarios;
	public final StringExpression titulo;
	public final IntegerExpression idUsuarioPropietario;
	public final StringExpression descripcionCampo;
	
	public NotificacionCriteria(Criteria criteria) {
		super(criteria);
		idNotificacion = new IntegerExpression("idNotificacion", this);
		usuariosId = new IntegerExpression("usuarios.idUsuario", this);
		usuarios = new AssociationExpression("usuarios", this);
		titulo = new StringExpression("titulo", this);
		idUsuarioPropietario = new IntegerExpression("idUsuarioPropietario", this);
		descripcionCampo = new StringExpression("descripcionCampo", this);
	}
	
	public NotificacionCriteria(PersistentSession session) {
		this(session.createCriteria(NotificacionBD.class));
	}
	
	public NotificacionCriteria() throws PersistentException {
		this(com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession());
	}
	
	public UsuariosCriteria createUsuariosCriteria() {
		return new UsuariosCriteria(createCriteria("usuarios"));
	}
	
	public NotificacionBD uniqueNotificacion() {
		return (NotificacionBD) super.uniqueResult();
	}
	
	public NotificacionBD[] listNotificacion() {
		java.util.List list = super.list();
		return (NotificacionBD[]) list.toArray(new NotificacionBD[list.size()]);
	}
}
