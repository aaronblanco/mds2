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

public class UsuariosCriteria extends AbstractORMCriteria {
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
	
	public UsuariosCriteria(Criteria criteria) {
		super(criteria);
		idUsuario = new IntegerExpression("idUsuario", this);
		email = new StringExpression("email", this);
		descripcion = new StringExpression("descripcion", this);
		nombreUsuario = new StringExpression("nombreUsuario", this);
		nombre = new StringExpression("nombre", this);
		contraseña = new StringExpression("contraseña", this);
		fotoPerfil = new StringExpression("fotoPerfil", this);
		amonestado = new BooleanExpression("amonestado", this);
		sancionado = new BooleanExpression("sancionado", this);
		publico = new BooleanExpression("publico", this);
		oculto = new BooleanExpression("oculto", this);
		pro_tickets = new CollectionExpression("ORM_pro_tickets", this);
		pro_mensajes = new CollectionExpression("ORM_pro_mensajes", this);
		usuarios = new CollectionExpression("ORM_usuarios", this);
		pro_temas = new CollectionExpression("ORM_pro_temas", this);
		pro_secciones = new CollectionExpression("ORM_pro_secciones", this);
		notificaciones = new CollectionExpression("ORM_notificaciones", this);
		usuariosAmigos = new CollectionExpression("ORM_usuariosAmigos", this);
	}
	
	public UsuariosCriteria(PersistentSession session) {
		this(session.createCriteria(UsuariosBD.class));
	}
	
	public UsuariosCriteria() throws PersistentException {
		this(com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession());
	}
	
	public com.mds2.foro.TicketCriteria createPro_ticketsCriteria() {
		return new com.mds2.foro.TicketCriteria(createCriteria("ORM_pro_tickets"));
	}
	
	public com.mds2.foro.MensajeCriteria createPro_mensajesCriteria() {
		return new com.mds2.foro.MensajeCriteria(createCriteria("ORM_pro_mensajes"));
	}
	
	public com.mds2.foro.UsuariosCriteria createUsuariosCriteria() {
		return new com.mds2.foro.UsuariosCriteria(createCriteria("ORM_usuarios"));
	}
	
	public com.mds2.foro.TemaCriteria createPro_temasCriteria() {
		return new com.mds2.foro.TemaCriteria(createCriteria("ORM_pro_temas"));
	}
	
	public com.mds2.foro.SeccionCriteria createPro_seccionesCriteria() {
		return new com.mds2.foro.SeccionCriteria(createCriteria("ORM_pro_secciones"));
	}
	
	public com.mds2.foro.NotificacionCriteria createNotificacionesCriteria() {
		return new com.mds2.foro.NotificacionCriteria(createCriteria("ORM_notificaciones"));
	}
	
	public com.mds2.foro.UsuariosCriteria createUsuariosAmigosCriteria() {
		return new com.mds2.foro.UsuariosCriteria(createCriteria("ORM_usuariosAmigos"));
	}
	
	public UsuariosBD uniqueUsuarios() {
		return (UsuariosBD) super.uniqueResult();
	}
	
	public UsuariosBD[] listUsuarios() {
		java.util.List list = super.list();
		return (UsuariosBD[]) list.toArray(new UsuariosBD[list.size()]);
	}
}

