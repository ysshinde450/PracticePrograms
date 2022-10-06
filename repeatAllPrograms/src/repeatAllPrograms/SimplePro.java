package repeatAllPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimplePro {

	static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");*/
		 try
	        { 
	                Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"java -version\"");
	        }
	        catch (Exception e)
	        {
	            System.out.println("Something went wrong");
	            e.printStackTrace();
	        }
	}

}
