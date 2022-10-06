package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Videos\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		Thread.sleep(5000);
		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		Thread.sleep(5000);
		WebElement slide= driver.findElement(By.id("slider"));
		Actions action = new Actions(driver);
		action.clickAndHold(slide).perform();
		Thread.sleep(500);
		action.moveToElement(slide).perform();
	}

}
