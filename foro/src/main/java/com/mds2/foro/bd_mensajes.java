package com.mds2.foro;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class bd_mensajes {
	public Bd_principal _bd_principal_mensajes;
	public Vector<Mensaje> _contiene_mensajes = new Vector<Mensaje>();

	//LOS MENSAJES PRIVADOS Y OCULTOS EN VD NO EXISTEN LOL
	public List cargarMensajeUNR(int aIdTema, boolean aPublico, boolean aPrivado, boolean aOculto, boolean aEliminado) throws PersistentException {

		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		Vector<Mensaje> listaMensajes = new Vector<Mensaje>();
		try {
			com.mds2.foro.Mensaje[] commds2foroMsg = com.mds2.foro.MensajeDAO.listMensajeByQuery("IdTemaPropietario = '"+aIdTema+"'", null);
			
			if(aPublico) {
				
				List<Mensaje> men = new ArrayList<Mensaje>();
				for(Mensaje m : commds2foroMsg) {
					if(m.getPublico())
						men.add(m);
				}
				
				return men;
			
			}else if(aEliminado) {
				List<Mensaje> men = new ArrayList<Mensaje>();
				for(Mensaje m : commds2foroMsg) {
					if(m.getEliminado())
						men.add(m);
				}
				
				return men;
			}
			
			//t.commit();
			//com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().close();
			
		}catch(Exception e) {
			 e.printStackTrace();
			//t.rollback();
			
		}
		
//		try {
//			
//			Tema tema = com.mds2.foro.TemaDAO.getTemaByORMID(aIdTema);
//			MensajeSetCollection temp = tema.contiene_mensajes;
//			for(Mensaje s : temp.toArray()) {
//				if(s.getPublico())
//					listaMensajes.add(s);
//			}
//				
//			t.commit();
//			
//		}catch(Exception e) {
//			t.rollback();
//		}
	
		
		return listaMensajes;
		
	}

	public List cargarMensajeCreado(int aIdTema, int aIdUsuario) throws PersistentException {
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		Vector<Mensaje> listaMensajes = new Vector<Mensaje>();
	
	try {
		
		Tema tema = com.mds2.foro.TemaDAO.getTemaByORMID(aIdTema);
		
		MensajeSetCollection temp = tema.contiene_mensajes;
		for(Mensaje s : temp.toArray()) {
			if(s.getIdPropietario() == aIdUsuario)
				listaMensajes.add(s);
		}
			
		t.commit();
		
	}catch(Exception e) {
		t.rollback();
	}
	
	return listaMensajes;
	
	}

	public List cargarUltimoMensaje(int aIdUsuario) {
		throw new UnsupportedOperationException();
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

			com.mds2.foro.MensajeDAO.delete(msj);
			
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
			
			msj.setNumMg(+1);
			
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
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		Vector<Mensaje> listaMensajes = new Vector<Mensaje>();
		
		
		try {
			
			
			listaMensajes = (Vector<Mensaje>) MensajeDAO.queryMensaje("Titulo = '"+ aKeyword +"'", null);
				
			t.commit();
			
		}catch(Exception e) {
			t.rollback();
		}
		
		
		return listaMensajes;
	}

	public List cargarRespuestas(int aIdMensaje)   throws PersistentException {
		throw new UnsupportedOperationException();
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