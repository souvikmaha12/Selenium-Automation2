package DataDrivenTesting;
import java.util.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
public class Data5 {
public static void main(String args[])throws FileNotFoundException,IOException {
	FileOutputStream file=new FileOutputStream("C:\\Users\\2484105\\eclipse-workspace\\InterimSeleniumPractise\\PractiseData\\dymanic.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook();
	XSSFSheet sheet=workbook.createSheet("Sheet1");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter rows");
	int rows=sc.nextInt();
	System.out.println("Enter cells");
	int cells=sc.nextInt();
	for(int r=0;r<=rows;r++) {
		XSSFRow row=sheet.createRow(r);
		for(int c=0;c<cells;c++) {
			XSSFCell cell=row.createCell(c);
			cell.setCellValue(sc.next());;
		}
	}
	workbook.write(file);
	workbook.close();
	file.close();
	System.out.println("File Created");
}
}
