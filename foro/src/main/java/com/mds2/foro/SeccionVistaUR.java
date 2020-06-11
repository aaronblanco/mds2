package com.mds2.foro;

import org.orm.PersistentException;


public class SeccionVistaUR extends SeccionClase {
	//private Listener _listaSeccionUsuarioReg;
	public Lista_Seccion_V_Usuario_Reg _unnamed_Lista_Seccion_V_Usuario_Reg_;
	public Lista_Tema_V_Usuario_Reg _unnamed_Lista_Tema_V_Usuario_Reg_;
	
	public SeccionVistaUR() throws PersistentException {
		super();
	}
	
	public SeccionVistaUR(Seccion s) throws PersistentException {
		super(s);
			
	}
	
}