package week1.day1.classroom;

public class OddNumbers {

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
		
	System.out.println("Printing only the odd numbers from 1 to 20");
	//Iterate from 1 to 20 (tip: using loop concept)
		for(int i = 1 ;i <= 20 ; i++)
    //Within loop -> check whether the integer is odd (tip: use mod operator)	 
		 {
			 if (i % 2 != 0)
    //Within loop -> print the odd integer			 
			 {
				 System.out.println(i);
				 
	  }
		 
    }
	
  }
	
}