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
package com.mds2.foro;

import org.orm.*;

public class SeccionSetCollection extends org.orm.util.ORMSet {
	public SeccionSetCollection(Object owner, org.orm.util.ORMAdapter adapter, int ownerKey, int targetKey, int collType) {
		super(owner, adapter, ownerKey, targetKey, true, collType);
	}
	
	public SeccionSetCollection(Object owner, org.orm.util.ORMAdapter adapter, int ownerKey, int collType) {
		super(owner, adapter, ownerKey, -1, false, collType);
	}
	
	/**
	* Return an iterator over the persistent objects
	* @return The persistent objects iterator
	*/
	public java.util.Iterator getIterator() {
		return super.getIterator(_ownerAdapter);
	}
	
	/**
	 * Add the specified persistent object to ORMSet
	 * @param value the persistent object
	 */
	public void add(SeccionBD value) {
		if (value != null) {
			super.add(value, value._ormAdapter);
		}
	}
	
	/**
	 * Remove the specified persistent object from ORMSet
	 * @param value the persistent object
	 */
	public void remove(SeccionBD value) {
		super.remove(value, value._ormAdapter);
	}
	
	/**
	 * Return true if ORMSet contains the specified persistent object
	 * @param value the persistent object
	 * @return True if this contains the specified persistent object
	 */
	public boolean contains(SeccionBD value) {
		return super.contains(value);
	}
	
	/**
	 * Return an array containing all of the persistent objects in ORMSet
	 * @return The persistent objects array
	 */
	public SeccionBD[] toArray() {
		return (SeccionBD[]) super.toArray(new SeccionBD[size()]);
	}
	
	/**
	 * Return an sorted array containing all of the persistent objects in ORMSet
	 * @param propertyName Name of the property for sorting:<ul>
	 * <li>idSeccion</li>
	 * <li>imagenSeccion</li>
	 * <li>creador</li>
	 * <li>titulo</li>
	 * <li>descripcion</li>
	 * <li>fecha</li>
	 * <li>idPropietarioSeccion</li>
	 * <li>publico</li>
	 * <li>privado</li>
	 * <li>oculto</li>
	 * <li>eliminado</li>
	 * </ul>
	 * @return The persistent objects sorted array
	 */
	public SeccionBD[] toArray(String propertyName) {
		return toArray(propertyName, true);
	}
	
	/**
	 * Return an sorted array containing all of the persistent objects in ORMSet
	 * @param propertyName Name of the property for sorting:<ul>
	 * <li>idSeccion</li>
	 * <li>imagenSeccion</li>
	 * <li>creador</li>
	 * <li>titulo</li>
	 * <li>descripcion</li>
	 * <li>fecha</li>
	 * <li>idPropietarioSeccion</li>
	 * <li>publico</li>
	 * <li>privado</li>
	 * <li>oculto</li>
	 * <li>eliminado</li>
	 * </ul>
	 * @param ascending true for ascending, false for descending
	 * @return The persistent objects sorted array
	 */
	public SeccionBD[] toArray(String propertyName, boolean ascending) {
		return (SeccionBD[]) super.toArray(new SeccionBD[size()], propertyName, ascending);
	}
	
	protected PersistentManager getPersistentManager() throws PersistentException {
		return com.mds2.foro.MDS11920PFBlancoRoblesPersistentManager.instance();
	}
	
}

