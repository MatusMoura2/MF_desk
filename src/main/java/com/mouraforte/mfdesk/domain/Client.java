package com.mouraforte.mfdesk.domain;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.constraints.br.CPF;

public class Client extends Person{
	
	private List<Called> calleds = new ArrayList<>();

	public Client() {
		super();
	}

	public Client(Integer id, @CPF String cpf, String email, String password) {
		super(id, cpf, email, password);
	}

	public List<Called> getCalleds() {
		return calleds;
	}

	public void setCalleds(List<Called> calleds) {
		this.calleds = calleds;
	}
	

}
