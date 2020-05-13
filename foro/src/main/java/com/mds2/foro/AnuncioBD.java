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
@Table(name="Anuncio")
public class AnuncioBD implements Serializable {
	public AnuncioBD() {
	}
	
	@Column(name="IdAnuncio", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DB_DCL_ANUNCIO_IDANUNCIO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DB_DCL_ANUNCIO_IDANUNCIO_GENERATOR", strategy="native")	
	private int idAnuncio;
	
	@Column(name="Imagen", nullable=true, length=255)	
	private String imagen;
	
	@Column(name="Publicado", nullable=false, length=1)	
	private boolean publicado;
	
	public void setImagen(String value) {
		this.imagen = value;
	}
	
	public String getImagen() {
		return imagen;
	}
	
	private void setIdAnuncio(int value) {
		this.idAnuncio = value;
	}
	
	public int getIdAnuncio() {
		return idAnuncio;
	}
	
	public int getORMID() {
		return getIdAnuncio();
	}
	
	public void setPublicado(boolean value) {
		this.publicado = value;
	}
	
	public boolean getPublicado() {
		return publicado;
	}
	
	public String toString() {
		return String.valueOf(getIdAnuncio());
	}
	
}
