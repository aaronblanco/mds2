package com.mds2.foro;

import java.io.File;
import java.util.List;
import java.util.Random;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.server.FileResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Image;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

//import Package2.iBanner_general;

public class Banner_general extends Banner_general_ventana implements View{
	private Button _faq;
	private Button _avisoLegal;
	

	public Banner_general() throws PersistentException {
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
		if(Sesion.getIDSESION() > 0) 
			if(Sesion.getADMINISTRADOR())
				UI.getCurrent().getNavigator().navigateTo("faqAdm");
			else if(Sesion.getMODERADOR())
				UI.getCurrent().getNavigator().navigateTo("faqMod");
			else
				UI.getCurrent().getNavigator().navigateTo("faqUsr");
			
		
		else
		UI.getCurrent().getNavigator().navigateTo("faq");
	}

	public void avisoLegal() {
		if(Sesion.getIDSESION() > 0) 
			if(Sesion.getADMINISTRADOR())
				UI.getCurrent().getNavigator().navigateTo("avisoLegalAdm");
			else if(Sesion.getMODERADOR())
				UI.getCurrent().getNavigator().navigateTo("avisoLegalMod");
			else
				UI.getCurrent().getNavigator().navigateTo("avisoLegalUsr");
			
		
		else
		UI.getCurrent().getNavigator().navigateTo("avisoLegal");
	}
}