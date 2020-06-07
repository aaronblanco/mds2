package com.mds2.foro;

//import DCLv3.SeccionVistaUR;
import java.util.Vector;
//import Package.Tema_privado;
//import Package.Crear_tema;
//import Package.Tema_UR;
//import DCLv3.CreacionTema;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Component;

public class Lista_Tema_V_Usuario_Reg extends Lista_Tema {
//	private Button _crearTema;
	public Usuario_registrado _usuario_registrado;
	public SeccionVistaUR _unnamed_SeccionVistaUR_;
	public Vector<Tema_privado> _list_Tema_privado = new Vector<Tema_privado>();
	//public Vector<Crear_tema> _list_Crear_tema = new Vector<Crear_tema>();
	public Vector<Tema_UR> _list_Tema_UR = new Vector<Tema_UR>();
	public CreacionTema _unnamed_CreacionTema_;

	iUsuario_no_registrado iUsrNR  = new DB_Main();
	
	public Lista_Tema_V_Usuario_Reg() {
		
		super();
		
		Inicializar();
		
		crearTemaB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				crearTema();
			}
		});	
		
		
		listaTemas.addComponent((Component) iUsrNR.cargarTemasUNR(1, true, true, false, false));
		
		
	}
	
	private void Inicializar() {
		crearTemaB.setVisible(true);

	}
	
	public void crearTema() {
		UI.getCurrent().getNavigator().navigateTo("crearTemaB");
	}
}