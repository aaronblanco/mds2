package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Notification;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;

public class Iniciar_sesión extends Iniciar_sesion_ventana implements View{
	private TextField _nombreUsuario;
	private PasswordField _contrasena;
	private Button _recordar;
	private Button _registrarse;
	private Button _iniciarSesion;
	
	public Menu_UNR _unnamed_Menu_UNR_;
	public Recuperar_contrasena _recuperar_contraseña;

	iUsuario iUsr = new DB_Main();
	iAdministrador iAdm = new DB_Main();
	iModerador iMod = new DB_Main();
	
	public Iniciar_sesión() {
		this._nombreUsuario = userName;
		this._contrasena = password;
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
		Sesion sesion = new Sesion();
		
		
		int idU = iUsr.iniciarSesion(_nombreUsuario.getValue(), _contrasena.getValue());
		
		System.out.println(idU);
		if(idU >= 1) {
			
		
			Sesion.setIDSESION(idU);
			System.out.println("ey");
			Administrador Adm = iAdm.obtenerPerfilAdmin(idU);
			System.out.println("PASA POR AQUI");
			Moderador Mod = iMod.obtenerPerfilModerador(idU);
			System.out.println("Y AQUI");
			if(Adm != null) {
				Sesion.setNOMBRESESION(_nombreUsuario.toString());
				AdministradorClase admin =  new AdministradorClase();
			
				UI.getCurrent().getNavigator().addView(Sesion.getNOMBRESESION(), admin);
				System.out.println("LLEGA A AQUI");
				UI.getCurrent().getNavigator().navigateTo(Sesion.getNOMBRESESION());
			}
				
			else if(Mod != null) {
				Sesion.setNOMBRESESION(_nombreUsuario.toString());
				ModeradorClase mod =  new ModeradorClase();
			
				UI.getCurrent().getNavigator().addView(Sesion.getNOMBRESESION(), mod);
			
				UI.getCurrent().getNavigator().navigateTo(Sesion.getNOMBRESESION());
			}
			
			
			else {

			UI.getCurrent().getNavigator().navigateTo("usuarioReg");

			
			
			}
			Notification notification = Notification.show(
			        "FALLO AL INICIAR SESION");
			
		}
		
	
		
		
	}

	public void registrarse() {
		UI.getCurrent().getNavigator().navigateTo("Registrarse");
	}
}
