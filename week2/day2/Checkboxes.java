package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {
	
public static void main(String[] args) throws InterruptedException {
		

	    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();
			
		driver.get("http://leafground.com/pages/checkbox.html");//1. Launch URL "http://www.leafground.com/pages/Link.html"
		
		driver.manage().window().fullscreen();//full screen		
        

        String ques1= driver.findElementByXPath("//label[text()='Select the languages that you know?']").getText();
        System.out.println(ques1);
        
        driver.findElementByXPath("//label[text()='Select the languages that you know?']/following-sibling::div[1]//input").click();
        String q1c1 = driver.findElementByXPath("//label[text()='Select the languages that you know?']/following-sibling::div[1]").getText();
        System.out.println(q1c1+ " is selected");
        
        driver.findElementByXPath("//label[text()='Select the languages that you know?']/following-sibling::div[3]//input").click();
        String q1c3 = driver.findElementByXPath("//label[text()='Select the languages that you know?']/following-sibling::div[3]").getText();
        System.out.println(q1c3+ " is selected");
        
        driver.findElementByXPath("//label[text()='Select the languages that you know?']/following-sibling::div[4]//input").click();
        String q1c4 = driver.findElementByXPath("//label[text()='Select the languages that you know?']/following-sibling::div[4]").getText();
        System.out.println(q1c4+ " is selected");
        
        driver.findElementByXPath("//label[text()='Select the languages that you know?']/following-sibling::div[5]//input").click();
        String q1c5 = driver.findElementByXPath("//label[text()='Select the languages that you know?']/following-sibling::div[5]").getText();
        System.out.println(q1c5+ " is selected");
        
        String ques2=driver.findElementByXPath("//label[text()='Confirm Selenium is checked']").getText();
        System.out.println(ques2);
        
        Boolean q2v1= driver.findElementByXPath("//label[text()='Confirm Selenium is checked']/following-sibling::div/input").isSelected();
        String q2c1 = driver.findElementByXPath("//label[text()='Confirm Selenium is checked']/following-sibling::div").getText();
        System.out.println(q2c1+ " is selected as "+q2v1);
        
        String ques3=driver.findElementByXPath("//label[text()='DeSelect only checked']").getText();
        System.out.println(ques3);
        
        
        Boolean q3v1= driver.findElementByXPath("(//label[text()='DeSelect only checked']/following-sibling::div/input)[1]").isSelected();
        String q3c1 = driver.findElementByXPath("(//label[text()='DeSelect only checked']/following-sibling::div/input)[1]").getText();
        System.out.println(q3c1+ " is selected as "+q3v1);
        
        Boolean q3v2= driver.findElementByXPath("(//label[text()='DeSelect only checked']/following-sibling::div/input)[2]").isSelected();
        String q3c2 = driver.findElementByXPath("(//label[text()='DeSelect only checked']/following-sibling::div/input)[2]").getText();
        System.out.println(q3c2+ " is selected as "+q3v2);
        
        if(q3v1== true ) {
        	
        	driver.findElementByXPath("(//label[text()='DeSelect only checked']/following-sibling::div/input)[2]").click();
        	Boolean newq3v1 = driver.findElementByXPath("(//label[text()='DeSelect only checked']/following-sibling::div/input)[2]").isSelected();
        	System.out.println("sucessfully deselected "+newq3v1);
        }
        
        
        	else if( q3v2==true)	{
        	
        	driver.findElementByXPath("(//label[text()='DeSelect only checked']/following-sibling::div/input)[2]").click();
        	Boolean newq3v2 = driver.findElementByXPath("(//label[text()='DeSelect only checked']/following-sibling::div/input)[2]").isSelected();
        	System.out.println("sucessfully deselected "+newq3v2);
        }
        	
        
        String ques5= driver.findElementByXPath("//label[text()='Select all below checkboxes ']").getText();
        System.out.println(ques5);
        
        driver.findElementByXPath("//label[text()='Select all below checkboxes ']/following-sibling::div[1]//input").click();
        String q5c1 = driver.findElementByXPath("//label[text()='Select all below checkboxes ']/following-sibling::div[1]").getText();
        System.out.println(q5c1+ " is selected");
        
        driver.findElementByXPath("//label[text()='Select all below checkboxes ']/following-sibling::div[2]//input").click();
        String q5c2 = driver.findElementByXPath("//label[text()='Select all below checkboxes ']/following-sibling::div[2]").getText();
        System.out.println(q5c2+ " is selected");
        
        driver.findElementByXPath("//label[text()='Select all below checkboxes ']/following-sibling::div[3]//input").click();
        String q5c3 = driver.findElementByXPath("//label[text()='Select all below checkboxes ']/following-sibling::div[3]").getText();
        System.out.println(q5c3+ " is selected");
        
        driver.findElementByXPath("//label[text()='Select all below checkboxes ']/following-sibling::div[4]//input").click();
        String q5c4 = driver.findElementByXPath("//label[text()='Select all below checkboxes ']/following-sibling::div[4]").getText();
        System.out.println(q5c4+ " is selected");
        
        driver.findElementByXPath("//label[text()='Select all below checkboxes ']/following-sibling::div[5]//input").click();
        String q5c5 = driver.findElementByXPath("//label[text()='Select all below checkboxes ']/following-sibling::div[5]").getText();
        System.out.println(q5c5+ " is selected");	
        
        driver.close();
        
        }
        

        
}        



