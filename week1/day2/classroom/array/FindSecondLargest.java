package week1.day2.classroom.array;

import java.util.Arrays;

public class FindSecondLargest {
	
	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,11,4,6,7};
		
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */
		
		Arrays.sort(data);
		System.out.println("The ascending order is ");
		
		for (int i = data.length-1; i>=0 ; i--) //using for loop to print all values from array in descending order
			   
		   {
			System.out.println(data[i]);
			 
		   }
		System.out.println("The second largest data is "+ data[data.length-2]);
	}

}
