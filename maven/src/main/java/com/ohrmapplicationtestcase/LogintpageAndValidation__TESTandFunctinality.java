package com.ohrmapplicationtestcase;

import java.io.IOException;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.config.Basetest;
import com.utility.Excelcommonmethod;
import com.utility.Log4j;
import com.utility.Orangehrmproperties;
import com.utility.Screenshots;

public class LogintpageAndValidation__TESTandFunctinality extends Basetest{
      
	
	Properties property;
	String excelFileInputPath="C:\\Users\\ramre\\OneDrive\\Desktop\\myproject12\\maven\\Excelfiles\\LogInTest.xlsx";
	                          // C:\\Users\\ramre\\OneDrive\\Desktop\\myproject12\\maven\\Excelfiles\\LogInTest.xlsx
	String excelFileOutputPath="C:\\Users\\ramre\\OneDrive\\Desktop\\myproject12\\maven\\Excelfiles\\LogInTest.xlsx";
	String Sheetname="Sheet1";
	
	
	Excelcommonmethod Excelfile;
	
@Test(priority=1,description="ohrm validating login panel")
public void validationhomepage_loginpanel ()throws IOException {
	
	Excelfile=new Excelcommonmethod(excelFileInputPath,excelFileOutputPath,Sheetname);
		

		
		
		property =Orangehrmproperties.loadproperty();
		By loginpageloginpaneltestlocator=By.id(property.getProperty("loginpageHeaderText"));
		//WebElement 
	    WebElement loginpanel=driver.findElement(loginpageloginpaneltestlocator);
	    
		String expected_loginpanel=Excelfile.getcallvalue(1,0);
		
		Log4j.info("expected_loginpanel getted data");
		
	    String actual_loginpanel=loginpanel.getText();
	    Excelfile.setcellvalue(1,1,actual_loginpanel);
	    Log4j.info("actual_loginpanel---text");
	    
		if(actual_loginpanel.equals(expected_loginpanel)) {
			Log4j.info("successfully navigated to ohrm loginpage---pass");
			 Excelfile.setcellvalue(1,2,"successfully navigated to ohrm loginpage---pass");
			 
		}
			 
		else {
			
			Log4j.info("failed  to  navigate  ohrm loginpage---pass");
			 Excelfile.setcellvalue(1,2,"failed to navigate  ohrm loginpage---fail");
		}
			
			
		Screenshots.takescreenshot(driver,"error to navigate to orangehrm");
		Log4j.info(" screenshot captured");
		
			
			
			
			
		
}
}
