package com.upskill.java_1;

public class MethodType {
	
	/* Type of Methods
	 * Void Method
	 * Static Method
	 * Return Type Method 
	 */
	public static int hourlyIncome = 65;
	public static void main(String[] args) {
		MethodType obj = new MethodType();
		obj.annualIncomeVoid();
		System.out.println("My Monthly Income:" +obj.monthlyIncomeReturn());
		weeklyIncomeStatic();
		/*System.out.println("Return My Name:" +obj.myNameReturn());
		System.out.println("Raining or Not:" +obj.isRaining());
        */
	}
	//Void Method - we have to call through object
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome*2000;
		System.out.println("My Annual Income:" +calculateAnnualIncome);
		
	}
	//Return Method - Must have to return some data
	public int monthlyIncomeReturn(){
		int calculateMonthlyIncome = hourlyIncome*180;
		return calculateMonthlyIncome;
	}
	/*public String myNameReturn(){
		String myNameReturn = "Mahfuz";
		return myNameReturn;
	}
	public boolean isRaining(){
		boolean isRaining = false;
		return isRaining;
	}*/
	
	//Static Method - we dont need to call through obj,we can call the method directly.
	public static void weeklyIncomeStatic(){
		int calculateWeeklyIncome = hourlyIncome*40;
		System.out.println("My Weekly Income:" + calculateWeeklyIncome);
		
	}
}
