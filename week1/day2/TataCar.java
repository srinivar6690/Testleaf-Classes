package week1.day2;
//if a class is in a different package we need to import it

import week1.day1.Car;

public class TataCar {
	
	public static void main(String[] args) {
	
		Car obj = new Car();// this object is created to call a drive car method from class = car
		obj.drivecar();
	}

}
