package com.mds2.foro;

public class Mensaje_UR extends Mensaje {
//	private Button _darMeGusta;
//	private Button _responder;
	private boolean _meGusta;
//	private Listener _listaUltimoMsg;
//	private Listener _listaMsgVUsuarioReg;
//	private Button _notificarAdministrador;
	public Lista_Mensaje_V_Usuario_Reg _unnamed_Lista_Mensaje_V_Usuario_Reg_;
	public Lista_Ultimo_mensaje _unnamed_Lista_Ultimo_mensaje_;
	//public Escribir_mensaje _escribir_mensaje;
	//public Interactuar_mensaje _interactuar_mensaje;

	public Mensaje_UR() {
		super();
		
		meGustaB.setVisible(true);
		
		responderMensaje.setVisible(true);
		
		notificarAdminB.setVisible(true);
	}
	
	public void darMeGusta() {
		throw new UnsupportedOperationException();
	}

	public void responderMsg() {
		throw new UnsupportedOperationException();
	}

	public void notificarAdministrador() {
		throw new UnsupportedOperationException();
	}
}