package com.mds2.foro;

import java.util.List;
//import DCLv3.Orden;
import java.util.Vector;
//import Package.Tema;
//import Package.Buscador_tema;

import org.orm.PersistentException;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Component;

public class Lista_Tema extends Lista_Tema_ventana {
	//private Orden _orden = DCLv3.Orden.Relevancia;
	public SeccionClase _sección;
	public Vector<TemaClase> _list_Tema = new Vector<TemaClase>();
	//public Vector<Buscador_tema> _list_Buscador_tema = new Vector<Buscador_tema>();
	iUsuario_no_registrado iUsrNR  = new DB_Main();


	public Lista_Tema() throws PersistentException {
		
		Inicializar();
		
		buscarTemaB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				buscarTema();
			}
		});	
		
		List<Tema> t = iUsrNR.cargarTemasUNR(Integer.valueOf(_sección.getId()), true, false, false, false);
		
		
		for(Tema it: t) {
			TemaClase tema = new TemaClase(it);
			listaTemas.addComponent(tema);
		}
		
		//listaTemas.addComponent((Component) _list_Tema);
	
	}
	
	private void Inicializar() {
		// TODO Auto-generated method stub
		crearTemaB.setVisible(false);
		
		statusTema.setVisible(false);
		
		buscarTemaB.setVisible(true);
	}
//AQUI COSA ID PUM
	public void buscarTema() {
		
		List st;
		try {
			st = iUsrNR.buscarTema(buscarTemaTF.toString(), 1);
		for(Object it : st) {
			listaTemas.addComponent((Component) it);
		}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
	}

	public void ordenar(Orden aNuevoOrden) {
		throw new UnsupportedOperationException();
	}
}