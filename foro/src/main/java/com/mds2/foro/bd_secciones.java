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
		
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		SeccionCriteria sc = new SeccionCriteria();
		Seccion[] secc = new Seccion[50];
		
		
		try {
			
			secc = sc.listSeccion();
			if(aPublico) {
				for(Seccion s:secc) {
					if(s.getPublico())
						_contiene_secciones.add(s);
				}
			}else if(aPrivado) {
				for(Seccion s:secc) {
					if(s.getPrivado())
						_contiene_secciones.add(s);
				}
				
			}else if(aOculto) {
				for(Seccion s:secc) {
					if(s.getOculto())
						_contiene_secciones.add(s);
				}
			}else if(aEliminado) {
				for(Seccion s:secc) {
					if(s.getEliminado())
						_contiene_secciones.add(s);
				}
			}
		
			t.commit();
			
		}catch(Exception e) {
			t.rollback();
		}
		
		return _contiene_secciones;
		
	}

	public boolean crearSeccion(String aTitulo, String aSubtitulo, int aIdUserCreador) throws PersistentException {
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		try {
			Seccion sec = com.mds2.foro.SeccionDAO.createSeccion();
			Usuarios u = com.mds2.foro.UsuariosDAO.getUsuariosByORMID(aIdUserCreador);
			sec.setTitulo(aTitulo);
			sec.setDescripcion(aSubtitulo);
		
			sec.setIdPropietarioSeccion(aIdUserCreador);
		
		
			sec.setFecha(System.currentTimeMillis());
			sec.setPublico(true);
			sec.setCreador(u.getNombre());
			com.mds2.foro.SeccionDAO.save(sec);
		
			t.commit();
		
			return true;
		}
		catch(Exception e) {
			t.rollback();	
			return false;
		}
		
	}
//ESTE METODO ES MUY PROBABLE QUE YA NO EXISTA O QUE SEA DIFERENTE (VEASE TIPO)
	public boolean cambiarAccesibilidadSeccion(boolean publico, boolean privado, boolean oculto, int idSeccion) throws PersistentException {

		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		Seccion se = com.mds2.foro.SeccionDAO.getSeccionByORMID(idSeccion);
		
		try {
			se.setPrivado(privado);
			se.setPublico(publico);
			se.setOculto(oculto);
			t.commit();
			return true;
		}catch(Exception e) {
			t.rollback();
			return false;
		}
	}

	public boolean eliminarSeccion(int aIdSeccion) throws PersistentException {
		
		Seccion sec = SeccionDAO.getSeccionByORMID(aIdSeccion);
		sec.setPublico(false);
		sec.setPrivado(false);
		sec.setOculto(false);
		sec.setEliminado(true);
		
		return true;
	}

	public List buscarSeccion(String aKeyword) throws PersistentException {
		
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		Vector<Seccion> listaSecciones = new Vector<Seccion>();
		
		try {
			
			
			listaSecciones = (Vector<Seccion>) SeccionDAO.querySeccion("Titulo = '"+ aKeyword +"'", null);
				
			t.commit();
			
		}catch(Exception e) {
			t.rollback();
		}
		
		
		return listaSecciones;
		
	}
}