package com.mds2.foro;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;

public class bd_tickets {
	public Bd_principal _bd_principal_tickets;
	public Vector<Ticket> _contiene_tickets = new Vector<Ticket>();

	public List cargarTicket(int aIdUsuario) throws PersistentException {
		Usuarios u = com.mds2.foro.UsuariosDAO.getUsuariosByORMID(aIdUsuario);
		
		
		
	}

	public boolean crearTicket(String aCuerpoTicket, int aIdUsuarioPropietarioTicket) {
		throw new UnsupportedOperationException();
	}

	public boolean cerrarTicket(int aIdTicket) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarTicket(int aIdTicket) {
		throw new UnsupportedOperationException();
	}
}