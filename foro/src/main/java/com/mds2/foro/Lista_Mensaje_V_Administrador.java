package com.mds2.foro;

import java.util.Vector;
//import DCLv3.Mensaje_Administrador;
import java.util.function.Consumer;

import com.vaadin.ui.Component;

public class Lista_Mensaje_V_Administrador extends Lista_Mensaje_V_Moderador{
	public Tema_vista_Admin _unnamed_Tema_vista_Admin_;
	public Vector<Mensaje_Administrador> _list_Mensaje_Administrador = new Vector<Mensaje_Administrador>();
	
	public Lista_Mensaje_V_Administrador() {
		super();
		
		listaMensajeAdmin.addComponent((Component) iUsrNR.cargarMensajeUNR(1, false, false, false, true));
		//NO ESTOY NADA SEGURO DE SI ESTO TIENE SENTIDO VALE?
		listaMensajeAdmin.forEach((Consumer<? super Component>) iUsrNR.cargarRespuestas(1));
	}
}