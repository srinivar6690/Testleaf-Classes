package week1.day1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		// Declare an int Input and assign a value
	int input =13;
	
	    // Declare a boolean input as flag
    boolean isnotPrime = false;
    
       // Iterate from 1 to half of the input
    for (int i = 2; i <= input/2 ; i++) {
       	// Divide the input with each for loop variable and check the remainder
	
		if(input%i==0) {
	   // Set the flag as true when there is no remainder		
	isnotPrime=true;
				}
    }
		
    	//Check the flag (Provide a condition) 
		if(isnotPrime!=true) {
	     
	// Print 'Prime' when the condition matches
	System.out.println(" Prime Number ");
		}
	// Print 'Not a Prime' when the condition doesn't match 	
		else
	System.out.println(" Not a Prime Number ");	
	
	 	
	}
		
	}
	
    

	

