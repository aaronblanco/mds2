package com.mds2.foro;

import java.util.Date;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class bd_secciones {
	public Bd_principal _bd_principal_secciones;
	public Vector<Seccion> _contiene_secciones = new Vector<Seccion>();

	public List cargarSecciones(boolean aPublico, boolean aPrivado, boolean aOculto, boolean aEliminado) throws PersistentException {
		
		try {
			
			com.mds2.foro.Seccion[] commds2foroSeccions = new Seccion[50];
			
			if(aPublico) {
				 Seccion[] tal = com.mds2.foro.SeccionDAO.listSeccionByQuery("Publico = '"+1+"'", "Titulo");
				 _contiene_secciones = new Vector<Seccion>();
				 for(Seccion s:tal) {
						_contiene_secciones.add(s);
				}
				
				return  _contiene_secciones;
				
				
			}else if(aPrivado) {
				commds2foroSeccions = com.mds2.foro.SeccionDAO.listSeccionByQuery("Privado = '"+1+"'", "Titulo");
				_contiene_secciones = new Vector<Seccion>();
				for(Seccion s:commds2foroSeccions) {
					_contiene_secciones.add(s);
				}
				
			}else if(aOculto) {
				commds2foroSeccions = com.mds2.foro.SeccionDAO.listSeccionByQuery("Oculto = '"+1+"'", "Titulo");
				_contiene_secciones = new Vector<Seccion>();
				for(Seccion s:commds2foroSeccions) {
					_contiene_secciones.add(s);
				}
			}else if(aEliminado) {
				commds2foroSeccions = com.mds2.foro.SeccionDAO.listSeccionByQuery("Eliminado = '"+1+"'", "Titulo");
				_contiene_secciones = new Vector<Seccion>();
				for(Seccion s:commds2foroSeccions) {
					_contiene_secciones.add(s);
				}
			}
		}catch(Exception e) {
			 e.printStackTrace();			
		}
		
		return _contiene_secciones;
		
	}

	public boolean crearSeccion(String aTitulo, String aSubtitulo, String fotoURL, int aIdUserCreador) throws PersistentException {
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		try {
			com.mds2.foro.Seccion sec = com.mds2.foro.SeccionDAO.createSeccion();
			Usuarios u = com.mds2.foro.UsuariosDAO.getUsuariosByORMID(aIdUserCreador);
			sec.setTitulo(aTitulo);
			sec.setDescripcion(aSubtitulo);
			sec.setIdPropietarioSeccion(aIdUserCreador);
			sec.setFecha(System.currentTimeMillis());
			sec.setPublico(true);
			sec.setCreador(u.getNombre());
			sec.setEliminado(false);
			sec.setImagenSeccion(fotoURL);
			sec.setOculto(false);
			sec.setPrivado(false);
			sec.setUsuarios(u);
			
			com.mds2.foro.SeccionDAO.save(sec);
		
			t.commit();
			return true;
		}
		catch(Exception e) {
			t.rollback();	
			return false;
		}
		
	}
	
	public boolean cambiarAccesibilidadSeccion(boolean publico, boolean privado, boolean oculto, int idSeccion) throws PersistentException {

		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		Seccion se = com.mds2.foro.SeccionDAO.getSeccionByORMID(idSeccion);
		
		try {
			se.setPrivado(privado);
			se.setPublico(publico);
			se.setOculto(oculto);
			
			com.mds2.foro.SeccionDAO.save(se);
			
			t.commit();
			
			return true;
			
		}catch(Exception e) {
			t.rollback();
			return false;
		}
	}

	public boolean eliminarSeccion(int aIdSeccion) throws PersistentException {
		
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		Seccion sec = SeccionDAO.getSeccionByORMID(aIdSeccion);
		
		try {
			sec.setPublico(false);
			sec.setPrivado(false);
			sec.setOculto(false);
			sec.setEliminado(true);
			t.commit();
			return true;
		}catch(Exception e) {
			t.rollback();
			return false;
		}
	}

	public List buscarSeccion(String aKeyword) throws PersistentException {
		
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		List<Seccion> listaSecciones = null;
		
		try {
			
			listaSecciones = SeccionDAO.querySeccion("Titulo LIKE ('%"+ aKeyword +"%')", null);
			
			t.commit();
			
		}catch(Exception e) {
			t.rollback();
		}
		
		
		return listaSecciones;
		
	}
}