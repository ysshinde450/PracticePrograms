package fileupload;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 {
	
	public static void main(String[] args) throws IOException {
	
		File path= new File("C:\\Users\\user\\Desktop\\Testing notes\\1 Practice Programs.xlsx");
		FileInputStream load=new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		XSSFSheet sheet1 = workbook.getSheetAt(1);
		String data = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
	}

}
