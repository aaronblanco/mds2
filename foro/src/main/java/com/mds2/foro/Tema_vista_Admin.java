package com.mds2.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

//import Package.Lista_Tema_V_Administrador;

public class Tema_vista_Admin extends TemaVistaModerador {
//	private Button _eliminarTema;
//	private Button _cerrarTema;
//	private Listener _listaTemaAdmin;
	public Lista_Tema_V_Administrador _unnamed_Lista_Tema_V_Administrador_;
	public Lista_Mensaje_V_Administrador _unnamed_Lista_Mensaje_V_Administrador_;

	public Tema_vista_Admin() {
		super();
		
		notificarAdmin.setVisible(false);
		
		cerrarTema.setVisible(true);
		
		eliminarTema.setVisible(true);
		
	}
	
	
	
	public void eliminarTema() {
		throw new UnsupportedOperationException();
	}

	public void cerrarTema() {
		throw new UnsupportedOperationException();
	}
}