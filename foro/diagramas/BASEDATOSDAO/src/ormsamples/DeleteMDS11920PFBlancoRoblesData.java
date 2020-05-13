/**
 * Licensee: aba693(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteMDS11920PFBlancoRoblesData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().beginTransaction();
		try {
			db_dcl.Notificacion dB_DCLNotificacion = db_dcl.NotificacionDAO.loadNotificacionByQuery(null, null);
			// Delete the persistent object
			db_dcl.NotificacionDAO.delete(dB_DCLNotificacion);
			db_dcl.Mensaje dB_DCLMensaje = db_dcl.MensajeDAO.loadMensajeByQuery(null, null);
			// Delete the persistent object
			db_dcl.MensajeDAO.delete(dB_DCLMensaje);
			db_dcl.Usuarios dB_DCLUsuarios = db_dcl.UsuariosDAO.loadUsuariosByQuery(null, null);
			// Delete the persistent object
			db_dcl.UsuariosDAO.delete(dB_DCLUsuarios);
			db_dcl.Moderador dB_DCLModerador = db_dcl.ModeradorDAO.loadModeradorByQuery(null, null);
			// Delete the persistent object
			db_dcl.ModeradorDAO.delete(dB_DCLModerador);
			db_dcl.Seccion dB_DCLSeccion = db_dcl.SeccionDAO.loadSeccionByQuery(null, null);
			// Delete the persistent object
			db_dcl.SeccionDAO.delete(dB_DCLSeccion);
			db_dcl.Tema dB_DCLTema = db_dcl.TemaDAO.loadTemaByQuery(null, null);
			// Delete the persistent object
			db_dcl.TemaDAO.delete(dB_DCLTema);
			db_dcl.Anuncio dB_DCLAnuncio = db_dcl.AnuncioDAO.loadAnuncioByQuery(null, null);
			// Delete the persistent object
			db_dcl.AnuncioDAO.delete(dB_DCLAnuncio);
			db_dcl.Ticket dB_DCLTicket = db_dcl.TicketDAO.loadTicketByQuery(null, null);
			// Delete the persistent object
			db_dcl.TicketDAO.delete(dB_DCLTicket);
			db_dcl.media dB_DCLmedia = db_dcl.mediaDAO.loadMediaByQuery(null, null);
			// Delete the persistent object
			db_dcl.mediaDAO.delete(dB_DCLmedia);
			db_dcl.imagenes dB_DCLimagenes = db_dcl.imagenesDAO.loadImagenesByQuery(null, null);
			// Delete the persistent object
			db_dcl.imagenesDAO.delete(dB_DCLimagenes);
			db_dcl.Administrador dB_DCLAdministrador = db_dcl.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			db_dcl.AdministradorDAO.delete(dB_DCLAdministrador);
			db_dcl.videos dB_DCLvideos = db_dcl.videosDAO.loadVideosByQuery(null, null);
			// Delete the persistent object
			db_dcl.videosDAO.delete(dB_DCLvideos);
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
				db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
