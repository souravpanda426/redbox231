import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Scripts.BaseTest;

public class SampleTwo extends BaseTest{
	
	//https://demoqa.com/droppable
	
	@Test
	public void execute() {
		Actions a = new Actions(driver);
		a.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).build().perform();
		System.out.println();
		
	}

}
