package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Testing Videos\\chromedriver.exe");
		 driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	WebElement element=driver.findElement(By.xpath("//*[contains(text(),'right click me')]"));
	
	Actions action=new Actions(driver);
	action.contextClick(element).build().perform();
	WebElement element1=driver.findElement(By.xpath("//*[text()='Double-Click Me To See Alert']"));
	action.doubleClick(element1).build().perform();
	}	
}