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
package db_dcl;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Seccion")
public class Seccion implements Serializable {
	public Seccion() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == db_dcl.ORMConstants.KEY_SECCION_CONTIENE_TEMAS) {
			return ORM_contiene_temas;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == db_dcl.ORMConstants.KEY_SECCION_USUARIOS) {
			this.usuarios = (db_dcl.Usuarios) owner;
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
	
	@Column(name="IdSeccion", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DB_DCL_SECCION_IDSECCION_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DB_DCL_SECCION_IDSECCION_GENERATOR", strategy="native")	
	private int idSeccion;
	
	@ManyToOne(targetEntity=db_dcl.Usuarios.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuariosIdUsuario", referencedColumnName="IdUsuario", nullable=false) }, foreignKey=@ForeignKey(name="FKSeccion237009"))	
	private db_dcl.Usuarios usuarios;
	
	@Column(name="ImagenSeccion", nullable=true, length=255)	
	private String imagenSeccion;
	
	@Column(name="Creador", nullable=true, length=255)	
	private String creador;
	
	@Column(name="Titulo", nullable=true, length=255)	
	private String titulo;
	
	@Column(name="Descripcion", nullable=true, length=255)	
	private String descripcion;
	
	@Column(name="Fecha", nullable=false, length=20)	
	private long fecha;
	
	@Column(name="IdPropietarioSeccion", nullable=false, length=10)	
	private int idPropietarioSeccion;
	
	@Column(name="Publico", nullable=false, length=1)	
	private boolean publico = true;
	
	@Column(name="Privado", nullable=false, length=1)	
	private boolean privado = false;
	
	@Column(name="Oculto", nullable=false, length=1)	
	private boolean oculto = false;
	
	@Column(name="Eliminado", nullable=false, length=1)	
	private boolean eliminado = false;
	
	@OneToMany(targetEntity=db_dcl.Tema.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="SeccionIdSeccion", nullable=false) })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_contiene_temas = new java.util.HashSet();
	
	public void setImagenSeccion(String value) {
		this.imagenSeccion = value;
	}
	
	public String getImagenSeccion() {
		return imagenSeccion;
	}
	
	private void setIdSeccion(int value) {
		this.idSeccion = value;
	}
	
	public int getIdSeccion() {
		return idSeccion;
	}
	
	public int getORMID() {
		return getIdSeccion();
	}
	
	public void setCreador(String value) {
		this.creador = value;
	}
	
	public String getCreador() {
		return creador;
	}
	
	public void setTitulo(String value) {
		this.titulo = value;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setFecha(long value) {
		this.fecha = value;
	}
	
	public long getFecha() {
		return fecha;
	}
	
	public void setIdPropietarioSeccion(int value) {
		this.idPropietarioSeccion = value;
	}
	
	public int getIdPropietarioSeccion() {
		return idPropietarioSeccion;
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
	
	private void setORM_Contiene_temas(java.util.Set value) {
		this.ORM_contiene_temas = value;
	}
	
	private java.util.Set getORM_Contiene_temas() {
		return ORM_contiene_temas;
	}
	
	@Transient	
	public final db_dcl.TemaSetCollection contiene_temas = new db_dcl.TemaSetCollection(this, _ormAdapter, db_dcl.ORMConstants.KEY_SECCION_CONTIENE_TEMAS, db_dcl.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setUsuarios(db_dcl.Usuarios value) {
		if (usuarios != null) {
			usuarios.pro_secciones.remove(this);
		}
		if (value != null) {
			value.pro_secciones.add(this);
		}
	}
	
	public db_dcl.Usuarios getUsuarios() {
		return usuarios;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Usuarios(db_dcl.Usuarios value) {
		this.usuarios = value;
	}
	
	private db_dcl.Usuarios getORM_Usuarios() {
		return usuarios;
	}
	
	public String toString() {
		return String.valueOf(getIdSeccion());
	}
	
}
