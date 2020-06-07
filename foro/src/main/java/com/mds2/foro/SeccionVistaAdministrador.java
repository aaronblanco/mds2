package com.mds2.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

//import Package.Lista_Seccion_V_administrador;
//import Package.Lista_Tema_V_Administrador;

public class SeccionVistaAdministrador extends SeccionVistaModerador {
//	private Button _eliminarSeccion;
//	private Listener _listaSeccionAdmin;
	public Lista_Seccion_V_administrador _unnamed_Lista_Seccion_V_administrador_;
	public Lista_Tema_V_Administrador _unnamed_Lista_Tema_V_Administrador_;
	iAdministrador iAdmin  = new DB_Main();

	public SeccionVistaAdministrador() {
		super();
		eliminarSeccion.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				eliminarSeccion();
			}
			
		});
		
	}
	
	private void Inicializar() {
		eliminarSeccion.setVisible(true);

	}
	public void eliminarSeccion() {
//		COSAS DEL ID DE LAS COSAS
		//iAdmin.eliminarSeccion(this.id);
	}
}