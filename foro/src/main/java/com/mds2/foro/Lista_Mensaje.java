package com.mds2.foro;

import java.util.Vector;
//import Package.Buscador_mensaje;
//import Package.Mensaje;
import java.util.function.Consumer;

import com.vaadin.ui.*;
import com.vaadin.ui.Button.ClickEvent;

public class Lista_Mensaje extends Lista_Mensaje_ventana{
//	private Label _tituloTema;
//	private Label _subtituloDescripcion;
//	private Label _numTotalMensajes;
//	private Label _usuarioCreador;
//	private Label _fechaCreacion;
//	private Label _pagina;
	public TemaClase _Tema;
	//public Vector<Buscador_mensaje> _list_Buscador_mensaje = new Vector<Buscador_mensaje>();
	public Vector<MensajeClase> _list_Mensaje = new Vector<MensajeClase>();
	iUsuario_no_registrado iUsrNR = new DB_Main();
	
	
	public Lista_Mensaje() {
		
		Inicializar();
		
		volverTema.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("volverTema");
			}
			
		});	
		
		crearMensaje.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("crearMensaje");
			}
		});	
		
		buscadorBoton.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				buscarMensaje();
			}
		});	
		
		
		
		
		listaMensajeAdmin.addComponent((Component) iUsrNR.cargarMensajeUNR(Integer.parseInt(_Tema.getId()), true, false, false, false));
		//NO ESTOY NADA SEGURO DE SI ESTO TIENE SENTIDO VALE?
		listaMensajeAdmin.forEach((Consumer<? super Component>) iUsrNR.cargarRespuestas(1));
	}
	
	private void Inicializar() {
		// TODO Auto-generated method stub
		volverTema.setVisible(true);
		
		crearMensaje.setVisible(false);
		
		buscadorBoton.setVisible(true);
	}

	//LOS IDS
	public void buscarMensaje() {
		listaMensajeAdmin.addComponent((Component) iUsrNR.buscarMensaje(buscadorMensaje.toString(), 1));
	}
}