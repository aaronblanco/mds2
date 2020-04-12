package com.mds2.foro;

//import DCLv3.TemaVistaModerador;
import java.util.Vector;
//import Package.Mensaje_moderador;

public class Lista_Mensaje_V_Moderador extends Lista_Mensaje_V_Usuario_Reg {
	public Moderador _moderador;
	public TemaVistaModerador _unnamed_TemaVistaModerador_;
	public Vector<Mensaje_moderador> _list_Mensaje_moderador = new Vector<Mensaje_moderador>();
	
	public Lista_Mensaje_V_Moderador() {
		super();
		
	}
}