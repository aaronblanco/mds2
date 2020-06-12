package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

//import DCLv3.TemaVistaModerador;

public class Tema_oculto extends Tema_UR {
//	private Listener _listaTemaMod;
	public Lista_Tema_V_Moderador _unnamed_Lista_Tema_V_Moderador_;
	
	public Tema_oculto(Tema it) throws PersistentException {
		super(it);
		
		this._titulo.addClickListener(new Button.ClickListener() {
			
            @Override
            public void buttonClick(ClickEvent event) {
                // TODO Auto-generated method stub
                if(Sesion.getADMINISTRADOR()) {
                	try {
    					UI.getCurrent().getNavigator().addView(_nombreSeccion + "Adm/" + _titulo.getCaption(), new AdministradorClase(new Lista_Mensaje_V_Administrador(it.getIdTema())));
    				} catch (PersistentException e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
    				UI.getCurrent().getNavigator().navigateTo(_nombreSeccion+ "Adm/" + _titulo.getCaption());
                }else {
                	try {
    					UI.getCurrent().getNavigator().addView(_nombreSeccion + "Mod/" + _titulo.getCaption(), new ModeradorClase(new Lista_Mensaje_V_Moderador(it.getIdTema())));
    				} catch (PersistentException e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
    				UI.getCurrent().getNavigator().navigateTo(_nombreSeccion+ "Mod/" + _titulo.getCaption());
                }
            	
            	
            	
            }

        });
	}
	
}