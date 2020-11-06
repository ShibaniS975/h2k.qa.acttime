package com.acti.utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLib {
	public static XSSFWorkbook wb;
	public  ExcelLib()
	{
		try
		{
		File file = new File("./src/test/resources/testdata/Actidata.xlsx");
		FileInputStream fis = new FileInputStream(file);
		 wb = new XSSFWorkbook(fis);		
		}
		catch(Exception e)
		{
			System.out.println("Excel Sheet not found" +e.getMessage());
		}
		//function to get the rowcount
	}
		public static int getrowCount(int sheetIndex)
		{
			return wb.getSheetAt(sheetIndex).getLastRowNum()+1;
		}
		//function to read data
		public static String getData(int sheetIndex, int row, int col)
		{
			return wb.getSheetAt(sheetIndex).getRow(row).getCell(col).toString();
		}

}
