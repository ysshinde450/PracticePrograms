import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FirstScript {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Testing Videos\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	      //implicit wait
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	      //launch application
	      driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
	      WebElement m=driver.findElement(By.xpath("//input[@type='file']"));
	      m.sendKeys("C:\\Users\\user\\Downloads\\WhatsApp Image 2021-05-03 at 12.00.31 PM.jpeg");
		
		;
	}
}