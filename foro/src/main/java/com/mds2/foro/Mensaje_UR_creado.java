package com.mds2.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

//ESTO ANTES HEREDABA DE MENSAJECLASE PERO ENTONCES NO TIENE LOS METODOS DE MENSAJE_UR Y ESO ESTA FEISIMO
public class Mensaje_UR_creado extends Mensaje_UR {
	private Button _eliminarMensaje;
//	private Listener _listaMsgCreado;
	public Lista_Mensaje_creado _unnamed_Lista_Mensaje_creado_;
	public Usuario_creador_de_mensaje _unnamed_Usuario_creador_de_mensaje_;
	iUsuario_creador_de_mensaje iUsr = new DB_Main();
	
	public Mensaje_UR_creado() {
		super();
		
		eliminarMensaje.setVisible(true);
		
		_eliminarMensaje = eliminarMensaje;
		_eliminarMensaje.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				eliminarMensaje();
			}
		});	
	}
	
	public void eliminarMensaje() {
		iUsr.eliminarMensajePropio(aIdMensaje);
	}
}