package io.mars.hr;

import javax.inject.Inject;

import io.vertigo.core.node.Home;
import io.vertigo.core.lang.Assertion;
import io.vertigo.core.lang.Generated;
import io.vertigo.datamodel.task.TaskManager;
import io.vertigo.datamodel.task.metamodel.TaskDefinition;
import io.vertigo.datamodel.task.model.Task;
import io.vertigo.datamodel.task.model.TaskBuilder;
import io.vertigo.datastore.impl.dao.StoreServices;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
 @Generated
public final class HrPAO implements StoreServices {
	private final TaskManager taskManager;

	/**
	 * Constructeur.
	 * @param taskManager Manager des Task
	 */
	@Inject
	public HrPAO(final TaskManager taskManager) {
		Assertion.checkNotNull(taskManager);
		//-----
		this.taskManager = taskManager;
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
	 * Execute la tache StTkGetMissionsDisplayByPersonId.
	 * @param personId Long
	 * @return DtList de MissionDisplay missions
	*/
	@io.vertigo.datamodel.task.proxy.TaskAnnotation(
			name = "TkGetMissionsDisplayByPersonId",
			request = "select " + 
 "            		mis.mission_id as MISSION_ID," + 
 "            		mis.role as ROLE," + 
 "            		bas.name as BASE_NAME," + 
 "            		bus.name as BUSINESS_NAME" + 
 "            	from mission mis" + 
 "            	left join base bas on mis.base_id = bas.base_id" + 
 "				left join business bus on mis.business_id = bus.business_id" + 
 "            	where mis.person_id = #personId#;",
			taskEngineClass = io.vertigo.dynamox.task.TaskEngineSelect.class)
	@io.vertigo.datamodel.task.proxy.TaskOutput(domain = "STyDtMissionDisplay")
	public io.vertigo.datamodel.structure.model.DtList<io.mars.hr.domain.MissionDisplay> getMissionsDisplayByPersonId(@io.vertigo.datamodel.task.proxy.TaskInput(name = "personId", domain = "STyId") final Long personId) {
		final Task task = createTaskBuilder("TkGetMissionsDisplayByPersonId")
				.addValue("personId", personId)
				.build();
		return getTaskManager()
				.execute(task)
				.getResult();
	}

	private TaskManager getTaskManager() {
		return taskManager;
	}
}
