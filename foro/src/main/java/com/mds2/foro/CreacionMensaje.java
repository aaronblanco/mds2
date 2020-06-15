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
	private int _idTema;
	public Lista_Mensaje_V_Usuario_Reg _Lista_Mensaje_V_Usuario_Reg_;
	iUsuario iUsr = new DB_Main();
	
	public CreacionMensaje(int idTema) throws PersistentException{
		Tema t = com.mds2.foro.TemaDAO.getTemaByORMID(idTema);
		this._idTema = idTema;
		this.tituloTema.setValue(t.getTitulo());
		this.subtitulo.setValue(t.getDescripcion());
		this.fechaCreacion.setValue(String.valueOf(t.getFecha()));
		this._enviar = crearMensaje;
		this._cuerpo = textoTema;
		_enviar.addClickListener(new Button.ClickListener() {
			
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					Tema t = com.mds2.foro.TemaDAO.getTemaByORMID(idTema);
					Seccion s = t.getSeccion_tema();
					enviar(idTema);
					
					
					if(Sesion.getADMINISTRADOR()) {
						UI.getCurrent().getNavigator().addView(s.getTitulo()+"Adm/"+t.getTitulo(), new AdministradorClase(new Lista_Mensaje_V_Administrador(t.getIdTema())));
						UI.getCurrent().getNavigator().navigateTo(s.getTitulo()+"Adm/"+t.getTitulo());
					}	
					else if(Sesion.getMODERADOR()) {
						UI.getCurrent().getNavigator().addView(s.getTitulo()+"Mod/"+t.getTitulo(), new ModeradorClase(new Lista_Mensaje_V_Moderador(t.getIdTema())));
						UI.getCurrent().getNavigator().navigateTo(s.getTitulo()+"Mod/"+t.getTitulo());
					}
					else {
						UI.getCurrent().getNavigator().addView(s.getTitulo()+"Usr/"+t.getTitulo(), new Usuario_registrado(new Lista_Mensaje_V_Usuario_Reg(t.getIdTema())));
						UI.getCurrent().getNavigator().navigateTo(s.getTitulo()+"Usr/"+t.getTitulo());
					
					}
				

					
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
				try {
					cancelar();				
				}catch(Exception e) {
					e.printStackTrace();
				}
				
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
	

	public void adjuntarImagen() {
	}

	public void enviar(int idTema) throws PersistentException {
		iUsr.crearMensaje(_cuerpo.getValue(), " que pasa tu", Sesion.getIDSESION(), idTema);
	}
	
	public void cancelar() throws PersistentException {
		Tema t = com.mds2.foro.TemaDAO.getTemaByORMID(_idTema);
		Seccion s = t.getSeccion_tema();
		if(Sesion.getADMINISTRADOR()) {
			UI.getCurrent().getNavigator().addView(s.getTitulo()+"Adm/"+t.getTitulo(), new AdministradorClase(new Lista_Mensaje_V_Administrador(t.getIdTema())));
			UI.getCurrent().getNavigator().navigateTo(s.getTitulo()+"Adm/"+t.getTitulo());
		}	
		else if(Sesion.getMODERADOR()) {
			UI.getCurrent().getNavigator().addView(s.getTitulo()+"Mod/"+t.getTitulo(), new ModeradorClase(new Lista_Mensaje_V_Moderador(t.getIdTema())));
			UI.getCurrent().getNavigator().navigateTo(s.getTitulo()+"Mod/"+t.getTitulo());
		}
		else {
			UI.getCurrent().getNavigator().addView(s.getTitulo()+"Usr/"+t.getTitulo(), new Usuario_registrado(new Lista_Mensaje_V_Usuario_Reg(t.getIdTema())));
			UI.getCurrent().getNavigator().navigateTo(s.getTitulo()+"Usr/"+t.getTitulo());
		
		}
	}
}