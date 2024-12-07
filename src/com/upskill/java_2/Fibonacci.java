package com.upskill.java_2;

public class Fibonacci {

	public static void main(String[] args) {
		
		int n=11;                      //Number of Terms
		int a = 0 , b = 1;
		System.out.println("Fibonacci sequence up to " + n + " terms:");
				for(int i=1;i <= n; i++){
					System.out.print(a + " ");
					int next = a + b;
		            a = b;
		            b = next;
			}
	}

}
