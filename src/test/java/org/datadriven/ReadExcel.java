package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\rithw\\eclipse-workspace\\NewMaven\\src\\test\\resources\\Excel\\DataExcel.xlsx");
		
		FileInputStream st=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook();
		
		Sheet s = w.getSheet("sheet1");
		
		Row r = s.getRow(0);
		
	
	}

}
