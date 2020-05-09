package week1.day1.classroom;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare your input number (int)
		int i = 123;
				// Initialize an integer variable by name: sum
        int sum = 0, temp;
				// Use loop to calculate the sum: while loop to use until the number goes greater than 0??
        
        while (i>0)
			 
		 {
				// Within loop: get the remainder when done by 10 -> Tip: use mod
        	 temp = i%10;
						// Print the remainder to confirm
			 System.out.println("The remainder is " + temp);
			 
					// Within loop: add that remainder to the sum
			 
		     sum = sum + temp;
					// Print the sum to confirm
		     
			System.out.println("The sum is " + sum);
			 
			   		// Within loop: get quotient of that number (tip: quotient should be same variable of loop condition)
			
			 i = i/10; 
			 		// Print the quotient to confirm
			 
			System.out.println("The quotient is "+ i);
		 }	
				// Outside the loop: print the final sum
		 
             System.out.println("the sum of numbers is"+'\t'+sum);
	}

}


