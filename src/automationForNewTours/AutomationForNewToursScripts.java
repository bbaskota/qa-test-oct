
package automationForNewTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutomationForNewToursScripts {
	
	static WebDriver  driver = null;
	
	public static void main(String[] args) {	
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeBrowser\\chromedriver.exe");	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("disable-infobars");
	options.addArguments("disable-extensions");
	options.addArguments("--start-maximized");
	WebDriver driver = new ChromeDriver() ;
	driver.get("http://newtours.demoaut.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
	System.out.println("*****Registration link clicked *******");
	FillContactInformation();
	CreateUsernameAndPassword();
	}
	
	public static  void FillContactInformation(){
		driver.findElement(By.xpath("//*[@name = 'firstName']")).sendKeys("bashu");
		driver.findElement(By.xpath("//*[@name = 'lastName']")).sendKeys("baskota");
		driver.findElement(By.xpath("//*[@name = 'phone']")).sendKeys("4084315333");
		driver.findElement(By.xpath("//*[@name = 'userName']")).sendKeys("bashu.baskot@gmail.com");
	}
	
	public  static void CreateUsernameAndPassword(){
		driver.findElement(By.xpath("//*[@name = 'email']")).sendKeys("bbaskota");
		driver.findElement(By.xpath("//*[@name = 'password']")).sendKeys("bashu123");
		driver.findElement(By.xpath("//*[@name = 'confirmPassword']]")).sendKeys("bashu123");
		
		
	}
	
	

}

