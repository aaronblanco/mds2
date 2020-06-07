package com.mds2.foro;

import java.util.Vector;
//import Package.Ver_perfil_de_usuario;
//import Package.Mensaje_UR;
//import DCLv3.CreacionMensaje;
import java.util.function.Consumer;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Component;

public class Lista_Mensaje_V_Usuario_Reg extends Lista_Mensaje {
	//private Button _crearMensaje;
	public Usuario_registrado _usuario_registrado;
	public Tema_UR _unnamed_Tema_UR_;
	//public Vector<Ver_perfil_de_usuario> _list_Ver_perfil_de_usuario = new Vector<Ver_perfil_de_usuario>();
	public Vector<Mensaje_UR> _list_Mensaje_UR = new Vector<Mensaje_UR>();
	public CreacionMensaje _unnamed_CreacionMensaje_;
	
	
	public Lista_Mensaje_V_Usuario_Reg() {
		super();
		
		crearMensaje.setVisible(true);
		
		crearMensaje.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				crearMensaje();
			}
			
		});	
		
		//COSAS
		listaMensajeAdmin.addComponent((Component) iUsrNR.cargarMensajeUNR(1, false, true, false, false));
		//NO ESTOY NADA SEGURO DE SI ESTO TIENE SENTIDO VALE?
		listaMensajeAdmin.forEach((Consumer<? super Component>) iUsrNR.cargarRespuestas(1));
		
	}
	
	public void crearMensaje() {
		UI.getCurrent().getNavigator().navigateTo("crearMensaje");
	}
}