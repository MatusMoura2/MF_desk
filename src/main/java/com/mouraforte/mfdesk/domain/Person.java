package com.mouraforte.mfdesk.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.hibernate.validator.constraints.br.CPF;

import com.mouraforte.mfdesk.domain.enums.Profiles;

public abstract class Person {

	protected Integer id;
	@CPF
	protected String cpf;
	protected String email;
	protected String password;

	protected LocalDate dateInit = LocalDate.now();

	protected Set<Integer> profiles = new HashSet<>();

	public Person() {
		super();
		addProfiles(Profiles.CLIENT);
	}

	public Person(Integer id, @CPF String cpf, String email, String password) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.email = email;
		this.password = password;
		addProfiles(Profiles.CLIENT);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getDateInit() {
		return dateInit;
	}

	public void setDateInit(LocalDate dateInit) {
		this.dateInit = dateInit;
	}

	public Set<Profiles> getProfiles() {
		return profiles.stream().map(p -> Profiles.toEnum(p)).collect(Collectors.toSet());
	}

	public void addProfiles(Profiles profiles) {
		this.profiles.add(profiles.getCod());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
