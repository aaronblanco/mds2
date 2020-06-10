package com.mds2.foro;

import java.util.List;

import org.orm.PersistentException;

public interface iUsuario_no_registrado extends iBanner_general, iMenu_UNR {

	public boolean registrarse(String aUsername, String aFullname, String aPassword, String aDescription, String aEmail, String aFotoURL) throws PersistentException;

	public List cargarListaSecciones(boolean aPublico, boolean aPrivado, boolean aOculto, boolean aEliminado) throws PersistentException;

	public List cargarTemasUNR(int aIdSeccion, boolean aPublico, boolean aPrivado, boolean aOculto, boolean aEliminado) throws PersistentException;

	public List cargarMensajeUNR(int aIdTema, boolean aPublico, boolean aPrivado, boolean aOculto, boolean aEliminado) throws PersistentException;

	public boolean recuperarPassword(String aEmail);

	public List buscarSeccion(String aKeyword) throws PersistentException;

	public List buscarTema(String aKeyword, int aIdSeccion) throws PersistentException;

	public List buscarMensaje(String aKeyword, int aIdTema) throws PersistentException;

	public List cargarRespuestas(int aIdMensaje)throws PersistentException;
}