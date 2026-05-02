package DataDrivenTesting;
import java.util.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class Data1{
public static void main(String args[])throws FileNotFoundException,IOException {
	FileInputStream file=new FileInputStream("C:\\Users\\2484105\\eclipse-workspace\\InterimSeleniumPractise\\PractiseData\\Book1.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	int totalrows=sheet.getLastRowNum();
	int totalcells=sheet.getRow(0).getLastCellNum();
	System.out.println("Total rows:"+totalrows);
	System.out.println("Total cells:"+totalcells);
	for(int r=0;r<=totalrows;r++) {
		XSSFRow currentrow=sheet.getRow(r);
		for(int c=0;c<totalcells;c++) {
			XSSFCell cell=currentrow.getCell(c);
			System.out.print(cell.toString()+"\t ");
		}
		System.out.println();
	}
	workbook.close();
	file.close();
}
}
