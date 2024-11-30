package com.upskill.java_2;

public class IfElseStatement {

	public  static void main(String[] args) {
		
		IfElseStatement obj = new IfElseStatement();
		obj.oddEven();	
		obj.agelimit();
	}
	public int getNumber(){
		return 60;
	}
	public String getName(){
		return "Mahfuz";
	}
	
	public void agelimit(){
		
		int age = getNumber();
		String name=getName();
		
		if (age==0 || age==1)
			System.out.println(name+" You are"+" "+age+",So "+"You are Infant.");
		else if(age>1 && age<=3)
			System.out.println(name+" You are"+" "+age+",So "+"You are Toddler.");
		else if(age>3 && age<=12)
			System.out.println(name+" You are"+" "+age+",So "+"You are Children.");
		else if(age>=13 && age<=19)
			System.out.println(name+" You are"+" "+age+",So "+"You are Teenager.");
		else if(age>=20 && age<=29)
			System.out.println(name+" You are"+" "+age+",So "+"You are Young Adult/twenties.");
		else if(age>=30 && age<=39)
			System.out.println(name+" You are"+" "+age+",So "+"You are Thirties.");
		else if(age>=40 && age<=49)
			System.out.println(name+" You are"+" "+age+",So "+"You are Forties.");
		else if(age>=50 && age<=59)
			System.out.println(name+" You are"+" "+age+",So "+"You are Fifties.");
		else if(age>=60 && age<=69)
			System.out.println(name+" You are"+" "+age+",So "+"You are Sixties.");
		else if(age>=70 && age<=79)
			System.out.println(name+" You are"+" "+age+",So "+"You are Seventies.");
		else if(age>=80 && age<=89)
			System.out.println(name+" You are"+" "+age+",So "+"You are Eighties.");
		else if(age>=90 && age<=99)
			System.out.println(name+" You are"+" "+age+",So "+"You are Nineties.");
		else if (age>100)
		    System.out.println(name+" You are"+" "+age+",So "+"You are Champion.");
		else
			System.out.println(name+" Please insert Correct age.");
	}
	
	public void oddEven(){
		int num=getNumber();
		String name=getName();
		
		if(num%2==0)
			System.out.println("Hi,"+name+" The number you entered is Even.");
		else
			System.out.println("Hi,"+name+" The number you entered is Odd.");
		}
		
		/*if(age<=13){                             //Here <= or any logic is java operator.
			System.out.println("You are Children...");
		
		}else if(age>=13 && age<=19){
			System.out.println("You are Teenager......");
		}else if(age>60){
			if (age >100){
				System.out.println("You are Champion......");
			}else{
			System.out.println("You are Senior......");
			}
		}
		else{
			System.out.println("You are Adult......");
		}*/
		

}
