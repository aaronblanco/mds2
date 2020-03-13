package com.mds2.foro;

import java.util.Vector;
//import Package.Cambiar_accesibilidad;
//import Package.Crear_sección;
//import Package.Sección_oculta;
//import DCLv3.SeccionVistaModerador;
//import DCLv3.CreacionSeccion;

public class Lista_Seccion_V_Moderador extends Lista_Seccion_V_Usuario_Reg {
	//private Button _crearSeccion;
	public Moderador _unnamed_Moderador_;
	public Vector<Cambiar_accesibilidad> _list_Cambiar_accesibilidad = new Vector<Cambiar_accesibilidad>();
	public Vector<Crear_sección> _list_Crear_sección = new Vector<Crear_sección>();
	public Vector<Sección_oculta> _list_Sección_oculta = new Vector<Sección_oculta>();
	public SeccionVistaModerador _unnamed_SeccionVistaModerador_;
	public CreacionSeccion _unnamed_CreacionSeccion_;

	public void crearSeccion() {
		throw new UnsupportedOperationException();
	}
}