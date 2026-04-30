package DataDrivenTesting;
import java.util.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
public class Data3 {
public static void main(String args[])throws FileNotFoundException,IOException{
	FileInputStream file=new FileInputStream("C:\\Users\\2484105\\eclipse-workspace\\InterimSeleniumPractise\\PractiseData\\Book1.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	int rows=sheet.getLastRowNum();
	int cells=sheet.getRow(0).getLastCellNum();
	System.out.println(rows);
	System.out.println(cells);
	for(int r=0;r<=rows;r++) {
		XSSFRow row=sheet.getRow(r);
		for(int c=0;c<cells;c++) {
			XSSFCell cell=row.getCell(c);
			//if(cell.getCellType().toString().equals("STRING")) {
				System.out.print(cell.toString()+"\t ");
			}
		System.out.println();
	}
	workbook.close();
	file.close();
}
}
