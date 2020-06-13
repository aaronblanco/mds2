package com.mds2.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;

public class NotificacionClase extends VerPerfilGenerico{
	private Button _eliminarNotificacion;
	private Label _titulo;
	private TextField _descripcion;
//	private Listener _listaNotificacion;
	public Lista_Notificación _unnamed_Lista_Notificación_;

	public NotificacionClase(Notificacion n) {
		// TODO Auto-generated constructor stub
		this._descripcion.setValue(n.getDescripcionCampo());
		this._titulo.setValue(n.getTitulo());
		
		aceptarSolicitud.setVisible(true);
		this._eliminarNotificacion = rechazarSolicitud;
		
		
	}

	public void eliminarNotificacion() {
		throw new UnsupportedOperationException();
	}
}