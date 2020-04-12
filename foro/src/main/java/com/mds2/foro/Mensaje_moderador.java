package com.mds2.foro;

public class Mensaje_moderador extends Mensaje_UR {
	//private Button _ocultar;
	//private Listener _listaMsgMod;
	public Lista_Mensaje_V_Moderador _unnamed_Lista_Mensaje_V_Moderador_;
	//public Ver_información_de_usuario_registrado _ver_información_de_usuario_registrado;

	public Mensaje_moderador() {
		super();
		
		meGustaB.setVisible(true);
		
		responderMensaje.setVisible(true);
		
		notificarAdminB.setVisible(true);
		
		
	}
	
	//Aqui sustituimos el notificar por notificar Y ocultar, asi que habra que sobreescribir cosas
	public void ocultar() {
		throw new UnsupportedOperationException();
	}
}