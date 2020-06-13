package com.mds2.foro;

import java.util.List;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

public class PanelAdministracionGenerico extends PanelAdministracionGenerico_ventana implements View{

	iUsuario iUsr = new DB_Main();
	public PanelAdministracionGenerico() {
		
		buscador.setVisible(true);
		
		configPubliAdmin.setVisible(false);
		
		modNumUM.setVisible(false);
		
		buscador.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					buscarUsuario(txtBuscador.getValue());
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});	
	}
	public void buscarUsuario(String aKeyword) throws PersistentException {
		List<Usuarios> lista = iUsr.buscarUsuario(aKeyword);
		for(Usuarios u : lista) {
			PerfilUsuarioRegMod ur = new PerfilUsuarioRegMod(u.getIdUsuario());
			panelLayout.addComponent(ur);
		}
	}
}