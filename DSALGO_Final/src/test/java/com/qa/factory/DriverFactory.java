package com.qa.factory;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public static WebDriver driver;
	
		
	//public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal();
	
	public static WebDriver init_driver(String browser) {
				
	
		System.out.println("browser value is:"+browser);
		
		if(browser.equalsIgnoreCase("CHROME")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			//tlDriver.set(new ChromeDriver());
		}
		 
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			//tlDriver.set(new FirefoxDriver());
	}
		else {
			System.out.println("Please pass the correct browser value:"+ browser);
		}
		
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return getDriver();
		
		}
		public static void openpage(String URL) {
		
			getDriver().get(URL);
		}
		public static WebDriver getDriver() {
			return driver;
		}
		
		public static String getdriverTitle() {
			return getDriver().getTitle();
		}
		
		//public static String getText() {
			//return getText();	
		
		public static void setupdriver(String browser) {
			if (getDriver() == null )
			{
				init_driver(browser); 
			}
		}
		
		public static void openPage(String url) {
		//	LoggerLoad.info("current page :"+url);
			getDriver().get(url);
		}
		
		public static void navigateback() {
			
			driver.navigate().back();
		}
	
		public static void refresh() {
			driver.navigate().refresh();
		}
		
		public static void getAlertMsg() {
			driver.switchTo().alert().accept();
		}
		}