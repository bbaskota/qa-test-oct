package expedia_dot_com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingExpediaAndBookAFlight {

	static WebDriver driver = null;
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeBrowser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.expedia.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SelectOrigin("DFW");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SelectDestination("JFK");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SelectDepartDate("28");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SelectReturnDate("12");
		
		
		
		
	}
	
	public  static void SelectOrigin(String city){
		WebElement origin = driver.findElement(By.xpath("//*[@id='package-origin-hp-package']"));	
		origin.sendKeys(city);
		origin.sendKeys(Keys.ENTER);
	}
	
	
	public static void SelectDestination(String destCity){
		
		WebElement destination = driver.findElement(By.xpath(" //*[@id='package-destination-hp-package']"));
		destination.sendKeys(destCity);
		destination.sendKeys(Keys.ENTER);
		
		
	}
	
	
	public static void SelectDepartDate(String myDepartDate){
		
		 driver.findElement(By.xpath("//*[@id='package-departing-hp-package']")).click();;
		
		List<WebElement> calDate = driver.findElements(By.xpath("//*[@class='datepicker-dropdown']"));
		
		for (WebElement webElement : calDate) {
			
			String newvalue = webElement.getText();
			if (newvalue.equalsIgnoreCase(myDepartDate)) {
				webElement.click();
				break;
			}
		}
		
		
	}
	
	
	public static void SelectReturnDate(String ReturnDate){
		
		 driver.findElements(By.xpath("//*[@id='package-returning-hp-package']"));
		 
		 List <WebElement> returnda = driver.findElements(By.xpath("//*[@class='datepicker-dropdown']"));
		
		for (WebElement rdate : returnda) {
			String newDate = rdate.getText();
			if (newDate.equalsIgnoreCase(ReturnDate)) {
				rdate.click();
				break;
			}
		}
		
	}
	
	
	

}
