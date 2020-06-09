package com.mds2.foro;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class bd_mensajes {
	public Bd_principal _bd_principal_mensajes;
	public Vector<Mensaje> _contiene_mensajes = new Vector<Mensaje>();

	public List cargarMensajeUNR(int aIdTema, boolean aPublico, boolean aPrivado, boolean aOculto, boolean aEliminado) throws PersistentException {

			PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
			Vector<Mensaje> listaMensajes = new Vector<Mensaje>();
		
		try {
			
			Tema tema = com.mds2.foro.TemaDAO.getTemaByORMID(aIdTema);
			MensajeSetCollection temp = tema.contiene_mensajes;
			for(Mensaje s : temp.toArray()) {
				if(s.getPublico())
					listaMensajes.add(s);
			}
				
			t.commit();
			
		}catch(Exception e) {
			t.rollback();
		}
	
		
		return listaMensajes;
		
	}

	public List cargarMensajeUR(int aIdTema, String aAccesibilidadPub) {
		throw new UnsupportedOperationException();
	}

	public List cargarMensajeMod(int aIdTema, String aAccesibilidadPub) {
		throw new UnsupportedOperationException();
	}

	public List cargarMensajeAdmin(int aIdTema, String aAccesibilidadPub, String aAccesibilidadElim) {
		throw new UnsupportedOperationException();
	}

	public List cargarMensajeCreado(int aIdTema, int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public List cargarUltimoMensaje(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public boolean crearMensaje(String aCuerpoMensaje, int aIdUsuario, int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarMensajePropio(int aIdMensaje) {
		throw new UnsupportedOperationException();
	}

	public int darMeGustaMensaje(int aIdMensaje, int aIdUser) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarMensajeAdmin(int aIdMensaje) {
		throw new UnsupportedOperationException();
	}

	public List buscarMensaje(String aKeyword, int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public List cargarRespuestas(int aIdMensaje) {
		throw new UnsupportedOperationException();
	}

	public List cargarRespuestasUR(int aIdMensaje) {
		throw new UnsupportedOperationException();
	}

	public boolean ocultarMensaje(int aIdMensaje) {
		throw new UnsupportedOperationException();
	}
	
}