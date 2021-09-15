package com.npci.designpatterns.creational;

public class Asur extends WebSeries {
	
	String gener;
	double rating;
	
	public Asur(Double rating) {
	//	this.gener=gener;
		this.rating=rating;
	}
	
	@Override
	String getGener() {
		gener="Suspense Thriller";
		return gener;
	}

	@Override
	double getRating() {
		//rating=9.1;
		return rating;
	}
	
		
}
