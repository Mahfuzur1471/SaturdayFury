package com.upskill.java_4;

public abstract class AbstractClass {
	
	public abstract void iCar();
	
	public abstract void iWheel();
	
	public abstract void iDoor();
	
	public abstract void iEnginee();
	
	public abstract String iName();
	
	public abstract int iValue();
	
	public abstract boolean iYes();

    public String name(){
		
		String name="Upskill";
		return name;
	}

    public int value(){
	
	int value=100;
	return value;
}

    public boolean ev(){
	
	boolean ev= true;
	return ev;
}


    public void car(){
		
		System.out.println("My Car is Tesla");
	}  
     public void bus(){
		
		System.out.println("My bus is Volbo");
	}

}
