package inatechspecific;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public Object[][] readTestdata(String filename) throws InvalidFormatException, IOException{
		// get the  workbook
		File file  = new File("./testdata/"+filename +".xlsx");
		XSSFWorkbook wbook = new XSSFWorkbook(file);
		
		XSSFSheet  sheet1 = wbook.getSheetAt(0);
		
		int rowCount = sheet1.getLastRowNum();
		int columnCount = sheet1.getRow(0).getLastCellNum();
		
		Object [][] data = new Object[rowCount][columnCount];
		
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row =  sheet1.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell =  row.getCell(j);				
				//String celldatavalue = cell.getStringCellValue();				
				//System.out.println("Data : row"+ i + "Column "+ j+  celldatavalue);
				
				data[i-1][j] =cell.getStringCellValue();
			}
			
		}
		wbook.close();
		return data;
}
}
