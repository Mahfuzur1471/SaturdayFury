package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		
		String nameFury[] = {"Protik","Tahmina","Mahfuz","Roton","Fahmida"};
		//System.out.println("Student Name :" +nameFury[2]);
		//System.out.println("total Length :" +nameFury.length);
		
		int ageFury[] = {25,28,32,29,27,30};
			System.out.println("Student Name & Age :" +nameFury[1] +" & "+ ageFury[2]);
			//System.out.println("total Length :" +ageFury.length);
			
			//2D Array
			
		int age2D[][] = new int[][] {{25,27,29,31,24,26},
                                		{24,28,30}};
             System.out.println("Print 2D Array values :" +age2D[1][2]);
             String name2D[][] = new String[][] {{"Protik","Tahmina","Mahfuz","Roton","Fahmida"},
         		                              {"Esrat","Sabiha","Mabub"}};
                System.out.println("Print 2D Array Name :" +name2D[1][2]);  
                
        HashMap<String,Integer> Student = new   HashMap<String,Integer>();      
			Student.put("protik", 28);
			Student.put("Tahmina", 22);
			Student.put("Zia", 23);
			Student.put("Mahfuz", 29);
			System.out.println("HashMap Student Age :" +Student.get("Zia"));
			
	    HashMap<String,String> CC = new   HashMap<String,String>();      
	    		CC.put("Bangladesh", "Dhaka");
				CC.put("USA", "Washington DC");
				CC.put("India", "Delhi");
				CC.put("Pakistan", "Islamabad");
				System.out.println("Capital Name is : " +CC.get("Bangladesh"));	
				
		HashSet<String> Car = new HashSet<String>();
				Car.add("BMW");
				Car.add("Toyota");
				Car.add("Tesla");
				System.out.println("Car Name Is : "+Car);
	}

}
