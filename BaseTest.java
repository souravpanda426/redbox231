package Scripts;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;






public class BaseTest {
	
	
	public static WebDriver driver;
	public static ExtentReports reports;
	public static ExtentTest logger;
	
	
	
	
	@BeforeMethod
	
	public static void setUp() throws FileNotFoundException, IOException {
		
		
		Random r = new Random();
		Date d = new Date();
		
		
		reports = new ExtentReports("/Users/sourav/git/repository12/MYNEWPROJECT/test-output/ExtentReports/extreport"+r.nextInt()+ d +".html",true);
		logger = reports.startTest("amazontestone");
		

		
		Properties property = new Properties();
		property.load(new FileInputStream("/Users/sourav/git/repository12/MYNEWPROJECT/Resources/configuration.properties"));
		Object object = property.get("browser");
		String string = object.toString();
		System.out.println(string);
		if(string.equalsIgnoreCase("FireFox")) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/sourav/git/repository12/MYNEWPROJECT/src/driver/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();

	    
		//driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.get("https://www.amazon.com/");
		//driver.get("https://www.youtube.com/");
		}
		
	
		
		else {
			System.exit(0);
		}
			
	}
	
	
	@AfterMethod
	public void close(ITestResult result) throws IOException {
		
		
		
		
		
		
		if(result.getStatus()==ITestResult.FAILURE) {
			
			CommonMethods.takeScreeshot();
			logger.log(LogStatus.FAIL, "test case failed is"+result.getName());
			
			
			
		}
		
		else if(result.getStatus()==ITestResult.SUCCESS){
			
		logger.log(LogStatus.PASS, "test case failed is"+result.getName());
		
		}
		
		else if(result.getStatus()==ITestResult.SKIP) {
			logger.log(LogStatus.SKIP, "test case skipped is"+result.getName());
		}
		
		reports.flush();
		
		
		
		
		
		
	}
	
	@AfterTest
	public void closeReport() throws IOException {
		
		
		
		driver.close();
	}

}
