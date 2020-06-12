package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;


public class SeccionVistaUR extends SeccionClase {
	//private Listener _listaSeccionUsuarioReg;
	public Lista_Seccion_V_Usuario_Reg _unnamed_Lista_Seccion_V_Usuario_Reg_;
	public Lista_Tema_V_Usuario_Reg _unnamed_Lista_Tema_V_Usuario_Reg_;
	
	public SeccionVistaUR() throws PersistentException {
		super();
	}
	
	public SeccionVistaUR(Seccion s) throws PersistentException {
		super(s);
		_nombreSeccion.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
			
				try {
					UI.getCurrent().getNavigator().addView(_nombreSeccion.getCaption() , new Usuario_registrado(new Lista_Tema_V_Usuario_Reg(s.getIdSeccion())));
					UI.getCurrent().getNavigator().navigateTo(_nombreSeccion.getCaption());
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
	
}