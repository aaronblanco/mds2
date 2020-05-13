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
@Table(name="Usuarios")
@Inheritance(strategy=InheritanceType.JOINED)
public class Usuarios implements Serializable {
	public Usuarios() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == db_dcl.ORMConstants.KEY_USUARIOS_PRO_TICKETS) {
			return ORM_pro_tickets;
		}
		else if (key == db_dcl.ORMConstants.KEY_USUARIOS_PRO_MENSAJES) {
			return ORM_pro_mensajes;
		}
		else if (key == db_dcl.ORMConstants.KEY_USUARIOS_USUARIOS) {
			return ORM_usuarios;
		}
		else if (key == db_dcl.ORMConstants.KEY_USUARIOS_PRO_TEMAS) {
			return ORM_pro_temas;
		}
		else if (key == db_dcl.ORMConstants.KEY_USUARIOS_PRO_SECCIONES) {
			return ORM_pro_secciones;
		}
		else if (key == db_dcl.ORMConstants.KEY_USUARIOS_NOTIFICACIONES) {
			return ORM_notificaciones;
		}
		else if (key == db_dcl.ORMConstants.KEY_USUARIOS_USUARIOSAMIGOS) {
			return ORM_usuariosAmigos;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="IdUsuario", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DB_DCL_USUARIOS_IDUSUARIO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DB_DCL_USUARIOS_IDUSUARIO_GENERATOR", strategy="native")	
	private int idUsuario;
	
	@Column(name="Email", nullable=true, length=255)	
	private String email;
	
	@Column(name="Descripcion", nullable=true, length=255)	
	private String descripcion;
	
	@Column(name="NombreUsuario", nullable=true, length=255)	
	private String nombreUsuario;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Contraseña", nullable=true, length=255)	
	private String contraseña;
	
	@Column(name="FotoPerfil", nullable=true, length=255)	
	private String fotoPerfil;
	
	@Column(name="Amonestado", nullable=false, length=1)	
	private boolean amonestado;
	
	@Column(name="Sancionado", nullable=false, length=1)	
	private boolean sancionado;
	
	@Column(name="Publico", nullable=false, length=1)	
	private boolean publico = true;
	
	@Column(name="Oculto", nullable=false, length=1)	
	private boolean oculto = false;
	
	@OneToMany(mappedBy="usuarios", targetEntity=db_dcl.Ticket.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_pro_tickets = new java.util.HashSet();
	
	@OneToMany(mappedBy="usuarios", targetEntity=db_dcl.Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_pro_mensajes = new java.util.HashSet();
	
	@ManyToMany(targetEntity=db_dcl.Usuarios.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuarios_Usuarios", joinColumns={ @JoinColumn(name="UsuariosIdUsuario2") }, inverseJoinColumns={ @JoinColumn(name="UsuariosIdUsuario") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_usuarios = new java.util.HashSet();
	
	@OneToMany(mappedBy="usuarios", targetEntity=db_dcl.Tema.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_pro_temas = new java.util.HashSet();
	
	@OneToMany(mappedBy="usuarios", targetEntity=db_dcl.Seccion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_pro_secciones = new java.util.HashSet();
	
	@OneToMany(mappedBy="usuarios", targetEntity=db_dcl.Notificacion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_notificaciones = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_usuarios", targetEntity=db_dcl.Usuarios.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_usuariosAmigos = new java.util.HashSet();
	
	private void setIdUsuario(int value) {
		this.idUsuario = value;
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}
	
	public int getORMID() {
		return getIdUsuario();
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setNombreUsuario(String value) {
		this.nombreUsuario = value;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setContraseña(String value) {
		this.contraseña = value;
	}
	
	public String getContraseña() {
		return contraseña;
	}
	
	public void setFotoPerfil(String value) {
		this.fotoPerfil = value;
	}
	
	public String getFotoPerfil() {
		return fotoPerfil;
	}
	
	public void setAmonestado(boolean value) {
		this.amonestado = value;
	}
	
	public boolean getAmonestado() {
		return amonestado;
	}
	
	public void setSancionado(boolean value) {
		this.sancionado = value;
	}
	
	public boolean getSancionado() {
		return sancionado;
	}
	
	public void setPublico(boolean value) {
		this.publico = value;
	}
	
	public boolean getPublico() {
		return publico;
	}
	
	public void setOculto(boolean value) {
		this.oculto = value;
	}
	
	public boolean getOculto() {
		return oculto;
	}
	
	private void setORM_Pro_tickets(java.util.Set value) {
		this.ORM_pro_tickets = value;
	}
	
	private java.util.Set getORM_Pro_tickets() {
		return ORM_pro_tickets;
	}
	
	@Transient	
	public final db_dcl.TicketSetCollection pro_tickets = new db_dcl.TicketSetCollection(this, _ormAdapter, db_dcl.ORMConstants.KEY_USUARIOS_PRO_TICKETS, db_dcl.ORMConstants.KEY_TICKET_USUARIOS, db_dcl.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Pro_mensajes(java.util.Set value) {
		this.ORM_pro_mensajes = value;
	}
	
	private java.util.Set getORM_Pro_mensajes() {
		return ORM_pro_mensajes;
	}
	
	@Transient	
	public final db_dcl.MensajeSetCollection pro_mensajes = new db_dcl.MensajeSetCollection(this, _ormAdapter, db_dcl.ORMConstants.KEY_USUARIOS_PRO_MENSAJES, db_dcl.ORMConstants.KEY_MENSAJE_USUARIOS, db_dcl.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Usuarios(java.util.Set value) {
		this.ORM_usuarios = value;
	}
	
	private java.util.Set getORM_Usuarios() {
		return ORM_usuarios;
	}
	
	@Transient	
	public final db_dcl.UsuariosSetCollection usuarios = new db_dcl.UsuariosSetCollection(this, _ormAdapter, db_dcl.ORMConstants.KEY_USUARIOS_USUARIOS, db_dcl.ORMConstants.KEY_USUARIOS_USUARIOSAMIGOS, db_dcl.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Pro_temas(java.util.Set value) {
		this.ORM_pro_temas = value;
	}
	
	private java.util.Set getORM_Pro_temas() {
		return ORM_pro_temas;
	}
	
	@Transient	
	public final db_dcl.TemaSetCollection pro_temas = new db_dcl.TemaSetCollection(this, _ormAdapter, db_dcl.ORMConstants.KEY_USUARIOS_PRO_TEMAS, db_dcl.ORMConstants.KEY_TEMA_USUARIOS, db_dcl.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Pro_secciones(java.util.Set value) {
		this.ORM_pro_secciones = value;
	}
	
	private java.util.Set getORM_Pro_secciones() {
		return ORM_pro_secciones;
	}
	
	@Transient	
	public final db_dcl.SeccionSetCollection pro_secciones = new db_dcl.SeccionSetCollection(this, _ormAdapter, db_dcl.ORMConstants.KEY_USUARIOS_PRO_SECCIONES, db_dcl.ORMConstants.KEY_SECCION_USUARIOS, db_dcl.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Notificaciones(java.util.Set value) {
		this.ORM_notificaciones = value;
	}
	
	private java.util.Set getORM_Notificaciones() {
		return ORM_notificaciones;
	}
	
	@Transient	
	public final db_dcl.NotificacionSetCollection notificaciones = new db_dcl.NotificacionSetCollection(this, _ormAdapter, db_dcl.ORMConstants.KEY_USUARIOS_NOTIFICACIONES, db_dcl.ORMConstants.KEY_NOTIFICACION_USUARIOS, db_dcl.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_UsuariosAmigos(java.util.Set value) {
		this.ORM_usuariosAmigos = value;
	}
	
	private java.util.Set getORM_UsuariosAmigos() {
		return ORM_usuariosAmigos;
	}
	
	@Transient	
	public final db_dcl.UsuariosSetCollection usuariosAmigos = new db_dcl.UsuariosSetCollection(this, _ormAdapter, db_dcl.ORMConstants.KEY_USUARIOS_USUARIOSAMIGOS, db_dcl.ORMConstants.KEY_USUARIOS_USUARIOS, db_dcl.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdUsuario());
	}
	
}
