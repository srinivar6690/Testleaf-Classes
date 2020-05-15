package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Mavenday1\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");//method to call browser
		//Absolute Xpath- ***************/html/body/div[2]/div[2]/div/h2 is the absolute xpath of Leaftaps Login(blue) ***********************/
		// absolute x path starts with single "/", it will start from root node, i.e html; then mouse over on the  f12 page and  find if the object is highlighted, then write Xpath from html->body->div->the object
		//Limitations: takes more time, prone to human error, it is dyanamic, it will change if the dev changes page design
		//Relative Xpath - **************************//tagname, use this in f12 to find if its unique, if its unique, then this is relative Xpath
		
		String absolute = driver.findElementsByXPath("//h2").getText();
		System.out.println(absolute);
		
		//Attribute based Xpath *************//tagname[@attributeName='attributevalue']
		//eg:label[@for='username'], //input[@class='inputLogin'and @id='username']
		//Text based Xpath*********** //tagname[text()=value], eg: //h2[text()=Leaftaps login]
		//partial text *******//tagname[contains(text(),value)]: eg: //h2[contains(text(),'Leaftaps')]
		//Attribute based Xpath with contains ****************input[contains(@id,'u_')]
		//collectionbased xpath*******to find elements with same tag eg:  (//input)[2]******* this will go to password, here [2] is index
		//collection based Xpath:  (//input[@class='inputlogin'])[2]
		Absolute xpath - single slash
		/html/body/div[2]/div[2]/div/h2
		Relative xpath
		Xpath using tagName:
		//tagName
		//h2
		//input
		Attribute Base xpath:
		//tagName[@attributeName='attributevalue']
		//input[@id='username']
		//label[@for='username']
		//input[@class='inputLogin' and @id='username']
		//input[@class='inputLogin123' or @id='username']
		TextBased Xpath:
		//h2[text()='Leaftaps Login']
		//h2[contains(text(),'Leaftaps')]
		//tagName[contains(text(),'partial text')]
		//a[contains(text(),'Forgotten')]
		//input[contains(@id,'u_')]
		(//input)[2]
		(//input[@class='inputLogin'])
				
				
				//form[@id='login']/p[2]
				parent xpath/child-tagName
				Grandparent to GrandChild
				Grandparent xpath//grandchild tagName
				//form[@id='login']//label
				(//form[@id='login']//label)[2]
				//div[@class='example']
				//input[@id='password']/parent::parent tagname 
				child xpath/parent::parent tagname
				//input[@id='password']/parent::p
				//option[text()='You can also use sendKeys to select']/parent::select
				child xpath/..
				grandchild xpath/ancestor::grandparent tagname
	}

}
