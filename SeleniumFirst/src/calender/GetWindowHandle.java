package calender;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Testing Videos\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize(); 
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
		Thread.sleep(500);
		String s1=driver.getWindowHandle();
		driver.findElement(By.linkText("CHARTER TRAIN")).click();
		Set<String> s2=driver.getWindowHandles();
		Thread.sleep(500);
		for(String temp:s2) {
			if(!s2.equals(s1))
			driver.switchTo().equals(s2);
			driver.findElement(By.xpath("//*[text()='Terms & Conditions']")).click();
		}
		driver.switchTo().equals(s1);
		driver.findElement(By.linkText("MORE")).click();
		}
}
