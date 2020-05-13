/**
 * Licensee: aba693(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateMDS11920PFBlancoRoblesData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		try {
			db_dcl.Notificacion dB_DCLNotificacion = db_dcl.NotificacionDAO.loadNotificacionByQuery(null, null);
			// Update the properties of the persistent object
			db_dcl.NotificacionDAO.save(dB_DCLNotificacion);
			db_dcl.Mensaje dB_DCLMensaje = db_dcl.MensajeDAO.loadMensajeByQuery(null, null);
			// Update the properties of the persistent object
			db_dcl.MensajeDAO.save(dB_DCLMensaje);
			db_dcl.Usuarios dB_DCLUsuarios = db_dcl.UsuariosDAO.loadUsuariosByQuery(null, null);
			// Update the properties of the persistent object
			db_dcl.UsuariosDAO.save(dB_DCLUsuarios);
			db_dcl.Moderador dB_DCLModerador = db_dcl.ModeradorDAO.loadModeradorByQuery(null, null);
			// Update the properties of the persistent object
			db_dcl.ModeradorDAO.save(dB_DCLModerador);
			db_dcl.Seccion dB_DCLSeccion = db_dcl.SeccionDAO.loadSeccionByQuery(null, null);
			// Update the properties of the persistent object
			db_dcl.SeccionDAO.save(dB_DCLSeccion);
			db_dcl.Tema dB_DCLTema = db_dcl.TemaDAO.loadTemaByQuery(null, null);
			// Update the properties of the persistent object
			db_dcl.TemaDAO.save(dB_DCLTema);
			db_dcl.Anuncio dB_DCLAnuncio = db_dcl.AnuncioDAO.loadAnuncioByQuery(null, null);
			// Update the properties of the persistent object
			db_dcl.AnuncioDAO.save(dB_DCLAnuncio);
			db_dcl.Ticket dB_DCLTicket = db_dcl.TicketDAO.loadTicketByQuery(null, null);
			// Update the properties of the persistent object
			db_dcl.TicketDAO.save(dB_DCLTicket);
			db_dcl.media dB_DCLmedia = db_dcl.mediaDAO.loadMediaByQuery(null, null);
			// Update the properties of the persistent object
			db_dcl.mediaDAO.save(dB_DCLmedia);
			db_dcl.imagenes dB_DCLimagenes = db_dcl.imagenesDAO.loadImagenesByQuery(null, null);
			// Update the properties of the persistent object
			db_dcl.imagenesDAO.save(dB_DCLimagenes);
			db_dcl.Administrador dB_DCLAdministrador = db_dcl.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			db_dcl.AdministradorDAO.save(dB_DCLAdministrador);
			db_dcl.videos dB_DCLvideos = db_dcl.videosDAO.loadVideosByQuery(null, null);
			// Update the properties of the persistent object
			db_dcl.videosDAO.save(dB_DCLvideos);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Notificacion by NotificacionCriteria");
		db_dcl.NotificacionCriteria dB_DCLNotificacionCriteria = new db_dcl.NotificacionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//dB_DCLNotificacionCriteria.idNotificacion.eq();
		System.out.println(dB_DCLNotificacionCriteria.uniqueNotificacion());
		
		System.out.println("Retrieving Mensaje by MensajeCriteria");
		db_dcl.MensajeCriteria dB_DCLMensajeCriteria = new db_dcl.MensajeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//dB_DCLMensajeCriteria.idMensaje.eq();
		System.out.println(dB_DCLMensajeCriteria.uniqueMensaje());
		
		System.out.println("Retrieving Usuarios by UsuariosCriteria");
		db_dcl.UsuariosCriteria dB_DCLUsuariosCriteria = new db_dcl.UsuariosCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//dB_DCLUsuariosCriteria.idUsuario.eq();
		System.out.println(dB_DCLUsuariosCriteria.uniqueUsuarios());
		
		System.out.println("Retrieving Moderador by ModeradorCriteria");
		db_dcl.ModeradorCriteria dB_DCLModeradorCriteria = new db_dcl.ModeradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//dB_DCLModeradorCriteria.idUsuario.eq();
		System.out.println(dB_DCLModeradorCriteria.uniqueModerador());
		
		System.out.println("Retrieving Seccion by SeccionCriteria");
		db_dcl.SeccionCriteria dB_DCLSeccionCriteria = new db_dcl.SeccionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//dB_DCLSeccionCriteria.idSeccion.eq();
		System.out.println(dB_DCLSeccionCriteria.uniqueSeccion());
		
		System.out.println("Retrieving Tema by TemaCriteria");
		db_dcl.TemaCriteria dB_DCLTemaCriteria = new db_dcl.TemaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//dB_DCLTemaCriteria.idTema.eq();
		System.out.println(dB_DCLTemaCriteria.uniqueTema());
		
		System.out.println("Retrieving Anuncio by AnuncioCriteria");
		db_dcl.AnuncioCriteria dB_DCLAnuncioCriteria = new db_dcl.AnuncioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//dB_DCLAnuncioCriteria.idAnuncio.eq();
		System.out.println(dB_DCLAnuncioCriteria.uniqueAnuncio());
		
		System.out.println("Retrieving Ticket by TicketCriteria");
		db_dcl.TicketCriteria dB_DCLTicketCriteria = new db_dcl.TicketCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//dB_DCLTicketCriteria.idTicket.eq();
		System.out.println(dB_DCLTicketCriteria.uniqueTicket());
		
		System.out.println("Retrieving media by mediaCriteria");
		db_dcl.mediaCriteria dB_DCLmediaCriteria = new db_dcl.mediaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//dB_DCLmediaCriteria.idMedia.eq();
		System.out.println(dB_DCLmediaCriteria.uniqueMedia());
		
		System.out.println("Retrieving imagenes by imagenesCriteria");
		db_dcl.imagenesCriteria dB_DCLimagenesCriteria = new db_dcl.imagenesCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//dB_DCLimagenesCriteria.idMedia.eq();
		System.out.println(dB_DCLimagenesCriteria.uniqueImagenes());
		
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		db_dcl.AdministradorCriteria dB_DCLAdministradorCriteria = new db_dcl.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//dB_DCLAdministradorCriteria.idUsuario.eq();
		System.out.println(dB_DCLAdministradorCriteria.uniqueAdministrador());
		
		System.out.println("Retrieving videos by videosCriteria");
		db_dcl.videosCriteria dB_DCLvideosCriteria = new db_dcl.videosCriteria();
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
				db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
