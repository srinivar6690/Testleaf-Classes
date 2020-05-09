package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[]num = new int[3];
    
     num[0]=50;
     num[1]=60;
     num[2]=30; //this demonstrates size of array can't be changed in run time we only gave 2 data still one more space is blank but length willnot get reduced
    // num[3]=40;//this demonstrates size of array can't be changed in run time - program wil show out of bound exception
     
     
    //System.out.println(num.length);// to get length of array
   // System.out.println(num[0]);//to get the first value from array
   // System.out.println(num[num.length-1]);//to get the last value from array
    
  /* for (int i = 0; i < num.length; i++) //using for loop to print all values from array in ascending order
   
   {
	   if(num[i]==20) {
		  
		   System.out.println(i);//get the index value
		   		   
	   }
	   //System.out.println(num[i]);// to print all values in array 
	   
	
}*/
  /* for (int i = num.length-1; i>=0 ; i--) //using for loop to print all values from array in descending order
   
   {
	 System.out.println(num[i]);
	   
   }*/
    
   /* Arrays.sort(num);// to sort the array based on ASCII values
     
     for (int i = 0; i < num.length; i++) //using for loop to print all values from array in ascending order
    	   
     {
    	 System.out.println(num[i]);
    	 
     }*/
     
     for (int i : num) // advanced 'foreach' for loop ,this works in ascending way so i-- is not there
     {
    	 
    	 System.out.println(i);
		
	}
     
	}
	
}

