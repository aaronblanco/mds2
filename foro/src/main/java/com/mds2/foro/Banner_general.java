package com.mds2.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

//import Package2.iBanner_general;

public class Banner_general extends Banner_Abajo_ventana{
//	private Button _faq;
//	private Button _avisoLegal;
//	private TextField _foroDesplegable;
//	public iBanner_general _iBanner_general;
//	public Banner _banner;
//	public Publicidad _publicidad;
//	public Aviso_legal _unnamed_Aviso_legal_;
//	public Foro_desplegable _unnamed_Foro_desplegable_;
//	public FAQ _unnamed_FAQ_;

	public Banner_general() {
		
		soporte.addClickListener(new Button.ClickListener() {
			
			//cancelar();
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("cancelarCreacionTema");
			}
			
		});	
		
		faq.addClickListener(new Button.ClickListener() {
			
			//cancelar();
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("cancelarCreacionTema");
			}
			
		});	
		
		avisoLegal.addClickListener(new Button.ClickListener() {
			
			//cancelar();
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("cancelarCreacionTema");
			}
			
		});	
		
		soporte.setVisible(false);
		
	}
	
	public void faq() {
		throw new UnsupportedOperationException();
	}

	public void avisoLegal() {
		throw new UnsupportedOperationException();
	}
}