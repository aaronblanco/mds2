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
@Table(name="imagenes")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Imagenes")
@PrimaryKeyJoinColumn(name="mediaIdMedia", referencedColumnName="IdMedia")
public class imagenes extends com.mds2.foro.media implements Serializable {
	public imagenes() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_IMAGENES_MENSAJE_IMAGEN) {
			this.mensaje_imagen = (com.mds2.foro.Mensaje) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@ManyToOne(targetEntity=com.mds2.foro.Mensaje.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="MensajeIdMensaje", referencedColumnName="IdMensaje", nullable=false) }, foreignKey=@ForeignKey(name="FKimagenes489188"))	
	private com.mds2.foro.Mensaje mensaje_imagen;
	
	public void setMensaje_imagen(com.mds2.foro.Mensaje value) {
		if (mensaje_imagen != null) {
			mensaje_imagen.contiene_imagenes.remove(this);
		}
		if (value != null) {
			value.contiene_imagenes.add(this);
		}
	}
	
	public com.mds2.foro.Mensaje getMensaje_imagen() {
		return mensaje_imagen;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Mensaje_imagen(com.mds2.foro.Mensaje value) {
		this.mensaje_imagen = value;
	}
	
	private com.mds2.foro.Mensaje getORM_Mensaje_imagen() {
		return mensaje_imagen;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
