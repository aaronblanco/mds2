/**
 * Licensee: trm187(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListMDS11920PFBlancoRoblesData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Notificacion...");
		com.mds2.foro.Notificacion[] commds2foroNotificacions = com.mds2.foro.NotificacionDAO.listNotificacionByQuery(null, null);
		int length = Math.min(commds2foroNotificacions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commds2foroNotificacions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Mensaje...");
		com.mds2.foro.Mensaje[] commds2foroMensajes = com.mds2.foro.MensajeDAO.listMensajeByQuery(null, null);
		length = Math.min(commds2foroMensajes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commds2foroMensajes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuarios...");
		com.mds2.foro.Usuarios[] commds2foroUsuarioses = com.mds2.foro.UsuariosDAO.listUsuariosByQuery(null, null);
		length = Math.min(commds2foroUsuarioses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commds2foroUsuarioses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Moderador...");
		com.mds2.foro.Moderador[] commds2foroModeradors = com.mds2.foro.ModeradorDAO.listModeradorByQuery(null, null);
		length = Math.min(commds2foroModeradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commds2foroModeradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Seccion...");
		com.mds2.foro.Seccion[] commds2foroSeccions = com.mds2.foro.SeccionDAO.listSeccionByQuery(null, null);
		length = Math.min(commds2foroSeccions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commds2foroSeccions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tema...");
		com.mds2.foro.Tema[] commds2foroTemas = com.mds2.foro.TemaDAO.listTemaByQuery(null, null);
		length = Math.min(commds2foroTemas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commds2foroTemas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Anuncio...");
		com.mds2.foro.Anuncio[] commds2foroAnuncios = com.mds2.foro.AnuncioDAO.listAnuncioByQuery(null, null);
		length = Math.min(commds2foroAnuncios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commds2foroAnuncios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Ticket...");
		com.mds2.foro.Ticket[] commds2foroTickets = com.mds2.foro.TicketDAO.listTicketByQuery(null, null);
		length = Math.min(commds2foroTickets.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commds2foroTickets[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing media...");
		com.mds2.foro.media[] commds2foromedias = com.mds2.foro.mediaDAO.listMediaByQuery(null, null);
		length = Math.min(commds2foromedias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commds2foromedias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing imagenes...");
		com.mds2.foro.imagenes[] commds2foroimageneses = com.mds2.foro.imagenesDAO.listImagenesByQuery(null, null);
		length = Math.min(commds2foroimageneses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commds2foroimageneses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador...");
		com.mds2.foro.Administrador[] commds2foroAdministradors = com.mds2.foro.AdministradorDAO.listAdministradorByQuery(null, null);
		length = Math.min(commds2foroAdministradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commds2foroAdministradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing videos...");
		com.mds2.foro.videos[] commds2forovideoses = com.mds2.foro.videosDAO.listVideosByQuery(null, null);
		length = Math.min(commds2forovideoses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commds2forovideoses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Notificacion by Criteria...");
		com.mds2.foro.NotificacionCriteria lcommds2foroNotificacionCriteria = new com.mds2.foro.NotificacionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommds2foroNotificacionCriteria.idNotificacion.eq();
		lcommds2foroNotificacionCriteria.setMaxResults(ROW_COUNT);
		com.mds2.foro.Notificacion[] commds2foroNotificacions = lcommds2foroNotificacionCriteria.listNotificacion();
		int length =commds2foroNotificacions== null ? 0 : Math.min(commds2foroNotificacions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commds2foroNotificacions[i]);
		}
		System.out.println(length + " Notificacion record(s) retrieved."); 
		
		System.out.println("Listing Mensaje by Criteria...");
		com.mds2.foro.MensajeCriteria lcommds2foroMensajeCriteria = new com.mds2.foro.MensajeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommds2foroMensajeCriteria.idMensaje.eq();
		lcommds2foroMensajeCriteria.setMaxResults(ROW_COUNT);
		com.mds2.foro.Mensaje[] commds2foroMensajes = lcommds2foroMensajeCriteria.listMensaje();
		length =commds2foroMensajes== null ? 0 : Math.min(commds2foroMensajes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commds2foroMensajes[i]);
		}
		System.out.println(length + " Mensaje record(s) retrieved."); 
		
		System.out.println("Listing Usuarios by Criteria...");
		com.mds2.foro.UsuariosCriteria lcommds2foroUsuariosCriteria = new com.mds2.foro.UsuariosCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommds2foroUsuariosCriteria.idUsuario.eq();
		lcommds2foroUsuariosCriteria.setMaxResults(ROW_COUNT);
		com.mds2.foro.Usuarios[] commds2foroUsuarioses = lcommds2foroUsuariosCriteria.listUsuarios();
		length =commds2foroUsuarioses== null ? 0 : Math.min(commds2foroUsuarioses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commds2foroUsuarioses[i]);
		}
		System.out.println(length + " Usuarios record(s) retrieved."); 
		
		System.out.println("Listing Moderador by Criteria...");
		com.mds2.foro.ModeradorCriteria lcommds2foroModeradorCriteria = new com.mds2.foro.ModeradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommds2foroModeradorCriteria.idUsuario.eq();
		lcommds2foroModeradorCriteria.setMaxResults(ROW_COUNT);
		com.mds2.foro.Moderador[] commds2foroModeradors = lcommds2foroModeradorCriteria.listModerador();
		length =commds2foroModeradors== null ? 0 : Math.min(commds2foroModeradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commds2foroModeradors[i]);
		}
		System.out.println(length + " Moderador record(s) retrieved."); 
		
		System.out.println("Listing Seccion by Criteria...");
		com.mds2.foro.SeccionCriteria lcommds2foroSeccionCriteria = new com.mds2.foro.SeccionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommds2foroSeccionCriteria.idSeccion.eq();
		lcommds2foroSeccionCriteria.setMaxResults(ROW_COUNT);
		com.mds2.foro.Seccion[] commds2foroSeccions = lcommds2foroSeccionCriteria.listSeccion();
		length =commds2foroSeccions== null ? 0 : Math.min(commds2foroSeccions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commds2foroSeccions[i]);
		}
		System.out.println(length + " Seccion record(s) retrieved."); 
		
		System.out.println("Listing Tema by Criteria...");
		com.mds2.foro.TemaCriteria lcommds2foroTemaCriteria = new com.mds2.foro.TemaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommds2foroTemaCriteria.idTema.eq();
		lcommds2foroTemaCriteria.setMaxResults(ROW_COUNT);
		com.mds2.foro.Tema[] commds2foroTemas = lcommds2foroTemaCriteria.listTema();
		length =commds2foroTemas== null ? 0 : Math.min(commds2foroTemas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commds2foroTemas[i]);
		}
		System.out.println(length + " Tema record(s) retrieved."); 
		
		System.out.println("Listing Anuncio by Criteria...");
		com.mds2.foro.AnuncioCriteria lcommds2foroAnuncioCriteria = new com.mds2.foro.AnuncioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommds2foroAnuncioCriteria.idAnuncio.eq();
		lcommds2foroAnuncioCriteria.setMaxResults(ROW_COUNT);
		com.mds2.foro.Anuncio[] commds2foroAnuncios = lcommds2foroAnuncioCriteria.listAnuncio();
		length =commds2foroAnuncios== null ? 0 : Math.min(commds2foroAnuncios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commds2foroAnuncios[i]);
		}
		System.out.println(length + " Anuncio record(s) retrieved."); 
		
		System.out.println("Listing Ticket by Criteria...");
		com.mds2.foro.TicketCriteria lcommds2foroTicketCriteria = new com.mds2.foro.TicketCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommds2foroTicketCriteria.idTicket.eq();
		lcommds2foroTicketCriteria.setMaxResults(ROW_COUNT);
		com.mds2.foro.Ticket[] commds2foroTickets = lcommds2foroTicketCriteria.listTicket();
		length =commds2foroTickets== null ? 0 : Math.min(commds2foroTickets.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commds2foroTickets[i]);
		}
		System.out.println(length + " Ticket record(s) retrieved."); 
		
		System.out.println("Listing media by Criteria...");
		com.mds2.foro.mediaCriteria lcommds2foromediaCriteria = new com.mds2.foro.mediaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommds2foromediaCriteria.idMedia.eq();
		lcommds2foromediaCriteria.setMaxResults(ROW_COUNT);
		com.mds2.foro.media[] commds2foromedias = lcommds2foromediaCriteria.listMedia();
		length =commds2foromedias== null ? 0 : Math.min(commds2foromedias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commds2foromedias[i]);
		}
		System.out.println(length + " media record(s) retrieved."); 
		
		System.out.println("Listing imagenes by Criteria...");
		com.mds2.foro.imagenesCriteria lcommds2foroimagenesCriteria = new com.mds2.foro.imagenesCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommds2foroimagenesCriteria.idMedia.eq();
		lcommds2foroimagenesCriteria.setMaxResults(ROW_COUNT);
		com.mds2.foro.imagenes[] commds2foroimageneses = lcommds2foroimagenesCriteria.listImagenes();
		length =commds2foroimageneses== null ? 0 : Math.min(commds2foroimageneses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commds2foroimageneses[i]);
		}
		System.out.println(length + " imagenes record(s) retrieved."); 
		
		System.out.println("Listing Administrador by Criteria...");
		com.mds2.foro.AdministradorCriteria lcommds2foroAdministradorCriteria = new com.mds2.foro.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommds2foroAdministradorCriteria.idUsuario.eq();
		lcommds2foroAdministradorCriteria.setMaxResults(ROW_COUNT);
		com.mds2.foro.Administrador[] commds2foroAdministradors = lcommds2foroAdministradorCriteria.listAdministrador();
		length =commds2foroAdministradors== null ? 0 : Math.min(commds2foroAdministradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commds2foroAdministradors[i]);
		}
		System.out.println(length + " Administrador record(s) retrieved."); 
		
		System.out.println("Listing videos by Criteria...");
		com.mds2.foro.videosCriteria lcommds2forovideosCriteria = new com.mds2.foro.videosCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommds2forovideosCriteria.idMedia.eq();
		lcommds2forovideosCriteria.setMaxResults(ROW_COUNT);
		com.mds2.foro.videos[] commds2forovideoses = lcommds2forovideosCriteria.listVideos();
		length =commds2forovideoses== null ? 0 : Math.min(commds2forovideoses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commds2forovideoses[i]);
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
