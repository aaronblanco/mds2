package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

//import Package.Mensaje_moderador;

public class Mensaje_Administrador extends Mensaje_moderador {
	private Button _eliminar;
	public Lista_Mensaje_V_Administrador _unnamed_Lista_Mensaje_V_Administrador_;
	iAdministrador iAd = new DB_Main();
	
	public Mensaje_Administrador(Mensaje m) {
		super(m);
		this._eliminar = eliminarMensaje;
		notificarAdminB.setVisible(false);
		eliminarMensaje.setVisible(true);


		
		_eliminar.addClickListener(new Button.ClickListener() {
			
			//cancelar();
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					eliminar(idM);
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});	
		
		
		
		
	}
	
	public void eliminar(int idMe) throws PersistentException {
		iAd.eliminarMensajeAdmin(idMe);
	}
}
