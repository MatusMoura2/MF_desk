package com.mouraforte.mfdesk.domain.enums;

public enum Priority {
	
	LOW(0, "LOW"), MEDIUM(1, "MEDIUM"), HIGH(2, "HIGH");
	
	private Integer cod;
	private String role;
	private Priority(Integer cod, String role) {
		this.cod = cod;
		this.role = role;
	}
	public Integer getCod() {
		return cod;
	}
	
	public String getRole() {
		return role;
	}
	
		public static Profiles toEnum(Integer cod) {
			if(cod == null) {
				return null;
			}
			
			for(Profiles x : Profiles.values()) {
				if(cod.equals(x.getCod())) {
					return x;
				}
			}
			
			throw new IllegalArgumentException("Perfil invalido!");
			
		}
}