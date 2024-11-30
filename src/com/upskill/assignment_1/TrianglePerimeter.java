package com.upskill.assignment_1;

public class TrianglePerimeter {

	public static void main(String[] args) {
		TrianglePerimeter TP = new TrianglePerimeter();
		TP.triangle();
		TP.rectangle();
		System.out.println("Return Multiply value is:" +TP.multiply());
		System.out.println(TP.function2()-TP.function1());
		
	}
	public void triangle(){                    //1 line assignment.
		int arms1 = 5;
		int arms2 = 7;
		int arms3= 11;
		int perimeter = arms1+arms2+arms3;
		System.out.println("Triangle Perimeter is:" +perimeter);
	}
	public void rectangle(){                    //2 line assignment.
		int width = 9;
		int length = 13;
		int perimeter = width+length;
		System.out.println("Recangle Perimeter is:" +perimeter);
	}
	public int multiply(){                       //3 line assignment.
		int a = 9;
		int b = 11;
		int m = a*b;
		int add = a+b+m;
		return m;
		
	}
	public int function1(){                       //4 line assignment.
		return 30;
		
	}
	public int function2(){                       //4 line assignment.
		return 50;
		
	}


}
