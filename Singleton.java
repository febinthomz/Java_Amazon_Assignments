package com.demo.samples.day8.designpatterns.creational.singleton;

public class Singleton {
	private static Singleton instance;
	public String value;
	
	private Singleton(String value) {
		try {
			Thread.sleep(2000);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		this.value = value;
	}
	public static Singleton getInstance(String value) {
		if(instance == null) {
			instance = new Singleton(value);
					
		}
		return instance;
	}
}
