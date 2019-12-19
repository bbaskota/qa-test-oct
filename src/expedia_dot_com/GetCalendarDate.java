package expedia_dot_com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GetCalendarDate {

	static WebDriver driver = null;
	@BeforeMethod

static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeBrowser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://yuilibrary.com/yui/docs/calendar/calendar-simple.html");
		driver.manage().window().maximize();
		selectDateOnCalender("28");
		

	}

	@Test(enabled = true, description = "hello this is test", priority = 1)
	public static void selectDateOnCalender(String myDate){
		
		List<WebElement> calender = driver.findElements(By.xpath("//table[@class ='calendar_col2 yui3-calendar-day']//td"));
		for (WebElement webElement : calender) {
			String newValue = webElement.getText();
			if (newValue.equalsIgnoreCase(myDate)) {
				webElement.click();
				break;
			}
			
		}
		
	}
	
	
	
}
