package com.upskill.java_4;

public class InterfaceImplementation implements Interface {

	@Override
	public void iCar() {
		System.out.println("My Car is Tesla");
		
	}

	@Override
	public void iWheel() {
		System.out.println("My Car is 6 Wheels");
		
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
		return age;
	}

	@Override
	public boolean iYes() {
		boolean ev = true;
		return ev;
	}

}
