package DataDrivenTesting;
import java.util.*;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.text.SimpleDateFormat;
public class Data2 {
public static void main(String args[])throws FileNotFoundException,IOException{
	FileInputStream file=new FileInputStream("C:\\Users\\2484105\\eclipse-workspace\\InterimSeleniumPractise\\PractiseData\\Book1.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("sheet1");
	int rowcount=sheet.getLastRowNum();
	int cellcount=sheet.getRow(0).getLastCellNum();
	System.out.println("Total rows:"+rowcount);
	System.out.println("Total cells:"+cellcount);
	String data[][]=new String[rowcount][cellcount];
	for(int r=0;r<rowcount;r++) {
		XSSFRow currentrow=sheet.getRow(r);
		for(int c=0;c<cellcount;c++) {
			XSSFCell cells=currentrow.getCell(c);
			if(cells!=null) {
			if(cells.getCellType()==CellType.STRING) {
				data[r][c]=cells.getStringCellValue();
			}else if(DateUtil.isCellDateFormatted(cells)){
				SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
				data[r][c]=sdf.format(cells.getDateCellValue());
			}else if(cells.getCellType()==CellType.NUMERIC) {
				data[r][c]=String.valueOf((int)cells.getNumericCellValue());
			}
		}
	}
	}
	for(int i=0;i<data.length;i++) {
		for(int j=0;j<data[i].length;j++) {
			System.out.print(data[i][j]+"\t ");
		}
		System.out.println();
	}
}
}
