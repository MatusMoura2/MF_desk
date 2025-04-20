package com.mouraforte.mfdesk.domain;

import java.io.ObjectInputFilter.Status;
import java.time.LocalDate;

import com.mouraforte.mfdesk.domain.enums.Priority;

public class Called {
	
	private Integer id;
	private LocalDate openData = LocalDate.now();
	private LocalDate closedData = LocalDate.now();
	private Priority priority;
	private Status status;
	private String title;
	private String observations;
	private Technician technician;
	private Client client;
	
	public Called(Integer id, Priority priority, Status status, String title, String observations,
			Technician technician, Client client) {
		super();
		this.id = id;
		this.priority = priority;
		this.status = status;
		this.title = title;
		this.observations = observations;
		this.technician = technician;
		this.client = client;
	}

	public Called() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getOpenData() {
		return openData;
	}

	public void setOpenData(LocalDate openData) {
		this.openData = openData;
	}

	public LocalDate getClosedData() {
		return closedData;
	}

	public void setClosedData(LocalDate closedData) {
		this.closedData = closedData;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getObservations() {
		return observations;
	}

	public void setObservations(String observations) {
		this.observations = observations;
	}

	public Technician getTechnician() {
		return technician;
	}

	public void setTechnician(Technician technician) {
		this.technician = technician;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Called other = (Called) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
