package runner;

import java.net.URL;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.codeborne.selenide.Configuration;
import com.cucumber.listener.Reporter;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import managers.FileReaderManager;

@RunWith(Cucumber.class)

@CucumberOptions(features = {"src/test/resources/BasicOperations.feature"},

			tags  = {},
			dryRun 	= false,			
			monochrome = true,
			//format	= {	"pretty","html:target/cucumber","json:target/cucumber/cucumber.json"											},
			glue  = {"com.SikuliBaseTest"},
			plugin =  { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"} )


public class SikuliRunnerTest {
	
	@BeforeTest
	public void runTestOnDocker() throws Exception {
		/*
		 * Configuration.remote = "http://localhost:4444/wd/hub"; Configuration.browser
		 * = "firefox"; Configuration.browserSize = "1920x1080";
		 * Configuration.browserCapabilities = new DesiredCapabilities();
		 * DesiredCapabilities capabilities = new DesiredCapabilities();
		 * capabilities.setCapability("enableVNC", true);
		 * 
		 * //capabilities.setCapability(capabilities: "enableVideo", value: true);
		 * 
		 * WebDriver driver = null; // Get URL driver.get("https://www.google.com/"); //
		 * Print Title System.out.println(driver.getTitle());
		 */
	}
	
	
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(FileReaderManager.getInstance().getConfigFileReader().getReportConfigPath());
		Reporter.setSystemInfo("User name", System.getProperty("user.name"));
		Reporter.setSystemInfo("TimeZone", System.getProperty("user.timeZone"));
		Reporter.setSystemInfo("Machine", 	"Windows 10" + "64 Bit");
		Reporter.setSystemInfo("Selenium", "3.141.59");
		Reporter.setSystemInfo("Maven", "3.6.3");
		Reporter.setSystemInfo("Java Version", "1.8.0_261");
	}
}





