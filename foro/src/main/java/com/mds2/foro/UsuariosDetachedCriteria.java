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

public class UsuariosDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idUsuario;
	public final StringExpression email;
	public final StringExpression descripcion;
	public final StringExpression nombreUsuario;
	public final StringExpression nombre;
	public final StringExpression contraseña;
	public final StringExpression fotoPerfil;
	public final BooleanExpression amonestado;
	public final BooleanExpression sancionado;
	public final BooleanExpression publico;
	public final BooleanExpression oculto;
	public final CollectionExpression pro_tickets;
	public final CollectionExpression pro_mensajes;
	public final CollectionExpression usuarios;
	public final CollectionExpression pro_temas;
	public final CollectionExpression pro_secciones;
	public final CollectionExpression notificaciones;
	public final CollectionExpression usuariosAmigos;
	
	public UsuariosDetachedCriteria() {
		super(com.mds2.foro.UsuariosBD.class, com.mds2.foro.UsuariosCriteria.class);
		idUsuario = new IntegerExpression("idUsuario", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		contraseña = new StringExpression("contraseña", this.getDetachedCriteria());
		fotoPerfil = new StringExpression("fotoPerfil", this.getDetachedCriteria());
		amonestado = new BooleanExpression("amonestado", this.getDetachedCriteria());
		sancionado = new BooleanExpression("sancionado", this.getDetachedCriteria());
		publico = new BooleanExpression("publico", this.getDetachedCriteria());
		oculto = new BooleanExpression("oculto", this.getDetachedCriteria());
		pro_tickets = new CollectionExpression("ORM_pro_tickets", this.getDetachedCriteria());
		pro_mensajes = new CollectionExpression("ORM_pro_mensajes", this.getDetachedCriteria());
		usuarios = new CollectionExpression("ORM_usuarios", this.getDetachedCriteria());
		pro_temas = new CollectionExpression("ORM_pro_temas", this.getDetachedCriteria());
		pro_secciones = new CollectionExpression("ORM_pro_secciones", this.getDetachedCriteria());
		notificaciones = new CollectionExpression("ORM_notificaciones", this.getDetachedCriteria());
		usuariosAmigos = new CollectionExpression("ORM_usuariosAmigos", this.getDetachedCriteria());
	}
	
	public UsuariosDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.mds2.foro.UsuariosCriteria.class);
		idUsuario = new IntegerExpression("idUsuario", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		contraseña = new StringExpression("contraseña", this.getDetachedCriteria());
		fotoPerfil = new StringExpression("fotoPerfil", this.getDetachedCriteria());
		amonestado = new BooleanExpression("amonestado", this.getDetachedCriteria());
		sancionado = new BooleanExpression("sancionado", this.getDetachedCriteria());
		publico = new BooleanExpression("publico", this.getDetachedCriteria());
		oculto = new BooleanExpression("oculto", this.getDetachedCriteria());
		pro_tickets = new CollectionExpression("ORM_pro_tickets", this.getDetachedCriteria());
		pro_mensajes = new CollectionExpression("ORM_pro_mensajes", this.getDetachedCriteria());
		usuarios = new CollectionExpression("ORM_usuarios", this.getDetachedCriteria());
		pro_temas = new CollectionExpression("ORM_pro_temas", this.getDetachedCriteria());
		pro_secciones = new CollectionExpression("ORM_pro_secciones", this.getDetachedCriteria());
		notificaciones = new CollectionExpression("ORM_notificaciones", this.getDetachedCriteria());
		usuariosAmigos = new CollectionExpression("ORM_usuariosAmigos", this.getDetachedCriteria());
	}
	
	public com.mds2.foro.TicketDetachedCriteria createPro_ticketsCriteria() {
		return new com.mds2.foro.TicketDetachedCriteria(createCriteria("ORM_pro_tickets"));
	}
	
	public com.mds2.foro.MensajeDetachedCriteria createPro_mensajesCriteria() {
		return new com.mds2.foro.MensajeDetachedCriteria(createCriteria("ORM_pro_mensajes"));
	}
	
	public com.mds2.foro.UsuariosDetachedCriteria createUsuariosCriteria() {
		return new com.mds2.foro.UsuariosDetachedCriteria(createCriteria("ORM_usuarios"));
	}
	
	public com.mds2.foro.TemaDetachedCriteria createPro_temasCriteria() {
		return new com.mds2.foro.TemaDetachedCriteria(createCriteria("ORM_pro_temas"));
	}
	
	public com.mds2.foro.SeccionDetachedCriteria createPro_seccionesCriteria() {
		return new com.mds2.foro.SeccionDetachedCriteria(createCriteria("ORM_pro_secciones"));
	}
	
	public com.mds2.foro.NotificacionDetachedCriteria createNotificacionesCriteria() {
		return new com.mds2.foro.NotificacionDetachedCriteria(createCriteria("ORM_notificaciones"));
	}
	
	public com.mds2.foro.UsuariosDetachedCriteria createUsuariosAmigosCriteria() {
		return new com.mds2.foro.UsuariosDetachedCriteria(createCriteria("ORM_usuariosAmigos"));
	}
	
	public UsuariosBD uniqueUsuarios(PersistentSession session) {
		return (UsuariosBD) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public UsuariosBD[] listUsuarios(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (UsuariosBD[]) list.toArray(new UsuariosBD[list.size()]);
	}
}

