package excel_work;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Singledata {

	
	public static void main(String[] args) throws IOException {
		//identify the file in system location
	 FileInputStream file=new FileInputStream("./Excelflies/singledata.xlsx");
	 
	 // identify the work book in the file
 	 XSSFWorkbook workbook=new  XSSFWorkbook(file);
	 
	 //identify the sheet in the work book
	 XSSFSheet sheet=workbook.getSheet("sheet1");
	 
	 //identify the row in the sheet
	 Row row=sheet.getRow(1);
	 
	//identify the row in the cell
	 Cell cell=row.getCell(1);
	 //getting the data from the row of the cell
	 String data=cell.getStringCellValue();
	 System.out.println(data);
	 
	 //WRITE DATA TO EXCEL
	 
	 Row row1=sheet.createRow(4);
	 Cell cell1=row1.createCell(3);
	 cell1.setCellValue("pagadala");
	 
	 Row row2=sheet.createRow(4);
	 Cell cell2=row2.createCell(4);
	 cell2.setCellValue("maheswari");
	 
	 Row row3=sheet.createRow(4);
	 Cell cell3=row3.createCell(5);
	 cell3.setCellValue("reddy");
	 
	 FileOutputStream file1=new FileOutputStream("./Excelflies/singledata.xlsx");
	  workbook.write(file1);
	
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	 
	}

}
