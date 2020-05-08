package week1.day1.assignments;

public class FibonacciSeries {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initialize 3 int variables (Tip: range & firstNum, secNum in the series)
  int range= 8, firstNum=0 ,secNum=1,temp;		

				// Iterate from 1 to the range
  System.out.println("the fibonacci series until range" +" "+ range+" " + "is" );
  
			for (int i = 1; i <= range; i++) {
				
						// Print first number 
         
			
			System.out.println(firstNum);

					// add first and second number

			temp	= firstNum + secNum;

					// Assign second number to the first number

			firstNum = 	secNum;
            
					// Assign sum to the second number
			
			secNum =temp;
			
			
			   }	
	
		}

}
