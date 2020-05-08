package week1.day1;

public class Car {
	
	
	String carColour= "Red";//global variable 
	int fuelCapacity= 62 ;//global variable 
	int kmRan = 50000 ;//global variable 
	float carPriceInLakhs = 7.5f;//global variable 
	long ownerMob = 8838269732L;//global variable 
	boolean isUsed= false;//global variable 
	char fuelType = 'D';//global variable 
				
			
	public void drivecar() {
		
			    int speed = 50;
			    System.out.println("driving a car");
			    System.out.println(speed);// local variable 
			}
	
	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.drivecar();
		System.out.println (myCar.carPriceInLakhs);
		
		
		/* double carPrice= myCar.carPriceInLakhs;
		System.out.println(carPrice);*/
	}
}
