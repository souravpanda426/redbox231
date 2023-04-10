import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Scripts.BaseTest;

public class HandlingFrames extends BaseTest{
	
	//https://ui.vision/demo/webtest/frames/
	
	
	private HandlingFrames() {
		
		
	}
	@Test
	public void handlingMultipleFrames() {
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_1.html']")));
		driver.switchTo().frame(0);
		driver.findElement(By.name("mytext1")).sendKeys("hello");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.name("mytext2")).sendKeys("helloworld");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.findElement(By.name("mytext3")).sendKeys("myhelloworld");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[.='Sign in to Google']")).click();
		
		
		//mytext2
	
	}

}
