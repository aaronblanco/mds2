/**
 * Licensee: aba693(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteMDS11920PFBlancoRoblesData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		try {
			com.mds2.foro.Notificacion lcommds2foroNotificacion = com.mds2.foro.NotificacionDAO.loadNotificacionByQuery(null, null);
			// Delete the persistent object
			com.mds2.foro.NotificacionDAO.delete(lcommds2foroNotificacion);
			com.mds2.foro.Mensaje lcommds2foroMensaje = com.mds2.foro.MensajeDAO.loadMensajeByQuery(null, null);
			// Delete the persistent object
			com.mds2.foro.MensajeDAO.delete(lcommds2foroMensaje);
			com.mds2.foro.Usuarios lcommds2foroUsuarios = com.mds2.foro.UsuariosDAO.loadUsuariosByQuery(null, null);
			// Delete the persistent object
			com.mds2.foro.UsuariosDAO.delete(lcommds2foroUsuarios);
			com.mds2.foro.Moderador lcommds2foroModerador = com.mds2.foro.ModeradorDAO.loadModeradorByQuery(null, null);
			// Delete the persistent object
			com.mds2.foro.ModeradorDAO.delete(lcommds2foroModerador);
			com.mds2.foro.Seccion lcommds2foroSeccion = com.mds2.foro.SeccionDAO.loadSeccionByQuery(null, null);
			// Delete the persistent object
			com.mds2.foro.SeccionDAO.delete(lcommds2foroSeccion);
			com.mds2.foro.Tema lcommds2foroTema = com.mds2.foro.TemaDAO.loadTemaByQuery(null, null);
			// Delete the persistent object
			com.mds2.foro.TemaDAO.delete(lcommds2foroTema);
			com.mds2.foro.Anuncio lcommds2foroAnuncio = com.mds2.foro.AnuncioDAO.loadAnuncioByQuery(null, null);
			// Delete the persistent object
			com.mds2.foro.AnuncioDAO.delete(lcommds2foroAnuncio);
			com.mds2.foro.Ticket lcommds2foroTicket = com.mds2.foro.TicketDAO.loadTicketByQuery(null, null);
			// Delete the persistent object
			com.mds2.foro.TicketDAO.delete(lcommds2foroTicket);
			com.mds2.foro.media lcommds2foromedia = com.mds2.foro.mediaDAO.loadMediaByQuery(null, null);
			// Delete the persistent object
			com.mds2.foro.mediaDAO.delete(lcommds2foromedia);
			com.mds2.foro.imagenes lcommds2foroimagenes = com.mds2.foro.imagenesDAO.loadImagenesByQuery(null, null);
			// Delete the persistent object
			com.mds2.foro.imagenesDAO.delete(lcommds2foroimagenes);
			com.mds2.foro.Administrador lcommds2foroAdministrador = com.mds2.foro.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			com.mds2.foro.AdministradorDAO.delete(lcommds2foroAdministrador);
			com.mds2.foro.videos lcommds2forovideos = com.mds2.foro.videosDAO.loadVideosByQuery(null, null);
			// Delete the persistent object
			com.mds2.foro.videosDAO.delete(lcommds2forovideos);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteMDS11920PFBlancoRoblesData deleteMDS11920PFBlancoRoblesData = new DeleteMDS11920PFBlancoRoblesData();
			try {
				deleteMDS11920PFBlancoRoblesData.deleteTestData();
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
