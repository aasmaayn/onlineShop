package com.asmaayni.store.common;

public enum Category {
	
	ELECTRONICS("01","Electronics"),
	HOME_AND_GARDENS("02","Home And Gardens"),
	FASHION("03","Fashion"),
	TOYES("04","Toyes");
	
	private String categoryValue;
	private String categoryCode;
	
	Category (String categoryCode, String categoryValue) {
		this.categoryValue = categoryValue;
		this.categoryCode = categoryCode;
	}

	public String getCategoryValue() {
		return categoryValue;
	}

	public void setCategoryValue(String categoryValue) {
		this.categoryValue = categoryValue;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
}
