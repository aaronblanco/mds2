package com.mds2.foro;

//import Package.Mensaje_moderador;

public class Mensaje_Administrador extends Mensaje_moderador {
	//private Button _eliminar;
	public Lista_Mensaje_V_Administrador _unnamed_Lista_Mensaje_V_Administrador_;

	public Mensaje_Administrador() {
		super();
		
		notificarAdminB.setVisible(false);
		
		eliminarMensaje.setVisible(true);
	}
	
	public void eliminar() {
		throw new UnsupportedOperationException();
	}
}