package com.SikuliBaseTest;


import static org.junit.Assert.assertEquals;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import com.util.Util;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BasicOperationsSteps {
	Screen s = new Screen();
	
	public BasicOperationsSteps() {
	}
	
	@Given("^the calculator is opened$")
	public void the_calculator_is_opened() {
		Util.open();
	}

	@When("^I add two plus two$")
	public void i_add_two_plus_two() throws FindFailed {
		s.click("C:\\Users\\DarkMatter\\workspace\\SikuliSeleniumBDDAutomation\\patterncompare\\btn2.PNG");
		s.click("C:\\Users\\DarkMatter\\workspace\\SikuliSeleniumBDDAutomation\\patterncompare\\patterncomparetnPlus.PNG");
		s.click("C:\\Users\\DarkMatter\\workspace\\SikuliSeleniumBDDAutomation\\patterncompare\\btn2.PNG");
		s.click("C:\\Users\\DarkMatter\\workspace\\SikuliSeleniumBDDAutomation\\patterncompare\btnEquals.PNG");
	}

	@Then("^the result should be four$")
	public void the_result_should_be_four() throws FindFailed {
		assertEquals(true, s.find("C:\\Users\\DarkMatter\\workspace\\SikuliSeleniumBDDAutomation\\patterncompare\\result4.PNG") != null ? true : false);
	}
	
	@When("^I subtract five from ten$")
	public void i_subtract_five_from_ten() throws FindFailed {
		s.click("C:\\Users\\DarkMatter\\workspace\\SikuliSeleniumBDDAutomation\\patterncompare\\btn1.PNG");
		s.click("C:\\Users\\DarkMatter\\workspace\\SikuliSeleniumBDDAutomation\\patterncompare\\btn0.PNG");
		s.click("C:\\Users\\DarkMatter\\workspace\\SikuliSeleniumBDDAutomation\\patterncompare\\btnMinus.PNG");
		s.click("C:\\Users\\DarkMatter\\workspace\\SikuliSeleniumBDDAutomation\\patterncompare\\btn5.PNG");
		s.click("C:\\Users\\DarkMatter\\workspace\\SikuliSeleniumBDDAutomation\\patterncompare\\btnEquals.PNG");
	}

	@Then("^the result should be five$")
	public void the_result_should_be_five() throws FindFailed {
	    assertEquals(true, s.find("C:\\WorkSpace\\imademethink_sikulix_automation\\patterncompare\\result5.PNG") != null ? true : false);
	}
	
	@When("^I multiply five times five$")
	public void i_multiply_five_times_five() throws FindFailed {
		s.click("C:\\WorkSpace\\imademethink_sikulix_automation\\patterncompare\\btn5.PNG");
		s.click("C:\\WorkSpace\\imademethink_sikulix_automation\\patterncompare\\btnMultiply.PNG");
		s.click("C:\\WorkSpace\\imademethink_sikulix_automation\\patterncompare\\btn5.PNG");
		s.click("C:\\WorkSpace\\imademethink_sikulix_automation\\patterncompare\\btnEquals.PNG");
	}

	@Then("^the result should be twenty five$")
	public void the_result_should_be_twenty_five() throws FindFailed {
		assertEquals(true, s.find("C:\\Users\\DarkMatter\\workspace\\SikuliSeleniumBDDAutomation\\patterncompare\\result25.PNG") != null ? true : false);
	}
	
	@When("^I divide twenty five by five$")
	public void i_divide_twenty_five_by_five() throws FindFailed {
		s.click("C:\\Users\\DarkMatter\\workspace\\SikuliSeleniumBDDAutomation\\patterncompare\\btn2.PNG");
		s.click("C:\\Users\\DarkMatter\\workspace\\SikuliSeleniumBDDAutomation\\patterncompare\\btn5.PNG");
		s.click("C:\\Users\\DarkMatter\\workspace\\SikuliSeleniumBDDAutomation\\patterncompare\\btnDivide.PNG");
		s.click("C:\\Users\\DarkMatter\\workspace\\SikuliSeleniumBDDAutomation\\patterncompare\\btn5.PNG");
		s.click("C:\\Users\\DarkMatter\\workspace\\SikuliSeleniumBDDAutomation\\patterncompare\\btnEquals.PNG");
	}
}