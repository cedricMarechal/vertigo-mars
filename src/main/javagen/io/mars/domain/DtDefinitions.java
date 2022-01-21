package io.mars.domain;

import java.util.Arrays;
import java.util.Iterator;

import io.vertigo.core.lang.Generated;
import io.vertigo.datamodel.structure.definitions.DtFieldName;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
public final class DtDefinitions implements Iterable<Class<?>> {

	/**
	 * Enumération des DtDefinitions.
	 */
	public enum Definitions {
		/** Objet de données Base. */
		Base(io.mars.basemanagement.domain.Base.class),
		/** Objet de données BaseIndex. */
		BaseIndex(io.mars.basemanagement.domain.BaseIndex.class),
		/** Objet de données BaseOverview. */
		BaseOverview(io.mars.basemanagement.domain.BaseOverview.class),
		/** Objet de données BaseType. */
		BaseType(io.mars.basemanagement.domain.BaseType.class),
		/** Objet de données BasesSummary. */
		BasesSummary(io.mars.basemanagement.domain.BasesSummary.class),
		/** Objet de données Business. */
		Business(io.mars.basemanagement.domain.Business.class),
		/** Objet de données Equipment. */
		Equipment(io.mars.basemanagement.domain.Equipment.class),
		/** Objet de données EquipmentCategory. */
		EquipmentCategory(io.mars.catalog.domain.EquipmentCategory.class),
		/** Objet de données EquipmentFeature. */
		EquipmentFeature(io.mars.basemanagement.domain.EquipmentFeature.class),
		/** Objet de données EquipmentIndex. */
		EquipmentIndex(io.mars.basemanagement.domain.EquipmentIndex.class),
		/** Objet de données EquipmentMaintenanceOverview. */
		EquipmentMaintenanceOverview(io.mars.basemanagement.domain.EquipmentMaintenanceOverview.class),
		/** Objet de données EquipmentOverview. */
		EquipmentOverview(io.mars.basemanagement.domain.EquipmentOverview.class),
		/** Objet de données EquipmentType. */
		EquipmentType(io.mars.catalog.domain.EquipmentType.class),
		/** Objet de données Event. */
		Event(io.mars.maintenance.domain.Event.class),
		/** Objet de données EventStatus. */
		EventStatus(io.mars.maintenance.domain.EventStatus.class),
		/** Objet de données GeoSearchEquipmentCriteria. */
		GeoSearchEquipmentCriteria(io.mars.basemanagement.domain.GeoSearchEquipmentCriteria.class),
		/** Objet de données Geosector. */
		Geosector(io.mars.basemanagement.domain.Geosector.class),
		/** Objet de données Groups. */
		Groups(io.mars.hr.domain.Groups.class),
		/** Objet de données MediaFileInfo. */
		MediaFileInfo(io.mars.common.domain.tools.file.MediaFileInfo.class),
		/** Objet de données Mission. */
		Mission(io.mars.hr.domain.Mission.class),
		/** Objet de données MissionDisplay. */
		MissionDisplay(io.mars.hr.domain.MissionDisplay.class),
		/** Objet de données OpendataSet. */
		OpendataSet(io.mars.opendata.domain.OpendataSet.class),
		/** Objet de données OpendataSetStatus. */
		OpendataSetStatus(io.mars.opendata.domain.OpendataSetStatus.class),
		/** Objet de données Person. */
		Person(io.mars.hr.domain.Person.class),
		/** Objet de données PersonInput. */
		PersonInput(io.mars.hr.domain.PersonInput.class),
		/** Objet de données Picture. */
		Picture(io.mars.basemanagement.domain.Picture.class),
		/** Objet de données Role. */
		Role(io.mars.hr.domain.Role.class),
		/** Objet de données Supplier. */
		Supplier(io.mars.catalog.domain.Supplier.class),
		/** Objet de données Tag. */
		Tag(io.mars.basemanagement.domain.Tag.class),
		/** Objet de données Ticket. */
		Ticket(io.mars.maintenance.domain.Ticket.class),
		/** Objet de données TicketStatus. */
		TicketStatus(io.mars.maintenance.domain.TicketStatus.class),
		/** Objet de données WorkOrder. */
		WorkOrder(io.mars.maintenance.domain.WorkOrder.class),
		/** Objet de données WorkOrderStatus. */
		WorkOrderStatus(io.mars.maintenance.domain.WorkOrderStatus.class)		;

		private final Class<?> clazz;

		private Definitions(final Class<?> clazz) {
			this.clazz = clazz;
		}

		/** 
		 * Classe associée.
		 * @return Class d'implémentation de l'objet 
		 */
		public Class<?> getDtClass() {
			return clazz;
		}
	}

	/**
	 * Enumération des champs de Base.
	 */
	public enum BaseFields implements DtFieldName<io.mars.basemanagement.domain.Base> {
		/** Propriété 'Id'. */
		baseId,
		/** Propriété 'Code'. */
		code,
		/** Propriété 'Name'. */
		name,
		/** Propriété 'Health Level'. */
		healthLevel,
		/** Propriété 'Creation Date'. */
		creationDate,
		/** Propriété 'Description'. */
		description,
		/** Propriété 'Geographic Location'. */
		geoLocation,
		/** Propriété 'Current base assets value'. */
		assetsValue,
		/** Propriété 'Renting Fee'. */
		rentingFee,
		/** Propriété 'Tags'. */
		tags,
		/** Propriété 'Tags'. */
		tagsAsList,
		/** Propriété 'Base Type'. */
		baseTypeId,
		/** Propriété 'Base Geosector'. */
		geosectorId	}

	/**
	 * Enumération des champs de BaseIndex.
	 */
	public enum BaseIndexFields implements DtFieldName<io.mars.basemanagement.domain.BaseIndex> {
		/** Propriété 'id'. */
		baseId,
		/** Propriété 'Name'. */
		name,
		/** Propriété 'Code'. */
		code,
		/** Propriété 'Creation Date'. */
		creationDate,
		/** Propriété 'Tags'. */
		tags,
		/** Propriété 'Type'. */
		baseTypeLabel,
		/** Propriété 'Geographic Location'. */
		geoLocation	}

	/**
	 * Enumération des champs de BaseOverview.
	 */
	public enum BaseOverviewFields implements DtFieldName<io.mars.basemanagement.domain.BaseOverview> {
		/** Propriété 'Equipments count'. */
		equipmentCount,
		/** Propriété 'Open tickets'. */
		openedTickets,
		/** Propriété 'Work Orders in progress'. */
		workOrdersInprogress	}

	/**
	 * Enumération des champs de BaseType.
	 */
	public enum BaseTypeFields implements DtFieldName<io.mars.basemanagement.domain.BaseType> {
		/** Propriété 'Id'. */
		baseTypeId,
		/** Propriété 'Base Type Label'. */
		label	}

	/**
	 * Enumération des champs de BasesSummary.
	 */
	public enum BasesSummaryFields implements DtFieldName<io.mars.basemanagement.domain.BasesSummary> {
		/** Propriété 'Bases count'. */
		baseCount,
		/** Propriété 'Name'. */
		baseMeanHealth,
		/** Propriété 'Health Level'. */
		openedTickets,
		/** Propriété 'Equipment Health'. */
		onlineEquipmentPercent	}

	/**
	 * Enumération des champs de Business.
	 */
	public enum BusinessFields implements DtFieldName<io.mars.basemanagement.domain.Business> {
		/** Propriété 'Id'. */
		businessId,
		/** Propriété 'Name'. */
		name,
		/** Propriété 'Icon'. */
		icon	}

	/**
	 * Enumération des champs de Equipment.
	 */
	public enum EquipmentFields implements DtFieldName<io.mars.basemanagement.domain.Equipment> {
		/** Propriété 'Id'. */
		equipmentId,
		/** Propriété 'Name'. */
		name,
		/** Propriété 'Code'. */
		code,
		/** Propriété 'Health Level'. */
		healthLevel,
		/** Propriété 'Date of purchase'. */
		purchaseDate,
		/** Propriété 'Description'. */
		description,
		/** Propriété 'Tags'. */
		tags,
		/** Propriété 'Geographic Location'. */
		geoLocation,
		/** Propriété 'Renting Fee'. */
		rentingFee,
		/** Propriété 'Current equipment value'. */
		equipmentValue,
		/** Propriété 'Base'. */
		baseId,
		/** Propriété 'Equipment Geosector'. */
		geosectorId,
		/** Propriété 'Business'. */
		businessId,
		/** Propriété 'Equipment Type'. */
		equipmentTypeId	}

	/**
	 * Enumération des champs de EquipmentCategory.
	 */
	public enum EquipmentCategoryFields implements DtFieldName<io.mars.catalog.domain.EquipmentCategory> {
		/** Propriété 'Id'. */
		equipmentCategoryId,
		/** Propriété 'Equipment Category Label'. */
		label,
		/** Propriété 'Equipment category is active'. */
		active	}

	/**
	 * Enumération des champs de EquipmentFeature.
	 */
	public enum EquipmentFeatureFields implements DtFieldName<io.mars.basemanagement.domain.EquipmentFeature> {
		/** Propriété 'Id'. */
		equipmentFeatureId,
		/** Propriété 'Name'. */
		name,
		/** Propriété 'Equipment'. */
		equipmentId	}

	/**
	 * Enumération des champs de EquipmentIndex.
	 */
	public enum EquipmentIndexFields implements DtFieldName<io.mars.basemanagement.domain.EquipmentIndex> {
		/** Propriété 'Id'. */
		equipmentId,
		/** Propriété 'Name'. */
		name,
		/** Propriété 'Code'. */
		code,
		/** Propriété 'Date of purchase'. */
		purchaseDate,
		/** Propriété 'Description'. */
		description,
		/** Propriété 'Tags'. */
		tags,
		/** Propriété 'Type'. */
		equipmentTypeName,
		/** Propriété 'Category'. */
		equipmentCategoryName,
		/** Propriété 'Current equipment value'. */
		equipmentValue,
		/** Propriété 'Base Id'. */
		baseId,
		/** Propriété 'Base Name'. */
		baseName,
		/** Propriété 'Geographic Location'. */
		geoLocation,
		/** Propriété 'ALL_TEXT'. */
		allText	}

	/**
	 * Enumération des champs de EquipmentMaintenanceOverview.
	 */
	public enum EquipmentMaintenanceOverviewFields implements DtFieldName<io.mars.basemanagement.domain.EquipmentMaintenanceOverview> {
		/** Propriété 'Open tickets'. */
		openedTickets,
		/** Propriété 'Work Orders in progress'. */
		workOrdersInprogress	}

	/**
	 * Enumération des champs de EquipmentOverview.
	 */
	public enum EquipmentOverviewFields implements DtFieldName<io.mars.basemanagement.domain.EquipmentOverview> {
		/** Propriété 'Business Id'. */
		businessId,
		/** Propriété 'Count by business'. */
		count,
		/** Propriété 'Business'. */
		businessName,
		/** Propriété 'Business'. */
		businessIcon,
		/** Propriété 'Ok count'. */
		okCount,
		/** Propriété 'Down count'. */
		downCount	}

	/**
	 * Enumération des champs de EquipmentType.
	 */
	public enum EquipmentTypeFields implements DtFieldName<io.mars.catalog.domain.EquipmentType> {
		/** Propriété 'Id'. */
		equipmentTypeId,
		/** Propriété 'Equipment Type Label'. */
		label,
		/** Propriété 'Equipment type is active'. */
		active,
		/** Propriété 'Equipment Category'. */
		equipmentCategoryId	}

	/**
	 * Enumération des champs de Event.
	 */
	public enum EventFields implements DtFieldName<io.mars.maintenance.domain.Event> {
		/** Propriété 'Id'. */
		eventId,
		/** Propriété 'dateTime'. */
		dateTime,
		/** Propriété 'duration'. */
		durationMinutes,
		/** Propriété 'affectedUrl'. */
		affectedUrl,
		/** Propriété 'affected'. */
		affectedLabel,
		/** Propriété 'Event Status'. */
		eventStatusId,
		/** Propriété 'Base'. */
		baseId,
		/** Propriété 'Person'. */
		personId	}

	/**
	 * Enumération des champs de EventStatus.
	 */
	public enum EventStatusFields implements DtFieldName<io.mars.maintenance.domain.EventStatus> {
		/** Propriété 'Id'. */
		eventStatusId,
		/** Propriété 'Status Label'. */
		label	}

	/**
	 * Enumération des champs de GeoSearchEquipmentCriteria.
	 */
	public enum GeoSearchEquipmentCriteriaFields implements DtFieldName<io.mars.basemanagement.domain.GeoSearchEquipmentCriteria> {
		/** Propriété 'Criteria'. */
		criteria,
		/** Propriété 'geoUpperLeft'. */
		geoUpperLeft,
		/** Propriété 'geoLowerRight'. */
		geoLowerRight,
		/** Propriété 'geoLocation'. */
		geoLocation,
		/** Propriété 'geoPrecision'. */
		geoPrecision	}

	/**
	 * Enumération des champs de Geosector.
	 */
	public enum GeosectorFields implements DtFieldName<io.mars.basemanagement.domain.Geosector> {
		/** Propriété 'Id'. */
		geosectorId,
		/** Propriété 'Sector Label'. */
		sectorLabel	}

	/**
	 * Enumération des champs de Groups.
	 */
	public enum GroupsFields implements DtFieldName<io.mars.hr.domain.Groups> {
		/** Propriété 'Id'. */
		groupId,
		/** Propriété 'Name'. */
		name	}

	/**
	 * Enumération des champs de MediaFileInfo.
	 */
	public enum MediaFileInfoFields implements DtFieldName<io.mars.common.domain.tools.file.MediaFileInfo> {
		/** Propriété 'Id'. */
		filId,
		/** Propriété 'Name'. */
		fileName,
		/** Propriété 'MimeType'. */
		mimeType,
		/** Propriété 'Size'. */
		length,
		/** Propriété 'Modification Date'. */
		lastModified,
		/** Propriété 'path'. */
		filePath,
		/** Propriété 'data'. */
		fileData	}

	/**
	 * Enumération des champs de Mission.
	 */
	public enum MissionFields implements DtFieldName<io.mars.hr.domain.Mission> {
		/** Propriété 'Id'. */
		missionId,
		/** Propriété 'Person'. */
		personId,
		/** Propriété 'Base'. */
		baseId,
		/** Propriété 'Business'. */
		businessId,
		/** Propriété 'Role'. */
		roleId	}

	/**
	 * Enumération des champs de MissionDisplay.
	 */
	public enum MissionDisplayFields implements DtFieldName<io.mars.hr.domain.MissionDisplay> {
		/** Propriété 'Id'. */
		missionId,
		/** Propriété 'Role'. */
		role,
		/** Propriété 'BaseId'. */
		baseId,
		/** Propriété 'Base'. */
		baseName,
		/** Propriété 'Business'. */
		businessName	}

	/**
	 * Enumération des champs de OpendataSet.
	 */
	public enum OpendataSetFields implements DtFieldName<io.mars.opendata.domain.OpendataSet> {
		/** Propriété 'Id'. */
		odsId,
		/** Propriété 'Code'. */
		code,
		/** Propriété 'Title'. */
		title,
		/** Propriété 'Description'. */
		description,
		/** Propriété 'Service Endpoint URL'. */
		endPointUrl,
		/** Propriété 'Picture'. */
		picturefileId,
		/** Propriété 'Tags'. */
		tags,
		/** Propriété 'Opendata Set Status'. */
		opendataSetStatusId	}

	/**
	 * Enumération des champs de OpendataSetStatus.
	 */
	public enum OpendataSetStatusFields implements DtFieldName<io.mars.opendata.domain.OpendataSetStatus> {
		/** Propriété 'Id'. */
		opendataSetStatusId,
		/** Propriété 'Status Label'. */
		label	}

	/**
	 * Enumération des champs de Person.
	 */
	public enum PersonFields implements DtFieldName<io.mars.hr.domain.Person> {
		/** Propriété 'Id'. */
		personId,
		/** Propriété 'First Name'. */
		firstName,
		/** Propriété 'Last Name'. */
		lastName,
		/** Propriété 'E-mail'. */
		email,
		/** Propriété 'Picture'. */
		picturefileId,
		/** Propriété 'Picture'. */
		picturefileIdTmp,
		/** Propriété 'Tags'. */
		tags,
		/** Propriété 'Date hired'. */
		dateHired,
		/** Propriété 'Full name'. */
		fullName,
		/** Propriété 'Group'. */
		groupId	}

	/**
	 * Enumération des champs de PersonInput.
	 */
	public enum PersonInputFields implements DtFieldName<io.mars.hr.domain.PersonInput> {
		/** Propriété 'Groups'. */
		groups	}

	/**
	 * Enumération des champs de Picture.
	 */
	public enum PictureFields implements DtFieldName<io.mars.basemanagement.domain.Picture> {
		/** Propriété 'Id'. */
		pictureId,
		/** Propriété 'Id'. */
		picturefileId,
		/** Propriété 'Base'. */
		baseId	}

	/**
	 * Enumération des champs de Role.
	 */
	public enum RoleFields implements DtFieldName<io.mars.hr.domain.Role> {
		/** Propriété 'Id'. */
		roleId,
		/** Propriété 'Role Label'. */
		label	}

	/**
	 * Enumération des champs de Supplier.
	 */
	public enum SupplierFields implements DtFieldName<io.mars.catalog.domain.Supplier> {
		/** Propriété 'Siren'. */
		siren,
		/** Propriété 'Broadcast status'. */
		statutDiffusion,
		/** Propriété 'Creation date'. */
		dateCreation,
		/** Propriété 'Sex'. */
		sexe,
		/** Propriété 'Firstname'. */
		prenomUsuel,
		/** Propriété 'Workforce range'. */
		trancheEffectifs,
		/** Propriété 'Last treatment'. */
		dateDernierTraitement,
		/** Propriété 'Number of periods'. */
		nombrePeriodes,
		/** Propriété 'Business category'. */
		categorieEntreprise,
		/** Propriété 'Start date'. */
		dateDebut,
		/** Propriété 'Administrative State'. */
		etatAdministratif,
		/** Propriété 'Name'. */
		nom,
		/** Propriété 'Use name'. */
		nomUsage,
		/** Propriété 'Denomination'. */
		denomination,
		/** Propriété 'Legal category'. */
		categorieJuridique,
		/** Propriété 'Core business'. */
		activitePrincipale,
		/** Propriété 'Business nomenclature'. */
		nomenclatureActivite,
		/** Propriété 'Nic Siege'. */
		nicSiege,
		/** Propriété 'Employer'. */
		caractereEmployeur	}

	/**
	 * Enumération des champs de Tag.
	 */
	public enum TagFields implements DtFieldName<io.mars.basemanagement.domain.Tag> {
		/** Propriété 'Id'. */
		tagId,
		/** Propriété 'Label'. */
		label	}

	/**
	 * Enumération des champs de Ticket.
	 */
	public enum TicketFields implements DtFieldName<io.mars.maintenance.domain.Ticket> {
		/** Propriété 'Id'. */
		ticketId,
		/** Propriété 'Number'. */
		code,
		/** Propriété 'Title'. */
		title,
		/** Propriété 'Description'. */
		description,
		/** Propriété 'Creation Date'. */
		dateCreated,
		/** Propriété 'Closing Date'. */
		dateClosed,
		/** Propriété 'Ticket Status'. */
		ticketStatusId,
		/** Propriété 'Equipment'. */
		equipmentId	}

	/**
	 * Enumération des champs de TicketStatus.
	 */
	public enum TicketStatusFields implements DtFieldName<io.mars.maintenance.domain.TicketStatus> {
		/** Propriété 'Id'. */
		ticketStatusId,
		/** Propriété 'Status Label'. */
		label	}

	/**
	 * Enumération des champs de WorkOrder.
	 */
	public enum WorkOrderFields implements DtFieldName<io.mars.maintenance.domain.WorkOrder> {
		/** Propriété 'Id'. */
		woId,
		/** Propriété 'Code'. */
		code,
		/** Propriété 'Number'. */
		ticketCode,
		/** Propriété 'Name'. */
		name,
		/** Propriété 'Description'. */
		description,
		/** Propriété 'Creation Date'. */
		dateCreated,
		/** Propriété 'Closing Date'. */
		dateClosed,
		/** Propriété 'Due Date'. */
		dueDate,
		/** Propriété 'Ticket'. */
		ticketId,
		/** Propriété 'Work Order Status'. */
		workOrderStatusId	}

	/**
	 * Enumération des champs de WorkOrderStatus.
	 */
	public enum WorkOrderStatusFields implements DtFieldName<io.mars.maintenance.domain.WorkOrderStatus> {
		/** Propriété 'Id'. */
		workOrderStatusId,
		/** Propriété 'Status Label'. */
		label	}

	/** {@inheritDoc} */
	@Override
	public Iterator<Class<?>> iterator() {
		return new Iterator<>() {
			private Iterator<Definitions> it = Arrays.asList(Definitions.values()).iterator();

			/** {@inheritDoc} */
			@Override
			public boolean hasNext() {
				return it.hasNext();
			}

			/** {@inheritDoc} */
			@Override
			public Class<?> next() {
				return it.next().getDtClass();
			}
		};
	}
}
