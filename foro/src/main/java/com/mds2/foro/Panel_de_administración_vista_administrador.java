package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

//import DCLv3.Lista_Ticket;
//import DCLv3.PanelAdministracionGenerico;

public class Panel_de_administración_vista_administrador extends PanelAdministracionGenerico {
//	private Button _modificarNumUltimoMensaje;
//	private Button _configurarPublicidad;
//	private Label _ticketsL;
//	private Label _candidatosAmonestadosL;
	public AdministradorClase _unnamed_Administrador_;
	public Sistema_de_tickets_vista_administrador _sistema_de_tickets_vista_administrador;
	public Sistema_de_publicidad _sistema_de_publicidad;
	public Lista_Usuario_Amonestado_V_Administrador _usuario_amonestado_vista_administrador;
	//public Buscar_usuario _buscar_usuario;
	public Lista_Ticket _unnamed_Lista_Ticket_;

	public Panel_de_administración_vista_administrador() throws PersistentException {
		
		modNumUM.setVisible(true);
		
		buscador.setVisible(true);
		
		configPubliAdmin.setVisible(true);
		
		System.out.println("creo el panel de publicidad");
		UI.getCurrent().getNavigator().addView("sistemaPublicidad", new AdministradorClase(new Sistema_de_publicidad()));
		
		modNumUM.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("irTema");
			}
		});	
		
		buscador.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("irTema");
			}
		});	
		
		configPubliAdmin.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				configurarPublicidad();
			}
		});	
		
	}
	
	public void modificarNumUltimoMensaje() {
		throw new UnsupportedOperationException();
	}

	public void buscarUsuario() {
		throw new UnsupportedOperationException();
	}

	public void configurarPublicidad() {
		UI.getCurrent().getNavigator().navigateTo("sistemaPublicidad");
	}
}