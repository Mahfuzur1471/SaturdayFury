package com.upskill.java_3;

import com.upskill.java_1.MethodType;

public class Inheritance extends MethodType{
	/*
		The process of pbtaining the data and method from one class to another class is known as Inceritance.
		-Single Inheritance
		-Multiple Inheritance (Java doesnt support multiple Inheritance directly rather through Interfaceses.
		-Multilevel Inheritance
	*/

	public static void main(String[] args) {
		
		Inheritance obj = new Inheritance();
		obj.annualIncomeVoid();
		weeklyIncomeStatic();                     //As this method data type is static so that we can call it without object
	}

}
