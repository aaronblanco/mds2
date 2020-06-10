package com.mds2.foro;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class bd_temas {
	public DB_Main _bd_principal_temas;
	public Vector<Tema> _contiene_temas = new Vector<Tema>();

	public List cargarTemasUNR(int aIdSeccion, boolean aPublico, boolean aPrivado, boolean aOculto, boolean aEliminado) throws PersistentException {
		
	
		
		
		try {
			
			
			if(aPublico) {
				com.mds2.foro.Tema[] temas = com.mds2.foro.TemaDAO.listTemaByQuery("Publico = '"+1+"' AND SeccionIdSeccion = '"+aIdSeccion+"'", "Titulo");
				 for(Tema s:temas) {
						_contiene_temas.add(s);
					}
				
				return  _contiene_temas;
				
				
			}else if(aPrivado) {
				com.mds2.foro.Tema[] temas = com.mds2.foro.TemaDAO.listTemaByQuery("Privado = '"+1+"' AND SeccionIdSeccion = '"+aIdSeccion+"'", "Titulo");
				 for(Tema s:temas) {
						_contiene_temas.add(s);
					}
				
				return  _contiene_temas;
			}else if(aOculto) {
				com.mds2.foro.Tema[] temas = com.mds2.foro.TemaDAO.listTemaByQuery("Oculto = '"+1+"' AND SeccionIdSeccion = '"+aIdSeccion+"'", "Titulo");
				 for(Tema s:temas) {
						_contiene_temas.add(s);
					}
				
				return  _contiene_temas;
			}else if(aEliminado) {
				com.mds2.foro.Tema[] temas= com.mds2.foro.TemaDAO.listTemaByQuery("Eliminado = '"+1+"' AND SeccionIdSeccion = '"+aIdSeccion+"'", "Titulo");
				 for(Tema s:temas) {
						_contiene_temas.add(s);
					}
				
				return  _contiene_temas;
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return _contiene_temas;
	}

	public List cargarTemasSeccionPrivada(int aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public boolean crearTema(String aTitulo, String aSubtitulo, int aIdSeccionPropietaria, int aIdTemaPropietario) throws PersistentException {
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
	try {
		Seccion sec = com.mds2.foro.SeccionDAO.getSeccionByORMID(aIdSeccionPropietaria);
		Usuarios u = com.mds2.foro.UsuariosDAO.getUsuariosByORMID(aIdTemaPropietario);
		Tema tema = com.mds2.foro.TemaDAO.createTema();
		
		tema.setTitulo(aTitulo);
		tema.setDescripcion(aSubtitulo);
		tema.setFecha(System.currentTimeMillis());
		tema.setIdTemaPropietario(aIdSeccionPropietaria);
		tema.setUsuarios(u);
		tema.setPublico(true);
		com.mds2.foro.TemaDAO.save(tema);
		
		u.pro_temas.add(tema);
		com.mds2.foro.UsuariosDAO.save(u);
			
		sec.contiene_temas.add(tema);
		com.mds2.foro.SeccionDAO.save(sec);
		
		t.commit();
		return true;
		
	}
	catch(Exception e) {
			t.rollback();
			return false;
		}
	
	}

	public boolean darMeGustaTema(int aIdTema, int aIdUser) {
		//TemaDAO.getTemaByORMID(aIdTema)
		throw new UnsupportedOperationException();
	}

	public boolean eliminarTema(int aIdTema) throws PersistentException {
		
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();	
		try {
			
			
			Tema tema = com.mds2.foro.TemaDAO.getTemaByORMID(aIdTema);
			tema.setEliminado(true);
			tema.setPrivado(false);
			tema.setPublico(false);
			tema.setOculto(false);
					
			t.commit();
		return true;
		}
		catch (Exception e) {
			// TODO: handle exception
			t.rollback();
			return false;
		}
		
		
	}

	//AQUI DEBERIA SER PONER EL BOTON DE CREAR TEMA EN INVIS
	public boolean cerrarTema(int aIdTema) throws PersistentException {
		throw new UnsupportedOperationException();
		
	}

	public boolean cambiarAccesibilidad(boolean aPublico, boolean aPrivado, boolean aOculto, int idTema) throws PersistentException{
		
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		Tema te = com.mds2.foro.TemaDAO.getTemaByORMID(idTema);
		try {
			te.setPrivado(aPrivado);
			te.setPublico(aPublico);
			te.setOculto(aOculto);
			t.commit();
			return true;
		}catch(Exception e) {
			t.rollback();
			return false;
		}
		
	}

	public List buscarTema(String aKeyword, int aIdSeccion) throws PersistentException {
		List temas = null;
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		
		try {
				
			temas.add(TemaDAO.queryTema("Titulo='"+aKeyword+"'", null));
				
			t.commit();
			
		}catch(Exception e) {
			t.rollback();
		}
		
		return temas;
		
	}
}