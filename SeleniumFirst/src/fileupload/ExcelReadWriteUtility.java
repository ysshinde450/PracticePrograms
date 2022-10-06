package fileupload;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWriteUtility {

	static String path="C:\\Users\\user\\Desktop\\Testing notes\\1 Practice Programs.xlsx";
	
	public static String excelReading(int sheetNo, int rowNo , int colNo) throws IOException {
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(sheetNo);
		return  sheet.getRow(rowNo).getCell(colNo).getStringCellValue();
	}
	public void excelWriting(int sheetNo, int rowNo , int colNo, String data) throws IOException {
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(sheetNo);
		FileOutputStream output=new FileOutputStream(path);
		sheet.createRow(rowNo).createCell(colNo).setCellValue(data);
		workbook.write(output);
		workbook.close();
	}
	public static void main(String[] args) throws IOException {
		ExcelReadWriteUtility obj=new ExcelReadWriteUtility();
		obj.excelWriting(1,1,1,"Successfully written");
		System.out.println(excelReading(0,0,0));
		
	}
}
