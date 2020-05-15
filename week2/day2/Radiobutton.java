package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args)throws InterruptedException { 
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().fullscreen();
		
		WebElement radio1= driver.findElementByXPath("//input[@id='yes']");
		radio1.click();
		WebElement Label1 = driver.findElementByXPath("//label[text()='Are you enjoying the classes?']");
		String ques1 = Label1.getText();
		System.out.println(ques1+" Yes ");
		
		WebElement radio2of1= driver.findElementByXPath("//div[@class='large-6 small-12 columns']/label[text()='Find default selected radio button']/following-sibling::label[1]/input");
		boolean selected1 = radio2of1.isSelected();
		System.out.println("UnChecked is " +selected1);
		
		
		WebElement radio2of2= driver.findElementByXPath("//div[@class='large-6 small-12 columns']/label[text()='Find default selected radio button']/following-sibling::label[2]/input");
		boolean selected2 = radio2of2.isSelected();
		System.out.println("Checked is " +selected2);
		
		WebElement radio3of1= driver.findElementByXPath("//div[@class='large-6 small-12 columns']/label[contains(text(),'Select your age group')]/following-sibling::input[1]");
		String 	radio3of1value = radio3of1.getText();
	    boolean selected3of1 = radio3of1.isSelected();
		
			
		
		WebElement radio3of2= driver.findElementByXPath("//div[@class='large-6 small-12 columns']/label[contains(text(),'Select your age group')]/following-sibling::input[2]");
		String 	radio3of2value = radio3of2.getText();	
		boolean selected3of2 = radio3of2.isSelected();
		
				
		
		WebElement radio3of3= driver.findElementByXPath("//div[@class='large-6 small-12 columns']/label[contains(text(),'Select your age group')]/following-sibling::input[3]");
		String 	radio3of3value = radio3of3.getText();
		boolean selected3of3 = radio3of3.isSelected();
		
		
		if(selected3of1==true) {
			System.out.println("1 - 20 years "+radio3of1value+"="+selected3of1);}
		
		else if(selected3of2==true) {
			System.out.println("21 - 40 years"+radio3of2value+"="+selected3of2);}
		
		else if(selected3of3==true) {
			System.out.println(" Above 40 years"+radio3of3value+"="+selected3of3);}
		
		else {System.out.println("no buttons selected by default");
		radio3of3.click();
		boolean manualselect = radio3of3.isSelected();
		String manualselecttext= radio3of3.getText();
		System.out.println("manually selected option is " +manualselecttext+"selected as" +manualselect );}
		
		
		driver.close();
		
		        
	}
			
			
	
	

}




