package com.npci.designpatterns.creational;

public class Main {

	//Eager Initialization
	Singleton singleton=Singleton.getInstance();
	
	//LazyIntialization 
	LazySingleton lazySingleton=LazySingleton.getInstance();
	
	//Thread Safe Singleton
	ThreadSafeInitalization threadSingleton=ThreadSafeInitalization.getInstance(); 
	
	//Factory.
	WebSeries moneyHiest=WebSeriesFactory.getWebSeries("HiestDrama",8.8 );
	WebSeries asur=WebSeriesFactory.getWebSeries("Asur",9.1 );
	
	//AbstractFactory or Factory of Factory 
	WebSeries moneyHiest1=WebSeriesAbsFactory.getWebSeries(new MoneyHeistFactory(), 8.8);
	WebSeries asur1=WebSeriesAbsFactory.getWebSeries(new AsurFactory(), 9.1);

	//builder
	Flower flower=new Flower
			.FlowerBuilder()
			.setSmell("lavender")
			.setColor("Pink")
			.setPetalLength(2)
			.setSepalLegth(2)
			.build();
	
	//prototype
	
	
}
