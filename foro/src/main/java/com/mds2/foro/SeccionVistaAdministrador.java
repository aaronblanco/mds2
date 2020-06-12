package com.mds2.foro;

import java.util.List;

import org.orm.PersistentException;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;


public class SeccionVistaAdministrador extends SeccionVistaModerador {
	private Button _eliminarSeccion;
//	private Listener _listaSeccionAdmin;
	public Lista_Seccion_V_administrador _unnamed_Lista_Seccion_V_administrador_;
	public Lista_Tema_V_Administrador _unnamed_Lista_Tema_V_Administrador_;
	iAdministrador iAdmin  = new DB_Main();

	public SeccionVistaAdministrador() throws PersistentException {
		super();
	}
	
	public SeccionVistaAdministrador(Seccion s) throws PersistentException {
		super(s);
		_nombreSeccion.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
			
				try {
					UI.getCurrent().getNavigator().addView(_nombreSeccion.getCaption() +"Adm", new AdministradorClase(new Lista_Tema_V_Administrador(s.getIdSeccion())));
					UI.getCurrent().getNavigator().navigateTo(_nombreSeccion.getCaption()+"Adm");
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		_eliminarSeccion = eliminarSeccion;
		_eliminarSeccion.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					eliminarSeccion(s.getIdSeccion());
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		

		
	}
	
	private void Inicializar() {
		eliminarSeccion.setVisible(true);
		_eliminarSeccion = eliminarSeccion;

	}
	public void eliminarSeccion(int idSec) throws PersistentException {
		iAdmin.eliminarSeccion(idSec);
	}
}