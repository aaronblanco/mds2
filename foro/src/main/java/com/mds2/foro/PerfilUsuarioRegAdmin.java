package com.mds2.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

//import DCLv3.PerfilUsuarioRegGenerico;

public class PerfilUsuarioRegAdmin extends PerfilUsuarioRegGenerico {

//	private Listener _listaUsuarioAmonestadoAdmin;
	public Lista_Usuario_Amonestado_V_Administrador _unnamed_Lista_Usuario_Amonestado_V_Administrador_;
	public Lista_Usuario_Amonestado _usuario_amonestado;
	iAdministrador iAd = new DB_Main();
	
	public PerfilUsuarioRegAdmin() {
		
		
		super();
		
		this._sancionarUsuario.setVisible(true);
		this._quitarSancion.setVisible(true);
		this._degradarAUsuarioRegistrado.setVisible(true);
		this._promocionarAModerador.setVisible(true);
		
		
		_sancionarUsuario.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
		
				sancionarUsuario();
			}
			
		});
		
		_quitarSancion.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				quitarSancion();
			}
			
		});
		
		
		_promocionarAModerador.addClickListener(new Button.ClickListener() {
					
					@Override
					public void buttonClick(ClickEvent event) {
						// TODO Auto-generated method stub
						promocionarAMod();
					}
					
				});
			
		_degradarAUsuarioRegistrado.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				degradarAUsuarioRegistrado();
			}
			
		});
		
		
	
		
	}
	
	
	public void sancionarUsuario() {
		iAd.sancionarUsuario(aIdUsuario);
	}

	public void quitarSancion() {
		iAd.quitarSancion(aIdUsuario);
	}

	public void promocionarAMod() {
		iAd.promocionarAMod(aIdUsuario);
	}

	public void degradarAUsuarioRegistrado() {
		iAd.degradarAUsuarioRegistrado(aIdUsuario);
	}
}