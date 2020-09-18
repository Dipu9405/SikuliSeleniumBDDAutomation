package com.SikuliBaseTest;


	
	
	public class FirstTest2 extends TestBase {
	   
	    public void GOOGLE1() {
	        System.out.println("Google1 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
	        getDriver().navigate().to("http://www.google.com");
	        System.out.println("Google1 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: " +  Thread.currentThread().getId());
	       
	        System.out.println("Google1 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
	    }

}
