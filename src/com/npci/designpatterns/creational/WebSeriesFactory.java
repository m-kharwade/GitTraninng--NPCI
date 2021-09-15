package com.npci.designpatterns.creational;

public class WebSeriesFactory {
	
	public static WebSeries getWebSeries(String gener, double rating){
		
		if("Asur".equalsIgnoreCase(gener))
			return new Asur(rating);
		else if("MoneyHeist".equalsIgnoreCase(gener))
			return new MoneyHeist(rating);
		else 
			return null;
	}

}
