package com.mds2.foro;

public class Tema_UR extends Tema {
	//private Button _darMeGusta;
	private boolean _meGusta;
	//private Label _estado;
//	private Listener _listaTemaUsuarioReg;
//	private Button _notificarAdministrador;
	public Lista_Tema_V_Usuario_Reg _unnamed_Lista_Tema_V_Usuario_Reg_;
	//public Interactuar_tema _interactuar_tema;
	public Lista_Mensaje_V_Usuario_Reg _unnamed_Lista_Mensaje_V_Usuario_Reg_;

	public Tema_UR() {
		super();
		
		darMG.setVisible(true);
		notificarAdmin.setVisible(true);
		
		
	}
	
	
	public void darMeGusta() {
		throw new UnsupportedOperationException();
	}

	public void notificarAdministrador() {
		throw new UnsupportedOperationException();
	}
}