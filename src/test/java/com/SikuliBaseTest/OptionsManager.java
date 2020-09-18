package com.SikuliBaseTest;
import java.io.File;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class OptionsManager {
	//Get Chrome Options
    public static ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-popup-blocking");
        //options.addArguments("--incognito");
        return options;
    }
 
    //Get Firefox Options
    public static FirefoxOptions getFirefoxOptions () {
        FirefoxOptions options = new FirefoxOptions();
        //FirefoxProfile profile = new FirefoxProfile();
       
		options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        FirefoxProfile profile=new FirefoxProfile(new File("C://Users//DarkMatter//AppData//Roaming//Mozilla//Firefox//Profiles"));
		
        //Accept Untrusted Certificates
        profile.setAcceptUntrustedCertificates(true);
        profile.setAssumeUntrustedCertificateIssuer(false);
       // profile.setPreference(key, value);
        
        //Use No Proxy Settings
        //profile.setPreference("network.proxy.type", 0);
        //Set Firefox profile to capabilities
        options.setProfile(profile);
        return options;
    }
}


