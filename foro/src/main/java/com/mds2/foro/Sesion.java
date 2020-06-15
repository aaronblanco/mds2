package com.mds2.foro;

public class Sesion {
	
	
	public static int IDSESION;

	public static String NOMBRESESION;
	public static Boolean ADMINISTRADOR;
	public static Boolean MODERADOR;
	public static Boolean getADMINISTRADOR() {
		return ADMINISTRADOR;
	}

	public static void setADMINISTRADOR(Boolean aDMINISTRADOR) {
		ADMINISTRADOR = aDMINISTRADOR;
	}

	public static int getIDSESION() {
		return IDSESION;
	}

	public static void setIDSESION(int iDSESION) {
		IDSESION = iDSESION;
	}

	public static String getNOMBRESESION() {
		return NOMBRESESION;
	}

	public static void setNOMBRESESION(String nOMBRESESION) {
		NOMBRESESION = nOMBRESESION;
	}
	
	public static Boolean getMODERADOR() {
		return MODERADOR;
	}

	public static void setMODERADOR(Boolean mODERADOR) {
		MODERADOR = mODERADOR;
	}



}
