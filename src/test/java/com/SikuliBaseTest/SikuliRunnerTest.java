package com.SikuliBaseTest;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.codeborne.selenide.Configuration;

import java.net.URL;


import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

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


}

