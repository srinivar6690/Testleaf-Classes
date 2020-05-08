package week1.day1.classroom;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare your input number
	int i;
		
	// Declare and initialize an integer variable by name: fact
				
    int fact= 5;
   
   // Iterate from 1 to your input (tip: using loop concept)
				
    for(i=1;i<5;i++) // Within the loop: Multiply fact with the iterator variable (Tip: Assign it to the 'fact' variable)
	  
   {
	
	   System.out.println("Inside loop printing the value of i to be multiplied to get factorial"+'\t'+i);
	   fact = fact*i;
   }
				//End of loop
       System.out.println("Outside loop - The Factorial of number 5 is "+'\t' +fact);		
   				// Print factorial (fact)
	}

}
