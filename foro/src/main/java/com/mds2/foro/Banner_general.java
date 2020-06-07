package com.mds2.foro;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

//import Package2.iBanner_general;

public class Banner_general extends Banner_general_ventana implements View{
	private Button _faq;
	private Button _avisoLegal;
//	private TextField _foroDesplegable;
//	public iBanner_general _iBanner_general;
//	public Banner _banner;
//	public Publicidad _publicidad;
//	public Aviso_legal _unnamed_Aviso_legal_;
//	public Foro_desplegable _unnamed_Foro_desplegable_;
//	public FAQ _unnamed_FAQ_;

	public Banner_general() {
		this._faq = faq;
		this._avisoLegal = avisoLegal;
		
		
		
		_faq.addStyleName("link");
		_faq.addClickListener(new Button.ClickListener() {
			
		
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				faq();
			}
			
		});	
		
		_avisoLegal.addStyleName("link");
		_avisoLegal.addClickListener(new Button.ClickListener() {
			
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				avisoLegal();
			}
			
		});	
		
		soporte.setVisible(false);
		
	}
	
	public void faq() {
		UI.getCurrent().getNavigator().navigateTo("faq");
	}

	public void avisoLegal() {
		UI.getCurrent().getNavigator().navigateTo("avisoLegal");
	}
}