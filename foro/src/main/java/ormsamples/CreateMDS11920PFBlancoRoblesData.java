/**
 * Licensee: aba693(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateMDS11920PFBlancoRoblesData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		try {
			com.mds2.foro.NotificacionBD dB_DCLNotificacion = com.mds2.foro.NotificacionDAO.createNotificacion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : idUsuarioPropietario, usuarios
			com.mds2.foro.NotificacionDAO.save(dB_DCLNotificacion);
			com.mds2.foro.MensajeBD dB_DCLMensaje = com.mds2.foro.MensajeDAO.createMensaje();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene_imagenes, eliminado, publico, idMedia, idPropietario, idTemaPropietario, numTotalMensajes, fechaCreacion, numMg, usuarios
			com.mds2.foro.MensajeDAO.save(dB_DCLMensaje);
			com.mds2.foro.UsuariosBD dB_DCLUsuarios = com.mds2.foro.UsuariosDAO.createUsuarios();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : usuariosAmigos, notificaciones, pro_secciones, pro_temas, usuarios, pro_mensajes, pro_tickets, oculto, publico, sancionado, amonestado
			com.mds2.foro.UsuariosDAO.save(dB_DCLUsuarios);
			com.mds2.foro.ModeradorBD dB_DCLModerador = com.mds2.foro.ModeradorDAO.createModerador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : idMod
			com.mds2.foro.ModeradorDAO.save(dB_DCLModerador);
			com.mds2.foro.SeccionBD dB_DCLSeccion = com.mds2.foro.SeccionDAO.createSeccion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene_temas, eliminado, oculto, privado, publico, idPropietarioSeccion, fecha, usuarios
			com.mds2.foro.SeccionDAO.save(dB_DCLSeccion);
			com.mds2.foro.TemaBD dB_DCLTema = com.mds2.foro.TemaDAO.createTema();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene_mensajes, eliminado, oculto, privado, publico, idTemaPropietario, fecha, usuarios
			com.mds2.foro.TemaDAO.save(dB_DCLTema);
			com.mds2.foro.AnuncioBD dB_DCLAnuncio = com.mds2.foro.AnuncioDAO.createAnuncio();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : publicado
			com.mds2.foro.AnuncioDAO.save(dB_DCLAnuncio);
			com.mds2.foro.TicketBD dB_DCLTicket = com.mds2.foro.TicketDAO.createTicket();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cerrado, abierto, usuarios
			com.mds2.foro.TicketDAO.save(dB_DCLTicket);
			com.mds2.foro.media dB_DCLmedia = com.mds2.foro.mediaDAO.createMedia();
			// Initialize the properties of the persistent object here
			com.mds2.foro.mediaDAO.save(dB_DCLmedia);
			com.mds2.foro.imagenes dB_DCLimagenes = com.mds2.foro.imagenesDAO.createImagenes();
			// Initialize the properties of the persistent object here
			com.mds2.foro.imagenesDAO.save(dB_DCLimagenes);
			com.mds2.foro.AdministradorBD dB_DCLAdministrador = com.mds2.foro.AdministradorDAO.createAdministrador();
			// Initialize the properties of the persistent object here
			com.mds2.foro.AdministradorDAO.save(dB_DCLAdministrador);
			com.mds2.foro.videos dB_DCLvideos = com.mds2.foro.videosDAO.createVideos();
			// Initialize the properties of the persistent object here
			com.mds2.foro.videosDAO.save(dB_DCLvideos);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateMDS11920PFBlancoRoblesData createMDS11920PFBlancoRoblesData = new CreateMDS11920PFBlancoRoblesData();
			try {
				createMDS11920PFBlancoRoblesData.createTestData();
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
