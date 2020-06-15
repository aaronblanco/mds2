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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Mensaje")
public class Mensaje implements Serializable {
	public Mensaje() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_MENSAJE_CONTIENE_IMAGENES) {
			return ORM_contiene_imagenes;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_MENSAJE_TEMA_MENSAJE) {
			this.tema_mensaje = (com.mds2.foro.Tema) owner;
		}
		
		else if (key == ORMConstants.KEY_MENSAJE_USUARIOS) {
			this.usuarios = (com.mds2.foro.Usuarios) owner;
		}
		
		else if (key == ORMConstants.KEY_MENSAJE_CONTIENE_VIDEOS) {
			this.contiene_videos = (com.mds2.foro.videos) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="IdMensaje", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="COM_MDS2_FORO_MENSAJE_IDMENSAJE_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_MDS2_FORO_MENSAJE_IDMENSAJE_GENERATOR", strategy="native")	
	private int idMensaje;
	
	@ManyToOne(targetEntity=com.mds2.foro.Tema.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="TemaIdTema", referencedColumnName="IdTema", nullable=false) }, foreignKey=@ForeignKey(name="FKMensaje869428"))	
	private com.mds2.foro.Tema tema_mensaje;
	
	@ManyToOne(targetEntity=com.mds2.foro.Usuarios.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuariosIdUsuario", referencedColumnName="IdUsuario", nullable=false) }, foreignKey=@ForeignKey(name="FKMensaje665283"))	
	private com.mds2.foro.Usuarios usuarios;
	
	@Column(name="Contenido", nullable=true, length=255)	
	private String contenido;
	
	@Column(name="Subtitulo", nullable=true, length=255)	
	private String subtitulo;
	
	@Column(name="NumMg", nullable=false, length=10)	
	private int numMg;
	
	@Column(name="FechaCreacion", nullable=false, length=20)	
	private long fechaCreacion;
	
	@Column(name="NumTotalMensajes", nullable=false, length=10)	
	private int numTotalMensajes;
	
	@Column(name="IdTemaPropietario", nullable=false, length=10)	
	private int idTemaPropietario;
	
	@Column(name="Titulo", nullable=true, length=255)	
	private String titulo;
	
	@Column(name="IdPropietario", nullable=false, length=10)	
	private int idPropietario;
	
	@Column(name="IdMedia", nullable=false, length=10)	
	private int idMedia;
	
	@Column(name="Publico", nullable=false, length=1)	
	private boolean publico = true;
	
	@Column(name="Eliminado", nullable=false, length=1)	
	private boolean eliminado = false;
	
	@OneToMany(mappedBy="mensaje_imagen", targetEntity=com.mds2.foro.imagenes.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_contiene_imagenes = new java.util.HashSet();
	
	@OneToOne(mappedBy="mensaje_video", targetEntity=com.mds2.foro.videos.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private com.mds2.foro.videos contiene_videos;
	
	public void setContenido(String value) {
		this.contenido = value;
	}
	
	public String getContenido() {
		return contenido;
	}
	
	private void setIdMensaje(int value) {
		this.idMensaje = value;
	}
	
	public int getIdMensaje() {
		return idMensaje;
	}
	
	public int getORMID() {
		return getIdMensaje();
	}
	
	public void setSubtitulo(String value) {
		this.subtitulo = value;
	}
	
	public String getSubtitulo() {
		return subtitulo;
	}
	
	public void setNumMg(int value) {
		this.numMg = value;
	}
	
	public int getNumMg() {
		return numMg;
	}
	
	public void setFechaCreacion(long value) {
		this.fechaCreacion = value;
	}
	
	public long getFechaCreacion() {
		return fechaCreacion;
	}
	
	public void setNumTotalMensajes(int value) {
		this.numTotalMensajes = value;
	}
	
	public int getNumTotalMensajes() {
		return numTotalMensajes;
	}
	
	public void setIdTemaPropietario(int value) {
		this.idTemaPropietario = value;
	}
	
	public int getIdTemaPropietario() {
		return idTemaPropietario;
	}
	
	public void setTitulo(String value) {
		this.titulo = value;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setIdPropietario(int value) {
		this.idPropietario = value;
	}
	
	public int getIdPropietario() {
		return idPropietario;
	}
	
	public void setIdMedia(int value) {
		this.idMedia = value;
	}
	
	public int getIdMedia() {
		return idMedia;
	}
	
	public void setPublico(boolean value) {
		this.publico = value;
	}
	
	public boolean getPublico() {
		return publico;
	}
	
	public void setEliminado(boolean value) {
		this.eliminado = value;
	}
	
	public boolean getEliminado() {
		return eliminado;
	}
	
	public void setTema_mensaje(com.mds2.foro.Tema value) {
		if (tema_mensaje != null) {
			tema_mensaje.contiene_mensajes.remove(this);
		}
		if (value != null) {
			value.contiene_mensajes.add(this);
		}
	}
	
	public com.mds2.foro.Tema getTema_mensaje() {
		return tema_mensaje;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Tema_mensaje(com.mds2.foro.Tema value) {
		this.tema_mensaje = value;
	}
	
	private com.mds2.foro.Tema getORM_Tema_mensaje() {
		return tema_mensaje;
	}
	
	public void setUsuarios(com.mds2.foro.Usuarios value) {
		if (usuarios != null) {
			usuarios.pro_mensajes.remove(this);
		}
		if (value != null) {
			value.pro_mensajes.add(this);
		}
	}
	
	public com.mds2.foro.Usuarios getUsuarios() {
		return usuarios;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Usuarios(com.mds2.foro.Usuarios value) {
		this.usuarios = value;
	}
	
	private com.mds2.foro.Usuarios getORM_Usuarios() {
		return usuarios;
	}
	
	private void setORM_Contiene_imagenes(java.util.Set value) {
		this.ORM_contiene_imagenes = value;
	}
	
	private java.util.Set getORM_Contiene_imagenes() {
		return ORM_contiene_imagenes;
	}
	
	@Transient	
	public final com.mds2.foro.imagenesSetCollection contiene_imagenes = new com.mds2.foro.imagenesSetCollection(this, _ormAdapter, ORMConstants.KEY_MENSAJE_CONTIENE_IMAGENES, ORMConstants.KEY_IMAGENES_MENSAJE_IMAGEN, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setContiene_videos(com.mds2.foro.videos value) {
		if (this.contiene_videos != value) {
			com.mds2.foro.videos lcontiene_videos = this.contiene_videos;
			this.contiene_videos = value;
			if (value != null) {
				contiene_videos.setMensaje_video(this);
			}
			if (lcontiene_videos != null && lcontiene_videos.getMensaje_video() == this) {
				lcontiene_videos.setMensaje_video(null);
			}
		}
	}
	
	public com.mds2.foro.videos getContiene_videos() {
		return contiene_videos;
	}
	
	public String toString() {
		return String.valueOf(getIdMensaje());
	}
	
}
