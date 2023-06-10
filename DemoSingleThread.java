package com.demo.samples.day8.designpatterns.creational.singleton;

public class DemoSingleThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Singleton sin= new Singleton("demo");
		
		Singleton singleton = Singleton.getInstance("FOO");
		Singleton anotherSingleton = Singleton.getInstance("BAR");
		System.out.println(singleton.value);
		System.out.println(anotherSingleton.value);
		System.out.println(" If you see same value , then singleton is reused (yay!!!)");
		

	}

}
