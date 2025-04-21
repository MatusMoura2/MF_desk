package com.mouraforte.mfdesk.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.br.CPF;

import com.mouraforte.mfdesk.domain.enums.Profiles;

@Entity
public class Client extends Person{
	
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy = "client")
	private List<Called> calleds = new ArrayList<>();

	public Client() {
		super();
		addProfiles(Profiles.CLIENT);
	}

	public Client(Integer id,String name, @CPF String cpf, String email, String password) {
		super(id,name, cpf, email, password);
		addProfiles(Profiles.CLIENT);
	}

	public List<Called> getCalleds() {
		return calleds;
	}

	public void setCalleds(List<Called> calleds) {
		this.calleds = calleds;
	}
	

}
