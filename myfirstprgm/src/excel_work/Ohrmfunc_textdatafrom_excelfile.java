package excel_work;

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


public class Ohrmfunc_textdatafrom_excelfile {


	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver;
		String applicationurladdress="http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ramre\\OneDrive\\Desktop\\myproject12\\myfirstprgm\\browserdrivefiles\\chromedriver.exe");
          driver=new ChromeDriver();
         driver.get(applicationurladdress);
         driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
         
         FileInputStream logintestdatafile=new FileInputStream("./Excelflies/Ohrm dataexcelfile.xlsx");
         XSSFWorkbook workbook=new XSSFWorkbook(logintestdatafile);
         XSSFSheet sheet=workbook.getSheet("Sheet1");
         
         Row row=sheet.getRow(0);
         
         Cell usernametestdatacell=row.getCell(0);
         String usernametestdata=usernametestdatacell.getStringCellValue();
         System.out.println("usernametestdata"+usernametestdata);
         
         Cell passwordtestdatacell=row.getCell(1);
         String passwordtestdata=passwordtestdatacell.getStringCellValue();
         System.out.println("passwordtestdata"+passwordtestdata);
         
         
        By usernamelocator=By.id("txtUsername");
         WebElement username=driver.findElement(usernamelocator);
         username.sendKeys(usernametestdata);
         
         By passwordloacator=By.id("txtPassword");
         WebElement password=driver.findElement(passwordloacator);
         password.sendKeys( passwordtestdata);
         
         By loginbuttonlocator=By.name("Submit");
         WebElement loginbutton=driver.findElement(loginbuttonlocator);
         loginbutton.click();
         
         //validating welcome admin page
        // <a href="#" id="welcome" class="panelTrigger">Welcome demo</a>
         By welcomeadminloacator=By.id("welcome");
         WebElement wecomeadmin=driver.findElement(welcomeadminloacator);
         String excpeted_dwelcomeadmin="demo";
         String actual_welcomeadmin= wecomeadmin.getText();
         
         if(actual_welcomeadmin.contains(excpeted_dwelcomeadmin))
         {
        	 System.out.println("successfully navigated to homepage --pass");
        	 Cell rowofthecell=row.createCell(2);
        	 rowofthecell.setCellValue("pass");
        	 
         }
         else
         {
        	 System.out.println("failed to navigate homepage-----fail");
        	 Cell rowofthecell=row.createCell(2);
        	 rowofthecell.setCellValue("fail");
         }
         wecomeadmin.click();
         Thread.sleep(10000);
         
         //automating logout
         By logoutl=By.linkText("Logout");
         WebElement logout=driver.findElement(logoutl);
         logout.click();
         
         FileOutputStream logintestresultsfile=new  FileOutputStream("./Excelflies/Ohrm dataexcelfile.xlsx");
         workbook.write(logintestresultsfile);
         
         
         
  
 
	}

}
