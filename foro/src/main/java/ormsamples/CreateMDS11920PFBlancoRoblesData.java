/**
 * Licensee: aba693(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateMDS11920PFBlancoRoblesData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		try {
			db_dcl.Notificacion dB_DCLNotificacion = db_dcl.NotificacionDAO.createNotificacion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : idUsuarioPropietario, usuarios
			db_dcl.NotificacionDAO.save(dB_DCLNotificacion);
			db_dcl.Mensaje dB_DCLMensaje = db_dcl.MensajeDAO.createMensaje();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene_imagenes, eliminado, publico, idMedia, idPropietario, idTemaPropietario, numTotalMensajes, fechaCreacion, numMg, usuarios
			db_dcl.MensajeDAO.save(dB_DCLMensaje);
			db_dcl.Usuarios dB_DCLUsuarios = db_dcl.UsuariosDAO.createUsuarios();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : usuariosAmigos, notificaciones, pro_secciones, pro_temas, usuarios, pro_mensajes, pro_tickets, oculto, publico, sancionado, amonestado
			db_dcl.UsuariosDAO.save(dB_DCLUsuarios);
			db_dcl.Moderador dB_DCLModerador = db_dcl.ModeradorDAO.createModerador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : idMod
			db_dcl.ModeradorDAO.save(dB_DCLModerador);
			db_dcl.Seccion dB_DCLSeccion = db_dcl.SeccionDAO.createSeccion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene_temas, eliminado, oculto, privado, publico, idPropietarioSeccion, fecha, usuarios
			db_dcl.SeccionDAO.save(dB_DCLSeccion);
			db_dcl.Tema dB_DCLTema = db_dcl.TemaDAO.createTema();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene_mensajes, eliminado, oculto, privado, publico, idTemaPropietario, fecha, usuarios
			db_dcl.TemaDAO.save(dB_DCLTema);
			db_dcl.Anuncio dB_DCLAnuncio = db_dcl.AnuncioDAO.createAnuncio();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : publicado
			db_dcl.AnuncioDAO.save(dB_DCLAnuncio);
			db_dcl.Ticket dB_DCLTicket = db_dcl.TicketDAO.createTicket();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cerrado, abierto, usuarios
			db_dcl.TicketDAO.save(dB_DCLTicket);
			db_dcl.media dB_DCLmedia = db_dcl.mediaDAO.createMedia();
			// Initialize the properties of the persistent object here
			db_dcl.mediaDAO.save(dB_DCLmedia);
			db_dcl.imagenes dB_DCLimagenes = db_dcl.imagenesDAO.createImagenes();
			// Initialize the properties of the persistent object here
			db_dcl.imagenesDAO.save(dB_DCLimagenes);
			db_dcl.Administrador dB_DCLAdministrador = db_dcl.AdministradorDAO.createAdministrador();
			// Initialize the properties of the persistent object here
			db_dcl.AdministradorDAO.save(dB_DCLAdministrador);
			db_dcl.videos dB_DCLvideos = db_dcl.videosDAO.createVideos();
			// Initialize the properties of the persistent object here
			db_dcl.videosDAO.save(dB_DCLvideos);
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
				db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
