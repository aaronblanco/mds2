package com.mds2.foro;

import java.util.List;

import org.orm.PersistentException;

//import Package.Panel_de_administración_vista_administrador;

public class Lista_Ticket extends Lista_Ticket_ventana{
//	private Button _verTicket;
	public Panel_de_administración_vista_administrador _unnamed_Panel_de_administración_vista_administrador_;
	public TicketClase _unnamed_Ticket_;

	iUsuario iUsr = new DB_Main();
	public Lista_Ticket() throws PersistentException {
		
		List<Ticket> lista = iUsr.cargarTicket(Sesion.getIDSESION());
		if(!lista.isEmpty()) {
			for(Ticket t : lista) {
				TicketClase tc = new TicketClase(t);
				sistemaTicketsLista.addComponent(tc);
			}
		}
		
	}
	
	
	public void cerrarTicket() {
		throw new UnsupportedOperationException();
	}

	public void verTicket() {
		throw new UnsupportedOperationException();
	}
}