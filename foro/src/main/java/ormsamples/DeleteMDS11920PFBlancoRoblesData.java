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
			com.mds2.foro.NotificacionBD dB_DCLNotificacion = com.mds2.foro.NotificacionDAO.loadNotificacionByQuery(null, null);
			// Delete the persistent object
			com.mds2.foro.NotificacionDAO.delete(dB_DCLNotificacion);
			com.mds2.foro.MensajeBD dB_DCLMensaje = com.mds2.foro.MensajeDAO.loadMensajeByQuery(null, null);
			// Delete the persistent object
			com.mds2.foro.MensajeDAO.delete(dB_DCLMensaje);
			com.mds2.foro.UsuariosBD dB_DCLUsuarios = com.mds2.foro.UsuariosDAO.loadUsuariosByQuery(null, null);
			// Delete the persistent object
			com.mds2.foro.UsuariosDAO.delete(dB_DCLUsuarios);
			com.mds2.foro.ModeradorBD dB_DCLModerador = com.mds2.foro.ModeradorDAO.loadModeradorByQuery(null, null);
			// Delete the persistent object
			com.mds2.foro.ModeradorDAO.delete(dB_DCLModerador);
			com.mds2.foro.SeccionBD dB_DCLSeccion = com.mds2.foro.SeccionDAO.loadSeccionByQuery(null, null);
			// Delete the persistent object
			com.mds2.foro.SeccionDAO.delete(dB_DCLSeccion);
			com.mds2.foro.TemaBD dB_DCLTema = com.mds2.foro.TemaDAO.loadTemaByQuery(null, null);
			// Delete the persistent object
			com.mds2.foro.TemaDAO.delete(dB_DCLTema);
			com.mds2.foro.AnuncioBD dB_DCLAnuncio = com.mds2.foro.AnuncioDAO.loadAnuncioByQuery(null, null);
			// Delete the persistent object
			com.mds2.foro.AnuncioDAO.delete(dB_DCLAnuncio);
			com.mds2.foro.TicketBD dB_DCLTicket = com.mds2.foro.TicketDAO.loadTicketByQuery(null, null);
			// Delete the persistent object
			com.mds2.foro.TicketDAO.delete(dB_DCLTicket);
			com.mds2.foro.media dB_DCLmedia = com.mds2.foro.mediaDAO.loadMediaByQuery(null, null);
			// Delete the persistent object
			com.mds2.foro.mediaDAO.delete(dB_DCLmedia);
			com.mds2.foro.imagenes dB_DCLimagenes = com.mds2.foro.imagenesDAO.loadImagenesByQuery(null, null);
			// Delete the persistent object
			com.mds2.foro.imagenesDAO.delete(dB_DCLimagenes);
			com.mds2.foro.AdministradorBD dB_DCLAdministrador = com.mds2.foro.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			com.mds2.foro.AdministradorDAO.delete(dB_DCLAdministrador);
			com.mds2.foro.videos dB_DCLvideos = com.mds2.foro.videosDAO.loadVideosByQuery(null, null);
			// Delete the persistent object
			com.mds2.foro.videosDAO.delete(dB_DCLvideos);
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
