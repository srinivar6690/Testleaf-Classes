package week1.day2.classroom.string;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// Here is the input
			String test = "$$ Welcome to 2nd Class of Automation $$ ";

			// Here is what the count you need to find
			// initialize 3 int variables (Tip: range & firstNum, secNum in the series)
			int  letter = 0, space = 0, num = 0, specialChar = 0;

			// Build the logic to find the count of each
			/* Pseudo Code:
				a) Convert the String to character array
				b) Traverse through each character (using loop)
				c) Find if the given character is what type using (if)
						i)  Character.isLetter
						ii) Character.isDigit
						iii)Character.isSpaceChar
						iv) else -> consider as special character
			*/
           
			// Print the count here
			
			char[] charArray = test.toCharArray();	//Convert the String to character array
			
			 for (int i = 0; i < charArray.length; i++) //Traverse through each character (using loop)
				 /* Find if the given character is what type using (if)
						i)  Character.isLetter
						ii) Character.isDigit
						iii)Character.isSpaceChar
						iv) else -> consider as special character*/
			 
			 {
				
				if( Character.isLetter(charArray[i] ))
					
				{
					letter++;
				
			}
				
				else	if  ( Character.isDigit(charArray[i] ))
				{
					num++;
				
			}
			
				else if ( Character.isSpaceChar(charArray[i] ))
				{
					space++;
				
			}
		
				else 
				{
					specialChar++;
				
			}
				
			

	}
			    System.out.println("letter: " + letter);
				System.out.println("space: " + space);
				System.out.println("number: " + num);
				System.out.println("specialCharacter: " + specialChar);
	}
}
