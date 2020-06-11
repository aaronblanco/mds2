package com.mds2.foro;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.TextField;


public class CreacionMensaje extends Creacion_Mensaje_ventana implements View{
	private Button _color;
	private Button _fuente;
	private Button _adjuntarImagen;
	private TextField _cuerpo;
	private Button _enviar;
	public Lista_Mensaje_V_Usuario_Reg _Lista_Mensaje_V_Usuario_Reg_;
	iUsuario iUsr = new DB_Main();
	
	public CreacionMensaje(){
		
		crearMensaje.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				enviar();
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
			
			//cancelar();
			
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
//??????????????????
	}

	public void enviar() {
		iUsr.crearMensaje(_cuerpo, null, Sesion.getIDSESION(), aIdTema);
	}
	
	public void cancelar() {
		UI.getCurrent().getNavigator().navigateTo("cancelarCreacionTema");
	}
}