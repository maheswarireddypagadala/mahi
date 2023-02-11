package browserautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class welcomeadminandlogout {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver;
    String applicationurl="http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";
    System.setProperty("webdriver.chrome.driver","./browserdrivefiles/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(applicationurl);
	System.out.println(driver.getTitle());
	System.out.println("driver.getCurentUrl");
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    
    
    //validate the login page of orangeHRM application
    String expected_titleoforangeHrmapplicationloginpage="OrangeHRM";
    System.out.println("expected titleoforangeHrmapplicationloginpage:" +expected_titleoforangeHrmapplicationloginpage);
    
    String actual_titleoforangeHrmapplicationloginpage=driver.getTitle();
    System.out.println("actual titleoforangeHrmapplicationloginpage:" +actual_titleoforangeHrmapplicationloginpage);
    
	if(actual_titleoforangeHrmapplicationloginpage.equals(expected_titleoforangeHrmapplicationloginpage)) {
	  System.out.println("orangeHrmapplicationloginhomepage---pass");
	  }
    else {
	  System.out.println("orangeHrmapplicationloginhomepage----fail");
    }		
	String expected_orangeHrmapplicationloginpagecurrenturladdress="http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";
    System.out.println("expected titleoforangeHrmapplicationloginpage:" + expected_orangeHrmapplicationloginpagecurrenturladdress);
    
    String actual_orangeHrmapplicationloginpagecurrenturladdress=driver.getCurrentUrl();
    System.out.println("expected titleoforangeHrmapplicationloginpage:" + actual_orangeHrmapplicationloginpagecurrenturladdress);
   if(actual_orangeHrmapplicationloginpagecurrenturladdress.contains(expected_orangeHrmapplicationloginpagecurrenturladdress)) {
	 System.out.println("orangeHrmapplicationloginpagecurrenturladdress----pass");  
   }
   else {
	   System.out.println("orangeHrmapplicationloginpagecurrenturladdress----fail");
   }
   
   driver.findElement(By.id("txtUsername")).sendKeys("ramram");
  // driver.findElement(By.id("txtPassword")).sendKeys("Ram@123!@#");
   
   WebElement password=driver.findElement(By.id("txtPassword"));
    password.sendKeys("Ram@123!@#");
   
   By loginl=By.className("button");
   WebElement login=driver.findElement(loginl);
   login.click();
   
   //driver.findElement(By.linkText("Welcome mahi")).click();
  //<a href="#" id="welcome" class="panelTrigger">Welcome mahi</a>
   
  By welcomel=By.linkText("Welcome ram");
  WebElement  welcome=driver.findElement(welcomel);
  welcome.click();
  
   Thread.sleep(10000);
  
   WebDriverWait wait=new WebDriverWait(driver,10);
    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Logout")));
  
    By logoutl=By.linkText("Logout");
     WebElement logout=driver.findElement(logoutl);
     logout.click();
  
  
	}
		   
		   
		   
		   
}