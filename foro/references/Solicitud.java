package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;


public class Solicitud extends VerPerfilGenerico {
	private Button _aceptarSolicitud;
    private Button _rechazarSolicitud;
	public Lista_Solicitud _unnamed_Lista_Solicitud_;
	iUsuario iUsr = new DB_Main();
	private int idS;
	
	
	public Solicitud(int idUs) {
		this.idS = idUs;
		this._aceptarSolicitud = aceptarSolicitud;
		this._rechazarSolicitud = rechazarSolicitud;
		
		
		
		_aceptarSolicitud.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
				try {
					aceptarSolicitud();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			
		
			
		});	
		
		
		
		_rechazarSolicitud.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
				try {
					rechazarSolicitud();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			
		
			
		});	
		
		
	}
	
	public Solicitud(Notificacion n, int idUs) {
		// TODO Auto-generated constructor stub
		this.idS = idUs;
		this._aceptarSolicitud = aceptarSolicitud;
		this._rechazarSolicitud = rechazarSolicitud;
		
		
		
		_aceptarSolicitud.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
				try {
					aceptarSolicitud();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			
		
			
		});	
		
		
		
		_rechazarSolicitud.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
				try {
					rechazarSolicitud();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			
		
			
		});	
		
	}

	public void aceptarSolicitud() throws PersistentException {
		iUsr.aceptarSolicitud(Sesion.getIDSESION(), idS);
	}

	public void rechazarSolicitud() throws PersistentException {
		iUsr.rechazarSolicitud(Sesion.getIDSESION(),idS);
	}
}