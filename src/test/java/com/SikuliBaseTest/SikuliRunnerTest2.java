package com.SikuliBaseTest;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\Sikulix_testing.feature"},

			//	@CucumberOptions(features	= {"src\\test\\java\\com\\SikuliBaseTest\\Sikulix_testing.feature"},
				
		//tags 			    = {},
//		dryRun 			= false,
//		strict 			    = false,
//		monochrome = true,
//		format 			= {
//   									"pretty",
//   									"html:target/cucumber",
//   									"json:target/cucumber/cucumber.json"
//   									},
		glue 			    = {"com.SikuliBaseTest"}
)

public class SikuliRunnerTest2 {

}

