package Assing_orangehrm_login_empadd_emplist;

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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class multipledata_empdata {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		WebDriver driver;
        String applicationalurladdress="http://127.0.0.1/orangehrm-4.2.0.1/";
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ramre\\OneDrive\\Desktop\\myproject12\\myfirstprgm\\browserdrivefiles\\chromedriver.exe");
	      driver=new ChromeDriver(); 
	      driver.get(applicationalurladdress);
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	      
	      
	      //navigate to validating data
	      FileInputStream file=new FileInputStream("C:\\Users\\ramre\\OneDrive\\Desktop\\myproject12\\myfirstprgm\\Excelflies\\orange.xlsx");
		  XSSFWorkbook workbook=new XSSFWorkbook(file);
		    XSSFSheet sheet=workbook.getSheet("Sheet2");
	      
	      int totalRows=sheet.getLastRowNum();
	      //System.out.println(totalRows);
	      
		 for(int i=0;i<=totalRows;i++)
		{ 
		  Row row=sheet.getRow(i);  
		  
	      Cell usernamecell=row.getCell(0);
	      String username=usernamecell.getStringCellValue();
	      
	       Cell passwordcell=row.getCell(1);
	       String  password=passwordcell.getStringCellValue();
	      
	      driver.findElement(By.id("txtUsername")).sendKeys(username);
	      driver.findElement(By.id("txtPassword")).sendKeys(password);
	    		  
	      driver.findElement(By.id("btnLogin")).click();
	      
	      String Expected_homepageurl="dashboard";
	      String actual_homepageurl=driver.getCurrentUrl();
	      
	      if(actual_homepageurl.contains(Expected_homepageurl)){
	      
	    	  By welcomeadminl=By.linkText("Welcome Admin");
	    	  WebElement  welcomeadmin=driver.findElement(welcomeadminl);
	    	  welcomeadmin.click();
	    	  
	    	   Thread.sleep(10000);
	    	  
	    	   WebDriverWait wait=new WebDriverWait(driver,10);
	    	    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Logout")));
	    	  
	    	    By logoutl=By.linkText("Logout");
	    	     WebElement logout=driver.findElement(logoutl);
	    	     logout.click();
	    	     
	    	     System.out.println(" Navigate to HOME page PASS");
	    	     Cell resultscell=row.createCell(2);
	    	     resultscell.setCellValue("pass");
	      }
		  
	      else {
	    	  System.out.println(" Navigate to HOME page ------fail");
	    	  Cell resultcell=row.createCell(2);
	    	  resultcell.setCellValue("fail");
	    	  
	    	  //screen shot
	    	  
	      }
		 FileOutputStream file1=new  FileOutputStream("./Excelflies/orange.xlsx");
		 workbook.write(file1);
		 
		 }
		 driver.close();
	
	}

}
