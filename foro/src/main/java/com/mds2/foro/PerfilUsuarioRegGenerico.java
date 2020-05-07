package com.mds2.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

//import Package.Lista_Ultimo_mensaje;

public class PerfilUsuarioRegGenerico extends PerfilUsuarioRegGenerico_ventana{
//	private TextField _nombre;
//	private TextField _descripcion;
//	private Image _foto;
//	private TextField _ultimosMsg;
//	private Button _anadirAmigo;
//	private Button _eliminarAmigo;
//	private TextField _estado;
	public Lista_Ultimo_mensaje _unnamed_Lista_Ultimo_mensaje_;
	
	public PerfilUsuarioRegGenerico() {
		
		interaccionarAmigoUsuario.setVisible(true);
		
		interaccionarModeracionAdmin.setVisible(false);
		
		interaccionarSancionAdmin.setVisible(false);
		
		interaccionarAmigoUsuario.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
			//	navigator.navigateTo("crearSeccion");
				UI.getCurrent().getNavigator().navigateTo("interaccionarAmigoUsuario");
			}
			
		});
		
	}
	
	public void anadirAmigo() {
		throw new UnsupportedOperationException();
	}

	public void eliminarAmigo() {
		throw new UnsupportedOperationException();
	}
}