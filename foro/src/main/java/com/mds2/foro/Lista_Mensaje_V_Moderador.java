package com.mds2.foro;

//import DCLv3.TemaVistaModerador;
import java.util.Vector;
//import Package.Mensaje_moderador;
import java.util.function.Consumer;

import com.vaadin.ui.Component;

public class Lista_Mensaje_V_Moderador extends Lista_Mensaje_V_Usuario_Reg {
	public ModeradorClase _moderador;
	public TemaVistaModerador _unnamed_TemaVistaModerador_;
	public Vector<Mensaje_moderador> _list_Mensaje_moderador = new Vector<Mensaje_moderador>();
	
	public Lista_Mensaje_V_Moderador() {
		super();
		listaMensajeAdmin.addComponent((Component) iUsrNR.cargarMensajeUNR(1, false, false, true, false));
		//NO ESTOY NADA SEGURO DE SI ESTO TIENE SENTIDO VALE?
		listaMensajeAdmin.forEach((Consumer<? super Component>) iUsrNR.cargarRespuestas(1));
		
		
	}
}