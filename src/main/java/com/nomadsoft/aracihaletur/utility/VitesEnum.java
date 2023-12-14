package com.nomadsoft.aracihaletur.utility;

public enum VitesEnum {
		  MANUEL("Benzin"),
		  YARIOTOMATIK("Dizel"),
		  OTOMATIK("Elektrik");

	private String type;
		VitesEnum(String type) {
			// TODO Auto-generated constructor stub
			this.type = type;
		}
		public String getType() {
			return type;
		}
}


