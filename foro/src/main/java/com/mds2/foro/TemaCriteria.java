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

public class TemaCriteria extends AbstractORMCriteria {
	public final IntegerExpression idTema;
	public final IntegerExpression seccion_mensajeId;
	public final AssociationExpression seccion_mensaje;
	public final IntegerExpression usuariosId;
	public final AssociationExpression usuarios;
	public final StringExpression titulo;
	public final LongExpression fecha;
	public final StringExpression descripcion;
	public final IntegerExpression idTemaPropietario;
	public final BooleanExpression publico;
	public final BooleanExpression privado;
	public final BooleanExpression oculto;
	public final BooleanExpression eliminado;
	public final CollectionExpression contiene_mensajes;
	
	public TemaCriteria(Criteria criteria) {
		super(criteria);
		idTema = new IntegerExpression("idTema", this);
		seccion_mensajeId = new IntegerExpression("seccion_mensaje.idSeccion", this);
		seccion_mensaje = new AssociationExpression("seccion_mensaje", this);
		usuariosId = new IntegerExpression("usuarios.idUsuario", this);
		usuarios = new AssociationExpression("usuarios", this);
		titulo = new StringExpression("titulo", this);
		fecha = new LongExpression("fecha", this);
		descripcion = new StringExpression("descripcion", this);
		idTemaPropietario = new IntegerExpression("idTemaPropietario", this);
		publico = new BooleanExpression("publico", this);
		privado = new BooleanExpression("privado", this);
		oculto = new BooleanExpression("oculto", this);
		eliminado = new BooleanExpression("eliminado", this);
		contiene_mensajes = new CollectionExpression("ORM_contiene_mensajes", this);
	}
	
	public TemaCriteria(PersistentSession session) {
		this(session.createCriteria(Tema.class));
	}
	
	public TemaCriteria() throws PersistentException {
		this(MDS11920PFBlancoRoblesPersistentManager.instance().getSession());
	}
	
	public SeccionCriteria createSeccion_mensajeCriteria() {
		return new SeccionCriteria(createCriteria("seccion_mensaje"));
	}
	
	public UsuariosCriteria createUsuariosCriteria() {
		return new UsuariosCriteria(createCriteria("usuarios"));
	}
	
	public MensajeCriteria createContiene_mensajesCriteria() {
		return new MensajeCriteria(createCriteria("ORM_contiene_mensajes"));
	}
	
	public Tema uniqueTema() {
		return (Tema) super.uniqueResult();
	}
	
	public Tema[] listTema() {
		java.util.List list = super.list();
		return (Tema[]) list.toArray(new Tema[list.size()]);
	}
}

