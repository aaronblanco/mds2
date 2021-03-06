/**
 * Licensee: trm187(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateMDS11920PFBlancoRoblesData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		try {
			com.mds2.foro.Notificacion lcommds2foroNotificacion = com.mds2.foro.NotificacionDAO.createNotificacion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : idUsuarioPropietario, usuarios
			com.mds2.foro.NotificacionDAO.save(lcommds2foroNotificacion);
			com.mds2.foro.Mensaje lcommds2foroMensaje = com.mds2.foro.MensajeDAO.createMensaje();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene_videos, contiene_imagenes, eliminado, publico, idMedia, idPropietario, idTemaPropietario, numTotalMensajes, fechaCreacion, numMg, usuarios, tema_mensaje
			com.mds2.foro.MensajeDAO.save(lcommds2foroMensaje);
			com.mds2.foro.Usuarios lcommds2foroUsuarios = com.mds2.foro.UsuariosDAO.createUsuarios();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : usuariosAmigos, notificaciones, pro_secciones, pro_temas, usuarios, pro_mensajes, pro_tickets, oculto, publico, sancionado, amonestado
			com.mds2.foro.UsuariosDAO.save(lcommds2foroUsuarios);
			com.mds2.foro.Moderador lcommds2foroModerador = com.mds2.foro.ModeradorDAO.createModerador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : idMod
			com.mds2.foro.ModeradorDAO.save(lcommds2foroModerador);
			com.mds2.foro.Seccion lcommds2foroSeccion = com.mds2.foro.SeccionDAO.createSeccion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene_temas, eliminado, oculto, privado, publico, idPropietarioSeccion, fecha, usuarios
			com.mds2.foro.SeccionDAO.save(lcommds2foroSeccion);
			com.mds2.foro.Tema lcommds2foroTema = com.mds2.foro.TemaDAO.createTema();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene_mensajes, eliminado, oculto, privado, publico, idTemaPropietario, fecha, usuarios, seccion_tema
			com.mds2.foro.TemaDAO.save(lcommds2foroTema);
			com.mds2.foro.Anuncio lcommds2foroAnuncio = com.mds2.foro.AnuncioDAO.createAnuncio();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : publicado
			com.mds2.foro.AnuncioDAO.save(lcommds2foroAnuncio);
			com.mds2.foro.Ticket lcommds2foroTicket = com.mds2.foro.TicketDAO.createTicket();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cerrado, abierto, usuarios
			com.mds2.foro.TicketDAO.save(lcommds2foroTicket);
			com.mds2.foro.media lcommds2foromedia = com.mds2.foro.mediaDAO.createMedia();
			// Initialize the properties of the persistent object here
			com.mds2.foro.mediaDAO.save(lcommds2foromedia);
			com.mds2.foro.imagenes lcommds2foroimagenes = com.mds2.foro.imagenesDAO.createImagenes();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : mensaje_imagen
			com.mds2.foro.imagenesDAO.save(lcommds2foroimagenes);
			com.mds2.foro.Administrador lcommds2foroAdministrador = com.mds2.foro.AdministradorDAO.createAdministrador();
			// Initialize the properties of the persistent object here
			com.mds2.foro.AdministradorDAO.save(lcommds2foroAdministrador);
			com.mds2.foro.videos lcommds2forovideos = com.mds2.foro.videosDAO.createVideos();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : mensaje_video
			com.mds2.foro.videosDAO.save(lcommds2forovideos);
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
