package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;


public class Amigo extends VerPerfilGenerico {
	private Button _anadirAmigo;
	private Button _eliminarAmigo;
	public Lista_Amigo _unnamed_Lista_Amigo_;

	
	public Amigo() {
		this._anadirAmigo = aceptarSolicitud;
		this._eliminarAmigo = rechazarSolicitud;
	}
	
	
	public Amigo(Usuarios a) {
		// TODO Auto-generated constructor stub
		
		this._anadirAmigo = aceptarSolicitud;
		this._eliminarAmigo = interactuarUsuario;
		irPerfil.setCaption(a.getNombreUsuario());
		irPerfil.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
				try {
					verPerfil(a.getIdUsuario());
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			
		
			
		});	
	}
	
	@Override
	public void verPerfil(int p) throws PersistentException {
		UI.getCurrent().getNavigator().addView("perfilPersona", new AdministradorClase(new PerfilUsuarioRegAdmin(p)));
		UI.getCurrent().getNavigator().navigateTo("perfilPersona");
	}


	public void anadirAmigo() {
		throw new UnsupportedOperationException();
	}

	public void eliminarAmigo() {
		throw new UnsupportedOperationException();
	}
}