package browserautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrmlogin {

	public static void main(String[] args) {
		
		WebDriver driver;
		String applicationurladdress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ramre\\OneDrive\\Desktop\\myproject12\\myfirstprgm\\browserdrivefiles\\chromedriver.exe");
          driver=new ChromeDriver();
         driver.get(applicationurladdress);
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
   //testing the login functionality of orange HRM application
    driver.findElement(By.id("txtUsername")).sendKeys("maheswari");
    driver.findElement(By.id("txtPassword")).sendKeys("Mahesh@1998");
    driver.findElement(By.className("button")).click();
    //driver.close();
    
  }
	

}
