package calender;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice { // Birth date selection using List<WebElement>

	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\Testing Videos\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		
		Thread.sleep(5000);
		
		System.setProperty("webdriver.edge.driver","D:\\Testing Videos\\msedgedriver.exe");	
		WebDriver driver1 = new EdgeDriver();
		driver1.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		List<WebElement> days=driver.findElements(By.xpath("//select[@title='Day']//option"));
		for(WebElement  day:days)
			if(day.getText().equals("19"))
				day.click();
		List<WebElement> months=driver.findElements(By.xpath("//select[@title='Month']//option"));
		for(WebElement  month:months)
			if(month.getText().equals("Jul"))
				month.click();
		List<WebElement> years=driver.findElements(By.xpath("//select[@title='Year']//option"));
		for(WebElement  year:years)
			if(year.getText().equals("1991"))
				year.click();
					
	}
}