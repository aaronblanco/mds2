package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.TextField;

//import Package.Lista_Seccion_V_Moderador;

public class CreacionSeccion extends Creacion_Seccion_ventana implements View {
	private TextField _tituloSeccion;
	private TextField _descipcionSeccion;
//	private Button _adjuntarImagen;
	private Button _enviar;
	private Button _cancelar;
	private String _imagenSeccionURL = "";
	public Lista_Seccion_V_Moderador _unnamed_Lista_Seccion_V_Moderador_;
	iModerador iMod = new DB_Main();
	
	public CreacionSeccion() {
		this._tituloSeccion = titulo;
		this._descipcionSeccion = descripcion;
		this._enviar = crearSeccionB;
		this._cancelar = cancelarSeccionB;
		
		
		_enviar.addClickListener(new Button.ClickListener() {
			
			
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					enviar();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});	
		
		_cancelar.addClickListener(new Button.ClickListener() {
			
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				cancelar();
			}
			
		});	
		
		
		
		
		
		//Esto es un upload, no un boton hay que ver como funciona
//		cargarImagenSeccionB.addClickListener(new Button.ClickListener() {
//			
//			//cancelar();
//			
//			@Override
//			public void buttonClick(ClickEvent event) {
//				// TODO Auto-generated method stub
//				UI.getCurrent().getNavigator().navigateTo("cancelarCreacionTema");
//			}
//			
//		});	
		
	}
	
	public void enviar() throws PersistentException {
		try {
		boolean hola = iMod.crearSeccion(_tituloSeccion.getValue(), _descipcionSeccion.getValue(), _imagenSeccionURL.toString(), 11);
		
		UI.getCurrent().getNavigator().navigateTo("Pagina principal");
		if(hola)
			System.out.println("bieeeeeeeeeeen");
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		}

	public void cancelar() {
		UI.getCurrent().getNavigator().navigateTo("listaSecciones");
	}

	public void adjuntarImagen() {
		throw new UnsupportedOperationException();
	}
}