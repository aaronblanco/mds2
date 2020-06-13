package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;


public class Seccion_privada extends SeccionVistaUR {
	public Lista_Seccion_V_Usuario_Reg _unnamed_Lista_Seccion_V_Usuario_Reg_;
	public Lista_Tema_Seccion_Privada _temas_seccion_privada;
	
	public Seccion_privada(Seccion s) throws PersistentException {
		super(s);
		_nombreSeccion.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
			
				try {
					UI.getCurrent().getNavigator().addView(_nombreSeccion.getCaption() +"Usr", new Usuario_registrado(new Lista_Tema_V_Usuario_Reg(s.getIdSeccion())));
					UI.getCurrent().getNavigator().navigateTo(_nombreSeccion.getCaption()+"Usr");
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
	}
	
}