package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Tema_privado extends Tema_UR {
//	private Listener _listaTemaUsuarioReg;
//	private Listener _listaTemaSeccionPriv;
	public Lista_Tema_V_Usuario_Reg _unnamed_Lista_Tema_V_Usuario_Reg_;
	public Lista_Tema_Seccion_Privada _unnamed_Lista_Tema_Seccion_Privada_;
	
	public Tema_privado(Tema it) throws PersistentException {
		super(it);
		
		this._titulo.addClickListener(new Button.ClickListener() {

            @Override
            public void buttonClick(ClickEvent event) {
                // TODO Auto-generated method stub
                
            	try {
					UI.getCurrent().getNavigator().addView(_nombreSeccion + "Usr/" + _titulo.getCaption(), new Usuario_registrado(new Lista_Mensaje_V_Usuario_Reg(it.getIdTema())));
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				UI.getCurrent().getNavigator().navigateTo(_nombreSeccion+ "Usr/" + _titulo.getCaption());
            	
            	
            }

        });
		
	}
	
}