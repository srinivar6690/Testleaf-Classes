package week1.day1.assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// Declare your input	
	int input = 153;
	   // Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)
	int calculated=0, remainder, original;
   	// Assign input into variable original 
	original=153;
	// Use loop to calculate: While loop to use until the number greater than 0??
     while(input>0) {
    	// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)	 	
		remainder= input%10;
		// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)
		input = input/10;
		// Within loop: Add calculated with the cube of remainder & assign it to calculated
		calculated = calculated + (remainder*remainder*remainder);
		System.out.println(calculated);
		// Check whether calculated and original are same
		if (calculated==original)
		//When it matches print it as Armstrong number
		System.out.println("This is an Armstrong number");
}
}
	
}


