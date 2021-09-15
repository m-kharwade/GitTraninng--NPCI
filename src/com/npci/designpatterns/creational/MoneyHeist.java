package com.npci.designpatterns.creational;

public class MoneyHeist extends WebSeries {
	String gener;
	double rating;
	
	public MoneyHeist(double rating) {
		this.rating=rating;
	}
	
	@Override
	String getGener() {
		gener="Hiest Drama";
		return null;
	}

	@Override
	double getRating() {
		rating=8.8;
		return 0;
	}
	
	

}
