package com.mds2.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

public class Mensaje_moderador extends Mensaje_UR {
	//private Button _ocultar;
	//private Listener _listaMsgMod;
	public Lista_Mensaje_V_Moderador _unnamed_Lista_Mensaje_V_Moderador_;
	//public Ver_información_de_usuario_registrado _ver_información_de_usuario_registrado;
	iModerador iUsr = new DB_Main();
	
	public Mensaje_moderador() {
		super();
		
		notificarAdminB.setCaption("Ocultar mensaje");
		
		notificarAdminB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				ocultar();
			}
		});
	}
	
	//Aqui sustituimos el notificar por notificar Y ocultar, asi que habra que sobreescribir cosas
	public void ocultar() {
		iUsr.ocultarMensaje(Integer.parseInt(this.getId()));
	}
}