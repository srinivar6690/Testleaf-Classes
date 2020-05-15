package week2.day1;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchApplication {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Mavenday1\\drivers\\chromedriver.exe");	
	//System.setProperty("webdriver.chrome.driver","");
	//System.setProperty("webdriver.geko.driver","C:\\Selenium\\Mavenday1\\drivers\\geckodriver.exe");
	//taskkill /f /im chromedriver.exe;
	ChromeDriver driver = new ChromeDriver();
	//FirefoxDriver driver = new FirefoxDriver();
	
	driver.get("http://leaftaps.com/opentaps/control/main");//method to call browser
	
	driver.manage().window().fullscreen();
	
	WebElement username = driver.findElementByXPath("//input[@id='username']");//method to find a webelement
	username.sendKeys("demosalesmanager");//method to enter text 
	driver.findElementByXPath("(//input[@class='inputLogin'])[2]").sendKeys("crmsfa");//method to find a webelement and input value to it
    driver.findElementByXPath("(//input)[3]").click();
	driver.findElementByXPath("//a[contains(text(),'CRM/')]").click();
	driver.findElementByXPath("//a[text()='Leads']").click();//5. Click on Leads Button
	driver.findElementByXPath("//a[text()='Create Lead']").click();//6. Click on create Lead Button
	driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("SQS");//7. Enter CompanyName using id Locator
	driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Raddii");//8. Enter FirstName using id Locator
	driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Raddy");//9. Enter LastName using id Locator
	//driver.findElementById("createLeadForm_dataSourceId").sendKeys("Conference");//interview Question
	
	
	WebElement source = driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']");//
	Select dropDown = new Select(source);
	dropDown.selectByVisibleText("Employee");
	
	WebElement marketing = driver.findElementByXPath("//select[@id='createLeadForm_marketingCampaignId']");
	Select dropDown1 = new Select(marketing);
	dropDown1.selectByValue("9001");
	
	WebElement ownership = driver.findElementByXPath("//select[@id='createLeadForm_ownershipEnumId']");
	Select dropDown2 = new Select(ownership);
	dropDown2.selectByIndex(5);
	
	driver.findElementByXPath("(//input[@name='primaryPhoneNumber'])[4]").sendKeys("9988776655");
	driver.findElementByXPath("//input[@id='createLeadForm_primaryEmail']").sendKeys("rad@email.test");
	WebElement Country = driver.findElementByXPath("//select[@id='createLeadForm_generalCountryGeoId']");
	Select dropDown3 = new Select(Country);
	dropDown3.selectByVisibleText("India");
	
	driver.findElementByXPath("//input[@value='Create Lead']").click();//
	
	WebElement Title= driver.findElementByXPath("//div[@id='sectionHeaderTitle_leads']");//15. Get the Title of the resulting Page
	String display =Title.getText();
	System.out.println(display);
	
	
	
	
	
	//List<WebElement> options = dropDown1.getOptions();
	//List<WebElement> options = dropDown.getOptions();//to get dropdown without select
	
	//int size = options.size();//to get size
	//System.out.println(size);//print size
	/*for (WebElement eachElement : options) {
		eachElement.click();
		Thread.sleep(2000);
	}*/
	

	
	//Thread.sleep(2000);
	//dropDown.selectByValue("LEAD_EMPLOYEE");
	//Thread.sleep(2000);
	//dropDown.selectByIndex(3);
	//Thread.sleep(2000);
	//

    
	/*Options manage = driver.manage();
	Window window = manage.window();
	window.maximize();*/ // this 3 lines used a alternative to driver.manage().window().maximize();
	
    //Thread.sleep(2000);//wait 2secs, we should add throws declaration  otherwise the program wont compile
	
	//driver.close();//method to close browser
	
	}

}
