package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyAndPaste {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.edge.driver",
				"D:\\Testing Videos\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement first=driver.findElement(By.xpath("//*[@name='firstname']"));
		WebElement last =driver.findElement(By.xpath("//*[@name='lastname']"));
		Actions action=new Actions(driver);
		action.sendKeys(first,"Yogesh").keyDown(Keys.CONTROL).sendKeys("a").keyDown(Keys.CONTROL).build().perform();
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
		last.click();
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}
}