package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import week2.day1.assignments.LeafTaps;

public class DeleteLead {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		LeafTaps obj= new LeafTaps();//imported create Lead script
		obj.createLead();//imported create Lead script
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");		
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
		
		driver.findElementByXPath("(//span[@class ='x-tab-strip-text '])[2]").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
	    
	    String firstleadId= driver.findElementByXPath("//div//div//div//table//td[contains(@class,'partyId') and @tabindex='0']//a[1]").getText();
	    System.out.println(firstleadId);
	    driver.findElementByXPath("//div//div//div//table//td[contains(@class,'partyId') and @tabindex='0']//a[1]").click();
	    
	    driver.findElementByXPath("//a[text()='Delete']").click();
	    Thread.sleep(2000);
	    
        driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(firstleadId);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		
		String message= driver.findElementByXPath("//div[@class='x-paging-info' and text()='No records to display']").getText();
	    System.out.println(message);
		
	    
	    driver.close();
		
	 	}
}
