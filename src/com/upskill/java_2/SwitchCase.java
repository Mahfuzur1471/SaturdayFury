package com.upskill.java_2;

public class SwitchCase {

	public static void main(String[] args) {
		int day = 1;
		String name = "Mahfuz";
		
		switch(day){
	    case 1:
	    	String emoji = "😊";
		    System.out.println("Hi, "+name+" "+"Today is Monday"+emoji);
		    int temperature = 20;
		    
		    if(temperature>60)
		    	System.out.println("Its Hot Today.");
	
		    else if (temperature>50 && temperature<60)
	    		System.out.println("Its Normal Weather Today.");
	    	
	    	else if(temperature <=50 && temperature>=40)
    			System.out.println("Its Cold Today.");
		   
	    	else 
	    		System.out.println("Its too Cold Today.");
	    	
	    	break;
	    case 2:
		     System.out.println("Hi, "+name+" "+"Today is Tuesday.");
		     break;
	    case 3:
			 System.out.println("Hi, "+name+" "+"Today is Wednesday.");
			 break;
	    case 4:
			 System.out.println("Hi, "+name+" "+"Today is Thursday.");
			 break;
	    case 5:
			 System.out.println("Hi, "+name+" "+"Today is Friday.");
			 break;
	    case 6:
			 System.out.println("Hi, "+name+" "+"Today is Saturday.");
			 break;
	    case 7:
			 System.out.println("Hi, "+name+" "+"Today is Sunday.");
			 break;
	    default:
			System.out.println("Hi, "+name+" "+"Enter valid number.");
		}
		

	}
	

}
