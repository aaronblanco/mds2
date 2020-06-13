package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.navigator.View;


public class Panel_de_administración_vista_moderador extends PanelAdministracionGenerico {
	public Menu_moderador _unnamed_Menu_moderador_;
	public Lista_Usuario_Amonestado _usuario_amonestado;
	
	public Panel_de_administración_vista_moderador() throws PersistentException {
		super();
		
		panelLayout.addComponent(new Lista_Usuario_Amonestado());
	}
	
}