package com.mds2.foro;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
//import Package.Tema_privado;

public class Lista_Tema_Seccion_Privada extends Lista_Tema_V_Usuario_Reg {
	public Seccion_privada _unnamed_Sección_privada_;
	public Vector<Tema_privado> _list_Tema_privado = new Vector<Tema_privado>();
	
	public Lista_Tema_Seccion_Privada(int idSeccion) throws NumberFormatException, PersistentException {
		super(idSeccion);
		listaTemas.removeAllComponents();
		
		List<Tema> t = iUsrNR.cargarTemasUNR(idSeccion, true, false, false, false);
		
		List<Tema> tu = iUsrNR.cargarTemasUNR(idSeccion, false, true, false, false);
		
		if(!t.isEmpty()) {
			for(Tema it: t) {
				Tema_UR tema = new Tema_UR(it);
				listaTemas.addComponent(tema);
			}
		}	
		
		if(!tu.isEmpty()) {
			for(Tema it: tu) {
				Tema_UR tema = new Tema_UR(it);
				listaTemas.addComponent(tema);
			}
		}
	}
	
}