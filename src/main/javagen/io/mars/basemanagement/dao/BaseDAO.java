package io.mars.basemanagement.dao;

import javax.inject.Inject;

import io.vertigo.core.lang.Generated;
import io.vertigo.datamodel.structure.model.UID;
import io.vertigo.datastore.entitystore.EntityStoreManager;
import io.vertigo.datastore.impl.dao.DAO;
import io.vertigo.datastore.impl.dao.StoreServices;
import io.vertigo.datamodel.smarttype.ModelManager;
import io.vertigo.datamodel.task.TaskManager;
import io.mars.basemanagement.domain.Base;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
public final class BaseDAO extends DAO<Base, java.lang.Long> implements StoreServices {

	/**
	 * Contructeur.
	 * @param entityStoreManager Manager de persistance
	 * @param taskManager Manager de Task
	 */
	@Inject
	public BaseDAO(final EntityStoreManager entityStoreManager, final TaskManager taskManager, final ModelManager modelManager) {
		super(Base.class, entityStoreManager, taskManager, modelManager);
	}

	/**
	 * Indique que le keyConcept associé à cette UID va être modifié.
	 * Techniquement cela interdit les opérations d'ecriture en concurrence
	 * et envoie un évenement de modification du keyConcept (à la fin de transaction eventuellement)
	 * @param UID UID du keyConcept modifié
	 * @return KeyConcept à modifier
	 */
	public Base readOneForUpdate(final UID<Base> uid) {
		return entityStoreManager.readOneForUpdate(uid);
	}

	/**
	 * Indique que le keyConcept associé à cet id va être modifié.
	 * Techniquement cela interdit les opérations d'ecriture en concurrence
	 * et envoie un évenement de modification du keyConcept (à la fin de transaction eventuellement)
	 * @param id Clé du keyConcept modifié
	 * @return KeyConcept à modifier
	 */
	public Base readOneForUpdate(final java.lang.Long id) {
		return readOneForUpdate(createDtObjectUID(id));
	}
}
