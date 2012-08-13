package com.visionarysoftwaresolutions.ratable;

public enum FiveStarRatingScale {
	ONE("1"),
	TWO("2"),
	THREE("3"),
	FOUR("4"),
	FIVE("5")
	
	private final String value
	
	FiveStarRatingScale(String val){ 
		this.value = val
	}
}
