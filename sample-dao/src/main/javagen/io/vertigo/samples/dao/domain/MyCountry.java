package io.vertigo.samples.dao.domain;

import io.vertigo.dynamo.domain.stereotype.Field;
import io.vertigo.dynamo.domain.model.Entity;
import io.vertigo.dynamo.domain.model.URI;
import io.vertigo.dynamo.domain.util.DtObjectUtil;
/**
 * Attention cette classe est générée automatiquement !
 * Objet de données MyCountry
 */
public final class MyCountry implements Entity {

	/** SerialVersionUID. */
	private static final long serialVersionUID = 1L;

	private Long couId;
	private String name;

	/** {@inheritDoc} */
	@Override
	public URI<MyCountry> getURI() {
		return DtObjectUtil.createURI(this);
	}
	
	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'Id'. 
	 * @return Long couId <b>Obligatoire</b>
	 */
	@Field(domain = "DO_ID", type = "ID", required = true, label = "Id")
	public Long getCouId() {
		return couId;
	}

	/**
	 * Champ : ID.
	 * Définit la valeur de la propriété 'Id'.
	 * @param couId Long <b>Obligatoire</b>
	 */
	public void setCouId(final Long couId) {
		this.couId = couId;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Code du pays'. 
	 * @return String name 
	 */
	@Field(domain = "DO_LABEL", label = "Code du pays")
	public String getName() {
		return name;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Code du pays'.
	 * @param name String 
	 */
	public void setName(final String name) {
		this.name = name;
	}


	// Association : Movie non navigable

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
