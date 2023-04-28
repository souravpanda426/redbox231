import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Scripts.BaseTest;

public class SampleFour extends BaseTest{
	
	
	@Test
	
	public void g() throws InterruptedException {
		
		
		WebElement ele = driver.findElement(By.id("userName"));
		WebElement findElement = driver.findElement(By.id("currentAddress"));
		ele.sendKeys("my name");
		ele.click();
		ele.sendKeys(Keys.CONTROL+"A");
		ele.sendKeys(Keys.CONTROL+"C");
		
		
		
	
		findElement.click();
		findElement.sendKeys(Keys.CONTROL+"V");
		Thread.sleep(5000);
	}

}
