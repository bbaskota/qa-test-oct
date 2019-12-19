package automationForNewTours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

public class AutomationForNewToursTest extends AutomationForNewToursScripts {


	
	@BeforeMethod
	public void launchingBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeBrowser\\chromedriver.exe");	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.addArguments("disable-extensions");
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver() ;	
		
	}
	
	

}
