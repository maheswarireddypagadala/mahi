package MousehoverAmazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hiddenElement {

	public static void main(String[] args) {
    WebDriver driver;
    String apllicationurl="http://amazon.in";
    System.setProperty("webdriver.chrome.driver","./browserdrivefiles/chromedriver.exe");
    driver=new ChromeDriver();
    driver.get(apllicationurl);
    
    //automating to hello signin element
   // <span id="nav-link-accountList-nav-line-1" 
   // class="nav-line-1 nav-progressive-content">Hello, sign in</span>
    By hellosigninL=By.id("nav-link-accountList-nav-line-1");
    WebElement hellosignin=driver.findElement(hellosigninL);
    //performing mouse hover operation on hello signin  element using
 //actions clas from package --org.openqa.selenium.interactions.Actions
    
    Actions action=new Actions(driver);
    //performing action on the current webpage
    
    action.moveToElement(hellosignin).build().perform();
    
	//action.moveTOElement(hellosignin).build().perform();
    //moving to hellosignin
    
    
    //automating your wish list (hidden element)
    //<span class="nav-text">Your Wish List</span>
    By yourwishlistlocator=By.linkText("Your Wish List");
    WebElement yourwishlist=driver.findElement(yourwishlistlocator);
    yourwishlist.click();
    System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());
	}

}