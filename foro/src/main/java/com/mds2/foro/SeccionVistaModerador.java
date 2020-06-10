package com.mds2.foro;

//import Package.Lista_Seccion_V_Moderador;
import java.util.Vector;
//import Package.Lista_Tema_V_Moderador;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

public class SeccionVistaModerador extends SeccionVistaUR {
	//private Listener _listaSeccionMod;
	public Lista_Seccion_V_Moderador _unnamed_Lista_Seccion_V_Moderador_;
	public Vector<Lista_Tema_V_Moderador> _list_Tema_V_Moderador = new Vector<Lista_Tema_V_Moderador>();
	iModerador iMod  = new DB_Main();

	
	public SeccionVistaModerador() {
		super();

		statusTema.setItems("Público","Privado","Oculto");
		statusTema.addValueChangeListener(event -> {
			cambiarAccesibilidad();
		});
		
	}
	
	private void Inicializar() {
		statusTema.setVisible(true);
	}

	public void cambiarAccesibilidad() {
		String value = statusTema.getValue();
		switch(value) {
		case "Público":
			iMod.cambiarAccesibilidad(true, false, false, 0);
			break;
		case "Privado":
			iMod.cambiarAccesibilidad(false, true, false, 0);
			break;
		case "Oculto":
			iMod.cambiarAccesibilidad(false, false, true, 0);
			break;
		default:
			break;
		}
	}
}