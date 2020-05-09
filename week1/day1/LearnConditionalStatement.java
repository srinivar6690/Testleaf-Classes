package week1.day1;

public class LearnConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//**********************if else test*************************** 
		
		/*
		String category = "";
		int age = 25; // age = 15 if will get executed , age =25 else will get executed
		
		if (age<17)
		{
			category = "minor";
			
			System.out.println("This is a True Condition check");
		}
		
		else
			
			category = "major";
			
		System.out.println(category);*/
		
		
		
	//*********************************//if else test ********************************	
	/*	String category = "";
		int age = 55;  // if age =15 if will get executed , age =55 else if will get executed , age =65 ? 
		
		if (age<17)
		{
			category = "minor";
			
			System.out.println("This is a True Condition check");
			
		}
			else if (age>17 && age <60)
				
			{
				
				category = "adult ";
				System.out.println(category);
				
	}*/
		
		//********************************//if else if  test ***************************************************		
		
		
				String category = "";
		int age = 65;  // if age =15 if will get executed , age =55 else if will get executed , age =65 else will get executed  
		
		if (age<17)
		{
			category = "minor";
			
			System.out.println("This is a True Condition check");
			
		}
			else if (age>17 && age <60)
				
			{
				
				category = "adult ";
				System.out.println(category);
				
	}
			else 
			{
				category = "senior citizen ";
		System.out.println(category);
	}
		
		
		
		
	}
	
}


