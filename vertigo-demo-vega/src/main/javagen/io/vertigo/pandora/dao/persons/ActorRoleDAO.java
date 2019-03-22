package io.vertigo.pandora.dao.persons;

import javax.inject.Inject;

import io.vertigo.app.Home;
import io.vertigo.dynamo.task.metamodel.TaskDefinition;
import io.vertigo.dynamo.task.model.Task;
import io.vertigo.dynamo.task.model.TaskBuilder;
import io.vertigo.dynamo.impl.store.util.DAO;
import io.vertigo.dynamo.store.StoreManager;
import io.vertigo.dynamo.store.StoreServices;
import io.vertigo.dynamo.task.TaskManager;
import io.vertigo.pandora.domain.persons.ActorRole;
import io.vertigo.lang.Generated;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
public final class ActorRoleDAO extends DAO<ActorRole, java.lang.Long> implements StoreServices {

	/**
	 * Contructeur.
	 * @param storeManager Manager de persistance
	 * @param taskManager Manager de Task
	 */
	@Inject
	public ActorRoleDAO(final StoreManager storeManager, final TaskManager taskManager) {
		super(ActorRole.class, storeManager, taskManager);
	}


	/**
	 * Creates a taskBuilder.
	 * @param name  the name of the task
	 * @return the builder 
	 */
	private static TaskBuilder createTaskBuilder(final String name) {
		final TaskDefinition taskDefinition = Home.getApp().getDefinitionSpace().resolve(name, TaskDefinition.class);
		return Task.builder(taskDefinition);
	}

	/**
	 * Execute la tache TK_IMPORT_ACTOR_ROLES.
	 * @param dtc io.vertigo.dynamo.domain.model.DtList<io.vertigo.pandora.domain.persons.ActorRole> 
	*/
	public void importActorRoles(final io.vertigo.dynamo.domain.model.DtList<io.vertigo.pandora.domain.persons.ActorRole> dtc) {
		final Task task = createTaskBuilder("TK_IMPORT_ACTOR_ROLES")
				.addValue("DTC", dtc)
				.build();
		getTaskManager().execute(task);
	}

}
