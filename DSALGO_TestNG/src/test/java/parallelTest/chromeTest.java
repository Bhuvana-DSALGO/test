package parallelTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class chromeTest {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://dsportalapp.herokuapp.com/");
	driver.manage().window().maximize();
	}	
	
	@Test(priority = 1)
	public void getsarted() throws InterruptedException {
		
		//Register
		driver.findElement(By.xpath("//button[@class='btn']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[text()=' Register ']")).click();
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Niha");
		//driver.findElement(By.xpath("//input[@name='password1']")).sendKeys("1357@KAB");
		//driver.findElement(By.xpath("//input[@name='password2']")).sendKeys("1357@KAB");
		//driver.findElement(By.xpath("//input[@value='Register']")).click();
	}
	@Test(priority = 2)
	public void login() throws InterruptedException {
		//Login
		driver.findElement(By.xpath("//*[text()='Sign in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Niha");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1357@KAB");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		//driver.findElement(By.xpath("//*[text()='Login']")).click();
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		
	}
	@Test(priority = 3)
	public void datastructures() throws InterruptedException {
		//Data Structures
		//driver.findElement(By.xpath("//form/input[@value='Login']")).click();
		driver.findElement(By.xpath("//h5[text()='Data Structures-Introduction']/..//a")).click();
		driver.findElement(By.xpath("//*[text()='Time Complexity']")).click();
		driver.findElement(By.xpath("//*[text()='Try here>>>']")).click();
		
		//o/p
		
		driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("print'Hello'");
		driver.findElement(By.xpath("//*[text()='Run']")).click();
		System.out.println(driver.findElement(By.xpath("//div/pre[@id='output']")).getText());
		driver.navigate().refresh();
				
		//invalid i/p
				
		driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("Hi");
		driver.findElement(By.xpath("//*[text()='Run']")).click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		driver.navigate().back();
			
	}	
		
	@Test(priority = 4)
	public void arrays() throws InterruptedException {	
		//Dropdown
		driver.findElement(By.xpath("//a[@data-toggle='dropdown']")).click();
		
		//Arrays in python
		driver.findElement(By.xpath("//*[text()='Arrays']")).click();
		driver.findElement(By.xpath("//*[text()='Arrays in Python']")).click();
		driver.findElement(By.xpath("//*[text()='Try here>>>']")).click();
							
		//o/p
		driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("print'Hello'");
		driver.findElement(By.xpath("//*[text()='Run']")).click();
		System.out.println(driver.findElement(By.xpath("//div/pre[@id='output']")).getText());
		driver.navigate().refresh();
		
		//invalid i/p
		driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("Hi");
		driver.findElement(By.xpath("//*[text()='Run']")).click();
		Thread.sleep(1000);
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		driver.navigate().back();
	}
		
		@Test(priority = 5)
		public void arrays_sm1() throws InterruptedException {	
		//Arrays using list
		driver.findElement(By.xpath("//*[text()='Arrays Using List']")).click();
		driver.findElement(By.xpath("//*[text()='Try here>>>']")).click();
		
		//o/p
		driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("print'Array List'");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		System.out.println(driver.findElement(By.xpath("//pre[@id='output']")).getText());
		driver.navigate().refresh();
				
		//invalid i/p
		
		driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("Hi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Run']")).click();
		Alert b = driver.switchTo().alert();
		System.out.println(b.getText());
		b.accept();
		driver.navigate().back();
		}
		
		@Test(priority = 5)
		public void arrays_sm2() throws InterruptedException {	
		//Basic operation
		driver.findElement(By.xpath("//*[text()='Basic Operations in Lists']")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-info']")).click();
		
		//o/p
		driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("print'Basic operation'");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		System.out.println(driver.findElement(By.xpath("//pre[@id='output']")).getText());
		driver.navigate().refresh();
		
		//invalid i/p
		
		driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("Hi");
		driver.findElement(By.xpath("//*[text()='Run']")).click();
		Alert c = driver.switchTo().alert();
		System.out.println(c.getText());
		c.accept();
		driver.navigate().back();
		}
		
		@Test(priority = 6)
		public void arrays_sm3() throws InterruptedException {	
		//Application of Array
		driver.findElement(By.xpath("//*[text()='Applications of Array']")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-info']")).click();
		
		//o/p
		driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("print'Application of Array'");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		System.out.println(driver.findElement(By.xpath("//pre[@id='output']")).getText());
		driver.navigate().refresh();
		
		//invalid i/p
		
		driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("Hi");
		driver.findElement(By.xpath("//*[text()='Run']")).click();
		Alert d = driver.switchTo().alert();
		System.out.println(d.getText());
		d.accept();
		driver.navigate().back();
			
		}
	
	@Test(priority = 7)
	public void arrays_PQ1() throws InterruptedException {	
	
		//practice Ques
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Practice Questions']")).click();
		
		//search the array-pq1
		driver.findElement(By.xpath("//*[text()='Search the array']")).click();
				
		//o/p
		
		WebElement t = driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea"));
		String s = Keys.chord(Keys.CONTROL,"a");
		t.sendKeys(s);
		t.sendKeys(Keys.DELETE);
		t.sendKeys("print 'pq1'");
		driver.findElement(By.className("button")).click();
		//driver.findElement(By.xpath("//div//input[@value='Submit']")).click();//submit
		//driver.findElement(By.xpath("//button[@type='button']")).click();
		System.out.println(driver.findElement(By.xpath("//pre[@id='output']")).getText());
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("Hi");
		driver.findElement(By.xpath("//*[text()='Run']")).click();
		Alert e = driver.switchTo().alert();
		System.out.println(e.getText());
		e.accept();
		driver.navigate().back();
	}
	
		@Test(priority = 8)
		public void arrays_PQ2() throws InterruptedException {	
		//pq-2
		
		driver.findElement(By.xpath("//*[text()='Max Consecutive Ones']")).click();
		
		//o/p
		
		WebElement t1 = driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea"));
		String s1 = Keys.chord(Keys.CONTROL,"a");
		t1.sendKeys(s1);
		t1.sendKeys(Keys.DELETE);
		t1.sendKeys("print 'pq2'");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		System.out.println(driver.findElement(By.xpath("//pre[@id='output']")).getText());
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("Hi");
		driver.findElement(By.xpath("//*[text()='Run']")).click();
		Alert f = driver.switchTo().alert();
		System.out.println(f.getText());
		f.accept();
		driver.navigate().back();
		}
		
		@Test(priority = 9)
		public void arrays_PQ3() throws InterruptedException {	
		//pq-3
				
		driver.findElement(By.xpath("//*[text()='Find Numbers with Even Number of Digits']")).click();
				
		//o/p
				
		WebElement t2 = driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea"));
		String s2 = Keys.chord(Keys.CONTROL,"a");
		t2.sendKeys(s2);
		t2.sendKeys(Keys.DELETE);
		t2.sendKeys("print 'pq3'");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		System.out.println(driver.findElement(By.xpath("//pre[@id='output']")).getText());
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("Hi");
		driver.findElement(By.xpath("//*[text()='Run']")).click();
		Alert g = driver.switchTo().alert();
		System.out.println(g.getText());
		g.accept();
		driver.navigate().back();
		}
		
		@Test(priority = 10)
		public void arrays_PQ4() throws InterruptedException {	
		//pq-4
						
		driver.findElement(By.xpath("//*[text()='Squares of  a Sorted Array']")).click();
						
		//o/p
						
		WebElement t4 = driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea"));
		String s3 = Keys.chord(Keys.CONTROL,"a");
		t4.sendKeys(s3);
		t4.sendKeys(Keys.DELETE);
		t4.sendKeys("print 'pq4'");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		System.out.println(driver.findElement(By.xpath("//pre[@id='output']")).getText());
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("Hi");
		driver.findElement(By.xpath("//*[text()='Run']")).click();
		Alert h = driver.switchTo().alert();
		System.out.println(h.getText());
		h.accept();
						
		driver.navigate().back();
		Thread.sleep(3000);

	}
	 
	@AfterTest
	public void tearDown() {
	driver.close();
	}
	}
	

