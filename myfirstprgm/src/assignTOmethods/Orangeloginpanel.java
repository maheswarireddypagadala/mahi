package assignTOmethods;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Orangeloginpanel extends Orangehrmlaunch {
	
	
	
	public void titleandurlvalidation() {
	//navigate to orange hrm application
    //validate the login page of orangeHRM application
      
      String expected_titleoforangeHrmapplicationloginpage="OrangeHRM";
      System.out.println("expected titleoforangeHrmapplicationloginpage:" +expected_titleoforangeHrmapplicationloginpage);
      
      String actual_titleoforangeHrmapplicationloginpage=driver.getTitle();
      System.out.println("actual titleoforangeHrmapplicationloginpage:" +actual_titleoforangeHrmapplicationloginpage);
      
  	    if(actual_titleoforangeHrmapplicationloginpage.equals(expected_titleoforangeHrmapplicationloginpage)) 
  	
  	{
  	  System.out.println("orangeHrmapplicationloginhomepage---pass");
  	  }
         else {
  	  System.out.println("orangeHrmapplicationloginhomepage----fail");
         }
	
  	    
      
  	String expected_orangeHrmapplicationloginpagecurrenturladdress="orangehrm-4.2.0.1";
      System.out.println("expected titleoforangeHrmapplicationloginpage:" + expected_orangeHrmapplicationloginpagecurrenturladdress);
      
      String actual_orangeHrmapplicationloginpagecurrenturladdress=driver.getCurrentUrl();
      System.out.println("expected titleoforangeHrmapplicationloginpage:" + actual_orangeHrmapplicationloginpagecurrenturladdress);
        if(actual_orangeHrmapplicationloginpagecurrenturladdress.contains(expected_orangeHrmapplicationloginpagecurrenturladdress))
     {
  	 System.out.println("orangeHrmapplicationloginpagecurrenturladdress----pass");  
     }
       else 
     {
  	   System.out.println("orangeHrmapplicationloginpagecurrenturladdress----fail");  
     }
     
     
     //validating the loginpaneltext before login
     
     String expected_orangeHrmapplicationloginpanelbeforetext="LOGIN Panel";
     System.out.println("expected_orangeHrmapplicationloginpanel : "+expected_orangeHrmapplicationloginpanelbeforetext);
     
     //id="logInPanelHeading"
     By loginpanellocator=By.id("logInPanelHeading");
     WebElement actual_loginpaneltextbeforeloginelement=driver.findElement(loginpanellocator);
     String actual_loginpaneltextbefotrelogin=actual_loginpaneltextbeforeloginelement.getText();
     System.out.println("actual_loginpaneltextbefotrelogin :  "+actual_loginpaneltextbefotrelogin);
     
     if(actual_loginpaneltextbefotrelogin.equals(expected_orangeHrmapplicationloginpanelbeforetext))
     {
    	 System.out.println("loginpanel text before login is matched -----------pass");
     }
     
     else {
    	 System.out.println("loginpanel text before login is not matched -------fail");
     }
	}
	
     public void orangehrmLogin() {
   //login with validation data testdata
     By usernamelocator=By.id("txtUsername");
	  WebElement username=driver.findElement(usernamelocator);
	  username.sendKeys("maheswari");
		
	  By passwordlocator=By.id("txtPassword");
	  WebElement password=driver.findElement(passwordlocator);
	  password.sendKeys("Mahesh@1998");
	  
	  //id="btnLogin"
	  By loginlocator=By.id("btnLogin");
	  WebElement login=driver.findElement(loginlocator);
	  login.click();
     
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
     }
     
     public void orangewelcomeadmin() throws InterruptedException {
	  By welcomel=By.linkText("Welcome Admin");
	  WebElement  welcome=driver.findElement(welcomel);
	  welcome.click();
	  
	   Thread.sleep(10000);
	  
	   WebDriverWait wait=new WebDriverWait(driver,10);
	    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Logout")));
     }
     
     public void orangehrmlogout() {
	    By logoutl=By.linkText("Logout");
	     WebElement logout=driver.findElement(logoutl);
	     logout.click();
     }
     

     
     public static void main(String[] args) throws InterruptedException {
    	 
    	 Orangeloginpanel loginandwelcome=new  Orangeloginpanel();
    	   
    	 loginandwelcome.hrmapplicationlaunch();
    	 
    	 loginandwelcome.titleandurlvalidation();
    	 loginandwelcome.orangehrmLogin();
    	 loginandwelcome.orangewelcomeadmin();
    	 loginandwelcome.orangehrmlogout();
    	 
    	 
    	 
    	 
}
	}
	
	
	

