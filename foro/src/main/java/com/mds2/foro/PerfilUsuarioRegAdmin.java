package com.mds2.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

//import DCLv3.PerfilUsuarioRegGenerico;

public class PerfilUsuarioRegAdmin extends PerfilUsuarioRegGenerico {
//	private Button _sancionarUsuario;
//	private Button _quitarSancion;
//	private Button _promocionarAModerador;
//	private Button _degradarAUsuarioRegistrado;
//	private Listener _listaUsuarioAmonestadoAdmin;
	public Lista_Usuario_Amonestado_V_Administrador _unnamed_Lista_Usuario_Amonestado_V_Administrador_;
	public Lista_Usuario_Amonestado _usuario_amonestado;

	public PerfilUsuarioRegAdmin() {
		
		interaccionarModeracionAdmin.setVisible(true);
		
		interaccionarSancionAdmin.setVisible(true);
		
		interaccionarModeracionAdmin.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
			//	navigator.navigateTo("crearSeccion");
				UI.getCurrent().getNavigator().navigateTo("eliminarSeccion");
			}
			
		});
		
		interaccionarSancionAdmin.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
			//	navigator.navigateTo("crearSeccion");
				UI.getCurrent().getNavigator().navigateTo("eliminarSeccion");
			}
			
		});
		
	}
	
	
	public void sancionarUsuario() {
		throw new UnsupportedOperationException();
	}

	public void quitarSancion() {
		throw new UnsupportedOperationException();
	}

	public void promocionarAMod() {
		throw new UnsupportedOperationException();
	}

	public void degradarAUsuarioRegistrado() {
		throw new UnsupportedOperationException();
	}
}