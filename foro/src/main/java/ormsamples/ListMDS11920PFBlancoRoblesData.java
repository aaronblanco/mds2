/**
 * Licensee: aba693(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListMDS11920PFBlancoRoblesData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Notificacion...");
		db_dcl.Notificacion[] dB_DCLNotificacions = db_dcl.NotificacionDAO.listNotificacionByQuery(null, null);
		int length = Math.min(dB_DCLNotificacions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dB_DCLNotificacions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Mensaje...");
		db_dcl.Mensaje[] dB_DCLMensajes = db_dcl.MensajeDAO.listMensajeByQuery(null, null);
		length = Math.min(dB_DCLMensajes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dB_DCLMensajes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuarios...");
		db_dcl.Usuarios[] dB_DCLUsuarioses = db_dcl.UsuariosDAO.listUsuariosByQuery(null, null);
		length = Math.min(dB_DCLUsuarioses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dB_DCLUsuarioses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Moderador...");
		db_dcl.Moderador[] dB_DCLModeradors = db_dcl.ModeradorDAO.listModeradorByQuery(null, null);
		length = Math.min(dB_DCLModeradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dB_DCLModeradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Seccion...");
		db_dcl.Seccion[] dB_DCLSeccions = db_dcl.SeccionDAO.listSeccionByQuery(null, null);
		length = Math.min(dB_DCLSeccions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dB_DCLSeccions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tema...");
		db_dcl.Tema[] dB_DCLTemas = db_dcl.TemaDAO.listTemaByQuery(null, null);
		length = Math.min(dB_DCLTemas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dB_DCLTemas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Anuncio...");
		db_dcl.Anuncio[] dB_DCLAnuncios = db_dcl.AnuncioDAO.listAnuncioByQuery(null, null);
		length = Math.min(dB_DCLAnuncios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dB_DCLAnuncios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Ticket...");
		db_dcl.Ticket[] dB_DCLTickets = db_dcl.TicketDAO.listTicketByQuery(null, null);
		length = Math.min(dB_DCLTickets.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dB_DCLTickets[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing media...");
		db_dcl.media[] dB_DCLmedias = db_dcl.mediaDAO.listMediaByQuery(null, null);
		length = Math.min(dB_DCLmedias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dB_DCLmedias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing imagenes...");
		db_dcl.imagenes[] dB_DCLimageneses = db_dcl.imagenesDAO.listImagenesByQuery(null, null);
		length = Math.min(dB_DCLimageneses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dB_DCLimageneses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador...");
		db_dcl.Administrador[] dB_DCLAdministradors = db_dcl.AdministradorDAO.listAdministradorByQuery(null, null);
		length = Math.min(dB_DCLAdministradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dB_DCLAdministradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing videos...");
		db_dcl.videos[] dB_DCLvideoses = db_dcl.videosDAO.listVideosByQuery(null, null);
		length = Math.min(dB_DCLvideoses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dB_DCLvideoses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Notificacion by Criteria...");
		db_dcl.NotificacionCriteria dB_DCLNotificacionCriteria = new db_dcl.NotificacionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//dB_DCLNotificacionCriteria.idNotificacion.eq();
		dB_DCLNotificacionCriteria.setMaxResults(ROW_COUNT);
		db_dcl.Notificacion[] dB_DCLNotificacions = dB_DCLNotificacionCriteria.listNotificacion();
		int length =dB_DCLNotificacions== null ? 0 : Math.min(dB_DCLNotificacions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dB_DCLNotificacions[i]);
		}
		System.out.println(length + " Notificacion record(s) retrieved."); 
		
		System.out.println("Listing Mensaje by Criteria...");
		db_dcl.MensajeCriteria dB_DCLMensajeCriteria = new db_dcl.MensajeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//dB_DCLMensajeCriteria.idMensaje.eq();
		dB_DCLMensajeCriteria.setMaxResults(ROW_COUNT);
		db_dcl.Mensaje[] dB_DCLMensajes = dB_DCLMensajeCriteria.listMensaje();
		length =dB_DCLMensajes== null ? 0 : Math.min(dB_DCLMensajes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dB_DCLMensajes[i]);
		}
		System.out.println(length + " Mensaje record(s) retrieved."); 
		
		System.out.println("Listing Usuarios by Criteria...");
		db_dcl.UsuariosCriteria dB_DCLUsuariosCriteria = new db_dcl.UsuariosCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//dB_DCLUsuariosCriteria.idUsuario.eq();
		dB_DCLUsuariosCriteria.setMaxResults(ROW_COUNT);
		db_dcl.Usuarios[] dB_DCLUsuarioses = dB_DCLUsuariosCriteria.listUsuarios();
		length =dB_DCLUsuarioses== null ? 0 : Math.min(dB_DCLUsuarioses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dB_DCLUsuarioses[i]);
		}
		System.out.println(length + " Usuarios record(s) retrieved."); 
		
		System.out.println("Listing Moderador by Criteria...");
		db_dcl.ModeradorCriteria dB_DCLModeradorCriteria = new db_dcl.ModeradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//dB_DCLModeradorCriteria.idUsuario.eq();
		dB_DCLModeradorCriteria.setMaxResults(ROW_COUNT);
		db_dcl.Moderador[] dB_DCLModeradors = dB_DCLModeradorCriteria.listModerador();
		length =dB_DCLModeradors== null ? 0 : Math.min(dB_DCLModeradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dB_DCLModeradors[i]);
		}
		System.out.println(length + " Moderador record(s) retrieved."); 
		
		System.out.println("Listing Seccion by Criteria...");
		db_dcl.SeccionCriteria dB_DCLSeccionCriteria = new db_dcl.SeccionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//dB_DCLSeccionCriteria.idSeccion.eq();
		dB_DCLSeccionCriteria.setMaxResults(ROW_COUNT);
		db_dcl.Seccion[] dB_DCLSeccions = dB_DCLSeccionCriteria.listSeccion();
		length =dB_DCLSeccions== null ? 0 : Math.min(dB_DCLSeccions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dB_DCLSeccions[i]);
		}
		System.out.println(length + " Seccion record(s) retrieved."); 
		
		System.out.println("Listing Tema by Criteria...");
		db_dcl.TemaCriteria dB_DCLTemaCriteria = new db_dcl.TemaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//dB_DCLTemaCriteria.idTema.eq();
		dB_DCLTemaCriteria.setMaxResults(ROW_COUNT);
		db_dcl.Tema[] dB_DCLTemas = dB_DCLTemaCriteria.listTema();
		length =dB_DCLTemas== null ? 0 : Math.min(dB_DCLTemas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dB_DCLTemas[i]);
		}
		System.out.println(length + " Tema record(s) retrieved."); 
		
		System.out.println("Listing Anuncio by Criteria...");
		db_dcl.AnuncioCriteria dB_DCLAnuncioCriteria = new db_dcl.AnuncioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//dB_DCLAnuncioCriteria.idAnuncio.eq();
		dB_DCLAnuncioCriteria.setMaxResults(ROW_COUNT);
		db_dcl.Anuncio[] dB_DCLAnuncios = dB_DCLAnuncioCriteria.listAnuncio();
		length =dB_DCLAnuncios== null ? 0 : Math.min(dB_DCLAnuncios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dB_DCLAnuncios[i]);
		}
		System.out.println(length + " Anuncio record(s) retrieved."); 
		
		System.out.println("Listing Ticket by Criteria...");
		db_dcl.TicketCriteria dB_DCLTicketCriteria = new db_dcl.TicketCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//dB_DCLTicketCriteria.idTicket.eq();
		dB_DCLTicketCriteria.setMaxResults(ROW_COUNT);
		db_dcl.Ticket[] dB_DCLTickets = dB_DCLTicketCriteria.listTicket();
		length =dB_DCLTickets== null ? 0 : Math.min(dB_DCLTickets.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dB_DCLTickets[i]);
		}
		System.out.println(length + " Ticket record(s) retrieved."); 
		
		System.out.println("Listing media by Criteria...");
		db_dcl.mediaCriteria dB_DCLmediaCriteria = new db_dcl.mediaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//dB_DCLmediaCriteria.idMedia.eq();
		dB_DCLmediaCriteria.setMaxResults(ROW_COUNT);
		db_dcl.media[] dB_DCLmedias = dB_DCLmediaCriteria.listMedia();
		length =dB_DCLmedias== null ? 0 : Math.min(dB_DCLmedias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dB_DCLmedias[i]);
		}
		System.out.println(length + " media record(s) retrieved."); 
		
		System.out.println("Listing imagenes by Criteria...");
		db_dcl.imagenesCriteria dB_DCLimagenesCriteria = new db_dcl.imagenesCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//dB_DCLimagenesCriteria.idMedia.eq();
		dB_DCLimagenesCriteria.setMaxResults(ROW_COUNT);
		db_dcl.imagenes[] dB_DCLimageneses = dB_DCLimagenesCriteria.listImagenes();
		length =dB_DCLimageneses== null ? 0 : Math.min(dB_DCLimageneses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dB_DCLimageneses[i]);
		}
		System.out.println(length + " imagenes record(s) retrieved."); 
		
		System.out.println("Listing Administrador by Criteria...");
		db_dcl.AdministradorCriteria dB_DCLAdministradorCriteria = new db_dcl.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//dB_DCLAdministradorCriteria.idUsuario.eq();
		dB_DCLAdministradorCriteria.setMaxResults(ROW_COUNT);
		db_dcl.Administrador[] dB_DCLAdministradors = dB_DCLAdministradorCriteria.listAdministrador();
		length =dB_DCLAdministradors== null ? 0 : Math.min(dB_DCLAdministradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dB_DCLAdministradors[i]);
		}
		System.out.println(length + " Administrador record(s) retrieved."); 
		
		System.out.println("Listing videos by Criteria...");
		db_dcl.videosCriteria dB_DCLvideosCriteria = new db_dcl.videosCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//dB_DCLvideosCriteria.idMedia.eq();
		dB_DCLvideosCriteria.setMaxResults(ROW_COUNT);
		db_dcl.videos[] dB_DCLvideoses = dB_DCLvideosCriteria.listVideos();
		length =dB_DCLvideoses== null ? 0 : Math.min(dB_DCLvideoses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dB_DCLvideoses[i]);
		}
		System.out.println(length + " videos record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListMDS11920PFBlancoRoblesData listMDS11920PFBlancoRoblesData = new ListMDS11920PFBlancoRoblesData();
			try {
				listMDS11920PFBlancoRoblesData.listTestData();
				//listMDS11920PFBlancoRoblesData.listByCriteria();
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
