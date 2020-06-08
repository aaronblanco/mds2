package com.mds2.foro;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;

//import DCLv3.Tipo;

public class TemaClase extends Tema_ventana implements View{
//	private Tipo _tipo = DCLv3.Tipo.Publico;
	private String _titulo;
	private Label _fechaCreacion;
	private Label _creador;
	private Label _meGustas;
	private Label _numMensajes;
//	private Listener _listaTema;
	public Lista_Tema _Lista_Tema;
	public Lista_Mensaje _mensajes;
	
	public TemaClase() {
		
		Inicializar();
		
		this._titulo = irTema.getCaption();
		this._fechaCreacion = fechaCreacTema;
		this._creador = creadorTema;
		this._meGustas = numMGTema;
		this._numMensajes = numMsgTema;
		
		
			irTema.addClickListener(new Button.ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {
					// TODO Auto-generated method stub
					UI.getCurrent().getNavigator().navigateTo("irTema");
				}
			});	
			
		}

	private void Inicializar() {
		// TODO Auto-generated method stub
		cerrarTema.setVisible(false);
		
		darMG.setVisible(false);
		
		notificarAdmin.setVisible(false);
		
		cambiarAcc.setVisible(false);
		
		eliminarTema.setVisible(false);
	}
	
	
}