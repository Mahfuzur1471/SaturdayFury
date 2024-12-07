package com.upskill.java_3;

public class Encapsulation {
	
		//Encapsulation used to hide the data using setter and getter method.
	
	private String name = "Upskill";							//Write & Read
	private int ssn = 5214589;									//Write Only		
	private String username = "Mahfuz1471";							//Read Only
	
	//Setter Method - Name										//Set the data,Write
	
	public void setName(String Value){
		name = Value;
	}
	//Setter Method - SSN
	public void setSSN(int Value){
		ssn = Value;
	}
	//Getter Method - Name										//Get the data,Read
	public String getName(){
		return name;
	}
	//Getter Method - UserName	
	public String getUserName(){
		return username;
	}
	
	public static void main (String[] args){
		Encapsulation obj = new Encapsulation();
		System.out.println(obj.getName());
		obj.setName("Mahfuz");
		System.out.println(obj.getName());
		System.out.println(obj.getUserName());
	}

}
