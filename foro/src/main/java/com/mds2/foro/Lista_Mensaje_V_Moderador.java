package com.mds2.foro;

import java.util.List;
//import DCLv3.TemaVistaModerador;
import java.util.Vector;
//import Package.Mensaje_moderador;
import java.util.function.Consumer;

import org.orm.PersistentException;

import com.vaadin.ui.Component;

public class Lista_Mensaje_V_Moderador extends Lista_Mensaje_V_Usuario_Reg {
	public ModeradorClase _moderador;
	public TemaVistaModerador _unnamed_TemaVistaModerador_;
	public Vector<Mensaje_moderador> _list_Mensaje_moderador = new Vector<Mensaje_moderador>();
	
	public Lista_Mensaje_V_Moderador(int idTema) throws PersistentException {
		super(idTema);
		
		List<Mensaje> msg = iUsrNR.cargarMensajeUNR(idTema, false, false, true, false);
		
		if(!msg.isEmpty()) {
			for(Mensaje m :msg) {
				MensajeClase me = new MensajeClase(m);
				listaMensajeAdmin.addComponent(me);
			}
		}
	}
}