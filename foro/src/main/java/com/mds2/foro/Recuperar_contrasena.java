package com.mds2.foro;

import java.util.List;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Notification;

public class Recuperar_contrasena extends Recuperar_contrasena_ventana implements View{
	private Button _correoValidacion;
	private TextField _email;
	public Iniciar_sesion _unnamed_Iniciar_sesión_;
	public Correo_electronico _unnamed_Correo_electrónico_;
	iUsuario iUsr = new DB_Main();
	public Recuperar_contrasena() {
		
		this._correoValidacion = recuPass;
		this._email = campoEmail;
		_correoValidacion.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					correoValidacion( _email.getValue());
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
	}
	
	public void correoValidacion(String email) throws PersistentException {
		List<Usuarios> u = iUsr.cargarUsuario();
		for(Usuarios it : u) {
			if(it.getEmail() == email)
				Notification.show("Tu contraseña es: " + it.getContraseña());
			else
				Notification.show("Ningun email coincide con los usuarios.");
		}
	}
}