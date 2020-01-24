package io.mars.basemanagement.domain;

import io.vertigo.core.lang.Generated;
import io.vertigo.datamodel.structure.model.Entity;
import io.vertigo.datamodel.structure.model.UID;
import io.vertigo.datamodel.structure.stereotype.Field;
import io.vertigo.datamodel.structure.util.DtObjectUtil;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
@io.vertigo.datamodel.smarttype.annotations.Mapper(clazz = io.vertigo.datamodel.structure.util.JsonMapper.class, dataType = io.vertigo.datamodel.structure.metamodel.DataType.String)
public final class Business implements Entity {
	private static final long serialVersionUID = 1L;

	private Long businessId;
	private String name;
	private String icon;

	/** {@inheritDoc} */
	@Override
	public UID<Business> getUID() {
		return UID.of(this);
	}
	
	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'Id'.
	 * @return Long businessId <b>Obligatoire</b>
	 */
	@Field(domain = "STyId", type = "ID", cardinality = io.vertigo.core.lang.Cardinality.ONE, label = "Id")
	public Long getBusinessId() {
		return businessId;
	}

	/**
	 * Champ : ID.
	 * Définit la valeur de la propriété 'Id'.
	 * @param businessId Long <b>Obligatoire</b>
	 */
	public void setBusinessId(final Long businessId) {
		this.businessId = businessId;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Name'.
	 * @return String name
	 */
	@Field(domain = "STyLabel", label = "Name")
	@io.vertigo.datamodel.structure.stereotype.SortField
	@io.vertigo.datamodel.structure.stereotype.DisplayField
	public String getName() {
		return name;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Name'.
	 * @param name String
	 */
	public void setName(final String name) {
		this.name = name;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Icon'.
	 * @return String icon
	 */
	@Field(domain = "STyLabel", label = "Icon")
	public String getIcon() {
		return icon;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Icon'.
	 * @param icon String
	 */
	public void setIcon(final String icon) {
		this.icon = icon;
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
