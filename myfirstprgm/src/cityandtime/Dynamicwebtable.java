package cityandtime;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Dynamicwebtable extends baseTest{
                            //baseTest is imported in current class to maintain reusability of code 
	
	public void webtablegettingdata() throws IOException  {
		
		
		// FileInputStream file=new FileInputStream("C:\\Users\\ramre\\OneDrive\\Desktop\\myproject12\\myfirstprgm\\Excelflies\\singledata.xlsx");
	   //  XSSFWorkbook workbook=new XSSFWorkbook(file);
	    // XSSFSheet sheet=workbook.getSheet("Sheet4");
		
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table
		By webtablexpath=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table");
		WebElement webtable=driver.findElement(webtablexpath);
		//table identified next step identify the number of  data rows
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a we have to consider tr to get table row 
		By webtablerowdatalocator=By.tagName("tr");
		List<WebElement>webtablerowdata=webtable.findElements(webtablerowdatalocator);
		 System.out.println(webtablerowdata.size());
	     
		 for (int rowindex=0;rowindex<webtablerowdata.size();rowindex++)
		 {   
			// Row row=sheet.createRow(rowindex);
			 System.out.println(rowindex);
			// Row row=sheet.createRow(rowindex);
			    By rowofthecellslocator=By.tagName("td");
			
			   List<WebElement>rowofthecell=webtablerowdata.get(rowindex).findElements(rowofthecellslocator);
			    System.out.println(rowofthecell.size());
			  
			 //goto very rowofthe cell
			 for(int rowofcellindex=0;rowofcellindex<rowofthecell.size();rowofcellindex++) {
				 //now its going to every row of cell data
				 String tabledata=rowofthecell.get(rowofcellindex).getText();
				 
				 //System.out.print(tabledata+"   ");
				 // Cell cell=row.createCell(rowofcellindex);
    	         // cell.setCellValue(tabledata);
    	          System.out.print(tabledata+"   ");
    	          
			 }
			 
			 System.out.println(" ");
		 }
				 
		// FileOutputStream file1=new FileOutputStream("C:\\Users\\ramre\\OneDrive\\Desktop\\myproject12\\myfirstprgm\\Excelflies\\singledata.xlsx");
	      //workbook.write(file1);
	     // workbook.close();
	 
	  			 
	}		 
 public static void main(String[] args) throws IOException {
    
     	Dynamicwebtable getdata=new Dynamicwebtable();
     	getdata.applicationlaunch();
        getdata.webtablegettingdata();
        getdata.applicationclose();
 }

}

