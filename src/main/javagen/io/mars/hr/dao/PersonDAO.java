package io.mars.hr.dao;

import javax.inject.Inject;

import java.util.Optional;
import io.vertigo.core.lang.Generated;
import io.vertigo.core.node.Home;
import io.vertigo.datamodel.task.metamodel.TaskDefinition;
import io.vertigo.datamodel.task.model.Task;
import io.vertigo.datamodel.task.model.TaskBuilder;
import io.vertigo.datastore.entitystore.EntityStoreManager;
import io.vertigo.datastore.impl.dao.DAO;
import io.vertigo.datastore.impl.dao.StoreServices;
import io.vertigo.datamodel.smarttype.SmartTypeManager;
import io.vertigo.datamodel.task.TaskManager;
import io.mars.hr.domain.Person;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
public final class PersonDAO extends DAO<Person, java.lang.Long> implements StoreServices {

	/**
	 * Contructeur.
	 * @param entityStoreManager Manager de persistance
	 * @param taskManager Manager de Task
	 * @param smartTypeManager SmartTypeManager
	 */
	@Inject
	public PersonDAO(final EntityStoreManager entityStoreManager, final TaskManager taskManager, final SmartTypeManager smartTypeManager) {
		super(Person.class, entityStoreManager, taskManager, smartTypeManager);
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
	 * Execute la tache StTkGetBaseManager.
	 * @param baseId Long
	 * @return Option de Person manager
	*/
	@io.vertigo.datamodel.task.proxy.TaskAnnotation(
			name = "TkGetBaseManager",
			request = "select per.*" + 
 "            	from mission mis" + 
 "            	join person per on mis.person_id = per.person_id" + 
 "            	where mis.base_id = #baseId# and mis.role= 'Base Manager'" + 
 "            	limit 1;",
			taskEngineClass = io.vertigo.dynamox.task.TaskEngineSelect.class)
	@io.vertigo.datamodel.task.proxy.TaskOutput(smartType = "STyDtPerson")
	public Optional<io.mars.hr.domain.Person> getBaseManager(@io.vertigo.datamodel.task.proxy.TaskInput(name = "baseId", smartType = "STyId") final Long baseId) {
		final Task task = createTaskBuilder("TkGetBaseManager")
				.addValue("baseId", baseId)
				.build();
		return Optional.ofNullable((io.mars.hr.domain.Person) getTaskManager()
				.execute(task)
				.getResult());
	}

}
