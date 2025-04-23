package com.mouraforte.mfdesk.domain.dtos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.mouraforte.mfdesk.domain.Technician;
import com.mouraforte.mfdesk.domain.enums.Profiles;

public class TechnicianDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	protected Integer id;
	protected String name;
	protected String cpf;
	protected String email;
	protected String password;

	@JsonFormat(pattern = "dd/MM/yyyy")
	protected LocalDate dateInit = LocalDate.now();

	protected Set<Integer> profiles = new HashSet<>();

	public TechnicianDTO() {
		super();
	}

	public TechnicianDTO(Technician technician) {
		super();
		this.id = technician.getId();
		this.name = technician.getName();
		this.cpf = technician.getCpf();
		this.email = technician.getEmail();
		this.password = technician.getPassword();
		this.profiles = technician.getProfiles().stream().map(x -> x.getCod()).collect(Collectors.toSet());
		this.dateInit = technician.getDateInit();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return profiles.stream().map(x -> Profiles.toEnum(x)).collect(Collectors.toSet());
	}

	public void setProfiles(Set<Integer> profiles) {
		this.profiles = profiles;
	}

}
