package com.tahaburak.atem.model;

import java.util.Date;

/**
 * Created by burak on 24.11.2019
 */
public class User {

	private Long id;

	private String name;
	private String surname;
	private Date birthDate;

	public User(Long id, String name, String surname, Date birthDate) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
	}

	// long list of getters and setters

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}
