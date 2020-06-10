 package com.mds2.foro;


import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;


public class SeccionClase extends Seccion_ventana implements View {
	private String _nombreSeccion;
	private String _imagenSeccion;
	private Listener _listaSeccion;
	public Lista_Seccion _secciones;
	public Lista_Tema _temas;
	private String subtitulo;
	private String usrCreador;
	private String fechaCreacion;
	private int numMsg;
	iUsuario_no_registrado iUsrNR  = new DB_Main();

	public SeccionClase() {
		
	
		
		Inicializar();
			
			irSeccion.addClickListener(new Button.ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {
					// TODO Auto-generated method stub
					UI.getCurrent().getNavigator().navigateTo("irSeccion");
				}
			});
			
			
		
	}
	
	public SeccionClase(Seccion s) {
		
		Inicializar();
		this._nombreSeccion = s.getTitulo();
		this.fechaCreacion = String.valueOf(s.getFecha());
		this.usrCreador = s.getCreador();
		//this._imagenSeccion = s.getImagenSeccion();
		//this.numMsg = s.contiene_temas.size();
		this.irSeccion.setCaption(_nombreSeccion);
		this.fechaCreacionSeccion.setCaption(fechaCreacion);
		this.userCreadorSeccion.setCaption(usrCreador);
		
		/*this._nombreSeccion = irSeccion.getCaption();
		this._imagenSeccion = imgSeccion;
		this.subtitulo = subtitleSection.toString();
		this.usrCreador = userCreadorSeccion.toString();
		this.fechaCreacion = fechaCreacionSeccion.toString();
		this.numMsg = numMsgSection.toString();
		*/
		
		
		//etc
	}
	
	private void Inicializar() {
		// TODO Auto-generated method stub
		statusTema.setVisible(false);
		eliminarSeccion.setVisible(false);
	}

}
