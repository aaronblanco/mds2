package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;



public class TemaVistaModerador extends Tema_UR {
	public Lista_Tema_V_Moderador _unnamed_Lista_Tema_V_Moderador_;
	public Lista_Mensaje_V_Moderador _unnamed_Lista_Mensaje_V_Moderador_;

	public TemaVistaModerador(Tema it) throws PersistentException {
		super(it);
		this._titulo.addClickListener(new Button.ClickListener() {

            @Override
            public void buttonClick(ClickEvent event) {
                // TODO Auto-generated method stub
                
            	try {
					UI.getCurrent().getNavigator().addView(_nombreSeccion + "Mod/" + _titulo.getCaption(), new ModeradorClase(new Lista_Mensaje_V_Moderador(it.getIdTema())));
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				UI.getCurrent().getNavigator().navigateTo(_nombreSeccion+ "Mod/" + _titulo.getCaption());
            	
            	
            }

        });
		cambiarAcc.setVisible(true);
	}
	
	public void cambiarAccesibilidad(Tipo aTipoNuevo) {
		throw new UnsupportedOperationException();
	}
}