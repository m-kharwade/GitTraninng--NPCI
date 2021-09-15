package com.npci.designpatterns.creational;

public class WebSeriesAbsFactory {
	
	public static WebSeries getWebSeries(WebSeriesAbstractFactory abstractFactory,double rating) {
		return abstractFactory.createSeries(rating);
	}

}
