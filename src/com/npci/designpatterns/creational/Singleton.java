package com.npci.designpatterns.creational;

public class Singleton {
	
	private Singleton() {};
	//Eager Initialization
	private static Singleton singleton=new Singleton();
	
	public static Singleton getInstance() {
		return singleton;
	}

}
