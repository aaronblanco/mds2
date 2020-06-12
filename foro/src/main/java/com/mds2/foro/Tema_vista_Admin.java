package com.mds2.foro;

import org.orm.PersistentException;

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
	iAdministrador iAdmin = new DB_Main();
	
//	public Tema_vista_Admin() {
//		super();
//		
//		//voy a dejar de hacer los inicializar en las clases superiores porque puede petar esto
//		notificarAdmin.setVisible(false);
//		
//		cerrarTema.setVisible(true);
//		
//		eliminarTema.setVisible(true);
//		
//		cerrarTema.addClickListener(new Button.ClickListener() {
//			
//			@Override
//			public void buttonClick(ClickEvent event) {
//				// TODO Auto-generated method stub
//				cerrarTema();
//			}
//		});
//		
//		eliminarTema.addClickListener(new Button.ClickListener() {
//			
//			@Override
//			public void buttonClick(ClickEvent event) {
//				// TODO Auto-generated method stub
//				try {
//					eliminarTema();
//				} catch (PersistentException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		});
//		
//	}
	
	
	
	public Tema_vista_Admin(Tema it) throws PersistentException {
		// TODO Auto-generated constructor stub
		super(it);
		notificarAdmin.setVisible(false);
		
		cerrarTema.setVisible(true);
		
		eliminarTema.setVisible(true);
		
		cerrarTema.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				cerrarTema();
			}
		});
		
		eliminarTema.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					eliminarTema();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		this._titulo.addClickListener(new Button.ClickListener() {

            @Override
            public void buttonClick(ClickEvent event) {
                // TODO Auto-generated method stub
                
            	try {
					UI.getCurrent().getNavigator().addView(_nombreSeccion + "Adm/" + _titulo.getCaption(), new AdministradorClase(new Lista_Mensaje_V_Administrador(it.getIdTema())));
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				UI.getCurrent().getNavigator().navigateTo(_nombreSeccion+ "Adm/" + _titulo.getCaption());
            	
            	
            }

        });
	}



	//LOS IDS	
	public void eliminarTema() throws PersistentException {
		iAdmin.eliminarTema(1);
	}
	//	LOS IDS
	public void cerrarTema() {
		iAdmin.cerrarTema(1);
	}
}