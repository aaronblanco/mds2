package com.mds2.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Tema_UR extends TemaClase {
	//private Button _darMeGusta;
	private boolean _meGusta;
	//private Label _estado;
//	private Listener _listaTemaUsuarioReg;
//	private Button _notificarAdministrador;
	public Lista_Tema_V_Usuario_Reg _lista_Tema_V_Usuario_Reg_;
	//public Interactuar_tema _interactuar_tema;
	public Lista_Mensaje_V_Usuario_Reg _lista_Mensaje_V_Usuario_Reg_;
	iUsuario iUsr = new DB_Main();
	iAdministrador iAdmin = new DB_Main();
	
	public Tema_UR() {
		super();
		
		Inicializar();
		
		darMG.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				darMeGusta();
			}
		});	
		
		notificarAdmin.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				notificarAdministrador();
			}
		});	
				
	}
	
	private void Inicializar() {
		
		darMG.setVisible(true);
		
		notificarAdmin.setVisible(true);

	}
	//LAS IDS	
	public void darMeGusta() {
		iUsr.darMeGustaTema(1, 1);
	}
//las ids wey
	public void notificarAdministrador() {
		iAdmin.notificarAdministrador(1, 1);
	}
}