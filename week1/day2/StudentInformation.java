package week1.day2;

public class StudentInformation {

	public void getStudentName(int id) {
		
		if(id==100) {
		
		String name = "Radha";
		System.out.println(name);
		}
		
		else {
			System.out.println("Id not matched");
		}
		
	}
	
	public String getAddress (int id, String name) {
		
		return "Chennai";
		
	}
		

	
	public static void main(String[] args) {
		
		StudentInformation si = new StudentInformation();	//classname obj = new class name
		si.getStudentName(200);//100 then o/p from if, 200 then o/p from else
		//System.out.println(si.getAddress(100,"Hari")); //we can print the o/p
		String address = si.getAddress(100,"Hari");//Or we can save it to variable the print
		System.out.println(address);
	}
}

