package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class PerfilUsuarioRegMod extends PerfilUsuarioRegGenerico {
	private Button _amonestar;
	public UsuarioAmonestado _unnamed_UsuarioAmonestado_;
	iModerador iMod = new DB_Main();
	public PerfilUsuarioRegMod(int idU) {
		this._amonestar = _sancionarUsuario;
		_amonestar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					amonestar(idU);
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		_amonestar.setVisible(true);

		
	}
	
	public void amonestar(int idUs) throws PersistentException {
		iMod.amonestarUsuario(idUs);
	}
}