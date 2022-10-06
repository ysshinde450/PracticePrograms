package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Testing Videos\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(500);
		driver.findElement(By.id("btnLogin")).click();
		/*
		 * driver.findElement(By.linkText("Admin")).click();
		 * driver.findElement(By.linkText("User Management")).click();
		 * driver.findElement(By.linkText("Users")).click(); Thread.sleep(500);
		 * driver.findElement(By.xpath(
		 * "//a[contains(text(),'Mujeeb')]//parent::td//preceding-sibling::td//input[@id='ohrmList_chkSelectRecord_56']"
		 * )).click();
		 *
		 */
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div/div/a[2]")).click();
		
	
	}
}