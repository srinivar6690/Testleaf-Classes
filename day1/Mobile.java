package week1.day1;

public class Mobile {
	
	
	String deviceModelName = "HUAWEI";//global variable 
	double devicePrice = 39999.99;//global variable 
	int numberOfcontacs = 500;//global variable 
    long IMEI = 867129039272110L;//global variable 
	
	public void makeCall() {

		System.out.println("Placing a Call"); 
		System.out.println("**************");
	}

	public void sendMessage() {

		System.out.println("Sending Message"); 
		System.out.println("**************");
	}

	public void takePicture() {

		System.out.println("Preparing Camera"); 
		System.out.println("**************");
	}


	public static void main(String[] args) {
		
	
	Mobile myMobile = new Mobile();
	
	String Model = myMobile.deviceModelName;//local variable 
	double Price = myMobile.devicePrice;//local variable 
	int contacts= myMobile.numberOfcontacs;//local variable 
	long uniqueId= myMobile.IMEI;//local variable 
			
			
	System.out.println(Model);
	System.out.println(Price);
	System.out.println(contacts);
	System.out.println(uniqueId);
	myMobile.makeCall();
	myMobile.sendMessage();
	myMobile.takePicture();
	}
	
}

