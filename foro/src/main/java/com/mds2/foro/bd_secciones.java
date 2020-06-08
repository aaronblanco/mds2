package com.mds2.foro;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class bd_secciones {
	public Bd_principal _bd_principal_secciones;
	public Vector<Seccion> _contiene_secciones = new Vector<Seccion>();

	public List cargarSecciones(boolean aPublico, boolean aPrivado, boolean aOculto, boolean aEliminado) throws PersistentException {

		
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		List listaSecciones = null;
		
		try {
			
			SeccionCriteria sc = new SeccionCriteria();
			Seccion[] cosa = new Seccion[50];
			cosa = sc.listSeccion();
			for(Seccion s:cosa) {
				if(s.getPublico())
					listaSecciones.add(s);
			}
				
			t.commit();
			
		}catch(Exception e) {
			t.rollback();
		}
	
		
		return listaSecciones;
		
	}

	public boolean crearSeccion(String aTitulo, String aSubtitulo, int aIdUserCreador) {
		throw new UnsupportedOperationException();
	}

	public boolean cambiarAccesibilidadSeccion(Tipo aTipoNuevo) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarSeccion(int aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public List buscarSeccion(String aKeyword) {
		throw new UnsupportedOperationException();
	}
}