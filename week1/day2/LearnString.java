package week1.day2;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		String s1 = "welcome" ; //here welcome is called string literal, the value is stored in string constant pool
		String s2 = "welcome";//here welcome is called string literal, the value is stored in string constant pool, but already s1 is having same value in pool
	    String s3 = new String("welcome");
		
		System.out.println(s1.equals(s2));//equals is a class to compare data
		System.out.println(s1.equals(s3));//equals is a class to compare data
		System.out.println("*****************");
		System.out.println(s1==s2);//== will compare memory address ans;true
		System.out.println(s1==s3);//== will compare memory address ans;false */
		
		String s1 = "welcome" ;//here welcome is called string literal, the value is stored in string constant pool
		String s2 = "Welcome";//here welcome is called string literal, the value is stored in string constant pool- W is caps
		String s3 = "WELCOME";
		String s4= "To Home";
		int x=10;
		String s5 = " Welcome Home "; //space in beginning and end 
		String s6 = "Wel48come48 2 Ho0me56";
		
	   /* System.out.println(s1.equals(s2));//equals is a class to compare data	o/p is false as case W
	    System.out.println(s1.equalsIgnoreCase(s2));//equalsIgnoreCase is a class to compare data irrespective of case sensitive
	    System.out.println(s1.length());//length is a method used to get string length
	    System.out.println(s1.charAt(4));//charAt is used to get a single character from string
	    System.out.println(s1.charAt(s1.length()-1));//used to get a single character from string
	    System.out.println(s1.toUpperCase());//used to convert from Lowercase to upper case
	    System.out.println(s3.toLowerCase());//used to convert from  upper case to lower case
	    System.out.println(s1.concat(s4));//used to join 2 strings
	    System.out.println(s1+" "+s4);//used to join 2 strings with space in between
	    System.out.println(s1.concat(" ").concat(s4).concat(" ").concat(s3));//used to join 2 strings with space in between
	    System.out.println(s1+x);//concat string and number
	    System.out.println(s5.trim());//trim is a method used to remove the spaces in beginning and end only, it will not remove space in middle
	    System.out.println(s5.replace('e','a'));//replace is a method used to change single character into a new charater
	    System.out.println(s5.replaceAll(" ",""));//replace all is a method used to replace with any regular expression this will remove spaces
	    System.out.println(s5.replaceAll("Wel",""));//replace all the 
	    System.out.println(s6.replaceAll("[0-9]",""));//replace all the numbers using a regular expresion
	    System.out.println(s6.replaceAll("[A-Za-z]",""));//replace all the upper and lower case*/
		
	    /* char[] charArray = s1.toCharArray();// method to convert a string into an array
	    for (char eachchar : charArray) {   
	    	
	    	System.out.print(eachchar + " ");
			
	    	x
	   for (int i=0;i<s1.length();i++) {
		   
		   System.out.print(s1.charAt(i)+" ");
	   }*/
		
		/*System.out.println(s1.hashCode());//thsi retruns the memeory address in console
		s1=s1+10;
		System.out.println(s1.hashCode());//immutable aas we can't change the address in run time*/
		
	StringBuffer str = new StringBuffer("Welcome");//Mutable 
	System.out.println(str.hashCode());
	str.append("home");//added home to welcome
	System.out.println(str);
	System.out.println(str.hashCode());//the welcome+home is replaced muted in same memeory space
	
		}
	    

	

}
