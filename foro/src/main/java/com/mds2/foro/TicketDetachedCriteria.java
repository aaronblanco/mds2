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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class TicketDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idTicket;
	public final IntegerExpression usuariosId;
	public final AssociationExpression usuarios;
	public final StringExpression texto;
	public final IntegerExpression idUsuarioPropietarioTicket;
	public final BooleanExpression abierto;
	public final BooleanExpression cerrado;
	
	public TicketDetachedCriteria() {
		super(com.mds2.foro.TicketBD.class, com.mds2.foro.TicketCriteria.class);
		idTicket = new IntegerExpression("idTicket", this.getDetachedCriteria());
		usuariosId = new IntegerExpression("usuarios.idUsuario", this.getDetachedCriteria());
		usuarios = new AssociationExpression("usuarios", this.getDetachedCriteria());
		texto = new StringExpression("texto", this.getDetachedCriteria());
		idUsuarioPropietarioTicket = new IntegerExpression("idUsuarioPropietarioTicket", this.getDetachedCriteria());
		abierto = new BooleanExpression("abierto", this.getDetachedCriteria());
		cerrado = new BooleanExpression("cerrado", this.getDetachedCriteria());
	}
	
	public TicketDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.mds2.foro.TicketCriteria.class);
		idTicket = new IntegerExpression("idTicket", this.getDetachedCriteria());
		usuariosId = new IntegerExpression("usuarios.idUsuario", this.getDetachedCriteria());
		usuarios = new AssociationExpression("usuarios", this.getDetachedCriteria());
		texto = new StringExpression("texto", this.getDetachedCriteria());
		idUsuarioPropietarioTicket = new IntegerExpression("idUsuarioPropietarioTicket", this.getDetachedCriteria());
		abierto = new BooleanExpression("abierto", this.getDetachedCriteria());
		cerrado = new BooleanExpression("cerrado", this.getDetachedCriteria());
	}
	
	public UsuariosDetachedCriteria createUsuariosCriteria() {
		return new UsuariosDetachedCriteria(createCriteria("usuarios"));
	}
	
	public TicketBD uniqueTicket(PersistentSession session) {
		return (TicketBD) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public TicketBD[] listTicket(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (TicketBD[]) list.toArray(new TicketBD[list.size()]);
	}
}

