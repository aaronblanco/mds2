package com.mds2.foro;

import java.util.Collection;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import org.orm.criteria.IntegerExpression;

public class bd_tickets {
	public Bd_principal _bd_principal_tickets;
	public Vector<Ticket> _contiene_tickets = new Vector<Ticket>();

	public List cargarTicket(int aIdUsuario) throws PersistentException {
		Usuarios u = com.mds2.foro.UsuariosDAO.getUsuariosByORMID(aIdUsuario);
		TicketCriteria tc = new TicketCriteria();
		
		tc.idUsuarioPropietarioTicket.eq(aIdUsuario);
		Ticket[] t = com.mds2.foro.TicketDAO.listTicketByCriteria(tc);
		
		for(Ticket a : t) {
			_contiene_tickets.add(a);
		}
		return _contiene_tickets;
		
	}

	public boolean crearTicket(String aCuerpoTicket, int aIdUsuarioPropietarioTicket) throws PersistentException {
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		try {
			Ticket ti = com.mds2.foro.TicketDAO.createTicket();
			Usuarios u = com.mds2.foro.UsuariosDAO.getUsuariosByORMID(aIdUsuarioPropietarioTicket);
			ti.setAbierto(true);
			ti.setCerrado(false);
			ti.setIdUsuarioPropietarioTicket(aIdUsuarioPropietarioTicket);
			ti.setTexto(aCuerpoTicket);
			
			com.mds2.foro.TicketDAO.save(ti);
			
			t.commit();
			
			return true;
		}
		catch(Exception e) {
				t.rollback();	
				return false;
			}
	}

	public boolean cerrarTicket(int aIdTicket) throws PersistentException {
		Ticket t = com.mds2.foro.TicketDAO.getTicketByORMID(aIdTicket);
		t.setAbierto(false);
		t.setCerrado(true);
		return t.getCerrado();
	}

	public boolean eliminarTicket(int aIdTicket) throws PersistentException {
		Ticket t = com.mds2.foro.TicketDAO.getTicketByORMID(aIdTicket);
		return com.mds2.foro.TicketDAO.delete(t);
	}
}