package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;

//import DCLv3.Tipo;

public class TemaClase extends Tema_ventana implements View{
	private Button _titulo;
	private long _fechaCreacion;
	private String _creador;
	private int _meGustas;
	private String _numMensajes;
	public Lista_Tema _Lista_Tema;
	public Lista_Mensaje _mensajes;
	private long _fechaCreacionSeccion;
	private String _userCreadorSeccion;
	private String _nombreSeccion;
	private int _idTema;
	
	public TemaClase() {
		
		Inicializar();
		

			
		}
	
	
	
	
	public TemaClase(Tema s) throws PersistentException {
		
		Inicializar();
		irTema.setCaption(s.getTitulo());
		this._titulo = irTema;
		//this._titulo.setCaption(s.getTitulo());
		
		this._fechaCreacion = s.getFecha();
		this._creador = s.getUsuarios().getNombreUsuario();
		
		
		this._fechaCreacionSeccion = s.getSeccion_tema().getFecha();
		this._userCreadorSeccion = s.getSeccion_tema().getCreador();
		this._nombreSeccion = s.getSeccion_tema().getTitulo();
		this._idTema = s.getIdTema();

        this._titulo.addStyleName("link");
        this._titulo.addClickListener(new Button.ClickListener() {

            @Override
            public void buttonClick(ClickEvent event) {
                // TODO Auto-generated method stub
                
            	try {
					UI.getCurrent().getNavigator().addView(_nombreSeccion + "/" + _titulo.getCaption() , new Usuario_no_registrado(new Lista_Mensaje(_idTema)));
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				UI.getCurrent().getNavigator().navigateTo(_nombreSeccion+ "/" + _titulo.getCaption());
            	
            	
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