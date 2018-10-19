package io.vertigo.pandora.domain.persons;

import io.vertigo.dynamo.domain.model.DtObject;
import io.vertigo.dynamo.domain.stereotype.Field;
import io.vertigo.dynamo.domain.util.DtObjectUtil;
import io.vertigo.lang.Generated;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
public final class PersonIndex implements DtObject {
	private static final long serialVersionUID = 1L;

	private Long perId;

	private String fullName;

	private String fullNameSortOnly;

	private String biography;

	private String sex;

	private String photoUrl;

	private String birthDate;

	private String birthPlace;

	private String activity;

	private String movies;

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'id'.
	 * @return Long perId <b>Obligatoire</b>
	 */
	@Field(domain = "DO_IDENTITY", required = true, label = "id")
	public Long getPerId() {
		return perId;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'id'.
	 * @param perId Long <b>Obligatoire</b>
	 */
	public void setPerId(final Long perId) {
		this.perId = perId;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Nom'.
	 * @return String fullName
	 */
	@Field(domain = "DO_LABEL", label = "Nom")
	public String getFullName() {
		return fullName;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Nom'.
	 * @param fullName String
	 */
	public void setFullName(final String fullName) {
		this.fullName = fullName;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Nom'.
	 * @return String fullNameSortOnly
	 */
	@Field(domain = "DO_TEXT_NOT_TOKENIZED", persistent = false, label = "Nom")
	public String getFullNameSortOnly() {
		return fullNameSortOnly;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Nom'.
	 * @param fullNameSortOnly String
	 */
	public void setFullNameSortOnly(final String fullNameSortOnly) {
		this.fullNameSortOnly = fullNameSortOnly;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Biographie'.
	 * @return String biography
	 */
	@Field(domain = "DO_TEXT", persistent = false, label = "Biographie")
	public String getBiography() {
		return biography;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Biographie'.
	 * @param biography String
	 */
	public void setBiography(final String biography) {
		this.biography = biography;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Sexe'.
	 * @return String sex
	 */
	@Field(domain = "DO_LABEL_SHORT", label = "Sexe")
	public String getSex() {
		return sex;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Sexe'.
	 * @param sex String
	 */
	public void setSex(final String sex) {
		this.sex = sex;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'photo'.
	 * @return String photoUrl
	 */
	@Field(domain = "DO_HREF", label = "photo")
	public String getPhotoUrl() {
		return photoUrl;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'photo'.
	 * @param photoUrl String
	 */
	public void setPhotoUrl(final String photoUrl) {
		this.photoUrl = photoUrl;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Date de naissance'.
	 * @return String birthDate
	 */
	@Field(domain = "DO_DATE", label = "Date de naissance")
	public String getBirthDate() {
		return birthDate;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Date de naissance'.
	 * @param birthDate String
	 */
	public void setBirthDate(final String birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Lieu de naissance'.
	 * @return String birthPlace
	 */
	@Field(domain = "DO_LABEL", label = "Lieu de naissance")
	public String getBirthPlace() {
		return birthPlace;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Lieu de naissance'.
	 * @param birthPlace String
	 */
	public void setBirthPlace(final String birthPlace) {
		this.birthPlace = birthPlace;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Activity'.
	 * @return String activity
	 */
	@Field(domain = "DO_MULTI_VALUES", label = "Activity")
	public String getActivity() {
		return activity;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Activity'.
	 * @param activity String
	 */
	public void setActivity(final String activity) {
		this.activity = activity;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Movies'.
	 * @return String movies
	 */
	@Field(domain = "DO_MULTI_VALUES", label = "Movies")
	public String getMovies() {
		return movies;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Movies'.
	 * @param movies String
	 */
	public void setMovies(final String movies) {
		this.movies = movies;
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
