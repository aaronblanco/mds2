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
@Table(name="Notificacion")
public class Notificacion implements Serializable {
	public Notificacion() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == db_dcl.ORMConstants.KEY_NOTIFICACION_USUARIOS) {
			this.usuarios = (db_dcl.Usuarios) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="IdNotificacion", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DB_DCL_NOTIFICACION_IDNOTIFICACION_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DB_DCL_NOTIFICACION_IDNOTIFICACION_GENERATOR", strategy="native")	
	private int idNotificacion;
	
	@ManyToOne(targetEntity=db_dcl.Usuarios.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuariosIdUsuario", referencedColumnName="IdUsuario", nullable=false) }, foreignKey=@ForeignKey(name="FKNotificaci390464"))	
	private db_dcl.Usuarios usuarios;
	
	@Column(name="Titulo", nullable=true, length=255)	
	private String titulo;
	
	@Column(name="IdUsuarioPropietario", nullable=false, length=10)	
	private int idUsuarioPropietario;
	
	@Column(name="DescripcionCampo", nullable=true, length=255)	
	private String descripcionCampo;
	
	private void setIdNotificacion(int value) {
		this.idNotificacion = value;
	}
	
	public int getIdNotificacion() {
		return idNotificacion;
	}
	
	public int getORMID() {
		return getIdNotificacion();
	}
	
	public void setTitulo(String value) {
		this.titulo = value;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setIdUsuarioPropietario(int value) {
		this.idUsuarioPropietario = value;
	}
	
	public int getIdUsuarioPropietario() {
		return idUsuarioPropietario;
	}
	
	public void setDescripcionCampo(String value) {
		this.descripcionCampo = value;
	}
	
	public String getDescripcionCampo() {
		return descripcionCampo;
	}
	
	public void setUsuarios(db_dcl.Usuarios value) {
		if (usuarios != null) {
			usuarios.notificaciones.remove(this);
		}
		if (value != null) {
			value.notificaciones.add(this);
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
		return String.valueOf(getIdNotificacion());
	}
	
}
