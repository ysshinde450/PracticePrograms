package calender;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChildPop {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Videos\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://groww.in/");
		driver.manage().window().maximize();
		String str = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[text()='Login/Register']")).click();
		Thread.sleep(1000);
		Set<String> allWin=driver.getWindowHandles();
		int size=allWin.size();
		if(size>1) {
			for(String elem:allWin) {
				if(!(elem.equals(str))) {
				driver.switchTo().equals(elem);
				driver.findElement(By.xpath("//input[@id='login_email1']")).sendKeys("Yogesh");
				}
			}
		}
		else
			driver.findElement(By.xpath("//input[@id='login_email1']")).sendKeys("Yogesh");
	}
}