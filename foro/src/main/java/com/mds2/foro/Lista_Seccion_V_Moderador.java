package com.mds2.foro;

import java.util.List;
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
		_crearSeccion = crearNuevaSeccion;
		Inicializar();
		
		_crearSeccion.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				crearSeccion();
			}
			
		});
		
		listaSeccion.removeAllComponents();
		if(Sesion.getIDSESION() > 0) {
			
			List<Seccion> su = iUsrNR.cargarListaSecciones(true, false, false, false);
			
			List<Seccion> sec = iUsrNR.cargarListaSecciones(false, true, false, false);
			
			List<Seccion> secM = iUsrNR.cargarListaSecciones(false, false, true, false);
			
			listaSeccion.removeAllComponents();
			
			if(!su.isEmpty()) {
				for(Seccion s : su) {
					SeccionVistaModerador sur = new SeccionVistaModerador(s);
					listaSeccion.addComponent(sur);
					UI.getCurrent().getNavigator().addView(s.getTitulo() + "Mod", new ModeradorClase(new Lista_Tema_V_Moderador(s.getIdSeccion())));
				}
			}
			
			if(!sec.isEmpty()) {
				for(Seccion s : sec) {
					SeccionVistaModerador sc = new SeccionVistaModerador(s);
					listaSeccion.addComponent(sc);
					UI.getCurrent().getNavigator().addView(s.getTitulo() + "Mod", new ModeradorClase(new Lista_Tema_V_Moderador(s.getIdSeccion())));
				}
			}
			
			if(!secM.isEmpty()) {
				for(Seccion s : secM) {
					SeccionVistaModerador sc = new SeccionVistaModerador(s);
					listaSeccion.addComponent(sc);
					UI.getCurrent().getNavigator().addView(s.getTitulo() + "Mod", new ModeradorClase(new Lista_Tema_V_Moderador(s.getIdSeccion())));
				}
			}
		}	
	}
	
	private void Inicializar(){
		_crearSeccion.setVisible(true);	
	}
	public void crearSeccion() {
		UI.getCurrent().getNavigator().navigateTo("crearSeccion");
	}
	
}