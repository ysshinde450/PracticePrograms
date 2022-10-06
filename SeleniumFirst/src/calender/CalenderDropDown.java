package calender;

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Videos\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='imgdp']")).click();Thread.sleep(1000);
		
		int i=0;
		while(i==0) {
			String date=driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
			if(!date.equals("August 1990"))
				driver.findElement(By.xpath("//*[contains(text(),'Prev')]")).click();
			else
				break;
		}
		driver.findElement(By.xpath("//*[text()='3']")).click();
		
	}
}