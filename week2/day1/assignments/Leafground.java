package week2.day1.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Leafground {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
			
		driver.get("http://www.leafground.com/pages/Edit.html");//1. Launch URL "http://www.leafground.com/pages/Edit.html"
		
		driver.manage().window().fullscreen();//full screen				
		
		String Question1= driver.findElementByXPath("//label[text()='Enter your email address']").getText();
		WebElement Answer1= driver.findElementById("email");
		Answer1.sendKeys("rad@sqs.test");//Enter Email address
		String Answer= Answer1.getAttribute("value");
		System.out.println("Q1: "+Question1+" -answer is- "+Answer);
		
		String Question2= driver.findElementByXPath("//label[text()='Append a text and press keyboard tab']").getText();
		WebElement Append = driver.findElementByXPath("//label[text()='Append a text and press keyboard tab']/following-sibling::input");
	    String appended = Append.getAttribute("value");//get existing text
	    System.out.println("Q2: "+Question2+" Existing text is "+appended);
	    Append.sendKeys("rad");//enter a text
	    Append.sendKeys(Keys.TAB);//Append a text and press keyboard tab
	    String appended1 = Append.getAttribute("value");
	    System.out.println("After appending -answer is- "+appended1);
	    
	    String Question3= driver.findElementByXPath("//label[text()='Get default text entered']").getText();
	    String defaulttext= driver.findElementByXPath("//label[text()='Get default text entered']/following-sibling::input").getAttribute("value");
	    System.out.println("Q3: "+Question3+" -answer is- "+defaulttext);//Get default text entered
	    
	    String Question4= driver.findElementByXPath("//label[text()='Clear the text']").getText();
	    WebElement forclear = driver.findElementByXPath("//label[text()='Clear the text']/following-sibling::input");
	    String clear = forclear.getAttribute("value");
	    System.out.println("Q4: "+Question4+ " The text to be cleared is "+clear);//Get default text entered
	    forclear.clear();
	    String clear1 = forclear.getAttribute("value");
	    System.out.println(" The cleared value is "+ clear1 +".");//print after cleared
	    
	    String Question5= driver.findElementByXPath("//label[text()='Confirm that edit field is disabled']").getText();
	    WebElement disabled = driver.findElementByXPath("//label[text()='Confirm that edit field is disabled']/following-sibling::input");
	    String isdisabled = disabled.getAttribute("disabled");//check if the field is disabled
	    System.out.println("Q5: "+Question5+" Ans: This field is set with disabled="+isdisabled);
	    
	    driver.close();
	}
}
