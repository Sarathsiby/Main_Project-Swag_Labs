package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base_Class {
	
	public WebDriver driver;
	String baseurl="https://www.saucedemo.com/";
	
	ExtentHtmlReporter report;
	protected ExtentTest test;
	protected ExtentReports extent;
	
	@BeforeTest
	public void setup()
	{
		report= new ExtentHtmlReporter("./report/myreport.html");
		report.config().setDocumentTitle("Automation Testing");
		report.config().setReportName("Functional Testing");
		report.config().setTheme(Theme.DARK);
		
		extent= new ExtentReports();
		extent.attachReporter(report);
		
		extent.setSystemInfo("Hostname", "Localhost");
		extent.setSystemInfo("OS", "Windows");
		extent.setSystemInfo("Testername", "Sarath");
		extent.setSystemInfo("Browser", "Edge");
	
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(baseurl);
	}
	
	@AfterMethod
	public void browserclose(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "Test case failed"+result.getName());
			test.log(Status.FAIL, "Test case failed"+result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "Test case skipped"+result.getName());
			test.log(Status.SKIP, "Test case skipped"+result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "Test case passed"+result.getName());
		}
	
	}
		@AfterTest
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	            extent.flush();
	        }
	}
//	public static WebDriver driver;
//	@BeforeTest
//	public void base() {
//		WebDriverManager.edgedriver().setup();
//		driver=new EdgeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.saucedemo.com/");
//	}
//	 @AfterTest
//	    public void tearDown() {
//	        if (driver != null) {
//	            driver.quit();
//	        }
//	    }
}
