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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class TicketCriteria extends AbstractORMCriteria {
	public final IntegerExpression idTicket;
	public final IntegerExpression usuariosId;
	public final AssociationExpression usuarios;
	public final StringExpression texto;
	public final IntegerExpression idUsuarioPropietarioTicket;
	public final BooleanExpression abierto;
	public final BooleanExpression cerrado;
	
	public TicketCriteria(Criteria criteria) {
		super(criteria);
		idTicket = new IntegerExpression("idTicket", this);
		usuariosId = new IntegerExpression("usuarios.idUsuario", this);
		usuarios = new AssociationExpression("usuarios", this);
		texto = new StringExpression("texto", this);
		idUsuarioPropietarioTicket = new IntegerExpression("idUsuarioPropietarioTicket", this);
		abierto = new BooleanExpression("abierto", this);
		cerrado = new BooleanExpression("cerrado", this);
	}
	
	public TicketCriteria(PersistentSession session) {
		this(session.createCriteria(Ticket.class));
	}
	
	public TicketCriteria() throws PersistentException {
		this(MDS11920PFBlancoRoblesPersistentManager.instance().getSession());
	}
	
	public UsuariosCriteria createUsuariosCriteria() {
		return new UsuariosCriteria(createCriteria("usuarios"));
	}
	
	public Ticket uniqueTicket() {
		return (Ticket) super.uniqueResult();
	}
	
	public Ticket[] listTicket() {
		java.util.List list = super.list();
		return (Ticket[]) list.toArray(new Ticket[list.size()]);
	}
}

