package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.data.Binder;
import com.vaadin.data.HasValue.ValueChangeEvent;
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
	Binder<Iniciar_sesión> binder = new Binder<>();
	public Iniciar_sesión() {
		this._nombreUsuario = userName;
		this._contrasena = password;
		this._recordar = recordarPassw;
		this._registrarse = registrars;
		this._iniciarSesion =iniSesion;
		
		this._nombreUsuario  = userName;
		this._nombreUsuario.setRequiredIndicatorVisible(true);
		this._nombreUsuario.addValueChangeListener(e->valueChange(e));
		this._contrasena = password;
		this._contrasena.setRequiredIndicatorVisible(true);	
		this._contrasena.addValueChangeListener(e->valueChange(e));
		
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
					
					
					validar();
					
					iniciarSesion();
					
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});	
		
	}
	
	public String get_nombreUsuario() {
		return _nombreUsuario.getValue();
	}

	public void set_nombreUsuario(String _nombreUsuario) {
		this._nombreUsuario =  new TextField(_nombreUsuario);
	}

	public String get_contrasena() {
		return _contrasena.getValue();
	}

	public void set_contrasena(String _contrasena) {
		this._contrasena = new PasswordField(_contrasena);
	}

	public void recordar() {
		UI.getCurrent().getNavigator().navigateTo("recordarPassw");
	}
	private void validar() {
		  binder.forField(_nombreUsuario)
		         .asRequired("El campo nombre de usuario no puede estar vacío")
		         .withValidator(_nombreUser -> _nombreUser.length() > 0,"Code should be atleast 1 character long").bind(Iniciar_sesión::get_nombreUsuario,Iniciar_sesión::set_nombreUsuario);
		  
		  binder.forField(_contrasena)
	      .asRequired("El campo la contraseña no puede estar vacío")
	      .withValidator(_contrasena -> _contrasena.length() > 0,"Code should be atleast 1 character long").bind(Iniciar_sesión::get_contrasena,Iniciar_sesión::set_contrasena);

		  binder.validate();

		}
		private void valueChange(ValueChangeEvent<String> e) {
	        
	         binder.validate();
	    }
	public void iniciarSesion() throws PersistentException {
	
		
		
		int idU = iUsr.iniciarSesion(_nombreUsuario.getValue(), _contrasena.getValue());
		
		if(idU >= 1) {
			
		
			Sesion.setIDSESION(idU);
				
			Moderador Mod = com.mds2.foro.ModeradorDAO.getModeradorByORMID(idU);
			
			Administrador a = com.mds2.foro.AdministradorDAO.getAdministradorByORMID(idU);
			
			if(a != null) {
				Sesion.setNOMBRESESION(_nombreUsuario.toString());
				Sesion.setADMINISTRADOR(true);
				
				AdministradorClase admin =  new AdministradorClase();
				UI.getCurrent().getNavigator().addView("Pagina principalAdm", new AdministradorClase());

				UI.getCurrent().getNavigator().addView("crearSeccion", new AdministradorClase(new CreacionSeccion()));
				UI.getCurrent().getNavigator().addView("Cerrar sesiónAdm",  new Usuario_no_registrado());
				UI.getCurrent().getNavigator().addView("Panel de administraciónAdm", new AdministradorClase(new Panel_de_administración_vista_administrador()) );
				UI.getCurrent().getNavigator().addView(Sesion.getNOMBRESESION(), admin);
				UI.getCurrent().getNavigator().addView("Mi perfilAdm", new AdministradorClase(new Mi_perfil()));  
				UI.getCurrent().getNavigator().addView("Panel de publicidad", new AdministradorClase(new Sistema_de_publicidad()) );
				UI.getCurrent().getNavigator().addView("sisTicketAdm", new AdministradorClase(new Sistema_de_tickets_vista_administrador()));
				UI.getCurrent().getNavigator().navigateTo(Sesion.getNOMBRESESION());
				
				
			}
				
			else if(Mod != null) {
				Sesion.setNOMBRESESION(_nombreUsuario.toString());
				
				ModeradorClase mod =  new ModeradorClase();
				UI.getCurrent().getNavigator().addView("Pagina principalMod", new ModeradorClase());
				UI.getCurrent().getNavigator().addView("Panel de administraciónMod", new ModeradorClase(new Panel_de_administración_vista_moderador()) );
				UI.getCurrent().getNavigator().addView("Cerrar sesiónMod",  new Usuario_no_registrado());
				UI.getCurrent().getNavigator().addView(Sesion.getNOMBRESESION(), mod);
				UI.getCurrent().getNavigator().addView("Mi perfilMod", new ModeradorClase(new Mi_perfil()));  
				UI.getCurrent().getNavigator().navigateTo(Sesion.getNOMBRESESION());
			}
			
			
				else if(idU > 0) {
				
			
				try {
					
					Sesion.setADMINISTRADOR(false);
				
					UI.getCurrent().getNavigator().addView("Cerrar sesiónUsr", new Usuario_no_registrado());			
					UI.getCurrent().getNavigator().addView("Pagina principalUsr", new Usuario_registrado());
					UI.getCurrent().getNavigator().addView("Mi perfilUsr", new Usuario_registrado(new Mi_perfil()));  
					UI.getCurrent().getNavigator().addView("sistemaTickets", new Usuario_registrado(new Sistema_de_tickets_vista_usuario_registrado()));	
					UI.getCurrent().getNavigator().addView("crearTicket", new Usuario_registrado(new CreacionTicket()));
					
					UI.getCurrent().getNavigator().addView("", new Usuario_registrado());
					
				} catch (PersistentException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}		
				
					UI.getCurrent().getNavigator().navigateTo("");
				}
			
				else {
					Notification.show("FALLO AL INICIAR SESION");
				}
	
		}
		
	}

	public void registrarse() {
		UI.getCurrent().getNavigator().navigateTo("Registrarse");
	}
}