package com.mds2.foro;

import java.util.ArrayList;
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
		com.mds2.foro.Ticket[] commds2foroTickets = com.mds2.foro.TicketDAO.listTicketByQuery(null, null);
		
		List<Ticket> t = new ArrayList<Ticket>();
		
		for(Ticket a : commds2foroTickets) {
			t.add(a);
		}
		return t;
		
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
			ti.setUsuarios(u);
			
			com.mds2.foro.TicketDAO.save(ti);
			
			t.commit();
			
			return true;
		}catch(Exception e) {
			t.rollback();	
			return false;
		}
	}

	public boolean cerrarTicket(int aIdTicket) throws PersistentException {
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		try {
			Ticket ti = com.mds2.foro.TicketDAO.getTicketByORMID(aIdTicket);
			ti.setAbierto(false);
			ti.setCerrado(true);
			
			com.mds2.foro.TicketDAO.save(ti);
			
			t.commit();
			return true;
		}catch(Exception e) {
			t.rollback();	
			return false;
		}

	}

	public boolean eliminarTicket(int aIdTicket) throws PersistentException {
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		try {
			com.mds2.foro.Ticket ti = com.mds2.foro.TicketDAO.loadTicketByQuery("IdTicket = '"+aIdTicket+"'", null);
			com.mds2.foro.TicketDAO.delete(ti);
			
			t.commit();
			return true;
		}catch(Exception e) {
			t.rollback();	
			return false;
		}
		

	}
}