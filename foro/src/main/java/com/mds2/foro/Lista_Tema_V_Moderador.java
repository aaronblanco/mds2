package com.mds2.foro;

import java.util.List;
//import DCLv3.SeccionVistaModerador;
import java.util.Vector;
//import Package.Tema_oculto;
//import Package.Cambiar_accesibilidad;
//import DCLv3.TemaVistaModerador;

import org.orm.PersistentException;

import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.Button.ClickEvent;

public class Lista_Tema_V_Moderador extends Lista_Tema_V_Usuario_Reg {
	public ModeradorClase _moderador;
	public SeccionVistaModerador _unnamed_SeccionVistaModerador_;
	public Vector<Tema_oculto> _list_Tema_oculto = new Vector<Tema_oculto>();
	//public Vector<Cambiar_accesibilidad> _list_Cambiar_accesibilidad = new Vector<Cambiar_accesibilidad>();
	public TemaVistaModerador _unnamed_TemaVistaModerador_;
	
	iUsuario_no_registrado iUsrNR  = new DB_Main();
	
	public Lista_Tema_V_Moderador(int idSeccion) throws NumberFormatException, PersistentException {
		
		super(idSeccion);

		List<Tema> t = iUsrNR.cargarTemasUNR(idSeccion, false, false, true, false);
	
		
		for(Tema it: t) {
			TemaVistaModerador tema = new TemaVistaModerador(it);
			listaTemas.addComponent(tema);
		
		}
		
	}

	
}