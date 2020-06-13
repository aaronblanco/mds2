package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class VerPerfilGenerico  extends VerPerfilGenerico_ventana implements View{
	private Button _verPerfilUsuairo;
	public ME_UsuarioReg _unnamed_ME_UsuarioReg_;

	
	public VerPerfilGenerico() {
		
		this._verPerfilUsuairo = irPerfil;
		
	}
	
	
	public VerPerfilGenerico(Usuarios p) {
		// TODO Auto-generated constructor stub
		
		this._verPerfilUsuairo = irPerfil;
		this._verPerfilUsuairo.setCaption(p.getNombreUsuario());
		
		this.aceptarSolicitud.setVisible(false);
		this.rechazarSolicitud.setVisible(false);
		this.interactuarUsuario.setVisible(false);
		
		
		_verPerfilUsuairo.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
				try {
					verPerfil(p.getIdUsuario());
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			
		
			
		});	
		
	}


	public void verPerfil(int p) throws PersistentException {
		UI.getCurrent().getNavigator().addView("perfilPersona", new AdministradorClase(new PerfilUsuarioRegAdmin(p)));
		UI.getCurrent().getNavigator().navigateTo("perfilPersona");
	}
}
