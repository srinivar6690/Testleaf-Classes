
package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Mavenday1\\drivers\\chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement dropdown1 =driver.findElementById("dropdown1");
		Select dd1 = new Select(dropdown1);
		dd1.selectByIndex(1);//select training program using index
		System.out.println("Selected training program using index");
		Thread.sleep(2000);
		
		
		WebElement dropdown2 =driver.findElementByName("dropdown2");
		Select dd2 = new Select(dropdown2);
		dd2.selectByVisibleText("Selenium");//select training program using text
		System.out.println("Selected training program using text");		
		WebElement dropdown3 =driver.findElementById("dropdown3");
		Select dd3 = new Select(dropdown3);//select training program using value
		dd3.selectByValue("1");
		Thread.sleep(2000);
		
		WebElement dropdown4 =driver.findElementByXPath("//select[@class='dropdown']");
		Select dd4 = new Select(dropdown4);
		java.util.List<WebElement> dropdownnos = dd4.getOptions();
		int no= dropdownnos.size(); //get number of dropdown options
		System.out.println(no);//print dropdown numbers
		Thread.sleep(2000);
		
		WebElement dropdown5= driver.findElementByXPath("//option[text()='You can also use sendKeys to select']/parent::select");
		dropdown5.sendKeys("Selenium");
		Thread.sleep(2000);
		
		WebElement dropdown6= driver.findElementByXPath("//option[text()='Select your programs']/parent::select");
		Boolean disabled = dropdown6.isEnabled();
		System.out.println(disabled);
		dropdown6.sendKeys("Selenium");
		System.out.println("Unable to select as field is disabled");
		Thread.sleep(2000);
		
		driver.close();
		
		
		
			
		
		
	}

}
