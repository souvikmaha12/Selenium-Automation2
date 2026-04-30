package DataDrivenTesting;
import java.util.*;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
public class Data6 {
public static void main(String args[])throws FileNotFoundException,IOException{
	FileOutputStream file=new FileOutputStream("C:\\Users\\2484105\\eclipse-workspace\\InterimSeleniumPractise\\PractiseData\\data1.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook();
	XSSFSheet sheet=workbook.createSheet("Sheet1");
	XSSFRow row1=sheet.createRow(0);
	row1.createCell(0).setCellValue("Java");
	row1.createCell(1).setCellValue("james");
	row1.createCell(2).setCellValue("10");
	XSSFRow row2=sheet.createRow(1);
	row2.createCell(0).setCellValue("Python");
	row2.createCell(1).setCellValue("Raghav");
	row2.createCell(2).setCellValue("15");
	XSSFRow row3=sheet.createRow(2);
	row3.createCell(0).setCellValue("C++");
	row3.createCell(1).setCellValue("Soumik");
	row3.createCell(2).setCellValue("50");
	workbook.write(file);
	workbook.close();
	file.close();
	System.out.println("File Created");
}
}
