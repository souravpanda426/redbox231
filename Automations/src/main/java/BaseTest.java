



import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class BaseTest {
	
	
	

	public static void main(String[] args) throws InterruptedException, IOException {
		
	System.setProperty("WebDriver.Chrome.driver","/Users/sourav/eclipse-workspace/Automations/src/main/resources/driver/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("selenium"+Keys.ENTER);
	/*List<WebElement> findElements = driver.findElements(By.tagName("a"));
	System.out.println(findElements.size());
	for(WebElement link:findElements) {
		
		System.out.println(link.getText());
		
	}*/
	
	driver.findElement(By.xpath("//h3[text()='Selenium']")).click();
	//driver.findElement(By.tagName("body")).sendKeys(Keys.COMMAND+"t");
	((JavascriptExecutor) driver).executeScript("window.open('about:blank','_blank');");
	
	TakesScreenshot ts = (TakesScreenshot) driver;
	
	File srcfile = ts.getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(srcfile,new File("/Users/sourav/eclipse-workspace/Automations/src/main/resources/Screenshot/screen"+srcfile.getName()));
	
	
		driver.close();	
		 
	}
}