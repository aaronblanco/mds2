package com.mds2.foro;

import java.util.Vector;
//import Package.Cambiar_accesibilidad;
//import Package.Crear_sección;
//import Package.Sección_oculta;
//import DCLv3.SeccionVistaModerador;
//import DCLv3.CreacionSeccion;

import org.orm.PersistentException;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Component;

public class Lista_Seccion_V_Moderador extends Lista_Seccion_V_Usuario_Reg {
	private Button _crearSeccion;
	public ModeradorClase _unnamed_Moderador_;
	//public Vector<Cambiar_accesibilidad> _list_Cambiar_accesibilidad = new Vector<Cambiar_accesibilidad>();
	//public Vector<Crear_sección> _list_Crear_sección = new Vector<Crear_sección>();
	public Vector<Seccion_oculta> _list_Seccion_oculta = new Vector<Seccion_oculta>();
	public SeccionVistaModerador _unnamed_SeccionVistaModerador_;
	public CreacionSeccion _unnamed_CreacionSeccion_;
	iModerador iMod = new DB_Main();

	
	public Lista_Seccion_V_Moderador() throws PersistentException {
		
		super();
		
		Inicializar();
		

		_list_Seccion_oculta =(Vector<Seccion_oculta>) iUsrNR.cargarListaSecciones(false, false, true, false);
		
//		for(Object it : _list_Seccion_oculta) {
//			listaSeccion.addComponent((Component) it);
//		}
		//listaSeccion.addComponent((Component) _list_Seccion_oculta);
		
		
		
		_crearSeccion.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				crearSeccion();
			}
			
		});
		
	}
	
	private void Inicializar(){
		crearNuevaSeccion.setVisible(true);
		buscarSeccionB.setVisible(true);
		this._crearSeccion = crearNuevaSeccion;
		//listaSeccion.addComponent( (Component) _list_Seccion_oculta);
		
	}
	public void crearSeccion() {
		UI.getCurrent().getNavigator().navigateTo("crearSeccion");
	}
}