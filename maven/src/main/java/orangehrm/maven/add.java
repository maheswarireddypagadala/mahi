package orangehrm.maven;

import java.util.concurrent.TimeUnit;


import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.utility.Log4j;


public class add {
	
	WebDriver driver;
    String applicationurladdress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth";

	    @Test(priority=1)
		public void  applicationlaunch() throws InterruptedException 
	    {
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\ramre\\OneDrive\\Desktop\\myproject12\\ohrm.testng\\broswer\\browserdriver\\chromedriver.exe");
	         driver=new ChromeDriver();
	         driver.get(applicationurladdress);
	         driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			
	
	  By usernamelocator=By.id("txtUsername");
	  WebElement username=driver.findElement(usernamelocator);
	  username.sendKeys("maheswari");
	  
	      Log4j.info(" username entered ");
	
	  By passwordlocator=By.id("txtPassword");
	  WebElement password=driver.findElement(passwordlocator);
	  password.sendKeys("Mahesh@1998");
	  
	  Log4j.info("paaword entered ");
	  //id="btnLogin"
	  By loginlocator=By.id("btnLogin");
	  WebElement login=driver.findElement(loginlocator);
	  login.click();
	  
       Log4j.info("  click operation done");
	  
		
	}
	  

}
