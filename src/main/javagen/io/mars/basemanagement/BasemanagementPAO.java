package io.mars.basemanagement;

import javax.inject.Inject;

import io.vertigo.core.node.Node;
import io.vertigo.core.lang.Assertion;
import io.vertigo.core.lang.Generated;
import io.vertigo.datamodel.task.TaskManager;
import io.vertigo.datamodel.task.definitions.TaskDefinition;
import io.vertigo.datamodel.task.model.Task;
import io.vertigo.datamodel.task.model.TaskBuilder;
import io.vertigo.datastore.impl.dao.StoreServices;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
 @Generated
public final class BasemanagementPAO implements StoreServices {
	private final TaskManager taskManager;

	/**
	 * Constructeur.
	 * @param taskManager Manager des Task
	 */
	@Inject
	public BasemanagementPAO(final TaskManager taskManager) {
		Assertion.check().isNotNull(taskManager);
		//-----
		this.taskManager = taskManager;
	}

	/**
	 * Creates a taskBuilder.
	 * @param name  the name of the task
	 * @return the builder 
	 */
	private static TaskBuilder createTaskBuilder(final String name) {
		final TaskDefinition taskDefinition = Node.getNode().getDefinitionSpace().resolve(name, TaskDefinition.class);
		return Task.builder(taskDefinition);
	}

	/**
	 * Execute la tache TkGetBaseOverview.
	 * @param baseId Long
	 * @return BaseOverview baseOverview
	*/
	@io.vertigo.datamodel.task.proxy.TaskAnnotation(
			name = "TkGetBaseOverview",
			request = "select " + 
 "				(select count(*) from equipment equ where equ.base_id = #baseId#) as equipment_count," + 
 "				(select count(*) from ticket tic join equipment equ on equ.equipment_id = tic.equipment_id where equ.base_id = #baseId# and ( tic.ticket_status_id = 'OPEN' or tic.ticket_status_id = 'ASSIGNED')) as opened_tickets," + 
 "				(select count(*) from work_order wor join ticket tic on tic.ticket_id = wor.ticket_id join equipment equ on equ.equipment_id = tic.equipment_id where equ.base_id = #baseId#  and wor.work_order_status_id = 'INPROGRESS') as work_orders_inprogress",
			taskEngineClass = io.vertigo.basics.task.TaskEngineSelect.class)
	@io.vertigo.datamodel.task.proxy.TaskOutput(smartType = "STyDtBaseOverview")
	public io.mars.basemanagement.domain.BaseOverview getBaseOverview(@io.vertigo.datamodel.task.proxy.TaskInput(name = "baseId", smartType = "STyId") final Long baseId) {
		final Task task = createTaskBuilder("TkGetBaseOverview")
				.addValue("baseId", baseId)
				.build();
		return getTaskManager()
				.execute(task)
				.getResult();
	}

	/**
	 * Execute la tache TkGetBasesSummary.
	 * @return BasesSummary basesSummary
	*/
	@io.vertigo.datamodel.task.proxy.TaskAnnotation(
			name = "TkGetBasesSummary",
			request = "select " + 
 "				(select count(*) from base) as base_count," + 
 "				(select avg(health_level) from base) as base_mean_health," + 
 "				(select count(*) from ticket tic where tic.ticket_status_id = 'OPEN' or tic.ticket_status_id = 'ASSIGNED') as opened_tickets," + 
 "				(select sum(case when health_level > 30 then 1.0 else 0.0 end) / count(*) * 100 from equipment) as online_equipment_percent;",
			taskEngineClass = io.vertigo.basics.task.TaskEngineSelect.class)
	@io.vertigo.datamodel.task.proxy.TaskOutput(smartType = "STyDtBasesSummary")
	public io.mars.basemanagement.domain.BasesSummary getBasesSummary() {
		final Task task = createTaskBuilder("TkGetBasesSummary")
				.build();
		return getTaskManager()
				.execute(task)
				.getResult();
	}

	/**
	 * Execute la tache TkGetEquipmentMaintenanceOverview.
	 * @param equipmentId Long
	 * @return EquipmentMaintenanceOverview equipmentMaintenanceOverview
	*/
	@io.vertigo.datamodel.task.proxy.TaskAnnotation(
			name = "TkGetEquipmentMaintenanceOverview",
			request = "select " + 
 "				(select count(*) from ticket tic where tic.equipment_id = #equipmentId# and ( tic.ticket_status_id = 'OPEN' or tic.ticket_status_id = 'ASSIGNED')) as opened_tickets," + 
 "				(select count(*) from work_order wor join ticket tic on tic.ticket_id = wor.ticket_id join equipment equ on equ.equipment_id = #equipmentId#  and wor.work_order_status_id = 'INPROGRESS') as work_orders_inprogress",
			taskEngineClass = io.vertigo.basics.task.TaskEngineSelect.class)
	@io.vertigo.datamodel.task.proxy.TaskOutput(smartType = "STyDtEquipmentMaintenanceOverview")
	public io.mars.basemanagement.domain.EquipmentMaintenanceOverview getEquipmentMaintenanceOverview(@io.vertigo.datamodel.task.proxy.TaskInput(name = "equipmentId", smartType = "STyId") final Long equipmentId) {
		final Task task = createTaskBuilder("TkGetEquipmentMaintenanceOverview")
				.addValue("equipmentId", equipmentId)
				.build();
		return getTaskManager()
				.execute(task)
				.getResult();
	}

	/**
	 * Execute la tache TkGetEquipmentsOverview.
	 * @param baseId Long
	 * @return DtList de EquipmentOverview overview
	*/
	@io.vertigo.datamodel.task.proxy.TaskAnnotation(
			name = "TkGetEquipmentsOverview",
			request = "select " + 
 "            	count(1) as count," + 
 "            	bus.business_id as business_id," + 
 "            	bus.name as business_name," + 
 "            	bus.icon as business_icon," + 
 "            	sum(case when equ.health_level >= 30 then 1 else 0 end) as ok_count," + 
 "            	sum(case when equ.health_level < 30 then 1 else 0 end) as down_count" + 
 "			from equipment equ" + 
 "				join business bus on bus.business_id = equ.business_id " + 
 "			where equ.base_id = #baseId#" + 
 "			group by business_name, bus.business_id",
			taskEngineClass = io.vertigo.basics.task.TaskEngineSelect.class)
	@io.vertigo.datamodel.task.proxy.TaskOutput(smartType = "STyDtEquipmentOverview")
	public io.vertigo.datamodel.structure.model.DtList<io.mars.basemanagement.domain.EquipmentOverview> getEquipmentsOverview(@io.vertigo.datamodel.task.proxy.TaskInput(name = "baseId", smartType = "STyId") final Long baseId) {
		final Task task = createTaskBuilder("TkGetEquipmentsOverview")
				.addValue("baseId", baseId)
				.build();
		return getTaskManager()
				.execute(task)
				.getResult();
	}

	/**
	 * Execute la tache TkLoadBaseIndex.
	 * @param baseIds List de Long
	 * @return DtList de BaseIndex dtcIndex
	*/
	@io.vertigo.datamodel.task.proxy.TaskAnnotation(
			name = "TkLoadBaseIndex",
			request = "select 	bas.BASE_ID, " + 
 "						bas.NAME, " + 
 "						bas.CODE, " + 
 "						bas.CREATION_DATE, " + 
 "						bas.TAGS," + 
 "						bas.GEO_LOCATION,  " + 
 "						bastype.LABEL as BASE_TYPE_LABEL" + 
 "				from BASE bas" + 
 "				join BASE_TYPE bastype on bastype.base_type_id = bas.base_type_id" + 
 "				where BASE_ID in (#baseIds.rownum#);",
			taskEngineClass = io.vertigo.basics.task.TaskEngineSelect.class)
	@io.vertigo.datamodel.task.proxy.TaskOutput(smartType = "STyDtBaseIndex")
	public io.vertigo.datamodel.structure.model.DtList<io.mars.basemanagement.search.BaseIndex> loadBaseIndex(@io.vertigo.datamodel.task.proxy.TaskInput(name = "baseIds", smartType = "STyId") final java.util.List<Long> baseIds) {
		final Task task = createTaskBuilder("TkLoadBaseIndex")
				.addValue("baseIds", baseIds)
				.build();
		return getTaskManager()
				.execute(task)
				.getResult();
	}

	/**
	 * Execute la tache TkLoadEquipmentIndex.
	 * @param equipmentIds List de Long
	 * @return DtList de EquipmentIndex dtcIndex
	*/
	@io.vertigo.datamodel.task.proxy.TaskAnnotation(
			name = "TkLoadEquipmentIndex",
			request = "select 	equ.EQUIPMENT_ID," + 
 "						equ.NAME, " + 
 "						equ.CODE, " + 
 "						equ.PURCHASE_DATE, " + 
 "						equ.TAGS, " + 
 "						equ.GEO_LOCATION,  " + 
 "						equipmentType.LABEL as EQUIPMENT_TYPE_NAME," + 
 "						equipmentCategory.LABEL as EQUIPMENT_CATEGORY_NAME," + 
 "                        bas.NAME as BASE_NAME" + 
 "				from EQUIPMENT equ" + 
 "                join BASE bas on bas.base_id = equ.base_id" + 
 "                join EQUIPMENT_TYPE equipmentType on equipmentType.equipment_type_id = equ.equipment_type_id" + 
 "				join EQUIPMENT_CATEGORY equipmentCategory on equipmentCategory.equipment_category_id = equipmentType.equipment_category_id" + 
 "				where EQUIPMENT_ID in (#equipmentIds.rownum#);",
			taskEngineClass = io.vertigo.basics.task.TaskEngineSelect.class)
	@io.vertigo.datamodel.task.proxy.TaskOutput(smartType = "STyDtEquipmentIndex")
	public io.vertigo.datamodel.structure.model.DtList<io.mars.basemanagement.search.EquipmentIndex> loadEquipmentIndex(@io.vertigo.datamodel.task.proxy.TaskInput(name = "equipmentIds", smartType = "STyId") final java.util.List<Long> equipmentIds) {
		final Task task = createTaskBuilder("TkLoadEquipmentIndex")
				.addValue("equipmentIds", equipmentIds)
				.build();
		return getTaskManager()
				.execute(task)
				.getResult();
	}

	/**
	 * Execute la tache TkSelectBaseId.
	 * @return List de Long baseIdList
	*/
	@io.vertigo.datamodel.task.proxy.TaskAnnotation(
			name = "TkSelectBaseId",
			request = "select BASE_ID from BASE",
			taskEngineClass = io.vertigo.basics.task.TaskEngineSelect.class)
	@io.vertigo.datamodel.task.proxy.TaskOutput(smartType = "STyId")
	public java.util.List<Long> selectBaseId() {
		final Task task = createTaskBuilder("TkSelectBaseId")
				.build();
		return getTaskManager()
				.execute(task)
				.getResult();
	}

	/**
	 * Execute la tache TkSelectBusinessId.
	 * @return List de Long businessIdList
	*/
	@io.vertigo.datamodel.task.proxy.TaskAnnotation(
			name = "TkSelectBusinessId",
			request = "select BUSINESS_ID from BUSINESS",
			taskEngineClass = io.vertigo.basics.task.TaskEngineSelect.class)
	@io.vertigo.datamodel.task.proxy.TaskOutput(smartType = "STyId")
	public java.util.List<Long> selectBusinessId() {
		final Task task = createTaskBuilder("TkSelectBusinessId")
				.build();
		return getTaskManager()
				.execute(task)
				.getResult();
	}

	/**
	 * Execute la tache TkSelectGeosectorId.
	 * @return List de Long geosectorIdList
	*/
	@io.vertigo.datamodel.task.proxy.TaskAnnotation(
			name = "TkSelectGeosectorId",
			request = "select GEOSECTOR_ID from GEOSECTOR",
			taskEngineClass = io.vertigo.basics.task.TaskEngineSelect.class)
	@io.vertigo.datamodel.task.proxy.TaskOutput(smartType = "STyId")
	public java.util.List<Long> selectGeosectorId() {
		final Task task = createTaskBuilder("TkSelectGeosectorId")
				.build();
		return getTaskManager()
				.execute(task)
				.getResult();
	}

	private TaskManager getTaskManager() {
		return taskManager;
	}
}
