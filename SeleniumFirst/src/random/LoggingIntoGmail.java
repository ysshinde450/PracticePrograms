package random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoggingIntoGmail {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Testing Videos\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(
				"https://accounts.google.com/v3/signin/identifier?dsh=S-33092905%3A1664173400867567&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%26ogbl%2F&emr=1&ltmpl=default&ltmplcache=2&osid=1&passive=true&rm=false&scc=1&service=mail&ss=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQDHYWrsZfRePIFiDXvwfTblN2V9ZCM5Va18PM-Xvr55cHie90URy5aozk0fPs6mPAXt9iwVOOgANA");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@autocomplete='username']")).sendKeys("ysshinde450");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@jsname='LgbsSe'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@autocomplete='current-password']")).sendKeys("MyGmail@450");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Next']")).click();
	}

}
