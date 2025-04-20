package com.mouraforte.mfdesk.domain.enums;

public enum Profiles {
	
	ADMIN(0, "ROLE_ADMIN"), CLIENT(1, "ROLE_CLIENT"), TECHNICIAN(2, "ROLE_TECHNICIAN");
	
	private Integer cod;
	private String role;
	private Profiles(Integer cod, String role) {
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
