package com.nomadsoft.aracihaletur.utility;

public enum YakitEnum {
		  BENZIN("Benzin"),
		  DIZEL("Dizel"),
		  ELECTRIC("Elektrik"),
		  HYBRIT("Hibrit");

	private String type;
		YakitEnum(String type) {
			// TODO Auto-generated constructor stub
			this.type = type;
		}
		public String getType() {
			return type;
		}
}


