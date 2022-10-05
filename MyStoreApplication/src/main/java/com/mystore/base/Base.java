package com.mystore.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

import com.mystore.actiondriver.Action;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	public static Properties prop;
	
	
	@BeforeTest
	public void loadConfig() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\Configuration\\Config.properties");
			prop.load(ip);
			System.out.println("Driver: "+driver);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void launchApp() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		String  browsername = prop.getProperty("browser");
		if(browsername.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		} else if(browsername.contains("IE")) {
			WebDriverManager.chromedriver().setup();
			driver = new EdgeDriver();
		} 
			
        driver.get(prop.getProperty("url"));
		Action.pageLoad(driver, 12);
		Action.implicitWait(driver,9);
		
	}
	
}
