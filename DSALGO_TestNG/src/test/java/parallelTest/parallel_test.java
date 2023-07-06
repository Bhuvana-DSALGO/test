package parallelTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallel_test {
	public class ParallelTest {

		WebDriver driver;

		@Test(priority = 1)
		public void testChrome() throws InterruptedException {
		System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://dsportalapp.herokuapp.com");
		driver.manage().window().maximize();
		//Assert.assertEquals(driver.getTitle(), "NumpyNinja");
		}

		@Test(priority = 2)
		public void testFirefox() throws InterruptedException {
		System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://dsportalapp.herokuapp.com");
		driver.manage().window().maximize();
		//Assert.assertEquals(driver.getTitle(), "NumpyNinja"); 
		}

		@AfterClass
		public void close() {
		driver.quit();
		} 
		}

}
