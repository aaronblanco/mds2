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

public class MensajeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idMensaje;
	public final IntegerExpression tema_mensajeId;
	public final AssociationExpression tema_mensaje;
	public final IntegerExpression usuariosId;
	public final AssociationExpression usuarios;
	public final StringExpression contenido;
	public final StringExpression subtitulo;
	public final IntegerExpression numMg;
	public final LongExpression fechaCreacion;
	public final IntegerExpression numTotalMensajes;
	public final IntegerExpression idTemaPropietario;
	public final StringExpression titulo;
	public final IntegerExpression idPropietario;
	public final IntegerExpression idMedia;
	public final BooleanExpression publico;
	public final BooleanExpression eliminado;
	public final CollectionExpression contiene_imagenes;
	public final IntegerExpression contiene_videosId;
	public final AssociationExpression contiene_videos;
	
	public MensajeDetachedCriteria() {
		super(com.mds2.foro.Mensaje.class, com.mds2.foro.MensajeCriteria.class);
		idMensaje = new IntegerExpression("idMensaje", this.getDetachedCriteria());
		tema_mensajeId = new IntegerExpression("tema_mensaje.idTema", this.getDetachedCriteria());
		tema_mensaje = new AssociationExpression("tema_mensaje", this.getDetachedCriteria());
		usuariosId = new IntegerExpression("usuarios.idUsuario", this.getDetachedCriteria());
		usuarios = new AssociationExpression("usuarios", this.getDetachedCriteria());
		contenido = new StringExpression("contenido", this.getDetachedCriteria());
		subtitulo = new StringExpression("subtitulo", this.getDetachedCriteria());
		numMg = new IntegerExpression("numMg", this.getDetachedCriteria());
		fechaCreacion = new LongExpression("fechaCreacion", this.getDetachedCriteria());
		numTotalMensajes = new IntegerExpression("numTotalMensajes", this.getDetachedCriteria());
		idTemaPropietario = new IntegerExpression("idTemaPropietario", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		idPropietario = new IntegerExpression("idPropietario", this.getDetachedCriteria());
		idMedia = new IntegerExpression("idMedia", this.getDetachedCriteria());
		publico = new BooleanExpression("publico", this.getDetachedCriteria());
		eliminado = new BooleanExpression("eliminado", this.getDetachedCriteria());
		contiene_imagenes = new CollectionExpression("ORM_contiene_imagenes", this.getDetachedCriteria());
		contiene_videosId = new IntegerExpression("contiene_videos.idMensaje", this.getDetachedCriteria());
		contiene_videos = new AssociationExpression("contiene_videos", this.getDetachedCriteria());
	}
	
	public MensajeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.mds2.foro.MensajeCriteria.class);
		idMensaje = new IntegerExpression("idMensaje", this.getDetachedCriteria());
		tema_mensajeId = new IntegerExpression("tema_mensaje.idTema", this.getDetachedCriteria());
		tema_mensaje = new AssociationExpression("tema_mensaje", this.getDetachedCriteria());
		usuariosId = new IntegerExpression("usuarios.idUsuario", this.getDetachedCriteria());
		usuarios = new AssociationExpression("usuarios", this.getDetachedCriteria());
		contenido = new StringExpression("contenido", this.getDetachedCriteria());
		subtitulo = new StringExpression("subtitulo", this.getDetachedCriteria());
		numMg = new IntegerExpression("numMg", this.getDetachedCriteria());
		fechaCreacion = new LongExpression("fechaCreacion", this.getDetachedCriteria());
		numTotalMensajes = new IntegerExpression("numTotalMensajes", this.getDetachedCriteria());
		idTemaPropietario = new IntegerExpression("idTemaPropietario", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		idPropietario = new IntegerExpression("idPropietario", this.getDetachedCriteria());
		idMedia = new IntegerExpression("idMedia", this.getDetachedCriteria());
		publico = new BooleanExpression("publico", this.getDetachedCriteria());
		eliminado = new BooleanExpression("eliminado", this.getDetachedCriteria());
		contiene_imagenes = new CollectionExpression("ORM_contiene_imagenes", this.getDetachedCriteria());
		contiene_videosId = new IntegerExpression("contiene_videos.idMensaje", this.getDetachedCriteria());
		contiene_videos = new AssociationExpression("contiene_videos", this.getDetachedCriteria());
	}
	
	public TemaDetachedCriteria createTema_mensajeCriteria() {
		return new TemaDetachedCriteria(createCriteria("tema_mensaje"));
	}
	
	public UsuariosDetachedCriteria createUsuariosCriteria() {
		return new UsuariosDetachedCriteria(createCriteria("usuarios"));
	}
	
	public imagenesDetachedCriteria createContiene_imagenesCriteria() {
		return new imagenesDetachedCriteria(createCriteria("ORM_contiene_imagenes"));
	}
	
	public videosDetachedCriteria createContiene_videosCriteria() {
		return new videosDetachedCriteria(createCriteria("contiene_videos"));
	}
	
	public Mensaje uniqueMensaje(PersistentSession session) {
		return (Mensaje) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Mensaje[] listMensaje(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Mensaje[]) list.toArray(new Mensaje[list.size()]);
	}
}

