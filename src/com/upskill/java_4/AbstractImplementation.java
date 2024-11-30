package com.upskill.java_4;

public class AbstractImplementation extends AbstractClass{

	@Override
	public void iCar() {
		System.out.println("My Car is Audi");
		
	}

	@Override
	public void iWheel() {
		System.out.println("My Car is 4 Wheels");
		
	}

	@Override
	public void iDoor() {
		System.out.println("My Car is 2 Doors");
		
	}

	@Override
	public void iEnginee() {
		System.out.println("My Car has Motor");
		
	}

	@Override
	public String iName() {
		String name = "upskill";
		return name;
	}

	@Override
	public int iValue() {
		int age = 30;
		return 0;
	}

	@Override
	public boolean iYes() {
		boolean ev = true;
		return ev;
	}

}
