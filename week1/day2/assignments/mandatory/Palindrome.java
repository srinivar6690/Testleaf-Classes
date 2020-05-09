package week1.day2.assignments.mandatory;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare A String value as"madam"
		// Declare another String rev value as ""
		String original = "madam";
		String rev = "";
		//Iterate over the String1 in reverse order
		int strlength=original.length();
		for(int i=strlength-1;i>=0;i--) {
	
			  rev=rev+original.charAt(i);// Add the char into rev
		
		}
		System.out.println("Reversed string: "+rev);
	//Compare the original String with the reversed String, if it is same then print palinDrome
	    if(original.equals(rev))
	    {
	    System.out.println("since original "+original+" and reverse of original  "+rev+" are same it is a palindrome");
	    }
	    			
	}
}


