package com.npci.designpatterns.creational;

public class ThreadSafeInitalization {
	
	private ThreadSafeInitalization() {};
	
	private static ThreadSafeInitalization singleton;
	
	public static synchronized ThreadSafeInitalization getInstance()
	{
		if(singleton==null)
		{
			singleton=new ThreadSafeInitalization();
		}
		return singleton;
	}

}
