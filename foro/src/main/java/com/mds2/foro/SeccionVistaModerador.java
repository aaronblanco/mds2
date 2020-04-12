package com.mds2.foro;

//import Package.Lista_Seccion_V_Moderador;
import java.util.Vector;
//import Package.Lista_Tema_V_Moderador;

public class SeccionVistaModerador extends SeccionVistaUR {
	//private Listener _listaSeccionMod;
	public Lista_Seccion_V_Moderador _unnamed_Lista_Seccion_V_Moderador_;
	public Vector<Lista_Tema_V_Moderador> _list_Tema_V_Moderador = new Vector<Lista_Tema_V_Moderador>();

	public SeccionVistaModerador() {
		super();
		statusTema.setVisible(true);
	}
	
	public void cambiarAccesibilidad(Tipo aTipoNuevo) {
		throw new UnsupportedOperationException();
	}
}