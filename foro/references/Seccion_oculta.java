package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;


public class Seccion_oculta extends SeccionVistaModerador {
	public Lista_Seccion_V_Moderador _unnamed_Lista_Seccion_V_Moderador_;
	
	public Seccion_oculta(Seccion s) throws PersistentException {
		super(s);
		_nombreSeccion.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
			
				try {
					UI.getCurrent().getNavigator().addView(_nombreSeccion.getCaption() +"Mod", new ModeradorClase(new Lista_Tema_V_Moderador(s.getIdSeccion())));
					UI.getCurrent().getNavigator().navigateTo(_nombreSeccion.getCaption()+"Mod");
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
}