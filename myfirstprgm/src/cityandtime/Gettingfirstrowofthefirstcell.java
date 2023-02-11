
package cityandtime;

import java.io.FileInputStream;
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

public class Gettingfirstrowofthefirstcell {

	WebDriver driver;
	String applicationurl="https://timeanddate.com/worldclock";
	 
	public void applicationlaunch()
	{
	  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ramre\\\\OneDrive\\\\Desktop\\\\myproject12\\\\myfirstprgm\\\\browserdrivefiles\\\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get(applicationurl);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	   }
	//  selector-- /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
	//  /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]/a
	//  expression of the xpath---absolute--locator
	
    public void Getfirstrowofthefirstcellvalue() throws IOException {
    	By webpagecitynamelocator=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a");
        WebElement webpagecityname=driver.findElement(webpagecitynamelocator);
        String citynametext=webpagecityname.getText();
        System.out.println(citynametext);
        FileInputStream file=new FileInputStream("C:\\Users\\ramre\\OneDrive\\Desktop\\myproject12\\myfirstprgm\\Excelflies\\singledata.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook(file);
        XSSFSheet sheet=workbook.getSheet("sheet1");
        Row row=sheet.createRow(6);
        Cell cell=row.createCell(0);
        cell.setCellValue(citynametext);
        
        FileOutputStream file1=new FileOutputStream("C:\\Users\\ramre\\OneDrive\\Desktop\\myproject12\\myfirstprgm\\Excelflies\\singledata.xlsx");
        workbook.write(file1);
        workbook.close();
    }
    
   
public static void main(String[] args) throws IOException {
		Gettingfirstrowofthefirstcell getdata=new Gettingfirstrowofthefirstcell();
		getdata.applicationlaunch();
		getdata.Getfirstrowofthefirstcellvalue();
	}

}
