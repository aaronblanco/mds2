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
		
		TemaCriteria tc = new TemaCriteria();
		Tema[]temas = tc.listTema();
		
		if(aPublico) {
			try {
				for(Tema tem : temas) {
					if(tem.getPublico())
						_contiene_temas.add(tem);
				}
			}catch(Exception e) {
				
			}
		}else if(aPrivado) {
			try {
				for(Tema tem : temas) {
					if(tem.getPrivado())
						_contiene_temas.add(tem);
				}
			}catch(Exception e) {
				
			}
		}else if(aOculto) {
			try {
				for(Tema tem : temas) {
					if(tem.getOculto())
						_contiene_temas.add(tem);
				}
			}catch(Exception e) {
				
			}
		}else if(aEliminado) {
			try {
				for(Tema tem : temas) {
					if(tem.getEliminado())
						_contiene_temas.add(tem);
				}
			}catch(Exception e) {
				
			}
		}
		
		return _contiene_temas;
	}

	public List cargarTemasSeccionPrivada(int aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public boolean crearTema(String aTitulo, String aSubtitulo, int aIdSeccionPropietaria, int aIdTemaPropietario) throws PersistentException {
		
		Seccion sec = com.mds2.foro.SeccionDAO.getSeccionByORMID(aIdSeccionPropietaria);
		Usuarios u = com.mds2.foro.UsuariosDAO.getUsuariosByORMID(aIdTemaPropietario);
		Tema tema = com.mds2.foro.TemaDAO.createTema();
		
		tema.setTitulo(aTitulo);
		tema.setDescripcion(aSubtitulo);
		
		sec.contiene_temas.add(tema);
		u.pro_temas.add(tema);
		
		
		
		return false;
		
		//tema.setFecha();
		
	}

	public boolean darMeGustaTema(int aIdTema, int aIdUser) {
		//TemaDAO.getTemaByORMID(aIdTema)
		
	}

	public boolean eliminarTema(int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public boolean cerrarTema(int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public boolean cambiarAccesibilidad(boolean aPublico, boolean aPrivado, boolean aOculto) {
		throw new UnsupportedOperationException();
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