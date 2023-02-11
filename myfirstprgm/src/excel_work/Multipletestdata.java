package excel_work;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Multipletestdata {

	public static void main(String[] args) throws IOException {
		//identify the file in system location
		 FileInputStream file=new FileInputStream("./Excelflies/singledata.xlsx");
		 
		 // identify the work book in the file
		 XSSFWorkbook workbook=new 	XSSFWorkbook(file);
		 
		 //identify the sheet in the work book
		 XSSFSheet sheet=workbook.getSheet("sheet1");
		 
		 //identifying the numbe rof rows in test data
		 
		 int sheetrowcount=sheet.getLastRowNum();
		 System.out.println("sheet row with data count is :-" + sheetrowcount);
		 
		 //to go the allthe active rows
		 for (int rowindex=0;rowindex<sheetrowcount;rowindex++) {
			 
			 
			 int row_ofthe_cell_count=sheet.getRow(rowindex).getLastCellNum();
			 System.out.println(row_ofthe_cell_count);
			 for(int cellindex=0;cellindex<row_ofthe_cell_count;cellindex++) {
				 
				 Row row=sheet.getRow(rowindex);
				 Cell rowofthecell=row.getCell(cellindex);
				 
			     
				 String data=rowofthecell.getStringCellValue();
				 System.out.println(data + " ");
				 
		 }
		 System.out.println();
		 }
		 
		 
		 
	}

}
