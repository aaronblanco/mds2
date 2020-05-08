package com.mds2.foro;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.data.*;
import com.vaadin.data.provider.TreeDataProvider;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.Navigator.ComponentContainerViewDisplay;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {

		
    	 Usuario_no_registrado pag = new Usuario_no_registrado();
	

    	 setContent(pag);
    
    	 
    	 
    	 Navigator navigator = new Navigator(this , this);
         navigator.addView("", pag.getClass());
     	
     	 
     	 navigator.addView("faq", new Usuario_no_registrado( new FAQ()));
     	 navigator.addView("avisoLegal",  new Usuario_no_registrado(new Aviso_legal()));
     	 navigator.addView("Iniciar sesión",  new Usuario_no_registrado(new Iniciar_sesión()));
     	 navigator.addView("Registrarse",  new Usuario_no_registrado(new Registrarse() ) );
     	 
     	 
     	 
     	 
     	 
     	  navigator.addView("crearSeccion", new Usuario_registrado(new CreacionSeccion()));
    	  navigator.addView("Mi perfil", new Usuario_registrado(new PerfilUsuarioRegAdmin()));
      	 
      	 
     	 
     	 
         navigator.addView("Panel de administración mod", new Moderador(new Panel_de_administración_vista_moderador()) );
         navigator.addView("Panel de administración", new Administrador(new Panel_de_administración_vista_administrador()) );
         navigator.addView("Panel de publicidad", new Administrador(new Sistema_de_publicidad()) );
         
         
         
         
         
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
