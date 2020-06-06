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

public class MensajeCriteria extends AbstractORMCriteria {
	public final IntegerExpression idMensaje;
	public final IntegerExpression contiene_videosId;
	public final AssociationExpression contiene_videos;
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
	
	public MensajeCriteria(Criteria criteria) {
		super(criteria);
		idMensaje = new IntegerExpression("idMensaje", this);
		contiene_videosId = new IntegerExpression("contiene_videos.", this);
		contiene_videos = new AssociationExpression("contiene_videos", this);
		usuariosId = new IntegerExpression("usuarios.idUsuario", this);
		usuarios = new AssociationExpression("usuarios", this);
		contenido = new StringExpression("contenido", this);
		subtitulo = new StringExpression("subtitulo", this);
		numMg = new IntegerExpression("numMg", this);
		fechaCreacion = new LongExpression("fechaCreacion", this);
		numTotalMensajes = new IntegerExpression("numTotalMensajes", this);
		idTemaPropietario = new IntegerExpression("idTemaPropietario", this);
		titulo = new StringExpression("titulo", this);
		idPropietario = new IntegerExpression("idPropietario", this);
		idMedia = new IntegerExpression("idMedia", this);
		publico = new BooleanExpression("publico", this);
		eliminado = new BooleanExpression("eliminado", this);
		contiene_imagenes = new CollectionExpression("ORM_contiene_imagenes", this);
	}
	
	public MensajeCriteria(PersistentSession session) {
		this(session.createCriteria(Mensaje.class));
	}
	
	public MensajeCriteria() throws PersistentException {
		this(MDS11920PFBlancoRoblesPersistentManager.instance().getSession());
	}
	
	public videosCriteria createContiene_videosCriteria() {
		return new videosCriteria(createCriteria("contiene_videos"));
	}
	
	public UsuariosCriteria createUsuariosCriteria() {
		return new UsuariosCriteria(createCriteria("usuarios"));
	}
	
	public imagenesCriteria createContiene_imagenesCriteria() {
		return new imagenesCriteria(createCriteria("ORM_contiene_imagenes"));
	}
	
	public Mensaje uniqueMensaje() {
		return (Mensaje) super.uniqueResult();
	}
	
	public Mensaje[] listMensaje() {
		java.util.List list = super.list();
		return (Mensaje[]) list.toArray(new Mensaje[list.size()]);
	}
}

