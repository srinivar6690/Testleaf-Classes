package week2.day1.assignments;


	import java.util.List;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	
	public class LeafTaps {

		public void createLead() {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");		
			ChromeDriver driver = new ChromeDriver();
				
			driver.get("http://leaftaps.com/opentaps/control/main");//1. Launch URL "http://leaftaps.com/opentaps/control/login"
			
			driver.manage().window().fullscreen();
			
			WebElement username = driver.findElementById("username");//2.Enter UserName  Using Id Locator
			username.sendKeys("demosalesmanager");//method to enter text 
			driver.findElementById("password").sendKeys("crmsfa");//2.Enter Password  Using Id Locator
		    driver.findElementByClassName("decorativeSubmit").click();//3. Click on Login Button using Class Locator
			driver.findElementByLinkText("CRM/SFA").click();//4. Click on CRM/SFA Link
			driver.findElementByLinkText("Leads").click();//5. Click on Leads Button
			driver.findElementByLinkText("Create Lead").click();//6. Click on create Lead Button
			driver.findElementById("createLeadForm_companyName").sendKeys("SQS");//7. Enter CompanyName using id Locator
			driver.findElementById("createLeadForm_firstName").sendKeys("Rad");//8. Enter FirstName using id Locator
			driver.findElementById("createLeadForm_lastName").sendKeys("Srinivas");//9. Enter LastName using id Locator
					
			WebElement source = driver.findElementById("createLeadForm_dataSourceId");//10. Select value as Employee in Source Using SelectbyVisible text
			Select dropDown = new Select(source);
			dropDown.selectByVisibleText("Employee");
			
			WebElement marketing = driver.findElementById("createLeadForm_marketingCampaignId");//11. Select value as Pay Per Click Advertising in MarketingCampaignId Using SelectbyValue
			Select dropDown1 = new Select(marketing);
			dropDown1.selectByValue("9001");
			
			WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");//12. Select value as Corporation in OwnerShip field Using SelectbyIndex
			Select dropDown2 = new Select(ownership);
			dropDown2.selectByIndex(5);
			
			driver.findElementByXPath("(//input[@name='primaryPhoneNumber'])[4]").sendKeys("9988776655");//added for phone edit
			driver.findElementByXPath("//input[@id='createLeadForm_primaryEmail']").sendKeys("rad@email.test");//added for email duplicate
			
			WebElement Country = driver.findElementById("createLeadForm_generalCountryGeoId");//13. Select value as India in Country Field Using SelectbyVisibletext
			Select dropDown3 = new Select(Country);
			dropDown3.selectByVisibleText("India");
			
			driver.findElementByClassName("smallSubmit").click();//14. Click on create Lead Button Using name Locator
			
			WebElement Title= driver.findElementById("sectionHeaderTitle_leads");//15. Get the Title of the resulting Page
			String display =Title.getText();
			System.out.println(display);
			
			
			driver.close();
		}
		
		public static void main(String[] args) throws InterruptedException {
			
		LeafTaps CrLead =new LeafTaps();
		CrLead.createLead();
				
}
}