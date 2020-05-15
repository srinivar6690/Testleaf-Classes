package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import week2.day1.assignments.LeafTaps;

public class DuplicateLead {
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
		
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("rad");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		
		String fname = driver.findElementByXPath("(//div//div//div//table//td[contains(@class,'friendlyPartyName') and @tabindex='0']/following-sibling::td//a)[1]").getText();
		System.out.println(fname);
		String lname = driver.findElementByXPath("(//td[contains(@class,'lastName ') and @tabindex ='0']//a)[1]").getText();
		System.out.println(lname);
		driver.findElementByXPath("(//div//div//div//table//td[contains(@class,'friendlyPartyName') and @tabindex='0']/following-sibling::td//a)[1]").click();
		
		
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		String titledupe = driver.findElementByXPath("//div[text()='Duplicate Lead']").getText();
		System.out.println(titledupe);
		
		driver.findElementByXPath("//input[@type='submit'  and @value='Create Lead']").click();
		String fdupname = driver.findElementByXPath("//span[@id= 'viewLead_firstName_sp']").getText();
		String fduplname =driver.findElementByXPath("//span[@id= 'viewLead_lastName_sp']").getText();
		
		
		if(fdupname.equals(fname) && (fduplname.equals(lname))){
			
			System.out.println("Duplicated "+fdupname+" "+fduplname);
			
			
		}
		driver.close();
}
}
