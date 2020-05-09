package week1.day2.classroom.array;

import java.util.Arrays;

public class MissingElementInAnArray {
	
	
	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};
		int j;	
        
		// Sort the array	
		
		Arrays.sort(arr);	

		for (int i = 0 ; i<arr.length ; i++)//		loop through the array (start i from arr[0] till the length of the array)
			   
		   {
			
			//System.out.println(arr[i]);
			j= i+1;
		//	System.out.println(j);
		   
			 if(j!= arr[i]) {
				 
					 System.out.println("The Missing Element is "+ j);
			break;
					 
		   }
		
		}
			
						
	}
	
}
			
	
	
	


