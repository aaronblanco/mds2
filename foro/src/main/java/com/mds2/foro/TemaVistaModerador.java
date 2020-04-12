package com.mds2.foro;

//import Package.Lista_Tema_V_Moderador;
//import Package.Lista_Mensaje_V_Moderador;
//import Package.Tema_UR;

public class TemaVistaModerador extends Tema_UR {
//	private Listener _listaTemaMod;
	public Lista_Tema_V_Moderador _unnamed_Lista_Tema_V_Moderador_;
	public Lista_Mensaje_V_Moderador _unnamed_Lista_Mensaje_V_Moderador_;

	public TemaVistaModerador() {
		super();
		
		cambiarAcc.setVisible(true);
	}
	
	public void cambiarAccesibilidad(Tipo aTipoNuevo) {
		throw new UnsupportedOperationException();
	}
}