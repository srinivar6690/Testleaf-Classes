package week1.day2.assignments.mandatory;

public class RemoveDuplicates {
		
	public static void main(String[] args) {
		
	String text = "We learn java basics as part of java sessions in java week1";
	//Initialize an integer variable as count
	int count = 0;
	//Split the String into array and iterate over it 
	String[] arrSplit = text.split(" ");
	
    for (int i=0; i < arrSplit.length; i++)
    {
    	if(arrSplit[i]!=null) 
    	//System.out.println(arrSplit[i]);
    		   
	//Initialize another loop to check whether the word is there in the array
		   
	for (int j=i+1;j<arrSplit.length;j++) {
	//compare both the loop variables & check they're equal
		
		if (arrSplit[i].equals(arrSplit[j]))
	   {
//			increase the count if both the arrays are equal	
			count++;
			arrSplit[j]=null;		             
        }
					
	}
	}
	
	if (count>0) {
	for(int k=0;k<arrSplit.length;k++)		//Displaying the String without duplicate words	
	{
		if(arrSplit[k]!=null)
		{
			System.out.println(arrSplit[k]);
		}
	}
}
}
	
}





