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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Tema")
public class TemaBD implements Serializable {
	public TemaBD() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == com.mds2.foro.ORMConstants.KEY_TEMA_CONTIENE_MENSAJES) {
			return ORM_contiene_mensajes;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == com.mds2.foro.ORMConstants.KEY_TEMA_USUARIOS) {
			this.usuarios = (com.mds2.foro.UsuariosBD) owner;
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
	
	@Column(name="IdTema", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DB_DCL_TEMA_IDTEMA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DB_DCL_TEMA_IDTEMA_GENERATOR", strategy="native")	
	private int idTema;
	
	@ManyToOne(targetEntity=com.mds2.foro.UsuariosBD.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuariosIdUsuario", referencedColumnName="IdUsuario", nullable=false) }, foreignKey=@ForeignKey(name="FKTema54155"))	
	private com.mds2.foro.UsuariosBD usuarios;
	
	@Column(name="Titulo", nullable=true, length=255)	
	private String titulo;
	
	@Column(name="Fecha", nullable=false, length=20)	
	private long fecha;
	
	@Column(name="Descripcion", nullable=true, length=255)	
	private String descripcion;
	
	@Column(name="IdTemaPropietario", nullable=false, length=10)	
	private int idTemaPropietario;
	
	@Column(name="Publico", nullable=false, length=1)	
	private boolean publico = true;
	
	@Column(name="Privado", nullable=false, length=1)	
	private boolean privado = false;
	
	@Column(name="Oculto", nullable=false, length=1)	
	private boolean oculto = false;
	
	@Column(name="Eliminado", nullable=false, length=1)	
	private boolean eliminado = false;
	
	@OneToMany(targetEntity=com.mds2.foro.MensajeBD.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="TemaIdTema", nullable=false) })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_contiene_mensajes = new java.util.HashSet();
	
	private void setIdTema(int value) {
		this.idTema = value;
	}
	
	public int getIdTema() {
		return idTema;
	}
	
	public int getORMID() {
		return getIdTema();
	}
	
	public void setTitulo(String value) {
		this.titulo = value;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setFecha(long value) {
		this.fecha = value;
	}
	
	public long getFecha() {
		return fecha;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setIdTemaPropietario(int value) {
		this.idTemaPropietario = value;
	}
	
	public int getIdTemaPropietario() {
		return idTemaPropietario;
	}
	
	public void setPublico(boolean value) {
		this.publico = value;
	}
	
	public boolean getPublico() {
		return publico;
	}
	
	public void setPrivado(boolean value) {
		this.privado = value;
	}
	
	public boolean getPrivado() {
		return privado;
	}
	
	public void setOculto(boolean value) {
		this.oculto = value;
	}
	
	public boolean getOculto() {
		return oculto;
	}
	
	public void setEliminado(boolean value) {
		this.eliminado = value;
	}
	
	public boolean getEliminado() {
		return eliminado;
	}
	
	private void setORM_Contiene_mensajes(java.util.Set value) {
		this.ORM_contiene_mensajes = value;
	}
	
	private java.util.Set getORM_Contiene_mensajes() {
		return ORM_contiene_mensajes;
	}
	
	@Transient	
	public final com.mds2.foro.MensajeSetCollection contiene_mensajes = new com.mds2.foro.MensajeSetCollection(this, _ormAdapter, com.mds2.foro.ORMConstants.KEY_TEMA_CONTIENE_MENSAJES, com.mds2.foro.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setUsuarios(com.mds2.foro.UsuariosBD value) {
		if (usuarios != null) {
			usuarios.pro_temas.remove(this);
		}
		if (value != null) {
			value.pro_temas.add(this);
		}
	}
	
	public com.mds2.foro.UsuariosBD getUsuarios() {
		return usuarios;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Usuarios(com.mds2.foro.UsuariosBD value) {
		this.usuarios = value;
	}
	
	private com.mds2.foro.UsuariosBD getORM_Usuarios() {
		return usuarios;
	}
	
	public String toString() {
		return String.valueOf(getIdTema());
	}
	
}
