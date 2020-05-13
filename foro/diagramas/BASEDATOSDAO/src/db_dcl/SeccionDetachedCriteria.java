/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: aba693(University of Almeria)
 * License Type: Academic
 */
package db_dcl;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class SeccionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idSeccion;
	public final IntegerExpression usuariosId;
	public final AssociationExpression usuarios;
	public final StringExpression imagenSeccion;
	public final StringExpression creador;
	public final StringExpression titulo;
	public final StringExpression descripcion;
	public final LongExpression fecha;
	public final IntegerExpression idPropietarioSeccion;
	public final BooleanExpression publico;
	public final BooleanExpression privado;
	public final BooleanExpression oculto;
	public final BooleanExpression eliminado;
	public final CollectionExpression contiene_temas;
	
	public SeccionDetachedCriteria() {
		super(db_dcl.Seccion.class, db_dcl.SeccionCriteria.class);
		idSeccion = new IntegerExpression("idSeccion", this.getDetachedCriteria());
		usuariosId = new IntegerExpression("usuarios.idUsuario", this.getDetachedCriteria());
		usuarios = new AssociationExpression("usuarios", this.getDetachedCriteria());
		imagenSeccion = new StringExpression("imagenSeccion", this.getDetachedCriteria());
		creador = new StringExpression("creador", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		fecha = new LongExpression("fecha", this.getDetachedCriteria());
		idPropietarioSeccion = new IntegerExpression("idPropietarioSeccion", this.getDetachedCriteria());
		publico = new BooleanExpression("publico", this.getDetachedCriteria());
		privado = new BooleanExpression("privado", this.getDetachedCriteria());
		oculto = new BooleanExpression("oculto", this.getDetachedCriteria());
		eliminado = new BooleanExpression("eliminado", this.getDetachedCriteria());
		contiene_temas = new CollectionExpression("ORM_contiene_temas", this.getDetachedCriteria());
	}
	
	public SeccionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, db_dcl.SeccionCriteria.class);
		idSeccion = new IntegerExpression("idSeccion", this.getDetachedCriteria());
		usuariosId = new IntegerExpression("usuarios.idUsuario", this.getDetachedCriteria());
		usuarios = new AssociationExpression("usuarios", this.getDetachedCriteria());
		imagenSeccion = new StringExpression("imagenSeccion", this.getDetachedCriteria());
		creador = new StringExpression("creador", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		fecha = new LongExpression("fecha", this.getDetachedCriteria());
		idPropietarioSeccion = new IntegerExpression("idPropietarioSeccion", this.getDetachedCriteria());
		publico = new BooleanExpression("publico", this.getDetachedCriteria());
		privado = new BooleanExpression("privado", this.getDetachedCriteria());
		oculto = new BooleanExpression("oculto", this.getDetachedCriteria());
		eliminado = new BooleanExpression("eliminado", this.getDetachedCriteria());
		contiene_temas = new CollectionExpression("ORM_contiene_temas", this.getDetachedCriteria());
	}
	
	public UsuariosDetachedCriteria createUsuariosCriteria() {
		return new UsuariosDetachedCriteria(createCriteria("usuarios"));
	}
	
	public db_dcl.TemaDetachedCriteria createContiene_temasCriteria() {
		return new db_dcl.TemaDetachedCriteria(createCriteria("ORM_contiene_temas"));
	}
	
	public Seccion uniqueSeccion(PersistentSession session) {
		return (Seccion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Seccion[] listSeccion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Seccion[]) list.toArray(new Seccion[list.size()]);
	}
}

