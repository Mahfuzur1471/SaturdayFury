package com.upskill.java_1;

public class Variables {
	
	public String country = "USA";               //Instance or global Variables-Variables create in class label,Outside Method
	public static String reagion = "America";    //Static Variables- Variables declared in class and don't required creating objects
	
	public void ny(String county){               //Method Parameter - Variables used as method parameter. 
		String city = "NYC";                    //Local Variables-Variable declared in Methods
		System.out.println("----NY Method---");
		System.out.println(country);
		System.out.println(city);
		System.out.println(county);
		
	}
	
	public void nj(String county){              //Method Parameter - Variables used as method parameter. 
		String city = "Peterson";               //Local Variables-Variable declared in Methods
		System.out.println("----NJ Method---");
		System.out.println(country);
		System.out.println(city);
		System.out.println(county);
		
	}
	public static void main(String[] args) {
		Variables myobj = new Variables();
		myobj.ny("Queens");
		myobj.nj("Essex");
		
		System.out.println("----Static/Non Static---");
		System.out.println(myobj.country);
		System.out.println(reagion);

	}

}
