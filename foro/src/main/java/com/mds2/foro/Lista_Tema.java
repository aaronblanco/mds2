package com.mds2.foro;

//import DCLv3.Orden;
import java.util.Vector;
//import Package.Tema;
//import Package.Buscador_tema;

public class Lista_Tema {
	//private Orden _orden = DCLv3.Orden.Relevancia;
	public Sección _sección;
	public Vector<Tema> _list_Tema = new Vector<Tema>();
	public Vector<Buscador_tema> _list_Buscador_tema = new Vector<Buscador_tema>();

	public void buscarTema() {
		throw new UnsupportedOperationException();
	}

	public void ordenar(Orden aNuevoOrden) {
		throw new UnsupportedOperationException();
	}
}