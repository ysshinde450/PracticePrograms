package repeatAllPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public static void main(String[] args) throws IOException {
		//first get the path of excel
		File path = new File("C:\\Users\\user\\Desktop\\Testing notes\\1 Practice Programs.xlsx");
		//load that excel file
		FileInputStream load = new FileInputStream(path);
		//get access workbook of excel
		XSSFWorkbook workbook= new XSSFWorkbook(load);
		//get sheet of workbook
		XSSFSheet sheet1 = workbook.getSheetAt(1);
		//read cell
		String cellValue= sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(cellValue);
	}

}
