package com.upskill.java_6;

public class MultiThreadingRunable  Implements Runable{

	
	public void run(){
		try{
			System.out.println(Thread.currentThread().getId());
		}catch(Exception e){
			e.printStackTrace();
		}
		
		}
}
