package appHooks;

import java.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {
	 
	//private static DriverFactory driverFactory;
	 //private static WebDriver driver;
	 ConfigReader configReader;
	 Properties prop;
	 
	 @Before (order = 0)
	 public void setup()
	 {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		 String browserName = prop.getProperty("browser");
		 //driverFactory = new DriverFactory();
		 DriverFactory.setupdriver(browserName);
		 System.out.println("browserName : "+browserName);
		// driver = DriverFactory.getDriver();
	 } 
	 
	 @Before (order = 1)
	 public void getbrowser()
	 {
		 DriverFactory.getDriver();
	 }
	
	/*@After(order = 0)
		
		public void after() {
			
		//driver.quit();
		}*/
		
	@After(order = 1)
		
		public void tearDown(Scenario scenario)
		
		{
			if(scenario.isFailed()) {
				
				String screenshotName = scenario.getName().replaceAll(" ", " ");
				byte [] sourcepath = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
				scenario.attach(sourcepath,"image/png",screenshotName);
					
				}
			
		}
	 
	 
}