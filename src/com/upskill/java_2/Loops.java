package com.upskill.java_2;

public class Loops {

	public static void main(String[] args) {
		practiceForLoops();
		practiceWhileLoops();
		practiceDoWhileLoop();
		//practiceInfiniteLoops();
		practiceNestedLoops();
	}
	
	public static void practiceForLoops(){                  //For Loop - Do again and again upto upper limit.
		int i;                                              //initialize the variable 
		
		for(i=1; i<=10; i++){                               //Setting lower limit,Upper limit and increment or decrement
			System.out.println("For loops=" +i);            //Statement
		}
	}
	public static void practiceWhileLoops(){                 //While Loop - Do again and again until condition match.
		int i=1;                                             //initialize the variable 
		while(i<=10){                                        //Setting Condition
			System.out.println("While Loops="+i);            //Statement
			i++;                                             //Increment or Decrement.
		}
		
	}
	 public static void practiceDoWhileLoop(){                //DO While Loop - Do Action then Condition Match.
		 int i = 1;											  //Initializing Variable.	
		 do{
			 System.out.println("Do While Loops="+i);         //Statement
				i++;                                          //Increment or Decrement.
			 
		 }while(i<10);                                        //Setting Condition.
	 }
	 /*public static void practiceInfiniteLoops(){                  //For Loop - Do again and again up to upper limit.
			int i;                                              //initialize the variable 
			
			for(i=1; ; i++){                               //Setting lower limit,No Upper limit and increment or decrement
				System.out.println("Infinite loops=" +i);            //Statement
			}
		}*/
	 public static void practiceNestedLoops(){                  //For Loop - Do again and again up to upper limit.
			int i;                                              //initialize the variable 
			int j;                                              //initialize the variable 
			int size=10;                                                 
			
			for(i=1;i<=size ; i++){
				for(j=1;j<=size ;j++){                                //Setting lower limit,No Upper limit and increment or decrement
					int multiplication = i*j;
				System.out.print( multiplication +" \t");            //Statement
			}
				System.out.println(" ");
				
		}
	 }

}
