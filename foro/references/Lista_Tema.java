package com.mds2.foro;

import java.util.List;
//import DCLv3.Orden;
import java.util.Vector;
//import Package.Tema;
//import Package.Buscador_tema;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Component;

public class Lista_Tema extends Lista_Tema_ventana implements View {
	public SeccionClase _sección;
	public Vector<TemaClase> _list_Tema = new Vector<TemaClase>();
	
	iUsuario_no_registrado iUsrNR  = new DB_Main();


	public Lista_Tema(int idSeccion) throws PersistentException {
		
		Inicializar();
		
		buscarTemaB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					buscarTema(idSeccion);
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});	
		
		List<Tema> t = iUsrNR.cargarTemasUNR(idSeccion, true, false, false, false);
		
		if(!t.isEmpty()) {
			for(Tema it: t) {
				TemaClase tema = new TemaClase(it);
				listaTemas.addComponent(tema);
				UI.getCurrent().getNavigator().addView(it.getSeccion_tema().getTitulo()+"/"+it.getTitulo(), new Usuario_no_registrado(new Lista_Mensaje(it.getIdTema())));

			}
		}

		
		Seccion s = SeccionDAO.getSeccionByORMID(idSeccion);
		_sección = new SeccionClase(s);
		
	}
	
	private void Inicializar() {
		// TODO Auto-generated method stub
		crearTemaB.setVisible(false);
		
		statusTema.setVisible(false);
		
		buscarTemaB.setVisible(true);
		
		
		
	}

	public void buscarTema(int idSeccion) throws PersistentException {
		
		List<Tema> st = iUsrNR.buscarTema(buscarTemaTF.getValue(), idSeccion);
			
		if(!st.isEmpty()) {
			for(Tema t : st) {
				TemaClase tc = new TemaClase(t);
				listaTemas.addComponent(tc);
			}
		}else {
			List<Tema> tema = iUsrNR.cargarTemasUNR(idSeccion, true, false, false, false);
			for(Tema te : tema) {
				TemaClase tem = new TemaClase(te);
				listaTemas.addComponent(tem);
			}
		}
		
		
				
	}

	
}