package repeatAllPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteUtility {
	
	public static void excelReading() throws IOException {
		FileInputStream path = new FileInputStream(
				"C:\\Users\\user\\Desktop\\Testing notes\\test cases retail domain.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(path);
		XSSFSheet sheet = workbook.getSheetAt(1);
	}
	
	public static void excelWriting() {
		
	}
	

}
