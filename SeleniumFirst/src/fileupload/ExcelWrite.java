package fileupload;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	
	public static void main(String[] args) throws IOException {
		File path= new File("C:\\Users\\user\\Desktop\\Testing notes\\1 Practice Programs.xlsx");
		FileInputStream load=new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		XSSFSheet sheet1 = workbook.getSheetAt(1);
		FileOutputStream output= new FileOutputStream(path);
		sheet1.createRow(1).createCell(0).setCellValue("Selenium");
		workbook.write(output);
	}

}
