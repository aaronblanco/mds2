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
@Table(name="Moderador")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Moderador")
@PrimaryKeyJoinColumn(name="UsuariosIdUsuario", referencedColumnName="IdUsuario")
public class Moderador extends db_dcl.Usuarios implements Serializable {
	public Moderador() {
	}
	
	@Column(name="IdMod", nullable=false, length=10)	
	private int idMod;
	
	public void setIdMod(int value) {
		this.idMod = value;
	}
	
	public int getIdMod() {
		return idMod;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
