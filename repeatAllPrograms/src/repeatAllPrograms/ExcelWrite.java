package repeatAllPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		//get file path
		File path = new File("C:\\Users\\user\\Desktop\\Testing notes\\test cases retail domain.xlsx");
		//load excel file
		FileInputStream load = new FileInputStream(path);
		//get access of that excel workbook
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		//get the sheet of that workbook
		XSSFSheet sheet = workbook.getSheetAt(3);
		//write in that sheet
		FileOutputStream input = new FileOutputStream(path);
		sheet.createRow(0).createCell(0).setCellValue("Yogesh");
		workbook.write(input);
	}
}
