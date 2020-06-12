package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

//import DCLv3.Tema_vista_Admin;

public class Tema_eliminado extends Tema_oculto {
	//private Listener _listaTemaAdmin;
	public Lista_Tema_V_Administrador _unnamed_Lista_Tema_V_Administrador_;
	
	public Tema_eliminado(Tema it) throws PersistentException {
		
		super(it);
		this._titulo.addClickListener(new Button.ClickListener() {

            @Override
            public void buttonClick(ClickEvent event) {
                // TODO Auto-generated method stub
                
            	try {
					UI.getCurrent().getNavigator().addView(_nombreSeccion + "Adm/" + _titulo.getCaption(), new AdministradorClase(new Lista_Mensaje_V_Administrador(it.getIdTema())));
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				UI.getCurrent().getNavigator().navigateTo(_nombreSeccion+ "Adm/" + _titulo.getCaption());
            	
            	
            }

        });
	}
	
}