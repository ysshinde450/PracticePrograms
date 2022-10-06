package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Videos\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement element=driver.findElements(By.xpath("//*[@class=\"block13 ui-draggable\"]")).get(1);
		Thread.sleep(1000);
		WebElement destElem=driver.findElement(By.xpath("//*[@id=\"amt7\"]"));
		Thread.sleep(1000);
		element.click();
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.dragAndDrop(element,destElem).perform();
		}
	

}
