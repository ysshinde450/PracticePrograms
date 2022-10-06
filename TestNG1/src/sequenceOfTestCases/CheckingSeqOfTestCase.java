package sequenceOfTestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckingSeqOfTestCase{

	public static WebDriver driver;
	@BeforeTest
	public void browserLaunch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Videos\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Test(priority = 1)
	public void verifyUrlPage() {
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url,"https://www.flipkart.com/");
		System.out.println("next line after hard assert");
	}

	@Test(priority = 2)
	public void varifyTitlePage() {
		String pagetxt = driver.findElement(By.cssSelector("._36KMOx")).getText();
		Assert.assertEquals(pagetxt, "Login");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}