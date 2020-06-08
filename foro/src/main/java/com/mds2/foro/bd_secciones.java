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

		
		//PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		Vector<Seccion> listaSecciones = new Vector<Seccion>();
		
		try {
			
			SeccionCriteria sc = new SeccionCriteria();
			Seccion[] cosa = new Seccion[50];
			cosa = sc.listSeccion();
		
			for(Seccion s:cosa) {
				if(s.getPublico())
					listaSecciones.add(s);
			}
				
		//	t.commit();
			
		}catch(Exception e) {
		//	t.rollback();
		}
	
		
		return listaSecciones;
		
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

	public boolean cambiarAccesibilidadSeccion(Tipo aTipoNuevo) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarSeccion(int aIdSeccion) {
		throw new UnsupportedOperationException();
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