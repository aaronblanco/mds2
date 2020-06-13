package com.mds2.foro;

import org.orm.PersistentException;

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
	private int idT;
	
	public Tema_UR() {
		super();
		
		Inicializar();
		
		notificarAdmin.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					notificarAdministrador(idT);
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});	
				
	}
	
	public Tema_UR(Tema it) throws PersistentException {
		super(it);
		Inicializar();
		this.idT = it.getIdTema();
//		darMG.addClickListener(new Button.ClickListener() {
//			
//			@Override
//			public void buttonClick(ClickEvent event) {
//				// TODO Auto-generated method stub
//				darMeGusta();
//			}
//		});	
//		
		
		
		notificarAdmin.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					notificarAdministrador(idT);
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});	
		
		
		
		this._titulo.addClickListener(new Button.ClickListener() {

            @Override
            public void buttonClick(ClickEvent event) {
                // TODO Auto-generated method stub
                
            	try {
					UI.getCurrent().getNavigator().addView(_nombreSeccion + "Usr/" + _titulo.getCaption(), new Usuario_registrado(new Lista_Mensaje_V_Usuario_Reg(it.getIdTema())));
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				UI.getCurrent().getNavigator().navigateTo(_nombreSeccion+ "Usr/" + _titulo.getCaption());
            	
            	
            }

        });
	}

	private void Inicializar() {
		 
		darMG.setVisible(false);
		
		notificarAdmin.setVisible(false);

	}
//	//LAS IDS	
//	public void darMeGusta() {
//		iUsr.darMeGustaTema(1, 1);
//	}

	public void notificarAdministrador(int idTema) throws PersistentException {
		iAdmin.notificarAdministrador(idTema, 1);
	}
}