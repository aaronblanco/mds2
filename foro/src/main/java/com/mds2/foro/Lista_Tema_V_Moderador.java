package com.mds2.foro;

//import DCLv3.SeccionVistaModerador;
import java.util.Vector;
//import Package.Tema_oculto;
//import Package.Cambiar_accesibilidad;
//import DCLv3.TemaVistaModerador;

import com.vaadin.ui.Component;

public class Lista_Tema_V_Moderador extends Lista_Tema_V_Usuario_Reg {
	public ModeradorClase _moderador;
	public SeccionVistaModerador _unnamed_SeccionVistaModerador_;
	public Vector<Tema_oculto> _list_Tema_oculto = new Vector<Tema_oculto>();
	//public Vector<Cambiar_accesibilidad> _list_Cambiar_accesibilidad = new Vector<Cambiar_accesibilidad>();
	public TemaVistaModerador _unnamed_TemaVistaModerador_;
	
	iUsuario_no_registrado iUsrNR  = new DB_Main();
	
	public Lista_Tema_V_Moderador() {
		
		super();
		
		listaTemas.addComponent((Component) iUsrNR.cargarTemasUNR(1, true, true, true, false));
		
	}
	
	private void Inicializar() {
		//ESTO NO DEBERAI ESTAR AQUI CREO
		//statusTema.setVisible(true);

	}
	
}