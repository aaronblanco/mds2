package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

//import DCLv3.PerfilUsuarioRegGenerico;

public class PerfilUsuarioRegAdmin extends PerfilUsuarioRegGenerico {

//	private Listener _listaUsuarioAmonestadoAdmin;
	public Lista_Usuario_Amonestado_V_Administrador _unnamed_Lista_Usuario_Amonestado_V_Administrador_;
	public Lista_Usuario_Amonestado _usuario_amonestado;
	iAdministrador iAd = new DB_Main();
	iModerador iMod = new DB_Main();
	
	public PerfilUsuarioRegAdmin(int idSenor) throws PersistentException {
		
		
		super(idSenor);
		
		this.idU = idSenor;
		
		Usuarios u = com.mds2.foro.UsuariosDAO.getUsuariosByORMID(idU);
		
		if(u.getAmonestado()) {
			this._sancionarUsuario.setVisible(false);
			this._quitarSancion.setVisible(true);
		}else {
			this._sancionarUsuario.setVisible(true);
			this._quitarSancion.setVisible(false);
		}
		
		if(!Sesion.ADMINISTRADOR) {
			this._sancionarUsuario.setCaption("Amonestar");
			this._quitarSancion.setVisible(false);;
		}
		
		
		Moderador m = null;
		
		m = com.mds2.foro.ModeradorDAO.getModeradorByORMID(idU);
		
		if(Sesion.ADMINISTRADOR && m == null) {
			this._degradarAUsuarioRegistrado.setVisible(false);
			this._promocionarAModerador.setVisible(true);
		}else if(Sesion.ADMINISTRADOR){
			this._degradarAUsuarioRegistrado.setVisible(true);
			this._promocionarAModerador.setVisible(false);
		}
		
		
		_sancionarUsuario.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
		
				try {
					sancionarUsuario(idSenor);
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		_quitarSancion.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					quitarSancion(idSenor);
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		
		_promocionarAModerador.addClickListener(new Button.ClickListener() {
					
					@Override
					public void buttonClick(ClickEvent event) {
						// TODO Auto-generated method stub
						try {
							promocionarAMod(idSenor);
						} catch (PersistentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
				});
			
		_degradarAUsuarioRegistrado.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					degradarAUsuarioRegistrado(idSenor);
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
	}
	
	
	public void sancionarUsuario(int idUs) throws PersistentException {
		if(Sesion.ADMINISTRADOR)
			iAd.sancionarUsuario(idUs);
		else
			iMod.amonestarUsuario(idUs);
	}

	public void quitarSancion(int idUs) throws PersistentException {
		iAd.quitarSancion(idUs);
	}

	public void promocionarAMod(int idUs) throws PersistentException {
		iAd.promocionarAMod(idUs);
	}

	public void degradarAUsuarioRegistrado(int idUs) throws PersistentException {
		iAd.degradarAUsuarioRegistrado(idUs);
	}
}