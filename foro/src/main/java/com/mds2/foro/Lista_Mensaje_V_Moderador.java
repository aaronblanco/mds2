package com.mds2.foro;

import java.util.List;
//import DCLv3.TemaVistaModerador;
import java.util.Vector;
//import Package.Mensaje_moderador;
import java.util.function.Consumer;

import org.orm.PersistentException;

import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Lista_Mensaje_V_Moderador extends Lista_Mensaje_V_Usuario_Reg {
	public ModeradorClase _moderador;
	public TemaVistaModerador _unnamed_TemaVistaModerador_;
	public Vector<Mensaje_moderador> _list_Mensaje_moderador = new Vector<Mensaje_moderador>();
	
	public Lista_Mensaje_V_Moderador(int idTema) throws PersistentException {
		super(idTema);
		
		_volverTema.addClickListener(new Button.ClickListener() {
			Tema te = com.mds2.foro.TemaDAO.getTemaByORMID(idTema);
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
				UI.getCurrent().getNavigator().navigateTo(te.getSeccion_tema().getTitulo()+"Mod");
			}
			
		});	
		
		
		listaMensajeAdmin.removeAllComponents();
		List<Mensaje> t = iUsrNR.cargarMensajeUNR(idTema, true, false);
		
		for(Mensaje it: t) {
			Mensaje_moderador msj = new Mensaje_moderador(it);
			listaMensajeAdmin.addComponent(msj);
		}
		
		t = iUsr.cargarMensajeCreado(idTema, Sesion.getIDSESION());
		for(Mensaje it : t) {
			Mensaje_UR_creado muc = new Mensaje_UR_creado(it);
			listaMensajeAdmin.addComponent(muc);
		}
		
	}
}