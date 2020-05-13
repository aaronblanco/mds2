/**
 * Licensee: aba693(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateMDS11920PFBlancoRoblesData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		try {
			com.mds2.foro.NotificacionBD dB_DCLNotificacion = com.mds2.foro.NotificacionDAO.loadNotificacionByQuery(null, null);
			// Update the properties of the persistent object
			com.mds2.foro.NotificacionDAO.save(dB_DCLNotificacion);
			com.mds2.foro.MensajeBD dB_DCLMensaje = com.mds2.foro.MensajeDAO.loadMensajeByQuery(null, null);
			// Update the properties of the persistent object
			com.mds2.foro.MensajeDAO.save(dB_DCLMensaje);
			com.mds2.foro.UsuariosBD dB_DCLUsuarios = com.mds2.foro.UsuariosDAO.loadUsuariosByQuery(null, null);
			// Update the properties of the persistent object
			com.mds2.foro.UsuariosDAO.save(dB_DCLUsuarios);
			com.mds2.foro.ModeradorBD dB_DCLModerador = com.mds2.foro.ModeradorDAO.loadModeradorByQuery(null, null);
			// Update the properties of the persistent object
			com.mds2.foro.ModeradorDAO.save(dB_DCLModerador);
			com.mds2.foro.SeccionBD dB_DCLSeccion = com.mds2.foro.SeccionDAO.loadSeccionByQuery(null, null);
			// Update the properties of the persistent object
			com.mds2.foro.SeccionDAO.save(dB_DCLSeccion);
			com.mds2.foro.TemaBD dB_DCLTema = com.mds2.foro.TemaDAO.loadTemaByQuery(null, null);
			// Update the properties of the persistent object
			com.mds2.foro.TemaDAO.save(dB_DCLTema);
			com.mds2.foro.AnuncioBD dB_DCLAnuncio = com.mds2.foro.AnuncioDAO.loadAnuncioByQuery(null, null);
			// Update the properties of the persistent object
			com.mds2.foro.AnuncioDAO.save(dB_DCLAnuncio);
			com.mds2.foro.TicketBD dB_DCLTicket = com.mds2.foro.TicketDAO.loadTicketByQuery(null, null);
			// Update the properties of the persistent object
			com.mds2.foro.TicketDAO.save(dB_DCLTicket);
			com.mds2.foro.media dB_DCLmedia = com.mds2.foro.mediaDAO.loadMediaByQuery(null, null);
			// Update the properties of the persistent object
			com.mds2.foro.mediaDAO.save(dB_DCLmedia);
			com.mds2.foro.imagenes dB_DCLimagenes = com.mds2.foro.imagenesDAO.loadImagenesByQuery(null, null);
			// Update the properties of the persistent object
			com.mds2.foro.imagenesDAO.save(dB_DCLimagenes);
			com.mds2.foro.AdministradorBD dB_DCLAdministrador = com.mds2.foro.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			com.mds2.foro.AdministradorDAO.save(dB_DCLAdministrador);
			com.mds2.foro.videos dB_DCLvideos = com.mds2.foro.videosDAO.loadVideosByQuery(null, null);
			// Update the properties of the persistent object
			com.mds2.foro.videosDAO.save(dB_DCLvideos);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Notificacion by NotificacionCriteria");
		com.mds2.foro.NotificacionCriteria dB_DCLNotificacionCriteria = new com.mds2.foro.NotificacionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//dB_DCLNotificacionCriteria.idNotificacion.eq();
		System.out.println(dB_DCLNotificacionCriteria.uniqueNotificacion());
		
		System.out.println("Retrieving Mensaje by MensajeCriteria");
		com.mds2.foro.MensajeCriteria dB_DCLMensajeCriteria = new com.mds2.foro.MensajeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//dB_DCLMensajeCriteria.idMensaje.eq();
		System.out.println(dB_DCLMensajeCriteria.uniqueMensaje());
		
		System.out.println("Retrieving Usuarios by UsuariosCriteria");
		com.mds2.foro.UsuariosCriteria dB_DCLUsuariosCriteria = new com.mds2.foro.UsuariosCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//dB_DCLUsuariosCriteria.idUsuario.eq();
		System.out.println(dB_DCLUsuariosCriteria.uniqueUsuarios());
		
		System.out.println("Retrieving Moderador by ModeradorCriteria");
		com.mds2.foro.ModeradorCriteria dB_DCLModeradorCriteria = new com.mds2.foro.ModeradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//dB_DCLModeradorCriteria.idUsuario.eq();
		System.out.println(dB_DCLModeradorCriteria.uniqueModerador());
		
		System.out.println("Retrieving Seccion by SeccionCriteria");
		com.mds2.foro.SeccionCriteria dB_DCLSeccionCriteria = new com.mds2.foro.SeccionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//dB_DCLSeccionCriteria.idSeccion.eq();
		System.out.println(dB_DCLSeccionCriteria.uniqueSeccion());
		
		System.out.println("Retrieving Tema by TemaCriteria");
		com.mds2.foro.TemaCriteria dB_DCLTemaCriteria = new com.mds2.foro.TemaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//dB_DCLTemaCriteria.idTema.eq();
		System.out.println(dB_DCLTemaCriteria.uniqueTema());
		
		System.out.println("Retrieving Anuncio by AnuncioCriteria");
		com.mds2.foro.AnuncioCriteria dB_DCLAnuncioCriteria = new com.mds2.foro.AnuncioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//dB_DCLAnuncioCriteria.idAnuncio.eq();
		System.out.println(dB_DCLAnuncioCriteria.uniqueAnuncio());
		
		System.out.println("Retrieving Ticket by TicketCriteria");
		com.mds2.foro.TicketCriteria dB_DCLTicketCriteria = new com.mds2.foro.TicketCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//dB_DCLTicketCriteria.idTicket.eq();
		System.out.println(dB_DCLTicketCriteria.uniqueTicket());
		
		System.out.println("Retrieving media by mediaCriteria");
		com.mds2.foro.mediaCriteria dB_DCLmediaCriteria = new com.mds2.foro.mediaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//dB_DCLmediaCriteria.idMedia.eq();
		System.out.println(dB_DCLmediaCriteria.uniqueMedia());
		
		System.out.println("Retrieving imagenes by imagenesCriteria");
		com.mds2.foro.imagenesCriteria dB_DCLimagenesCriteria = new com.mds2.foro.imagenesCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//dB_DCLimagenesCriteria.idMedia.eq();
		System.out.println(dB_DCLimagenesCriteria.uniqueImagenes());
		
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		com.mds2.foro.AdministradorCriteria dB_DCLAdministradorCriteria = new com.mds2.foro.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//dB_DCLAdministradorCriteria.idUsuario.eq();
		System.out.println(dB_DCLAdministradorCriteria.uniqueAdministrador());
		
		System.out.println("Retrieving videos by videosCriteria");
		com.mds2.foro.videosCriteria dB_DCLvideosCriteria = new com.mds2.foro.videosCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//dB_DCLvideosCriteria.idMedia.eq();
		System.out.println(dB_DCLvideosCriteria.uniqueVideos());
		
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
