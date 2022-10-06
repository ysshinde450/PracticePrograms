package repeatAllPrograms;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
		// simple alert
		driver.findElement(By.id("alertBox")).click();
		Alert simpleAlert = driver.switchTo().alert();
		System.out.println(simpleAlert.getText());
		simpleAlert.accept();
		Thread.sleep(10000);

		// Confirmation alert
		driver.findElement(By.id("confirmBox")).click();
		Alert confirmationAlert = driver.switchTo().alert();
		System.out.println(confirmationAlert.getText());
		Thread.sleep(5000);
		confirmationAlert.accept();
		Thread.sleep(1000);
		
		JavascriptExecutor execute = (JavascriptExecutor) driver;
		execute.executeScript("window.scrollBy(0,100)", "");
		
		// Prompt alert
		driver.findElement(By.id("promptBox")).click();
		Alert promptAlert = driver.switchTo().alert();
		Thread.sleep(5000);
		promptAlert.sendKeys("Yogesh Shinde");
		promptAlert.accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		Thread.sleep(5000);
		driver.quit();
	}
}