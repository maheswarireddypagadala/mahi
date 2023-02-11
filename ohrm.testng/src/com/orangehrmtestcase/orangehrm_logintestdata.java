package com.orangehrmtestcase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.orangehrm.Basetest;

public class orangehrm_logintestdata  extends Basetest {
	public FileInputStream file;
	 public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	 public Row row;
	 WebDriver driver;
	 
	@Test(priority=1,description=" login panel test")
	public void LoginPanelText()
	//<div id="logInPanelHeading">LOGIN Panel</div>
	{
		//validate the login page of orangeHRM application
	    String expected_titleoforangeHrmapplicationloginpage="OrangeHRM";
	    System.out.println("expected titleoforangeHrmapplicationloginpage:" +expected_titleoforangeHrmapplicationloginpage);
	    
	    String actual_titleoforangeHrmapplicationloginpage=driver.getTitle();
	    System.out.println("actual titleoforangeHrmapplicationloginpage:" +actual_titleoforangeHrmapplicationloginpage);
	    
		if(actual_titleoforangeHrmapplicationloginpage.equals(expected_titleoforangeHrmapplicationloginpage))
		{
		  System.out.println("orangeHrmapplicationloginhomepage---pass");
		  }
	    else
	    {
		  System.out.println("orangeHrmapplicationloginhomepage----fail");
	    }
		
		//<div id="logInPanelHeading">LOGIN Panel</div>
		
		By loginpanellocator=By.id("logInPanelHeading");
		WebElement loginpanel=driver.findElement(loginpanellocator);
	    String loginpaneltext=loginpanel.getText();
	   System.out.println("loginpaneltext :"+ loginpaneltext);
	
	}
	@Test(priority=2,description=" input to excelsheet ")
	public void inputlogin() throws IOException {
		  file=new FileInputStream("C:\\Users\\ramre\\OneDrive\\Desktop\\myproject12\\ohrm.testng\\exceltestdata\\orange.xlsx");
		  workbook=new XSSFWorkbook(file);
		  sheet=workbook.getSheet("Sheet1");
		  row=sheet.getRow(1);
		    
		    Cell usernametestdatacell=row.getCell(0);
		     String usernametestdata=usernametestdatacell.getStringCellValue();
		    System.out.println("usernametestdata :"+usernametestdata);
	
 		    
            Cell passwordtestdatacell=row.getCell(1);
		   String passwordtestdata=usernametestdatacell.getStringCellValue();
		    System.out.println("passwordtestdata :"+passwordtestdata);
	
		    //login with validation data testdata
		     By usernamelocator=By.id("txtUsername");
			  WebElement username=driver.findElement(usernamelocator);
			  username.sendKeys(usernametestdata);
				
			  By passwordlocator=By.id("txtPassword");
			  WebElement password=driver.findElement(passwordlocator);
			  password.sendKeys(passwordtestdata);
			  
			  //id="btnLogin"
			  By loginlocator=By.id("btnLogin");
			  WebElement login=driver.findElement(loginlocator);
			  login.click();
	
	}
	
	@Test(priority=3,description=" logout output")
	public void outputlogout() throws InterruptedException, IOException {
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
	     
		  By welcomel=By.linkText("Welcome Admin");
		  WebElement  welcome=driver.findElement(welcomel);
		  welcome.click();
		  
		   Thread.sleep(10000);
		  
		   WebDriverWait wait=new WebDriverWait(driver,10);
		    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Logout")));
		  
		    By logoutl=By.linkText("Logout");
		     WebElement logout=driver.findElement(logoutl);
		     logout.click();
		     
		     Cell resultincell=row.createCell(2);
		     resultincell.setCellValue("passesloginandlogout");
		     FileOutputStream file1=new  FileOutputStream("C:\\Users\\amre\\OneDrive\\Desktop\\myproject12\\ohrm.testng\\exceltestdata\\orange.xlsx");
			 workbook.write(file1);
		
	}
	
	

	
	
	
 }

