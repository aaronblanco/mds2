package com.mds2.foro;

import java.util.List;
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
	public Usuario_registrado _usuario_registrado;
	public SeccionVistaUR _unnamed_SeccionVistaUR_;
	public Vector<Tema_privado> _list_Tema_privado = new Vector<Tema_privado>();
	public Vector<Tema_UR> _list_Tema_UR = new Vector<Tema_UR>();
	public CreacionTema _unnamed_CreacionTema_;

	iUsuario_no_registrado iUsrNR  = new DB_Main();
	
	public Lista_Tema_V_Usuario_Reg(int idSeccion) throws NumberFormatException, PersistentException {
		super(idSeccion);
	
		
		Inicializar();
		
		listaTemas.removeAllComponents();
		
		List<Tema> t = iUsrNR.cargarTemasUNR(idSeccion, true, false, false, false);
		
		List<Tema> tu = iUsrNR.cargarTemasUNR(idSeccion, false, true, false, false);
		
		if(!t.isEmpty()) {
			for(Tema it: t) {
				Tema_UR tema = new Tema_UR(it);
				listaTemas.addComponent(tema);
				UI.getCurrent().getNavigator().addView(it.getSeccion_tema().getTitulo()+"Usr/"+it.getTitulo(), new Usuario_registrado(new Lista_Mensaje_V_Usuario_Reg(it.getIdTema())));

			}
		}	
		
		if(!tu.isEmpty()) {
			for(Tema it: tu) {
				Tema_UR tema = new Tema_UR(it);
				listaTemas.addComponent(tema);
				UI.getCurrent().getNavigator().addView(it.getSeccion_tema().getTitulo()+"Usr/"+it.getTitulo(), new Usuario_registrado(new Lista_Mensaje_V_Usuario_Reg(it.getIdTema())));

			}
		}
		
		crearTemaB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					crearTema(idSeccion, Sesion.getIDSESION());
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Seccion s = SeccionDAO.getSeccionByORMID(idSeccion);
		_sección = new SeccionClase(s);		
		
		
	}
	
	private void Inicializar() {
		crearTemaB.setVisible(true);
		
		
	}
	
	public static void crearTema(int idSeccion, int idCreadorTema) throws PersistentException {
		if(Sesion.getADMINISTRADOR()) {
			UI.getCurrent().getNavigator().addView("crearTemaAdm", new AdministradorClase(new CreacionTema( idSeccion, idCreadorTema)));
			UI.getCurrent().getNavigator().navigateTo("crearTemaAdm");
		}
		else if(Sesion.getMODERADOR()) {
			UI.getCurrent().getNavigator().addView("crearTemaMod", new ModeradorClase(new CreacionTema( idSeccion, idCreadorTema)));
			UI.getCurrent().getNavigator().navigateTo("crearTemaMod");
		}
		else {
			UI.getCurrent().getNavigator().addView("crearTema", new Usuario_registrado(new CreacionTema( idSeccion, idCreadorTema)));
			UI.getCurrent().getNavigator().navigateTo("crearTema");
		}
		
	}
}