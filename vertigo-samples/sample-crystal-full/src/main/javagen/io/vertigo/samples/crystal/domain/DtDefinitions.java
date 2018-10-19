package io.vertigo.samples.crystal.domain;

import java.util.Arrays;
import java.util.Iterator;

import io.vertigo.dynamo.domain.metamodel.DtFieldName;
import io.vertigo.lang.Generated;

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
		/** Objet de données Actor. */
		Actor(io.vertigo.samples.crystal.domain.Actor.class),
		/** Objet de données Country. */
		Country(io.vertigo.samples.crystal.domain.Country.class),
		/** Objet de données Movie. */
		Movie(io.vertigo.samples.crystal.domain.Movie.class),
		/** Objet de données MovieIndex. */
		MovieIndex(io.vertigo.samples.crystal.domain.MovieIndex.class),
		/** Objet de données Role. */
		Role(io.vertigo.samples.crystal.domain.Role.class),
		/** Objet de données Sexe. */
		Sexe(io.vertigo.samples.crystal.domain.Sexe.class),
		/** Objet de données User. */
		User(io.vertigo.samples.crystal.domain.User.class),
		/** Objet de données UserGroup. */
		UserGroup(io.vertigo.samples.crystal.domain.UserGroup.class);

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
	 * Enumération des champs de Actor.
	 */
	public enum ActorFields implements DtFieldName<io.vertigo.samples.crystal.domain.Actor> {
		/** Propriété 'Id'. */
		ACT_ID,
		/** Propriété 'Nom'. */
		NAME,
		/** Propriété 'Sexe'. */
		SEX_CD
	}

	/**
	 * Enumération des champs de Country.
	 */
	public enum CountryFields implements DtFieldName<io.vertigo.samples.crystal.domain.Country> {
		/** Propriété 'Id'. */
		COU_ID,
		/** Propriété 'Nom du pays'. */
		NAME
	}

	/**
	 * Enumération des champs de Movie.
	 */
	public enum MovieFields implements DtFieldName<io.vertigo.samples.crystal.domain.Movie> {
		/** Propriété 'Id'. */
		MOV_ID,
		/** Propriété 'Titre du film'. */
		NAME,
		/** Propriété 'AnnÃ©e'. */
		YEAR,
		/** Propriété 'Id Imdb'. */
		IMDBID,
		/** Propriété 'Country'. */
		COU_ID
	}

	/**
	 * Enumération des champs de MovieIndex.
	 */
	public enum MovieIndexFields implements DtFieldName<io.vertigo.samples.crystal.domain.MovieIndex> {
		/** Propriété 'id'. */
		MOV_ID,
		/** Propriété 'Titre'. */
		NAME,
		/** Propriété 'AnnÃ©e'. */
		YEAR,
		/** Propriété 'Pays'. */
		COUNTRY
	}

	/**
	 * Enumération des champs de Role.
	 */
	public enum RoleFields implements DtFieldName<io.vertigo.samples.crystal.domain.Role> {
		/** Propriété 'Id'. */
		ROL_ID,
		/** Propriété 'Dans le role de'. */
		AS_CHARACTER,
		/** Propriété 'Movie'. */
		MOV_ID,
		/** Propriété 'Actor'. */
		ACT_ID
	}

	/**
	 * Enumération des champs de Sexe.
	 */
	public enum SexeFields implements DtFieldName<io.vertigo.samples.crystal.domain.Sexe> {
		/** Propriété 'Id'. */
		SEX_CD,
		/** Propriété 'Label'. */
		LABEL
	}

	/**
	 * Enumération des champs de User.
	 */
	public enum UserFields implements DtFieldName<io.vertigo.samples.crystal.domain.User> {
		/** Propriété 'Id'. */
		USR_ID,
		/** Propriété 'Login'. */
		LOGIN,
		/** Propriété 'Nom'. */
		NAME,
		/** Propriété 'email'. */
		EMAIL,
		/** Propriété 'Country'. */
		COU_ID,
		/** Propriété 'Group'. */
		GRP_ID
	}

	/**
	 * Enumération des champs de UserGroup.
	 */
	public enum UserGroupFields implements DtFieldName<io.vertigo.samples.crystal.domain.UserGroup> {
		/** Propriété 'Id'. */
		GRP_ID,
		/** Propriété 'Nom'. */
		NAME
	}

	/** {@inheritDoc} */
	@Override
	public Iterator<Class<?>> iterator() {
		return new Iterator<Class<?>>() {
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
