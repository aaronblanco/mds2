package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.RichTextArea;
import com.vaadin.ui.TextField;


public class CreacionMensaje extends Creacion_Mensaje_ventana implements View{
	private Button _color;
	private Button _fuente;
	private Button _adjuntarImagen;
	private RichTextArea _cuerpo;
	private Button _enviar;
	public Lista_Mensaje_V_Usuario_Reg _Lista_Mensaje_V_Usuario_Reg_;
	iUsuario iUsr = new DB_Main();
	
	public CreacionMensaje(int idTema) throws PersistentException{
		Tema t = com.mds2.foro.TemaDAO.getTemaByORMID(idTema);
		
		this.tituloTema.setValue(t.getTitulo());
		this.subtitulo.setValue(t.getDescripcion());
		this.fechaCreacion.setValue(String.valueOf(t.getFecha()));
		this._enviar = crearMensaje;
		this._cuerpo = textoTema;
		_enviar.addClickListener(new Button.ClickListener() {
			
			Tema t = com.mds2.foro.TemaDAO.getTemaByORMID(idTema);
			Seccion s = t.getSeccion_tema();
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					enviar(idTema);
					
					
					
					UI.getCurrent().getNavigator().addView(s.getTitulo()+"Usr/"+t.getTitulo(), new Usuario_registrado(new Lista_Mensaje(t.getIdTema())));
					UI.getCurrent().getNavigator().navigateTo(s.getTitulo()+"Usr/"+t.getTitulo());
					

					
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});	
		
		cancelarCreacionMsg.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				cancelar();
			}
			
		});
		
		adjuntarMediaMsg.addClickListener(new Button.ClickListener() {
						
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				adjuntarImagen();
			}
		});	
	}
	
	public void color() {
		throw new UnsupportedOperationException();
	}

	public void fuente() {
		throw new UnsupportedOperationException();
	}

	public void adjuntarImagen() {
	}

	public void enviar(int idTema) throws PersistentException {
		iUsr.crearMensaje(_cuerpo.getValue(), " que pasa tu", Sesion.getIDSESION(), idTema);
	}
	
	public void cancelar() {
		UI.getCurrent().getNavigator().navigateTo("cancelarCreacionTema");
	}
}