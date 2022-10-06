
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumPra {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Videos\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> elements= driver.findElements(By.xpath("//*[@class='dataTable']//following-sibling::tbody//tr//tr[1]"));
		System.out.println("rows "+elements.size());
		
	/**	driver.findElement(By.xpath("//*[text()='First name']//following-sibling::input")).sendKeys("Yogesh");
		driver.findElement(By.xpath("//*[text()='Surname']//following-sibling::input")).sendKeys("Shinde");
		driver.findElement(By.xpath("//*[text()='Phone number or email address']//following-sibling::div//input")).sendKeys("yshinde454@gmail.com");
		driver.findElement(By.xpath("//*[text()='Male']//preceding-sibling::input")).click();
		WebElement elem1=driver.findElement(By.xpath("//*[@class='bs']//child::select[3]"));
		Select select1 = new Select(elem1);
		select1.selectByValue("1990");
		WebElement elem2=driver.findElement(By.xpath("//*[@class='bs']//child::select[2]"));
		Select select2 = new Select(elem2);
		select2.selectByVisibleText("Aug");
		WebElement elem3=driver.findElement(By.xpath("//*[@class='bs']//child::select[1]"));
		Select select3 = new Select(elem3);
		select3.selectByIndex(3);
		driver.findElement(By.xpath("//*[text()='New password']//following-sibling::div//input")).sendKeys("Yogesh@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='signup_policy']//following-sibling::div//input")).click();*/
	}
}