package VisibleElementofheaderblock;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValueLabs {

	public static void main(String[] args) {
		WebDriver driver;
		String application="https://www.valuelabs.com";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ramre\\OneDrive\\Desktop\\myproject12\\myfirstprgm\\browserdrivefiles\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(application);
        //identify the headerblock properties by inspect----
        //id="navbarSupportedContent"
        By headerblockL=By.id("navbarSupportedContent");
        WebElement headerblock=driver.findElement(headerblockL);
        
       /* <a class="nav-link1 menu-main dropdown-toggle" href="https://www.valuelabs.com" 
  		      id="Dropdown_about" role="button" data-toggle="dropdown" 
  		    aria-haspopup="true" aria-expanded="false">About Us</a>*/
        By headerblockLocator=By.tagName("a");
        List<WebElement>hearderblocklinks=headerblock.findElements(headerblockLocator);
        
        for (int index=0;index<hearderblocklinks.size();index++) 
        {
        	
           if(hearderblocklinks.get(index).isDisplayed()) {
        		
        		String headerblocklinkname=hearderblocklinks.get(index).getText();
            	System.out.println(index +"  "+ headerblocklinkname);
           }
           
        }	
     
        driver.quit();
	}

}