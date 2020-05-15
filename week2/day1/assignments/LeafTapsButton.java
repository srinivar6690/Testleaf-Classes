package week2.day1.assignments;

import java.awt.Color;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsButton {

	public static void  main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
			
		driver.get("http://www.leafground.com/pages/Button.html");//1. Launch URL "http://www.leafground.com/pages/Button.html"
		driver.manage().window().fullscreen();//full screen	
		
		driver.findElementById("home").click();//click home button
		Thread.sleep(2000);
		driver.findElementByXPath("//h5[text()='Button']/following-sibling::img").click();//click  button tile
		
		WebElement position = driver.findElementById("position");//get position
		Point positionvalue = position.getLocation();
		int x = positionvalue.getX();
		int y = positionvalue.getY();
		System.out.println("location "+positionvalue+" X axis is "+x+" Y axis is "+y);
		
		WebElement colour = driver.findElementById("color");//get colour as rgb
		String css= colour.getCssValue("background-color");
		System.out.println("RGBA value of field colour is "+css);
		
		//convert RGB to hex code//
		String[] hexValue = css.replace("rgba(", "").replace(")", "").split(",");
		int hexValue1=Integer.parseInt(hexValue[0]);
		hexValue[1] = hexValue[1].trim();
		int hexValue2=Integer.parseInt(hexValue[1]);
		hexValue[2] = hexValue[2].trim();
		int hexValue3=Integer.parseInt(hexValue[2]);
		String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
		System.out.println("The field colour is light green as hex code is "+actualColor);
		
		
		WebElement size = driver.findElementById("size");//get size 
		Dimension sizevaue= size.getSize();
		int L = sizevaue.getHeight();
		int B = sizevaue.getWidth();// in inspect mode it shows 121.8
		System.out.println("size of the field is "+ L+ " " + B );
		driver.close();		
	}

}
