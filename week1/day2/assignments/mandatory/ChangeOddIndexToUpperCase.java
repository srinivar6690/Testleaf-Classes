package week1.day2.assignments.mandatory;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Declare String Input as Follow
		
		String test = "changeme";
//Convert the String to character array
		char[] charArray = test.toCharArray();
				   for (int i=0;i<test.length();i++) {
					   if(i%2==0) 
				    	{
					   System.out.print(charArray[i] = Character.toUpperCase(charArray[i]));	
			}
					   if(i%2!=0)
						 				 
						   
							 System.out.print(charArray[i]);
		}	
	}
	
}