package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Testing Videos\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://irctc.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Contact Us")).click();Thread.sleep(1000);
		WebElement element=driver.findElement(By.xpath("//*[@class='goog-te-combo']//*[contains(text(),'Hindi')]"));
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,400)","");
		Thread.sleep(1000);
		element.click();
		
	}

}
