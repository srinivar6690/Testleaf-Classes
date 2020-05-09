package week1.day2.assignments.mandatory;

public class ReverseEvenWords {

	public static void main(String[] args) {

		//Declare the input as Follow
		String test="I am a software tester";
		//split the words and have it in an array
		String[] arrSplit = test.split(" ");
		//Traverse through each word (using loop)
		for (int i=0; i < arrSplit.length; i++)
	    {   
			
			System.out.print(" ");
	    	if(i%2==0) 
	    	{
	       	 String[] arrSplit1 = arrSplit[i].split(" ");//split the words and have it in an array
	    	 System.out.print(arrSplit1[0]+" ");
	    	}
	    	
	    	if(i%2!=0)
	    	{
	    	
	    	char[] charArray = arrSplit[i].toCharArray();	
			 
			 for (int j = charArray.length-1; j>=0 ; j--) {
				   
				 System.out.print(charArray[j]);
				 
	    }
		
   }

}
	
}
}