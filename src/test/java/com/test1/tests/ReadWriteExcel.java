package com.test1.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadWriteExcel {

	public static void main(String[] args) throws InvalidFormatException, IOException 
	
	{
		// TODO Auto-generated method stub
		
		// HSSF to work with excel 97 to 2003 file format - .xls files
		
		
		// XSSF to work with excel 2007+ file format - .xlsx files
		
		
		// SS User Model 
		
		FileInputStream fis = new FileInputStream("C:/MasterTestDataWithPoi/MasterTestDataFile.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet tds = wb.getSheet("TestCaseDataSets");
		
		//tds.getRow(6).getCell(1);
		
		
		// when printing out cell value, System.out.println will convert to string but when we try
		//to assign the cell value to a string variable we have to use .toString() to convert
		//cell value to String or it will not work
		String cellValue1 = tds.getRow(6).getCell(1).toString();
		
		String cellValue2 = tds.getRow(6).getCell(1).toString();
		
		System.out.println("Row 7, Col 2: " + tds.getRow(6).getCell(1));
		
		System.out.println("Row 6, Col 1: " + tds.getRow(5).getCell(0));
		
		

		//To write to excel spreadsheet
		
		FileOutputStream fos = new FileOutputStream("C:/MasterTestDataWithPoi/MasterTestDataFile.xlsx");
		
		//to create a sheet name "TestSheet" where Hello will be written
		wb.createSheet("TestSheet").createRow(5).createCell(2).setCellValue("Hello");
		
		//To change the value of a cell
		tds.getRow(5).getCell(0).setCellValue("Welcome");
		
		//workbook write method to write to the file
		wb.write(fos);
		wb.close();
	}

}
