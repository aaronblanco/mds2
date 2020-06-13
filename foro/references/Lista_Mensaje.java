package com.mds2.foro;

import java.util.List;
import java.util.Vector;
//import Package.Buscador_mensaje;
//import Package.Mensaje;
import java.util.function.Consumer;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.server.Page;
import com.vaadin.ui.*;
import com.vaadin.ui.Button.ClickEvent;

public class Lista_Mensaje extends Lista_Mensaje_ventana implements View {
	private Label _tituloTema;
	private Label _subtituloDescripcion;
	private Label _numTotalMensajes;
	private Label _usuarioCreador;
	private Label _fechaCreacion;
	private Label _pagina;
	private Button _crearMensaje;
	protected Button _volverTema;
	public TemaClase _Tema;
	public Vector<MensajeClase> _list_Mensaje = new Vector<MensajeClase>();
	iUsuario_no_registrado iUsrNR = new DB_Main();
	
	
	public Lista_Mensaje(int idTema) throws PersistentException {
		
		this._subtituloDescripcion = subtitle;
		this._fechaCreacion = fechaCreacion;
		this._usuarioCreador = usuarioCreador;
		this._crearMensaje = crearMensaje;
		this._volverTema = volverTema;
		
		Tema te = com.mds2.foro.TemaDAO.getTemaByORMID(idTema);
		_Tema = new TemaClase(te);
		
		Inicializar();
		
		_volverTema.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
				UI.getCurrent().getNavigator().navigateTo(te.getSeccion_tema().getTitulo());
			}
			
		});	
		
		_crearMensaje.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					UI.getCurrent().getNavigator().addView("crearMensaje", new Usuario_registrado(new CreacionMensaje(idTema)));
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				UI.getCurrent().getNavigator().navigateTo("crearMensaje");
			}
		});	
		
		buscadorBoton.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					buscarMensaje(idTema);
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});	
		
		
		
		List<Mensaje> t = iUsrNR.cargarMensajeUNR(idTema, true, false);
		
		for(Mensaje it: t) {
			MensajeClase msj = new MensajeClase(it);
			listaMensajeAdmin.addComponent(msj);
		}

		
	}
	
	private void Inicializar() {
		// TODO Auto-generated method stub
		volverTema.setVisible(true);
		
		crearMensaje.setVisible(false);
		
		buscadorBoton.setVisible(true);
		
	}

	public void buscarMensaje(int aIdTema) throws PersistentException {
		
		List<Mensaje> mb = iUsrNR.buscarMensaje(buscadorMensaje.getValue(), aIdTema);
		
		if(!mb.isEmpty()) {
			listaMensajeAdmin.removeAllComponents();
			for(Mensaje m : mb) {
				MensajeClase mc = new MensajeClase(m);
				listaMensajeAdmin.addComponent(mc);
			}
		}
	}
}