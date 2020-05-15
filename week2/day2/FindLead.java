package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import week2.day1.assignments.LeafTaps;

public class FindLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		LeafTaps obj= new LeafTaps();//imported create Lead script
		obj.createLead();//imported create Lead script
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Mavenday1\\drivers\\chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");//method to call browser
		
		driver.manage().window().fullscreen();
		
		WebElement username = driver.findElementByXPath("//input[@id='username']");//method to find a webelement
		username.sendKeys("demosalesmanager");//method to enter text 
		driver.findElementByXPath("(//input[@class='inputLogin'])[2]").sendKeys("crmsfa");
		driver.findElementByXPath("(//input)[3]").click();
		driver.findElementByXPath("//a[contains(text(),'CRM/')]").click();
		driver.findElementByXPath("//a[text()='Leads']").click();//5. Click on Leads Button
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("rad");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
	
	    Thread.sleep(2000);
	    driver.findElementByXPath("//div//div//div//table//td[contains(@class,'partyId') and @tabindex='0']//a[1]").click();//Click on first resulting lead
	    String pageTitle= driver.findElementByXPath("//div[text()='View Lead']").getText();
	    System.out.println(pageTitle);
	    
	    driver.findElementByXPath("//a[text()=\"Edit\"]").click();//Click Edit
	    String companyName= driver.findElementByXPath("(//input[@name='companyName'])[2]").getAttribute("value");
        System.out.println("The company name is "+companyName);
	    driver.findElementByXPath("(//input[@name='companyName'])[2]").clear();//Change the company name
        driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("Asystems");
        driver.findElementByXPath("(//input[@class='smallSubmit' and @value='Update'])").click();
        
        
        String pageTitle1= driver.findElementByXPath("//div[text()='View Lead']").getText();
	    System.out.println(pageTitle1);
	    String updatedName= driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
	    System.out.println("The updated company name is "+updatedName);
	    
	    
	    driver.close();
	    
	    
	    
	}    
	

}
