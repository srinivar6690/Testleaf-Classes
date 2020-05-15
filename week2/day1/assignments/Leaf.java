
package week2.day1.assignments;


import java.awt.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.html.HTMLLinkElement;


public class Leaf {
	
public static void main(String[] args) throws InterruptedException {
		

	    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();
			
		driver.get("http://www.leafground.com/pages/Link.html");//1. Launch URL "http://www.leafground.com/pages/Link.html"
		
		driver.manage().window().fullscreen();//full screen		
        
		driver.findElementByLinkText("Go to Home Page").click();
		System.out.println("Went to home page");
		Thread.sleep(2000);
		driver.findElementByLinkText("HyperLink").click();
		System.out.println("Came back to buttons page");
		Thread.sleep(2000);
		
		WebElement noclick = driver.findElementByLinkText("Find where am supposed to go without clicking me?");
		String noclicklink = noclick.getAttribute("href");
		System.out.println("found link without clicking as "+noclicklink);
		Thread.sleep(2000);
		
		driver.findElementByLinkText("Verify am I broken?").click();
		Thread.sleep(2000);
		String error = driver.findElementByXPath("//body/h1").getText();
		System.out.println(error);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElementByXPath("(//a[text()='Go to Home Page'])[2]").click();
		driver.findElementByLinkText("HyperLink").click();
		Thread.sleep(2000);
		System.out.println("Went to home page ");
		Thread.sleep(2000);
		System.out.println("Came back to buttons page after home");
		
		java.util.List<WebElement> elements = driver.findElementsByXPath("//a[text()='How many links are available in this page?']");
	    System.out.println("Number of elements:" +elements.size());

	    for (int i=0; i<elements.size();i++){
	      System.out.println("no of links available are:" + elements.get(i).getAttribute("href"));
	    }
	       
	     Boolean display= driver.findElementByXPath("(//a[text()='Go to Home Page'])[2]").isEnabled();
	     System.out.println(display);
	     
	     driver.close();
	    }
		
		
}

