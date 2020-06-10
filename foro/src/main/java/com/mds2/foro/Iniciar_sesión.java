package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.TextField;

public class Iniciar_sesión extends Iniciar_sesion_ventana implements View{
	private String _nombreUsuario;
	private String _contrasena;
	private Button _recordar;
	private Button _registrarse;
	private Button _iniciarSesion;
	
	public Menu_UNR _unnamed_Menu_UNR_;
	public Recuperar_contrasena _recuperar_contraseña;

	iUsuario iUsr = new DB_Main();
	
	public Iniciar_sesión() {
		this._nombreUsuario = userName.getValue();
		this._contrasena = password.getValue();
		this._recordar = recordarPassw;
		this._registrarse = registrars;
		this._iniciarSesion =iniSesion;
		
		_recordar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				recordar();
			}
		});	
		
		_registrarse.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				registrarse();
			}
		});	
		
		_iniciarSesion.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					iniciarSesion();
					
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});	
		
	}
	
	public void recordar() {
		UI.getCurrent().getNavigator().navigateTo("recordarPassw");
	}

	public void iniciarSesion() throws PersistentException {
		int idU = iUsr.iniciarSesion(_nombreUsuario, _contrasena);
		
		Usuarios usr = com.mds2.foro.UsuariosDAO.getUsuariosByORMID(idU);
		Usuario_registrado ur = new Usuario_registrado();
		ur.setId(String.valueOf(usr.getIdUsuario()));
		
		UI.getCurrent().getNavigator().addView(ur.getId(), ur);
		
		//UI.getCurrent().getNavigator().navigateTo("usuarioReg");
		
	}

	public void registrarse() {
		UI.getCurrent().getNavigator().navigateTo("Registrarse");
	}
}