package com.utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelcommonmethod {
	
	String excelFileInputPath;

	String excelFileOutputPath;

	String Sheetname;

	XSSFWorkbook workbook;

	public Excelcommonmethod(String excelFileInputPath, String excelFileOutputPath, String Sheetname) throws IOException {
		// TODO Auto-generated constructor stubthis.excelFileInputPath=excelFileInputPath;

		this.excelFileOutputPath= excelFileOutputPath;

		this.Sheetname=Sheetname;

		FileInputStream File=new FileInputStream(excelFileInputPath);

		workbook=new XSSFWorkbook(File);

	}

	
	public String getcallvalue(int rowIndex,int cellIndex) {

	XSSFSheet sheet=workbook.getSheet(Sheetname);

	Row row=sheet.getRow(rowIndex);

	Cell rowofcell=row.getCell(cellIndex);

	return rowofcell.getStringCellValue();

	}

	public void setcellvalue(int roeIndex,int cellIndex,String data) throws IOException {

	XSSFSheet sheet=workbook.getSheet(Sheetname);

	Row row=sheet.getRow(roeIndex);

	Cell rowofcell=row.createCell(cellIndex);

	rowofcell.setCellValue(data);

	}

	public void saveExcelData() throws IOException

	{

	FileOutputStream outputstreamTestResultFile=new FileOutputStream(excelFileOutputPath);

	workbook.write(outputstreamTestResultFile);

	}

}
