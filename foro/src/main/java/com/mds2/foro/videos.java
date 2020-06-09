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
@Table(name="videos")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Videos")
@PrimaryKeyJoinColumn(name="mediaIdMedia", referencedColumnName="IdMedia")
public class videos extends com.mds2.foro.media implements Serializable {
	public videos() {
	}
	
	@OneToOne(targetEntity=com.mds2.foro.Mensaje.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="MensajeIdMensaje", referencedColumnName="IdMensaje", nullable=false) }, foreignKey=@ForeignKey(name="FKvideos580226"))	
	private com.mds2.foro.Mensaje mensaje_video;
	
	public void setMensaje_video(com.mds2.foro.Mensaje value) {
		if (this.mensaje_video != value) {
			com.mds2.foro.Mensaje lmensaje_video = this.mensaje_video;
			this.mensaje_video = value;
			if (value != null) {
				mensaje_video.setContiene_videos(this);
			}
			if (lmensaje_video != null && lmensaje_video.getContiene_videos() == this) {
				lmensaje_video.setContiene_videos(null);
			}
		}
	}
	
	public com.mds2.foro.Mensaje getMensaje_video() {
		return mensaje_video;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
