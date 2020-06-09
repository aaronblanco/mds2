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
@Table(name="Ticket")
public class Ticket implements Serializable {
	public Ticket() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_TICKET_USUARIOS) {
			this.usuarios = (com.mds2.foro.Usuarios) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="IdTicket", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="COM_MDS2_FORO_TICKET_IDTICKET_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_MDS2_FORO_TICKET_IDTICKET_GENERATOR", strategy="native")	
	private int idTicket;
	
	@ManyToOne(targetEntity=com.mds2.foro.Usuarios.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuariosIdUsuario", referencedColumnName="IdUsuario", nullable=false) }, foreignKey=@ForeignKey(name="FKTicket219138"))	
	private com.mds2.foro.Usuarios usuarios;
	
	@Column(name="Texto", nullable=true, length=255)	
	private String texto;
	
	@Column(name="IdUsuarioPropietarioTicket", nullable=true, length=10)	
	private int idUsuarioPropietarioTicket;
	
	@Column(name="Abierto", nullable=false, length=1)	
	private boolean abierto = true;
	
	@Column(name="Cerrado", nullable=false, length=1)	
	private boolean cerrado = false;
	
	private void setIdTicket(int value) {
		this.idTicket = value;
	}
	
	public int getIdTicket() {
		return idTicket;
	}
	
	public int getORMID() {
		return getIdTicket();
	}
	
	public void setTexto(String value) {
		this.texto = value;
	}
	
	public String getTexto() {
		return texto;
	}
	
	public void setIdUsuarioPropietarioTicket(int value) {
		this.idUsuarioPropietarioTicket = value;
	}
	
	public int getIdUsuarioPropietarioTicket() {
		return idUsuarioPropietarioTicket;
	}
	
	public void setAbierto(boolean value) {
		this.abierto = value;
	}
	
	public boolean getAbierto() {
		return abierto;
	}
	
	public void setCerrado(boolean value) {
		this.cerrado = value;
	}
	
	public boolean getCerrado() {
		return cerrado;
	}
	
	public void setUsuarios(com.mds2.foro.Usuarios value) {
		if (usuarios != null) {
			usuarios.pro_tickets.remove(this);
		}
		if (value != null) {
			value.pro_tickets.add(this);
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
	
	public String toString() {
		return String.valueOf(getIdTicket());
	}
	
}
