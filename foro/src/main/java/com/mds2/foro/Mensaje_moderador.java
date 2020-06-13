package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Mensaje_moderador extends Mensaje_UR {
	private Button _ocultar;
	//private Listener _listaMsgMod;
	public Lista_Mensaje_V_Moderador _unnamed_Lista_Mensaje_V_Moderador_;
	//public Ver_información_de_usuario_registrado _ver_información_de_usuario_registrado;
	iModerador iUsr = new DB_Main();
	
	public Mensaje_moderador(Mensaje m) {
		super(m);
		
		notificarAdminB.setCaption("Ocultar mensaje");
		
		_ocultar = notificarAdminB;
		
		_ocultar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					ocultar(idM);
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		_verPerfil.addClickListener(new Button.ClickListener() {
	
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					verPerfil();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});	
		
	}
	
	@Override
	public void verPerfil() throws PersistentException {
		int idSenor = idUser;
		
		UI.getCurrent().getNavigator().addView("irPerfilMod", new ModeradorClase(new PerfilUsuarioRegAdmin(idSenor)));
		UI.getCurrent().getNavigator().navigateTo("irPerfilMod");
	}
	
	
	//Aqui sustituimos el notificar por notificar Y ocultar, asi que habra que sobreescribir cosas
	public void ocultar(int idMo) throws PersistentException {
		
		iUsr.ocultarMensaje(idMo);
	}
}