package com.mouraforte.mfdesk.domain.enums;

public enum Status {
	
	OPEN(0, "OPEN"), PROGRESS(1, "PROGRESS"), TCLOSED(2, "CLOSED");
	
	private Integer cod;
	private String role;
	private Status(Integer cod, String role) {
		this.cod = cod;
		this.role = role;
	}
	public Integer getCod() {
		return cod;
	}
	
	public String getRole() {
		return role;
	}
	
		public static Status toEnum(Integer cod) {
			if(cod == null) {
				return null;
			}
			
			for(Status x : Status.values()) {
				if(cod.equals(x.getCod())) {
					return x;
				}
			}
			
			throw new IllegalArgumentException("Status invalido!");
			
		}
}
