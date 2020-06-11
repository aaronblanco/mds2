package com.mds2.foro;

//import DCLv3.SeccionVistaUR;
import java.util.Vector;
//import Package.Tema_privado;
//import Package.Crear_tema;
//import Package.Tema_UR;
//import DCLv3.CreacionTema;

import org.orm.PersistentException;

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
	
	public Lista_Tema_V_Usuario_Reg(int idSeccion) throws NumberFormatException, PersistentException {
		super(idSeccion);
	
		
		Inicializar();
		
		crearTemaB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				crearTema(idSeccion, Sesion.getIDSESION());
			}
		});	
		
		
		
		_list_Tema_privado = (Vector<Tema_privado>) iUsrNR.cargarTemasUNR(idSeccion, false, true, false, false);
		
		for(Object it: _list_Tema_privado)
			listaTemas.addComponent((Component) it);
		
		
		
		
	}
	
	private void Inicializar() {
		crearTemaB.setVisible(true);

	}
	
	public static void crearTema(int idSeccion, int idCreadorTema) {
		UI.getCurrent().getNavigator().addView("crearTema", new Usuario_registrado(new CreacionTema( idSeccion, idCreadorTema)));
		UI.getCurrent().getNavigator().navigateTo("crearTema");
	}
}