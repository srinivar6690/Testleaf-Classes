package week2.day2;

import java.awt.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Mavenday1\\drivers\\chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
        /*driver.get("https://www.calculator.net/loan-calculator.html");//1. Launch URL "http://www.leafground.com/pages/Link.html"
		driver.manage().window().fullscreen();//full screen		
		String title=  driver.getTitle();
	    System.out.println(title);
		String value= driver.findElementById("cloanamount").getAttribute("value");
		System.out.println(value);
		driver.get("https://www.google.co.in");
		driver.findElementByName("q").sendKeys("Selenium",Keys.ENTER);
		driver.get("http://leaftaps.com/opentaps/control/main");
		String tag = driver.findElementByTagName("h2").getText();
		System.out.println(tag);*/
		
		//*********************recap of select class**************************//
		driver.get("https://www.facebook.com/");
		
		
		//step1:
		WebElement month =driver.findElementById("month");
	     
		//create object for select class
		Select dd= new Select(month);
	    
		//three methods; 1. selectByVisibleText, selectByValue,selectByIndex
		//dd.selectByVisibleText("Feb");//selectByVisibleText
		//dd.selectByValue("2");//select byvalue
		dd.selectByIndex(0);//select by index
		java.util.List<WebElement> months = dd.getOptions();
		/*System.out.println(months.size());
		int size= months.size();
		dd.selectByIndex(size-1);// to select last value from the list */
		
		for (WebElement eachmonth : months) {
			
			System.out.println(eachmonth.getAttribute("value"));
			
		}
		
	}


	
}
