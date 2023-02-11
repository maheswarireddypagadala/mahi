package handling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_scrollbar {
	
	WebDriver driver;
	String applicationurl="https://www.tsrtconline.in/oprs-web/";
    
	public void applicationLunch(){
		System.setProperty("webdriver.chrome.driver","./browserdrivefiles/chromedriver.exe");
		driver=new ChromeDriver();
	    driver.get(applicationurl);
	
	}
	public void handlingscrollbar()
	{
	 ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,250)");
	  
		        //or
		//JavascriptExecutor js=((JavascriptExecutor)driver);
		//js.executeScript("window.scrollTo(0,200)");
	}
	public static void main(String[] args) {
    
    	Handling_scrollbar obj=new Handling_scrollbar();
    	obj.applicationLunch();
    	obj.handlingscrollbar();
    }
	
	
	
		
 }	