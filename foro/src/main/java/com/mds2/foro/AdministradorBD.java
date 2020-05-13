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
@Table(name="Administrador")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Administrador")
@PrimaryKeyJoinColumn(name="UsuariosIdUsuario", referencedColumnName="IdUsuario")
public class AdministradorBD extends com.mds2.foro.UsuariosBD implements Serializable {
	public AdministradorBD() {
	}
	
	public String toString() {
		return super.toString();
	}
	
}
