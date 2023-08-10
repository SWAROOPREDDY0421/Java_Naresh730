package Selinium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven_Exp {

	public static void main(String[] args) throws IOException {
		//File
		FileInputStream file=new FileInputStream("F:\\Anil.xlsx");
		//workbook
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		//sheets
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rowcount=sheet.getLastRowNum();
		System.out.println("The row number is:"+rowcount);
		int cellcount=sheet.getRow(0).getLastCellNum();
		System.out.println("The Cell count number is:"+cellcount);
		for(int i=0;i<rowcount;i++) {
			XSSFRow count=sheet.getRow(i);
			for(int j=0;j<cellcount;j++) {
			String data=count.getCell(j).toString();
			System.out.print("  ||   "+data);
			}
			System.out.println();
		}

	}

}
