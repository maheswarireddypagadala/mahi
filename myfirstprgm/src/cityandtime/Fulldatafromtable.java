package cityandtime;

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
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fulldatafromtable {//Static method
	  WebDriver driver; 
	String applicationurl="https://timeanddate.com/worldclock";
			 
    public void applicationlaunch()
			{
			  System.setProperty("webdriver.chrome.driver","C:\\Users\\ramre\\OneDrive\\Desktop\\myproject12\\myfirstprgm\\browserdrivefiles\\chromedriver.exe");
			    driver=new ChromeDriver();
			    driver.get(applicationurl);
			    driver.manage().window().maximize();
			    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			    
			   }
        
   // first row of first cell
   // /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
   // lastrow of lastcell
   //  /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
    String expressionpart1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
    String expressionpart2="]/td[";    
    String expressionpart3="]";
   public void fulltabledatatest() throws IOException {
	   FileInputStream file=new FileInputStream("C:\\Users\\ramre\\OneDrive\\Desktop\\myproject12\\myfirstprgm\\Excelflies\\singledata.xlsx");
	     XSSFWorkbook workbook=new XSSFWorkbook(file);
	     XSSFSheet sheet=workbook.getSheet("Sheet2");

      for(int indexrow=1;indexrow<=36;indexrow++)
          {
               System.out.println(indexrow);
               Row row=sheet.createRow(indexrow);
                for(int indexcell=1;indexcell<=8;indexcell++) {
        	       By  webtablelocator=By.xpath(expressionpart1+indexrow+expressionpart2+indexcell+expressionpart3);
        	         WebElement webtable=driver.findElement(webtablelocator);
        	        // Dimension webtabletext=webtable.getSize();
        	         String  indexcellvalues=webtable.getText();
        	         System.out.println(indexcellvalues);
        	         Cell cell=row.createCell(indexcell);
        	         cell.setCellValue(indexcellvalues);
        	        
                     
   }
      System.out.println(" ");
   }
      FileOutputStream file1=new FileOutputStream("C:\\Users\\ramre\\OneDrive\\Desktop\\myproject12\\myfirstprgm\\Excelflies\\singledata.xlsx");
      workbook.write(file1);
      workbook.close();
 
       }    
       
    public static void main(String[] args) throws IOException {
    	Fulldatafromtable fulltabledata=new Fulldatafromtable();
    	fulltabledata.applicationlaunch();
    	fulltabledata.fulltabledatatest();
    }
}






