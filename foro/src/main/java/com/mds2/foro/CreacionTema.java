package com.mds2.foro;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.TextField;

//import Package.Lista_Tema_V_Usuario_Reg;

public class CreacionTema extends Creacion_tema_ventana implements View {
	private TextField _tituloTema;
	private TextField _subtituloTema;
	private Button _enviar;
	private Button _cancelar;
	public Lista_Tema_V_Usuario_Reg _unnamed_Lista_Tema_V_Usuario_Reg_;
	iUsuario iUsr = new DB_Main();
	
	
	public CreacionTema() {
		
		this._enviar = crearTema;
		this._cancelar = cancelarCreacionTema;
		this._tituloTema = titulo;
		this._subtituloTema = subtitulo;
		
		
		_enviar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				enviar();
			}
			
		});	
		
		_cancelar.addClickListener(new Button.ClickListener() {
			
			//cancelar();
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				cancelar();
			}
			
		});	
		
		
	}
	
	//LA DESCRIPCION NO EXISTE EN VD 
	public void enviar() {
		iUsr.crearTema(_tituloTema, _subtituloTema,  aIdSeccionPropietaria, aIdTemaPropietario);
	}

	public void cancelar() {
		UI.getCurrent().getNavigator().navigateTo("cancelarCreacionTema");
	}
}