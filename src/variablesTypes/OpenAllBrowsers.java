package variablesTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAllBrowsers {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeBrowser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://accounts.google.com");
//		driver.findElement(By.cssSelector("#identifierId")).clear();
//		driver.findElement(By.cssSelector("#identifierId")).sendKeys("bashu.geko");
//		driver.findElement(By.xpath("//*[@id='identifierNext']/content")).click();
//		//driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("");
		
		driver.get("https://www.phptravels.net/");
		driver.findElement(By.cssSelector("#body-section > section > div.cell > div > div > div.col-md-12 > ul > li.text-center.active > a")).click();
		driver.findElement(By.xpath("//*[@id='s2id_location_from']/a/span[1] ")).sendKeys("DFW");
		driver.findElement(By.cssSelector(" #flights > form > div.bgfade.col-md-3.col-xs-12.search-button > button")).click();
		
		
				

	}

}
