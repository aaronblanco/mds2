/**
 * Licensee: trm187(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateMDS11920PFBlancoRoblesData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		try {
			com.mds2.foro.Notificacion lcommds2foroNotificacion = com.mds2.foro.NotificacionDAO.loadNotificacionByQuery(null, null);
			// Update the properties of the persistent object
			com.mds2.foro.NotificacionDAO.save(lcommds2foroNotificacion);
			com.mds2.foro.Mensaje lcommds2foroMensaje = com.mds2.foro.MensajeDAO.loadMensajeByQuery(null, null);
			// Update the properties of the persistent object
			com.mds2.foro.MensajeDAO.save(lcommds2foroMensaje);
			com.mds2.foro.Usuarios lcommds2foroUsuarios = com.mds2.foro.UsuariosDAO.loadUsuariosByQuery(null, null);
			// Update the properties of the persistent object
			com.mds2.foro.UsuariosDAO.save(lcommds2foroUsuarios);
			com.mds2.foro.Moderador lcommds2foroModerador = com.mds2.foro.ModeradorDAO.loadModeradorByQuery(null, null);
			// Update the properties of the persistent object
			com.mds2.foro.ModeradorDAO.save(lcommds2foroModerador);
			com.mds2.foro.Seccion lcommds2foroSeccion = com.mds2.foro.SeccionDAO.loadSeccionByQuery(null, null);
			// Update the properties of the persistent object
			com.mds2.foro.SeccionDAO.save(lcommds2foroSeccion);
			com.mds2.foro.Tema lcommds2foroTema = com.mds2.foro.TemaDAO.loadTemaByQuery(null, null);
			// Update the properties of the persistent object
			com.mds2.foro.TemaDAO.save(lcommds2foroTema);
			com.mds2.foro.Anuncio lcommds2foroAnuncio = com.mds2.foro.AnuncioDAO.loadAnuncioByQuery(null, null);
			// Update the properties of the persistent object
			com.mds2.foro.AnuncioDAO.save(lcommds2foroAnuncio);
			com.mds2.foro.Ticket lcommds2foroTicket = com.mds2.foro.TicketDAO.loadTicketByQuery(null, null);
			// Update the properties of the persistent object
			com.mds2.foro.TicketDAO.save(lcommds2foroTicket);
			com.mds2.foro.media lcommds2foromedia = com.mds2.foro.mediaDAO.loadMediaByQuery(null, null);
			// Update the properties of the persistent object
			com.mds2.foro.mediaDAO.save(lcommds2foromedia);
			com.mds2.foro.imagenes lcommds2foroimagenes = com.mds2.foro.imagenesDAO.loadImagenesByQuery(null, null);
			// Update the properties of the persistent object
			com.mds2.foro.imagenesDAO.save(lcommds2foroimagenes);
			com.mds2.foro.Administrador lcommds2foroAdministrador = com.mds2.foro.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			com.mds2.foro.AdministradorDAO.save(lcommds2foroAdministrador);
			com.mds2.foro.videos lcommds2forovideos = com.mds2.foro.videosDAO.loadVideosByQuery(null, null);
			// Update the properties of the persistent object
			com.mds2.foro.videosDAO.save(lcommds2forovideos);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Notificacion by NotificacionCriteria");
		com.mds2.foro.NotificacionCriteria lcommds2foroNotificacionCriteria = new com.mds2.foro.NotificacionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommds2foroNotificacionCriteria.idNotificacion.eq();
		System.out.println(lcommds2foroNotificacionCriteria.uniqueNotificacion());
		
		System.out.println("Retrieving Mensaje by MensajeCriteria");
		com.mds2.foro.MensajeCriteria lcommds2foroMensajeCriteria = new com.mds2.foro.MensajeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommds2foroMensajeCriteria.idMensaje.eq();
		System.out.println(lcommds2foroMensajeCriteria.uniqueMensaje());
		
		System.out.println("Retrieving Usuarios by UsuariosCriteria");
		com.mds2.foro.UsuariosCriteria lcommds2foroUsuariosCriteria = new com.mds2.foro.UsuariosCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommds2foroUsuariosCriteria.idUsuario.eq();
		System.out.println(lcommds2foroUsuariosCriteria.uniqueUsuarios());
		
		System.out.println("Retrieving Moderador by ModeradorCriteria");
		com.mds2.foro.ModeradorCriteria lcommds2foroModeradorCriteria = new com.mds2.foro.ModeradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommds2foroModeradorCriteria.idUsuario.eq();
		System.out.println(lcommds2foroModeradorCriteria.uniqueModerador());
		
		System.out.println("Retrieving Seccion by SeccionCriteria");
		com.mds2.foro.SeccionCriteria lcommds2foroSeccionCriteria = new com.mds2.foro.SeccionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommds2foroSeccionCriteria.idSeccion.eq();
		System.out.println(lcommds2foroSeccionCriteria.uniqueSeccion());
		
		System.out.println("Retrieving Tema by TemaCriteria");
		com.mds2.foro.TemaCriteria lcommds2foroTemaCriteria = new com.mds2.foro.TemaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommds2foroTemaCriteria.idTema.eq();
		System.out.println(lcommds2foroTemaCriteria.uniqueTema());
		
		System.out.println("Retrieving Anuncio by AnuncioCriteria");
		com.mds2.foro.AnuncioCriteria lcommds2foroAnuncioCriteria = new com.mds2.foro.AnuncioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommds2foroAnuncioCriteria.idAnuncio.eq();
		System.out.println(lcommds2foroAnuncioCriteria.uniqueAnuncio());
		
		System.out.println("Retrieving Ticket by TicketCriteria");
		com.mds2.foro.TicketCriteria lcommds2foroTicketCriteria = new com.mds2.foro.TicketCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommds2foroTicketCriteria.idTicket.eq();
		System.out.println(lcommds2foroTicketCriteria.uniqueTicket());
		
		System.out.println("Retrieving media by mediaCriteria");
		com.mds2.foro.mediaCriteria lcommds2foromediaCriteria = new com.mds2.foro.mediaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommds2foromediaCriteria.idMedia.eq();
		System.out.println(lcommds2foromediaCriteria.uniqueMedia());
		
		System.out.println("Retrieving imagenes by imagenesCriteria");
		com.mds2.foro.imagenesCriteria lcommds2foroimagenesCriteria = new com.mds2.foro.imagenesCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommds2foroimagenesCriteria.idMedia.eq();
		System.out.println(lcommds2foroimagenesCriteria.uniqueImagenes());
		
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		com.mds2.foro.AdministradorCriteria lcommds2foroAdministradorCriteria = new com.mds2.foro.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommds2foroAdministradorCriteria.idUsuario.eq();
		System.out.println(lcommds2foroAdministradorCriteria.uniqueAdministrador());
		
		System.out.println("Retrieving videos by videosCriteria");
		com.mds2.foro.videosCriteria lcommds2forovideosCriteria = new com.mds2.foro.videosCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommds2forovideosCriteria.idMedia.eq();
		System.out.println(lcommds2forovideosCriteria.uniqueVideos());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateMDS11920PFBlancoRoblesData retrieveAndUpdateMDS11920PFBlancoRoblesData = new RetrieveAndUpdateMDS11920PFBlancoRoblesData();
			try {
				retrieveAndUpdateMDS11920PFBlancoRoblesData.retrieveAndUpdateTestData();
				//retrieveAndUpdateMDS11920PFBlancoRoblesData.retrieveByCriteria();
			}
			finally {
				com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
