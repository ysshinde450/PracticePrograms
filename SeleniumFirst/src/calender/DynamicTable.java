package calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {
		static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Videos\\chromedriver.exe");
		 try {
			driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/web-table-element.php");
			driver.manage().window().maximize();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 List<WebElement> column = driver.findElements(By.xpath("//*[@class='dataTable']/thead/tr/th")); 
		 System.out.println(column.size());;
	}

}
