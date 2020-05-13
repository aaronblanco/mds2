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
	
	public String toString() {
		return super.toString();
	}
	
}
