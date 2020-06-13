package com.mds2.foro;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class bd_mensajes {
	public Bd_principal _bd_principal_mensajes;
	public Vector<Mensaje> _contiene_mensajes = new Vector<Mensaje>();

	public List cargarMensajeUNR(int aIdTema, boolean aPublico, boolean aEliminado) throws PersistentException {

		Vector<Mensaje> listaMensajes = new Vector<Mensaje>();
		try {
			com.mds2.foro.Mensaje[] commds2foroMsg = com.mds2.foro.MensajeDAO.listMensajeByQuery("IdTemaPropietario = '"+aIdTema+"'", null);
			
			if(aPublico) {
				
				List<Mensaje> men = new ArrayList<Mensaje>();
				for(Mensaje m : commds2foroMsg) {
					if(m.getPublico()) {
						if(m.getIdPropietario()!= Sesion.getIDSESION())
							men.add(m);

					}
				}
				
				return men;
			
			}else if(aEliminado) {
				List<Mensaje> men = new ArrayList<Mensaje>();
				for(Mensaje m : commds2foroMsg) {
					if(m.getEliminado()) {
						if(m.getIdPropietario()!= Sesion.getIDSESION())
							men.add(m);
					}
				}
				
				return men;
			}
			
		}catch(Exception e) {
			 e.printStackTrace();
			//t.rollback();
			
		}
		
		return listaMensajes;
		
	}

	public List cargarMensajeCreado(int aIdTema, int aIdUsuario) throws PersistentException {
		List<Mensaje> lista = null;
		com.mds2.foro.Mensaje[] commds2foroMsg = com.mds2.foro.MensajeDAO.listMensajeByQuery("IdTemaPropietario = '"+aIdTema+"' AND IdPropietario = '"+aIdUsuario+"'", null);
		try {
			lista = new ArrayList<Mensaje>();
			
			for(Mensaje m : commds2foroMsg) {
				lista.add(m);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		return lista;
	
	}

	public List cargarUltimoMensaje(int aIdUsuario) throws PersistentException {

		List<Mensaje> lista = null;
		com.mds2.foro.Mensaje[] commds2foroMsg = com.mds2.foro.MensajeDAO.listMensajeByQuery("IdPropietario = '"+aIdUsuario+"'", null);
		try {
			lista = new ArrayList<Mensaje>();
			
			for(Mensaje m : commds2foroMsg) {
				lista.add(m);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		return lista;
		
	}

	public boolean crearMensaje(String aCuerpoMensaje, String mediaURL, int aIdUsuario, int aIdTema) throws PersistentException {
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
	
		try {
		
			Tema tema = com.mds2.foro.TemaDAO.getTemaByORMID(aIdTema);
		
			Usuarios u = com.mds2.foro.UsuariosDAO.getUsuariosByORMID(aIdUsuario);
		
			Mensaje msj= com.mds2.foro.MensajeDAO.createMensaje();
	//PARA LO DE MEDIA HABRIA QUE CREAR UNA INSTANCIA DE MEDIA CON LA URL QUE LE PASA Y HACER COSAS DE ASOCIAR 
			msj.setContenido(aCuerpoMensaje);
		
			msj.setEliminado(false);
			msj.setIdPropietario(aIdUsuario);
			msj.setIdTemaPropietario(aIdTema);
			msj.setNumMg(0);
			msj.setPublico(true);
			msj.setUsuarios(u);
			msj.setFechaCreacion(System.currentTimeMillis());
			tema.contiene_mensajes.add(msj);
	
			com.mds2.foro.TemaDAO.save(tema);
			com.mds2.foro.MensajeDAO.save(msj);
		
		
		
			t.commit();
			return true;
		}catch(Exception e) {
			t.rollback();
			return false;
		}
	
	
	
	}

	public boolean eliminarMensajePropio(int aIdMensaje) throws PersistentException {
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		
		try {
			
			Mensaje msj= com.mds2.foro.MensajeDAO.getMensajeByORMID(aIdMensaje);
			msj.setPublico(false);
			msj.setEliminado(true);
			
			t.commit();
			return true;
			
		}catch(Exception e) {
			t.rollback();
			return false;
		}
		
		
		
		
	}

	public int darMeGustaMensaje(int aIdMensaje, int aIdUser) throws PersistentException {
	PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		

		try {
			
			Mensaje msj= com.mds2.foro.MensajeDAO.getMensajeByORMID(aIdMensaje);
			int mg = 0;
			mg = msj.getNumMg();
			mg++;
			msj.setNumMg(mg);
			
			com.mds2.foro.MensajeDAO.save(msj);
			
			t.commit();
			return msj.getNumMg();
		}catch(Exception e) {
			t.rollback();
			return 0;
		}
		
		
	}

	public boolean eliminarMensajeAdmin(int aIdMensaje)  throws PersistentException {
	PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		

		try {
			
			
			Mensaje msj= com.mds2.foro.MensajeDAO.getMensajeByORMID(aIdMensaje);
			
			msj.setEliminado(true);
			
			com.mds2.foro.MensajeDAO.save(msj);
			//
			t.commit();
			return true;
		}catch(Exception e) {
			t.rollback();
			return false;
		}
		
	}

	public List buscarMensaje(String aKeyword, int aIdTema) throws PersistentException {
		
		List<Mensaje> lista = null;
		com.mds2.foro.Mensaje[] commds2foroMensajes = com.mds2.foro.MensajeDAO.listMensajeByQuery(null, null);

		lista = new ArrayList<Mensaje>();
		for(Mensaje m : commds2foroMensajes) {
			lista.add(m);
		}
		
		return lista;
	}

	public List cargarRespuestas(int aIdMensaje)   throws PersistentException {
		
		List<Mensaje> lista = null;

		return lista;
	}

	public List cargarRespuestasUR(int aIdMensaje) {
		throw new UnsupportedOperationException();
	}

	public boolean ocultarMensaje(int aIdMensaje) throws PersistentException {
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		
	
		try {
			
			Mensaje msj = com.mds2.foro.MensajeDAO.getMensajeByORMID(aIdMensaje);
	
			if(msj.getPublico())
				msj.setPublico(false);
			else
				msj.setPublico(true);
			com.mds2.foro.MensajeDAO.save(msj);	
			t.commit();
			return true;
		}catch(Exception e) {
			t.rollback();
			return false;
		}
	
	}
	
}