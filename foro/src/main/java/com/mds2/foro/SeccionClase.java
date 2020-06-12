 package com.mds2.foro;


import org.apache.log4j.xml.UnrecognizedElementHandler;
import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;


public class SeccionClase extends Seccion_ventana implements View {
	protected Button _nombreSeccion;
	private String _imagenSeccion;
	private Listener _listaSeccion;
	public Lista_Seccion _secciones;
	public Lista_Tema _temas;
	private String subtitulo;
	private String usrCreador;
	private String fechaCreacion;
	private int numMsg;
	iUsuario_no_registrado iUsrNR  = new DB_Main();

	public SeccionClase() throws PersistentException {
		
	
		
		Inicializar();
	
		
		
	}
	
	public SeccionClase(Seccion s) throws PersistentException {
		
		Inicializar();
		if( s != null)  {
			this._nombreSeccion = irSeccion;
			this._nombreSeccion.setCaption(s.getTitulo());
			this.fechaCreacion = String.valueOf(s.getFecha());
			this.usrCreador = s.getCreador();
			this.fechaCreacionSeccion.setCaption(fechaCreacion);
			this.userCreadorSeccion.setCaption(usrCreador);
		
		/*this._nombreSeccion = irSeccion.getCaption();
		this._imagenSeccion = imgSeccion;
		this.subtitulo = subtitleSection.toString();
		this.usrCreador = userCreadorSeccion.toString();
		this.fechaCreacion = fechaCreacionSeccion.toString();
		this.numMsg = numMsgSection.toString();
		*/
			_nombreSeccion.addClickListener(new Button.ClickListener() {
			
				@Override
				public void buttonClick(ClickEvent event) {
					// TODO Auto-generated method stub
				
					try {
				
			
					
						UI.getCurrent().getNavigator().addView(_nombreSeccion.getCaption() , new Usuario_no_registrado(new Lista_Tema(s.getIdSeccion())));
						UI.getCurrent().getNavigator().navigateTo(_nombreSeccion.getCaption());
					} catch (PersistentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
		
		}
		
	}
	
	private void Inicializar() {
		// TODO Auto-generated method stub
		statusTema.setVisible(false);
		eliminarSeccion.setVisible(false);
		this._nombreSeccion = irSeccion;
	}
	
		
	
}
