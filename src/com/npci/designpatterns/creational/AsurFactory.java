package com.npci.designpatterns.creational;

public class AsurFactory implements WebSeriesAbstractFactory {

	@Override
	public WebSeries createSeries(double rating) {
		
		return new Asur(rating);
	}
}
