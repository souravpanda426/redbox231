package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Gmail extends BaseTest{

	
	
	@Test(invocationCount=1)
	public void gmail() throws InterruptedException {
		/*WebDriverWait ww = new WebDriverWait(driver,10);
		ww.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("identifierId"))));
		driver.findElement(By.id("identifierId")).sendKeys("panda.sourav426@gmail.com");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[@aria-label='Try again']")).click();
		Thread.sleep(8000);
		driver.findElement(By.id("identifierId")).sendKeys("panda.sourav426@gmail.com");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		*/
		Thread.sleep(8000);
		driver.findElement(By.id("identifierId")).sendKeys("panda.sourav426@gmail.com");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[@aria-label='Try again']")).click();
		driver.findElement(By.id("identifierId")).sendKeys("panda.sourav426@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123@SOUrav");
		
		
	}
}
