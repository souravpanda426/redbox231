package Scripts;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import java.util.Random;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utility.CommonMethods;






public class BaseTest implements IAutoConstant {
	
	
	public static WebDriver driver;
	public static ExtentReports reports;
	public static ExtentTest logger;
	
	
	
	
	@BeforeMethod
	
	public static void setUp() throws FileNotFoundException, IOException {
		
		
		Random r = new Random();
		Date d = new Date();
		reports = new ExtentReports(extentreportpath+r.nextInt()+ d +".html",true);
		logger = reports.startTest("mytest");
		

		
		String browserName = CommonMethods.getDataFromProperties("browser");
		System.out.println(browserName + "  browser launch ");
		if(browserName.equalsIgnoreCase("FireFox")) {
		
		System.setProperty("webdriver.gecko.driver",  geckdriverpath);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
         
		}
		else {
			
			//System.setProperty("webdriver.chrome.driver","/Users/sourav/git/repository12/MYNEWPROJECT/Resources/driver/chromedriver");
			
		    driver = new SafariDriver();
		}
			
		
		String url = CommonMethods.getDataFromProperties("url");
		driver.get(url);
		
		//driver.get("https://www.amazon.com/");
		//driver.get(url);
		//driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		
		
	
		
		
	}		
	
	
	
	@AfterMethod
	public void close(ITestResult result) throws IOException {
		
		
		
		
		
		
		if(result.getStatus()==ITestResult.FAILURE) {
			
			CommonMethods.takeScreeshot();
			logger.log(LogStatus.FAIL, "test case failed is"+result.getName());
			
			
			
		}
		
		else if(result.getStatus()==ITestResult.SUCCESS){
			
		logger.log(LogStatus.PASS, "test case passed is"+result.getName());
		
		}
		
		else if(result.getStatus()==ITestResult.SKIP) {
			logger.log(LogStatus.SKIP, "test case skipped is"+result.getName());
		}
		
		reports.flush();
		
		
	
		System.out.println("closing browser");
		
		driver.close();
		
		
		
	}
	
	
	
   


}
