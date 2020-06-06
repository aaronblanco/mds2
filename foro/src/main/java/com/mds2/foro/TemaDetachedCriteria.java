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

public class TemaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idTema;
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
	
	public TemaDetachedCriteria() {
		super(com.mds2.foro.Tema.class, com.mds2.foro.TemaCriteria.class);
		idTema = new IntegerExpression("idTema", this.getDetachedCriteria());
		usuariosId = new IntegerExpression("usuarios.idUsuario", this.getDetachedCriteria());
		usuarios = new AssociationExpression("usuarios", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		fecha = new LongExpression("fecha", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		idTemaPropietario = new IntegerExpression("idTemaPropietario", this.getDetachedCriteria());
		publico = new BooleanExpression("publico", this.getDetachedCriteria());
		privado = new BooleanExpression("privado", this.getDetachedCriteria());
		oculto = new BooleanExpression("oculto", this.getDetachedCriteria());
		eliminado = new BooleanExpression("eliminado", this.getDetachedCriteria());
		contiene_mensajes = new CollectionExpression("ORM_contiene_mensajes", this.getDetachedCriteria());
	}
	
	public TemaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.mds2.foro.TemaCriteria.class);
		idTema = new IntegerExpression("idTema", this.getDetachedCriteria());
		usuariosId = new IntegerExpression("usuarios.idUsuario", this.getDetachedCriteria());
		usuarios = new AssociationExpression("usuarios", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		fecha = new LongExpression("fecha", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		idTemaPropietario = new IntegerExpression("idTemaPropietario", this.getDetachedCriteria());
		publico = new BooleanExpression("publico", this.getDetachedCriteria());
		privado = new BooleanExpression("privado", this.getDetachedCriteria());
		oculto = new BooleanExpression("oculto", this.getDetachedCriteria());
		eliminado = new BooleanExpression("eliminado", this.getDetachedCriteria());
		contiene_mensajes = new CollectionExpression("ORM_contiene_mensajes", this.getDetachedCriteria());
	}
	
	public UsuariosDetachedCriteria createUsuariosCriteria() {
		return new UsuariosDetachedCriteria(createCriteria("usuarios"));
	}
	
	public MensajeDetachedCriteria createContiene_mensajesCriteria() {
		return new MensajeDetachedCriteria(createCriteria("ORM_contiene_mensajes"));
	}
	
	public Tema uniqueTema(PersistentSession session) {
		return (Tema) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tema[] listTema(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tema[]) list.toArray(new Tema[list.size()]);
	}
}

