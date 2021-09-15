package com.npci.designpatterns.creational;

public class MoneyHeistFactory implements WebSeriesAbstractFactory {

	@Override
	public WebSeries createSeries(double rating) {
		
		return new MoneyHeist(rating);
	}

	
}
