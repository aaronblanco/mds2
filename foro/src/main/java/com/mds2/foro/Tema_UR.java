package com.mds2.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Tema_UR extends Tema {
	//private Button _darMeGusta;
	private boolean _meGusta;
	//private Label _estado;
//	private Listener _listaTemaUsuarioReg;
//	private Button _notificarAdministrador;
	public Lista_Tema_V_Usuario_Reg _unnamed_Lista_Tema_V_Usuario_Reg_;
	//public Interactuar_tema _interactuar_tema;
	public Lista_Mensaje_V_Usuario_Reg _unnamed_Lista_Mensaje_V_Usuario_Reg_;

	
	
	public Tema_UR() {
		
		
		crearTema.setVisible(true);

		
		
		
		crearTema.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
			
				UI.getCurrent().getNavigator().navigateTo("crearTema");
			}
			
	
			
			
		});
	}
	
	
	
	
	
	
	
	
	
	public void darMeGusta() {
		throw new UnsupportedOperationException();
	}

	public void notificarAdministrador() {
		throw new UnsupportedOperationException();
	}
}