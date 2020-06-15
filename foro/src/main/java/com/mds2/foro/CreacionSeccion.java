package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.TextField;

//import Package.Lista_Seccion_V_Moderador;

public class CreacionSeccion extends Creacion_Seccion_ventana implements View {
	private TextField _tituloSeccion;
	private TextField _descipcionSeccion;
	private Button _enviar;
	private Button _cancelar;
	private String _imagenSeccionURL = "";
	public Lista_Seccion_V_Moderador _unnamed_Lista_Seccion_V_Moderador_;
	iModerador iMod = new DB_Main();
	
	public CreacionSeccion() {
		this._tituloSeccion = titulo;
		this._descipcionSeccion = descripcion;
		this._enviar = crearSeccionB;
		this._cancelar = cancelarSeccionB;
		
		
		_enviar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					enviar();
					if(Sesion.getADMINISTRADOR())
						UI.getCurrent().getNavigator().navigateTo("Pagina principalAdm");
					else if(Sesion.getMODERADOR())
						UI.getCurrent().getNavigator().navigateTo("Pagina principalMod");
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});	
		
		_cancelar.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					cancelar();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});	
		

		
	}
	
	public void enviar() throws PersistentException {
		try {
			 iMod.crearSeccion(_tituloSeccion.getValue(), _descipcionSeccion.getValue(), _imagenSeccionURL.toString(), Sesion.getIDSESION());
		
			
		}catch(Exception e) {
				
			e.printStackTrace();
		}
			
	}
	
	public void cancelar() throws PersistentException {
		if(com.mds2.foro.AdministradorDAO.getAdministradorByORMID(Sesion.getIDSESION())!=null)
			UI.getCurrent().getNavigator().navigateTo("Pagina principalAdm");
		else
			UI.getCurrent().getNavigator().navigateTo("Pagina principalMod");
		
	}

}