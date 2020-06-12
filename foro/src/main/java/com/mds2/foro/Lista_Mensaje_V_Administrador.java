package com.mds2.foro;

import java.util.List;
import java.util.Vector;
//import DCLv3.Mensaje_Administrador;
import java.util.function.Consumer;

import org.orm.PersistentException;

import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Lista_Mensaje_V_Administrador extends Lista_Mensaje_V_Moderador{
	public Tema_vista_Admin _unnamed_Tema_vista_Admin_;
	public Vector<Mensaje_Administrador> _list_Mensaje_Administrador = new Vector<Mensaje_Administrador>();
	
	public Lista_Mensaje_V_Administrador(int idTema) throws PersistentException {
		super(idTema);
		
		listaMensajeAdmin.removeAllComponents();
		List<Mensaje> t = iUsrNR.cargarMensajeUNR(idTema, true, false);
		System.out.println(t.toString());
		
		for(Mensaje it: t) {
			Mensaje_Administrador msj = new Mensaje_Administrador(it);
			listaMensajeAdmin.addComponent(msj);
		}
		
		t = iUsr.cargarMensajeCreado(idTema, Sesion.getIDSESION());
		System.out.println(t.toString());
		for(Mensaje it : t) {
			Mensaje_UR_creado muc = new Mensaje_UR_creado(it);
			listaMensajeAdmin.addComponent(muc);
		}
		List<Mensaje> msg = iUsrNR.cargarMensajeUNR(idTema, false, true);
		
		if(!msg.isEmpty()) {
			for(Mensaje m : msg) {
				Mensaje_Administrador me = new Mensaje_Administrador(m);
				listaMensajeAdmin.addComponent(me);
			}
		}
		
		
		
		_volverTema.addClickListener(new Button.ClickListener() {
			Tema te = com.mds2.foro.TemaDAO.getTemaByORMID(idTema);
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
				UI.getCurrent().getNavigator().navigateTo(te.getSeccion_tema().getTitulo()+"Adm");
			}
			
		});	
	}
}