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
@Table(name="media")
@Inheritance(strategy=InheritanceType.JOINED)
public class media implements Serializable {
	public media() {
	}
	
	@Column(name="IdMedia", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="COM_MDS2_FORO_MEDIA_IDMEDIA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_MDS2_FORO_MEDIA_IDMEDIA_GENERATOR", strategy="native")	
	private int idMedia;
	
	@Column(name="Url", nullable=true, length=255)	
	private String url;
	
	private void setIdMedia(int value) {
		this.idMedia = value;
	}
	
	public int getIdMedia() {
		return idMedia;
	}
	
	public int getORMID() {
		return getIdMedia();
	}
	
	public void setUrl(String value) {
		this.url = value;
	}
	
	public String getUrl() {
		return url;
	}
	
	public String toString() {
		return String.valueOf(getIdMedia());
	}
	
}
