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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class SeccionCriteria extends AbstractORMCriteria {
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
	
	public SeccionCriteria(Criteria criteria) {
		super(criteria);
		idSeccion = new IntegerExpression("idSeccion", this);
		usuariosId = new IntegerExpression("usuarios.idUsuario", this);
		usuarios = new AssociationExpression("usuarios", this);
		imagenSeccion = new StringExpression("imagenSeccion", this);
		creador = new StringExpression("creador", this);
		titulo = new StringExpression("titulo", this);
		descripcion = new StringExpression("descripcion", this);
		fecha = new LongExpression("fecha", this);
		idPropietarioSeccion = new IntegerExpression("idPropietarioSeccion", this);
		publico = new BooleanExpression("publico", this);
		privado = new BooleanExpression("privado", this);
		oculto = new BooleanExpression("oculto", this);
		eliminado = new BooleanExpression("eliminado", this);
		contiene_temas = new CollectionExpression("ORM_contiene_temas", this);
	}
	
	public SeccionCriteria(PersistentSession session) {
		this(session.createCriteria(Seccion.class));
	}
	
	public SeccionCriteria() throws PersistentException {
		this(db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession());
	}
	
	public UsuariosCriteria createUsuariosCriteria() {
		return new UsuariosCriteria(createCriteria("usuarios"));
	}
	
	public db_dcl.TemaCriteria createContiene_temasCriteria() {
		return new db_dcl.TemaCriteria(createCriteria("ORM_contiene_temas"));
	}
	
	public Seccion uniqueSeccion() {
		return (Seccion) super.uniqueResult();
	}
	
	public Seccion[] listSeccion() {
		java.util.List list = super.list();
		return (Seccion[]) list.toArray(new Seccion[list.size()]);
	}
}

