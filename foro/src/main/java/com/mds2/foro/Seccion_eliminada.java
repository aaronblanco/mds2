package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Seccion_eliminada extends Seccion_oculta {
	public Lista_Seccion_V_administrador _unnamed_Lista_Seccion_V_administrador_;
	
	public Seccion_eliminada(Seccion s) throws PersistentException {
		super(s);
		_nombreSeccion.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
			
				try {
					UI.getCurrent().getNavigator().addView(_nombreSeccion.getCaption() +"Adm", new AdministradorClase(new Lista_Tema_V_Administrador(s.getIdSeccion())));
					UI.getCurrent().getNavigator().navigateTo(_nombreSeccion.getCaption()+"Adm");
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
	
}