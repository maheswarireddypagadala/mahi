package com.orangehrm;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Basetest {
	
	public WebDriver driver;
	String applicationurladdress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

    @BeforeMethod()
	public void  applicationlaunch() {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\ramre\\OneDrive\\Desktop\\myproject12\\ohrm.testng\\broswer\\browserdriver\\chromedriver.exe");
         driver=new ChromeDriver();
         driver.get(applicationurladdress);
         driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		}
  //  @AfterMethod()
  //  public void applicationclose() {
    	
    //	driver.close();
     // }
   // @Test
    //public void mahi() {
    	
    //}
}
