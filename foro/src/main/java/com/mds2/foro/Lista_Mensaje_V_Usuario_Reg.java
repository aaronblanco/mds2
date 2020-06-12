package com.mds2.foro;

import java.util.List;
import java.util.Vector;
//import Package.Ver_perfil_de_usuario;
//import Package.Mensaje_UR;
//import DCLv3.CreacionMensaje;
import java.util.function.Consumer;

import org.orm.PersistentException;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Component;

public class Lista_Mensaje_V_Usuario_Reg extends Lista_Mensaje {
	//private Button _crearMensaje;
	public Usuario_registrado _usuario_registrado;
	public Tema_UR _unnamed_Tema_UR_;
	//public Vector<Ver_perfil_de_usuario> _list_Ver_perfil_de_usuario = new Vector<Ver_perfil_de_usuario>();
	public Vector<Mensaje_UR> _list_Mensaje_UR = new Vector<Mensaje_UR>();
	public CreacionMensaje _unnamed_CreacionMensaje_;
	iUsuario iUsr = new DB_Main();
	
	public Lista_Mensaje_V_Usuario_Reg(int idTema) throws PersistentException {
		
		super(idTema);
		
		crearMensaje.setVisible(true);
		
		crearMensaje.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				crearMensaje();
			}
			
		});	
		
		
		_volverTema.addClickListener(new Button.ClickListener() {
			Tema te = com.mds2.foro.TemaDAO.getTemaByORMID(idTema);
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
				UI.getCurrent().getNavigator().navigateTo(te.getSeccion_tema().getTitulo()+"Usr");
			}
			
		});	
		
		listaMensajeAdmin.removeAllComponents();
		List<Mensaje> t = iUsrNR.cargarMensajeUNR(idTema, true, false);
		System.out.println(t.toString());
		
		for(Mensaje it: t) {
			Mensaje_UR msj = new Mensaje_UR(it);
			listaMensajeAdmin.addComponent(msj);
		}
		
		t = iUsr.cargarMensajeCreado(idTema, Sesion.getIDSESION());
		System.out.println(t.toString());
		for(Mensaje it : t) {
			Mensaje_UR_creado muc = new Mensaje_UR_creado(it);
			listaMensajeAdmin.addComponent(muc);
		}
		
	}
	
	public void crearMensaje() {
		UI.getCurrent().getNavigator().navigateTo("crearMensaje");
	}
}