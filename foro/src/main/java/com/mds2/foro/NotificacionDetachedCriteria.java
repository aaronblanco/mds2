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

public class NotificacionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idNotificacion;
	public final IntegerExpression usuariosId;
	public final AssociationExpression usuarios;
	public final StringExpression titulo;
	public final IntegerExpression idUsuarioPropietario;
	public final StringExpression descripcionCampo;
	
	public NotificacionDetachedCriteria() {
		super(com.mds2.foro.Notificacion.class, com.mds2.foro.NotificacionCriteria.class);
		idNotificacion = new IntegerExpression("idNotificacion", this.getDetachedCriteria());
		usuariosId = new IntegerExpression("usuarios.idUsuario", this.getDetachedCriteria());
		usuarios = new AssociationExpression("usuarios", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		idUsuarioPropietario = new IntegerExpression("idUsuarioPropietario", this.getDetachedCriteria());
		descripcionCampo = new StringExpression("descripcionCampo", this.getDetachedCriteria());
	}
	
	public NotificacionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.mds2.foro.NotificacionCriteria.class);
		idNotificacion = new IntegerExpression("idNotificacion", this.getDetachedCriteria());
		usuariosId = new IntegerExpression("usuarios.idUsuario", this.getDetachedCriteria());
		usuarios = new AssociationExpression("usuarios", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		idUsuarioPropietario = new IntegerExpression("idUsuarioPropietario", this.getDetachedCriteria());
		descripcionCampo = new StringExpression("descripcionCampo", this.getDetachedCriteria());
	}
	
	public UsuariosDetachedCriteria createUsuariosCriteria() {
		return new UsuariosDetachedCriteria(createCriteria("usuarios"));
	}
	
	public Notificacion uniqueNotificacion(PersistentSession session) {
		return (Notificacion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Notificacion[] listNotificacion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Notificacion[]) list.toArray(new Notificacion[list.size()]);
	}
}

