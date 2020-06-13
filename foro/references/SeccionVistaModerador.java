package com.mds2.foro;

import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.ComboBox;

public class SeccionVistaModerador extends SeccionVistaUR {
	public Lista_Seccion_V_Moderador _unnamed_Lista_Seccion_V_Moderador_;
	public Vector<Lista_Tema_V_Moderador> _list_Tema_V_Moderador = new Vector<Lista_Tema_V_Moderador>();
	iModerador iMod  = new DB_Main();
	private ComboBox _estadoSec;
	
	public SeccionVistaModerador() throws PersistentException {
		super();
	}
	
	public SeccionVistaModerador(Seccion s) throws PersistentException {
		super(s);
		Inicializar();
		_nombreSeccion.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
			
				try {
					UI.getCurrent().getNavigator().addView(_nombreSeccion.getCaption() +"Mod", new ModeradorClase(new Lista_Tema_V_Moderador(s.getIdSeccion())));
					UI.getCurrent().getNavigator().navigateTo(_nombreSeccion.getCaption()+"Mod");
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		_estadoSec.setItems("Público","Privado","Oculto");
		_estadoSec.setCaption("Público");
		_estadoSec.addValueChangeListener(event -> {
			try {
				cambiarAccesibilidad(s.getIdSeccion());
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
	}
	
	private void Inicializar() {
		_estadoSec = statusTema;
		_estadoSec.setVisible(true);
	}

	public void cambiarAccesibilidad(int idSeccion) throws PersistentException {
		String value = statusTema.getValue();
		switch(value) {
		case "Público":
			iMod.cambiarAccesibilidad(true, false, false, idSeccion);
			break;
		case "Privado":
			iMod.cambiarAccesibilidad(false, true, false, idSeccion);
			break;
		case "Oculto":
			iMod.cambiarAccesibilidad(false, false, true, idSeccion);
			break;
		default:
			break;
		}
	}
}