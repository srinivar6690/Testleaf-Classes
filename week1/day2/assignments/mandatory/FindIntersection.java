package week1.day2.assignments.mandatory;

public class FindIntersection {
	

	
	public static void main(String[] args) {
		
	
		int[] arr1 = {3,2,11,4,6,7}; //Declare An array for {3,2,11,4,6,7}
		int[] arr2 = {1,2,8,4,9,7}; //Declare another array for {1,2,8,4,9,7}
		int i, j;
		System.out.println("Intersection of the two arrays ::");
		//Declare for loop iterator from 0 to array length
		
		for (i=0;i<arr1.length;i++) {
			//Declare a nested for loop with another array from 0 to array length
			//System.out.println(arr1[i]);
			
			for (j=0;j<arr2.length;j++) {	
				//System.out.println(arr2[j]);
				
				//Compare Both the arrays using a condition statement
				if (arr1[i]==arr2[j])
				{
					System.out.println(arr2[j]);//Print the first array (shoud match item in both arrays)		
				}
			}
		}
			
	}

}
