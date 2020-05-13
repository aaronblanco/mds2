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
		com.mds2.foro.NotificacionBD[] dB_DCLNotificacions = com.mds2.foro.NotificacionDAO.listNotificacionByQuery(null, null);
		int length = Math.min(dB_DCLNotificacions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dB_DCLNotificacions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Mensaje...");
		com.mds2.foro.MensajeBD[] dB_DCLMensajes = com.mds2.foro.MensajeDAO.listMensajeByQuery(null, null);
		length = Math.min(dB_DCLMensajes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dB_DCLMensajes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuarios...");
		com.mds2.foro.UsuariosBD[] dB_DCLUsuarioses = com.mds2.foro.UsuariosDAO.listUsuariosByQuery(null, null);
		length = Math.min(dB_DCLUsuarioses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dB_DCLUsuarioses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Moderador...");
		com.mds2.foro.ModeradorBD[] dB_DCLModeradors = com.mds2.foro.ModeradorDAO.listModeradorByQuery(null, null);
		length = Math.min(dB_DCLModeradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dB_DCLModeradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Seccion...");
		com.mds2.foro.SeccionBD[] dB_DCLSeccions = com.mds2.foro.SeccionDAO.listSeccionByQuery(null, null);
		length = Math.min(dB_DCLSeccions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dB_DCLSeccions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tema...");
		com.mds2.foro.TemaBD[] dB_DCLTemas = com.mds2.foro.TemaDAO.listTemaByQuery(null, null);
		length = Math.min(dB_DCLTemas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dB_DCLTemas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Anuncio...");
		com.mds2.foro.AnuncioBD[] dB_DCLAnuncios = com.mds2.foro.AnuncioDAO.listAnuncioByQuery(null, null);
		length = Math.min(dB_DCLAnuncios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dB_DCLAnuncios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Ticket...");
		com.mds2.foro.TicketBD[] dB_DCLTickets = com.mds2.foro.TicketDAO.listTicketByQuery(null, null);
		length = Math.min(dB_DCLTickets.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dB_DCLTickets[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing media...");
		com.mds2.foro.media[] dB_DCLmedias = com.mds2.foro.mediaDAO.listMediaByQuery(null, null);
		length = Math.min(dB_DCLmedias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dB_DCLmedias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing imagenes...");
		com.mds2.foro.imagenes[] dB_DCLimageneses = com.mds2.foro.imagenesDAO.listImagenesByQuery(null, null);
		length = Math.min(dB_DCLimageneses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dB_DCLimageneses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador...");
		com.mds2.foro.AdministradorBD[] dB_DCLAdministradors = com.mds2.foro.AdministradorDAO.listAdministradorByQuery(null, null);
		length = Math.min(dB_DCLAdministradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dB_DCLAdministradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing videos...");
		com.mds2.foro.videos[] dB_DCLvideoses = com.mds2.foro.videosDAO.listVideosByQuery(null, null);
		length = Math.min(dB_DCLvideoses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dB_DCLvideoses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Notificacion by Criteria...");
		com.mds2.foro.NotificacionCriteria dB_DCLNotificacionCriteria = new com.mds2.foro.NotificacionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//dB_DCLNotificacionCriteria.idNotificacion.eq();
		dB_DCLNotificacionCriteria.setMaxResults(ROW_COUNT);
		com.mds2.foro.NotificacionBD[] dB_DCLNotificacions = dB_DCLNotificacionCriteria.listNotificacion();
		int length =dB_DCLNotificacions== null ? 0 : Math.min(dB_DCLNotificacions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dB_DCLNotificacions[i]);
		}
		System.out.println(length + " Notificacion record(s) retrieved."); 
		
		System.out.println("Listing Mensaje by Criteria...");
		com.mds2.foro.MensajeCriteria dB_DCLMensajeCriteria = new com.mds2.foro.MensajeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//dB_DCLMensajeCriteria.idMensaje.eq();
		dB_DCLMensajeCriteria.setMaxResults(ROW_COUNT);
		com.mds2.foro.MensajeBD[] dB_DCLMensajes = dB_DCLMensajeCriteria.listMensaje();
		length =dB_DCLMensajes== null ? 0 : Math.min(dB_DCLMensajes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dB_DCLMensajes[i]);
		}
		System.out.println(length + " Mensaje record(s) retrieved."); 
		
		System.out.println("Listing Usuarios by Criteria...");
		com.mds2.foro.UsuariosCriteria dB_DCLUsuariosCriteria = new com.mds2.foro.UsuariosCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//dB_DCLUsuariosCriteria.idUsuario.eq();
		dB_DCLUsuariosCriteria.setMaxResults(ROW_COUNT);
		com.mds2.foro.UsuariosBD[] dB_DCLUsuarioses = dB_DCLUsuariosCriteria.listUsuarios();
		length =dB_DCLUsuarioses== null ? 0 : Math.min(dB_DCLUsuarioses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dB_DCLUsuarioses[i]);
		}
		System.out.println(length + " Usuarios record(s) retrieved."); 
		
		System.out.println("Listing Moderador by Criteria...");
		com.mds2.foro.ModeradorCriteria dB_DCLModeradorCriteria = new com.mds2.foro.ModeradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//dB_DCLModeradorCriteria.idUsuario.eq();
		dB_DCLModeradorCriteria.setMaxResults(ROW_COUNT);
		com.mds2.foro.ModeradorBD[] dB_DCLModeradors = dB_DCLModeradorCriteria.listModerador();
		length =dB_DCLModeradors== null ? 0 : Math.min(dB_DCLModeradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dB_DCLModeradors[i]);
		}
		System.out.println(length + " Moderador record(s) retrieved."); 
		
		System.out.println("Listing Seccion by Criteria...");
		com.mds2.foro.SeccionCriteria dB_DCLSeccionCriteria = new com.mds2.foro.SeccionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//dB_DCLSeccionCriteria.idSeccion.eq();
		dB_DCLSeccionCriteria.setMaxResults(ROW_COUNT);
		com.mds2.foro.SeccionBD[] dB_DCLSeccions = dB_DCLSeccionCriteria.listSeccion();
		length =dB_DCLSeccions== null ? 0 : Math.min(dB_DCLSeccions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dB_DCLSeccions[i]);
		}
		System.out.println(length + " Seccion record(s) retrieved."); 
		
		System.out.println("Listing Tema by Criteria...");
		com.mds2.foro.TemaCriteria dB_DCLTemaCriteria = new com.mds2.foro.TemaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//dB_DCLTemaCriteria.idTema.eq();
		dB_DCLTemaCriteria.setMaxResults(ROW_COUNT);
		com.mds2.foro.TemaBD[] dB_DCLTemas = dB_DCLTemaCriteria.listTema();
		length =dB_DCLTemas== null ? 0 : Math.min(dB_DCLTemas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dB_DCLTemas[i]);
		}
		System.out.println(length + " Tema record(s) retrieved."); 
		
		System.out.println("Listing Anuncio by Criteria...");
		com.mds2.foro.AnuncioCriteria dB_DCLAnuncioCriteria = new com.mds2.foro.AnuncioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//dB_DCLAnuncioCriteria.idAnuncio.eq();
		dB_DCLAnuncioCriteria.setMaxResults(ROW_COUNT);
		com.mds2.foro.AnuncioBD[] dB_DCLAnuncios = dB_DCLAnuncioCriteria.listAnuncio();
		length =dB_DCLAnuncios== null ? 0 : Math.min(dB_DCLAnuncios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dB_DCLAnuncios[i]);
		}
		System.out.println(length + " Anuncio record(s) retrieved."); 
		
		System.out.println("Listing Ticket by Criteria...");
		com.mds2.foro.TicketCriteria dB_DCLTicketCriteria = new com.mds2.foro.TicketCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//dB_DCLTicketCriteria.idTicket.eq();
		dB_DCLTicketCriteria.setMaxResults(ROW_COUNT);
		com.mds2.foro.TicketBD[] dB_DCLTickets = dB_DCLTicketCriteria.listTicket();
		length =dB_DCLTickets== null ? 0 : Math.min(dB_DCLTickets.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dB_DCLTickets[i]);
		}
		System.out.println(length + " Ticket record(s) retrieved."); 
		
		System.out.println("Listing media by Criteria...");
		com.mds2.foro.mediaCriteria dB_DCLmediaCriteria = new com.mds2.foro.mediaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//dB_DCLmediaCriteria.idMedia.eq();
		dB_DCLmediaCriteria.setMaxResults(ROW_COUNT);
		com.mds2.foro.media[] dB_DCLmedias = dB_DCLmediaCriteria.listMedia();
		length =dB_DCLmedias== null ? 0 : Math.min(dB_DCLmedias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dB_DCLmedias[i]);
		}
		System.out.println(length + " media record(s) retrieved."); 
		
		System.out.println("Listing imagenes by Criteria...");
		com.mds2.foro.imagenesCriteria dB_DCLimagenesCriteria = new com.mds2.foro.imagenesCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//dB_DCLimagenesCriteria.idMedia.eq();
		dB_DCLimagenesCriteria.setMaxResults(ROW_COUNT);
		com.mds2.foro.imagenes[] dB_DCLimageneses = dB_DCLimagenesCriteria.listImagenes();
		length =dB_DCLimageneses== null ? 0 : Math.min(dB_DCLimageneses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dB_DCLimageneses[i]);
		}
		System.out.println(length + " imagenes record(s) retrieved."); 
		
		System.out.println("Listing Administrador by Criteria...");
		com.mds2.foro.AdministradorCriteria dB_DCLAdministradorCriteria = new com.mds2.foro.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//dB_DCLAdministradorCriteria.idUsuario.eq();
		dB_DCLAdministradorCriteria.setMaxResults(ROW_COUNT);
		com.mds2.foro.AdministradorBD[] dB_DCLAdministradors = dB_DCLAdministradorCriteria.listAdministrador();
		length =dB_DCLAdministradors== null ? 0 : Math.min(dB_DCLAdministradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dB_DCLAdministradors[i]);
		}
		System.out.println(length + " Administrador record(s) retrieved."); 
		
		System.out.println("Listing videos by Criteria...");
		com.mds2.foro.videosCriteria dB_DCLvideosCriteria = new com.mds2.foro.videosCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//dB_DCLvideosCriteria.idMedia.eq();
		dB_DCLvideosCriteria.setMaxResults(ROW_COUNT);
		com.mds2.foro.videos[] dB_DCLvideoses = dB_DCLvideosCriteria.listVideos();
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
				com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
