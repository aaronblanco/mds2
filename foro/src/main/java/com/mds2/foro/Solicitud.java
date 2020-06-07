package com.mds2.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

//import DCLv3.VerPerfilGenerico;

public class Solicitud extends VerPerfilGenerico {
	private Button _aceptarSolicitud;
    private Button _rechazarSolicitud;
//	private Listener _listaSolicitud;
	public Lista_Solicitud _unnamed_Lista_Solicitud_;
	iUsuario iUsr = new DB_Main();
	
	public Solicitud() {
		
		this._aceptarSolicitud = aceptarSolicitud;
		this._rechazarSolicitud = rechazarSolicitud;
		
		
		
		_aceptarSolicitud.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
				aceptarSolicitud();

			}
			
		
			
		});	
		
		
		
		_rechazarSolicitud.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
				rechazarSolicitud();

			}
			
		
			
		});	
		
		
	}
	
	public void aceptarSolicitud() {
		iUsr.aceptarSolicitud(aIdUsuario, aIdAmigo);
	}

	public void rechazarSolicitud() {
		iUsr.rechazarSolicitud();
	}
}