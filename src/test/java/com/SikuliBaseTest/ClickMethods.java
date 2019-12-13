package com.SikuliBaseTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;

//import net.sourceforge.tess4j.Tesseract1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.basics.Settings;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.ObserveEvent;
import org.sikuli.script.ObserverCallBack;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;
import org.sikuli.script.SikuliException;
import org.sikuli.script.TextRecognizer;
//import java.nio.file.pathLocation;

@SuppressWarnings("unused")
public class ClickMethods {
	public static int MaxWaitTime = 8000;
	public static ObserveEvent event;
	//public static String pathScreenShot = "C:\\esi-sofea\\ws\\IntakeFT\\LocationScreenShots\\TestResults\\Screenshots\\";
	public static String pathLocation ="C:\\\\WorkSpace\\\\SikuliBaseTest-Framework\\LocationScreenShots\\";
	public static String pathRegion = "C:\\WorkSpace\\SikuliBaseTest-Framework\\RegionScreenShots\\";

	
	
	
	public static void clickElementListUsingImage(String Image) throws SikuliException, Throwable{


		try				
		{
		Screen screen = new Screen();
		String pathloc = pathLocation + Image;			
		Pattern pattern= new Pattern(pathloc).similar(0.7f);	
		
			screen.onAppear(pathLocation,new ObserverCallBack() {
                @Override
                public void appeared(ObserveEvent event) {						
						if(screen.exists(pattern) != null){	 
		                	
		                	//event.getRegion().mouseMove();		                	
		                	event.getRegion().click();		   
						}  
						else {
						/*
						 * //ScreenshotMethods.takeScreenshot(BrowserMethods.driver1,
						 * "tempJPEGFilePlaceHolder", Image); Assert.fail("does not exist");
						 * CommonMethods.testStepPassFlag = false; CommonMethods.closeAllBrowsers();
						 */           		
	                	}
        		}
            }
			 
		);
			
		screen.observe(10);
		screen.stopObserver();	
		
		}
		
		catch (Exception e)
		{		
			/*
			 * System.out.println(WaitMethods.alreadyWaitedTime);
			 * ScreenshotMethods.takeScreenshot(BrowserMethods.driver1,
			 * "tempJPEGFilePlaceHolder", Image); Assert.fail("does not exist");
			 * CommonMethods.testStepPassFlag = false; CommonMethods.closeAllBrowsers();
			 */
			
		}


	}

	
	
	public static void clickElementUsingImage(String Image) throws SikuliException, Throwable{	
		
		try				
		{
		Screen screen = new Screen();
		
		String pathloc = pathLocation + Image;				
		Pattern pattern= new Pattern(pathloc).similar(0.7f);	
		screen.onAppear(pathloc, new ObserverCallBack() {
            @Override
            public void appeared(ObserveEvent event) {  	                       
            	try {	
            			Region region  = event.getRegion().find(pattern);
            			screen.setROI(region);            		
	                	if (region != null){	
	                		
	    					region.mouseMove(pattern);
	    					region.click(pattern);
	    					region.stopObserver();
	                	}
	                	else {
	                		//ScreenshotMethods.takeScreenshot(BrowserMethods.driver1, "tempJPEGFilePlaceHolder", Image);
	    					//Assert.fail("does not exist");
	    					//CommonMethods.testStepPassFlag = false;
	    					//CommonMethods.closeAllBrowsers();	                		
	                	}
    					
            	} catch (FindFailed e){  
            		System.out.println(e);
					
				}        		
        	}	         
			
    	}				
		
		);
		
		screen.observe(25);
		screen.stopObserver();
		
			
		}
		
		catch (Exception e){		
		
			/*
			 * System.out.println(e); System.out.println(WaitMethods.alreadyWaitedTime);
			 * ScreenshotMethods.takeScreenshot(BrowserMethods.driver1,
			 * "tempJPEGFilePlaceHolder", Image); Assert.fail("does not exist");
			 * CommonMethods.testStepPassFlag = false; CommonMethods.closeAllBrowsers();
			 */	
			
		}
		
	}

		

public static void moveMouseToElementUsingImage(String Image) throws SikuliException, Throwable{			
	
	//Settings.UseImageFinder = true;
	Settings.MinSimilarity = 0.50; 
	Settings.WaitScanRate = 0.3f; 
	Settings.ObserveScanRate = 0.1f; 
	Settings.OcrTextRead = true;
	Settings.OcrTextSearch = true;
	//Thread.sleep(2000);
	
		
			Thread.sleep(6000);
			Screen screen = new Screen();
			String pathloc = pathLocation + Image;
			//String pathReg = pathLocation + Image;
			Pattern pattern	= new Pattern(pathloc);			
			//Pattern pattern	= new Pattern(path).similar(0.98f);
			
		try				
		{	screen.waitVanish(pattern,10);
			Region region	= screen.find(pattern);
			//screen.setROI(region);  
			if (region!=null){
				//Thread.sleep(3000);
				//region.highlight();
				region.mouseMove(pattern);
				region.click(pattern);
				//CommonMethods.testStepPassFlag = true;
				//region.click(pattern);
			
				//region.doubleClick(pattern);
			}					
			
		}catch (Exception e){	
			  
	    			
		}
		
	}


	
public static void clickElementUsingImage1(String Image) throws SikuliException, Throwable{		
		
		
		Settings.MinSimilarity = 0.50; 
		Settings.WaitScanRate = 0.3f; 
		Settings.ObserveScanRate = 0.3f; 					
				
		Thread.sleep(2000);	

			try				
			{
			Screen screen = new Screen();
			String pathloc = pathLocation + Image;
			//String pathReg = pathLocation+ Image;
							
			Pattern pattern= new Pattern(pathloc).similar(0.7f);	
			
					
			screen.onAppear(pattern,new ObserverCallBack() {
		            @Override
		            public void appeared(ObserveEvent event) {	              
		            
		            	
		            	try {
		            		Region region = event.getRegion().find(pattern);
							if(region!= null){
								//region.setROI(region);
								region.highlight(1);
								//region.mouseMove(pattern);
		    					region.click(pattern);		    					         	
				            	screen.stopObserver();
								
							}
							else {
		                		//ScreenshotMethods.takeScreenshot(BrowserMethods.driver1, "tempJPEGFilePlaceHolder", Image);
		    					                		
		                	}
							
						} catch (FindFailed e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
    					
		            }
				}
			);
			screen.observe(20);		
			screen.stopObserver();
			
			}
			
			catch (Exception e)
			{			
					
				
			}


		}

	public static void clickElementUsingImage(String Image, float sim) throws Throwable{

		//Settings.MinSimilarity = 0.50; 
		Settings.WaitScanRate = 0.3f; 
		Settings.ObserveScanRate = 0.3f; 					
					
				

			try				
			{
			
			Screen screen = new Screen();
			String pathloc = pathLocation+ Image;					
			Pattern pattern= new Pattern(pathloc).similar(sim);						
			screen.onAppear(pathloc,new ObserverCallBack() {
		            @Override
		            public void appeared(ObserveEvent event) {	              
		            
		            	
		            	try {
		            		
		            		Region region = event.getRegion().find(pattern);
							if(region != null){
								region.highlight(2);
								//screen.setROI(region);
								Region R = region.exists(pattern);								
								R.mouseMove(pattern);
		    					R.click(pattern);
		    					R.stopObserver();	            	
				            								
							}
							else {
		                		              		
		                	}
							
						} catch (FindFailed e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
    					
		            }
		            
				}
			);
			screen.observe(40);		
			screen.stopObserver();
			
			}
			
			catch (Exception e)
			{			
				
				
				
			}


		}

	public static void ClickLocationUsingImage(int ofx, int ofy, String Image) throws SikuliException, Throwable{
			Settings.MinSimilarity = 0.50; 			
			Settings.WaitScanRate = 0.3f; 
			Settings.ObserveScanRate = 0.3f; 
			Settings.OcrTextRead = true;
			Settings.OcrTextSearch = true;
			Settings.runningSetup = true;
				
			Integer x;
			Integer y;
		
			
			try{	
				
				Screen screen = new Screen();
				String pathloc = pathLocation + Image;
				//String pathReg = pathLocation + Image;
				Pattern pattern	= new Pattern(pathloc);				
				screen.onAppear(pathloc,new ObserverCallBack() {
	                @Override
	                public void appeared(ObserveEvent event) {	
	                	

	                		
	                		try {
	                			Region region =event.getRegion().find(pattern);
	                			if(region!= null){
									Location l = region.getTarget();
									Integer x = l.getX()+ofx;
									Integer y = l.getY()+ofy;	
									Location loc = new Location(x, y);
									Region R = region.setLocation(loc);
									screen.setROI(R);
									
									R.mouseMove(loc);
									R.click(loc);
									R.stopObserver();
		                			}
	                			else {
	    	                		              		
	                				}
	    		                	
	    		                
							} catch (FindFailed e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}						
							
	                }
	                
				}
			
				
				);
			
			screen.observe(20);
			screen.stopObserver();
			
					
			}catch(Exception e){
			
			}
					
	}
	
	              
	
	public static void doubleClickLocationUsingImage(int ofx, int ofy, String Image) throws SikuliException, Throwable{
		
		
		Settings.MinSimilarity = 0.50; 
		Settings.WaitScanRate = 0.3f; 
		Settings.ObserveScanRate = 0.3f; 
		Settings.OcrTextRead = true;
		Settings.OcrTextSearch = true;
		Settings.runningSetup = true;
		//String path = pathLocation + Image;	
		Integer x;
		Integer y;
	
		
		try{		
			
			Screen screen = new Screen();
			String pathloc = pathLocation + Image;
			//String pathReg = pathLocation + Image;
			Pattern pattern	= new Pattern(pathloc);	
			//Screen screen = new Screen();				
			//Pattern pattern= new Pattern(path).similar(0.9f);			
			screen.onAppear(pathloc,new ObserverCallBack() {
                @Override
                public void appeared(ObserveEvent event) {
                	if(event.getRegion().exists(pattern) != null){	
                		try {
							Region region =event.getRegion().find(pattern);
							Location l = region.getTarget();
							Integer  x = l.getX()+ofx;
							Integer  y = l.getY()+ofy;
							Location loc = new Location(x, y);
							Region R = region.setLocation(loc);
							R.setLocation(loc);
							R.mouseMove(loc);
							R.click(loc);	
							R.stopObserver();
						} catch (FindFailed e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}						
						
					} 
                	else {
                		          		
                	}
	                	
	                }
				}
			);
		screen.observe(20);
		screen.stopObserver();		
				
		}catch(Exception e){
		
		}
				
	}
			
	public static void ClickUsingLocation(int x, int y,int ofx, int ofy, String Image) throws SikuliException, Throwable{
		
		Settings.DelayBeforeMouseDown = 0.1f;
		Settings.MinSimilarity = 0.50; 
		Settings.WaitScanRate = 0.3f; 
		Settings.ObserveScanRate = 0.3f; 
		//String path = pathLocation + Image;
				
				try
				{	
					Screen screen = new Screen();
					String pathloc = pathLocation + Image;
					//String pathReg = pathLocation + Image;
					Pattern pattern	= new Pattern(pathloc);	
					//Screen screen = new Screen();
					//Pattern pattern= new Pattern(path).similar(0.7f);						
					screen.onAppear(pathloc,new ObserverCallBack() {
		                @Override
		                public void appeared(ObserveEvent event) {	              

		                	if(event.getRegion().exists(pattern) != null){	
		                		try {
									Region region =event.getRegion().find(pattern);
									Location l = region.getTarget();
									Integer x = l.getX()+ofx;
									Integer y = l.getY()+ofy;
									Location loc = new Location(x+ofx, y+ofy);									
									Region R = region.setLocation(loc);													
									R.mouseMove(loc);									
									R.stopObserver();
								} catch (FindFailed e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}								
							} 
		                	else {
		                		            		
		                	}
			                	
			                }
						}
					);
				screen.observe(20);
				screen.stopObserver();		
						
				}catch(Exception e){
				
				}
						
	}	               


	public static void doubleClickUsingLocation(int x, int y,int ofx, int ofy, String Image) throws SikuliException, Throwable{
		
		Settings.DelayBeforeMouseDown = 0.1f;
		Settings.MinSimilarity = 0.50; 
		Settings.WaitScanRate = 0.3f; 
		Settings.ObserveScanRate = 0.3f; 
		//String path = pathLocation + Image;
				
		try{
				Screen screen = new Screen();
				String pathloc = pathLocation + Image;
				//String pathReg = pathLocation + Image;
				//Pattern pattern	= new Pattern(pathloc);	
				//Screen screen = new Screen();		
				Pattern pattern= new Pattern(pathloc).similar(0.7f);
				screen.onAppear(pathloc,new ObserverCallBack() {
		            @Override
		            public void appeared(ObserveEvent event) {	              
	
	                	if(event.getRegion().exists(pattern) != null){	
	                		try {
								Region region =event.getRegion().find(pattern);
								Location l = region.getTarget();
								Integer x = l.getX()+ofx;
								Integer y = l.getY()+ofy;
								Location loc = new Location(x+ofx, y+ofy);
								Region R = region.setLocation(loc);
													
								R.mouseMove(loc);
								R.doubleClick(loc);
								R.stopObserver();
								
							} catch (FindFailed e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}						
							
						} 
	                	else {
	                		               		
	                	}
		                	
		                }
					}
				);
			screen.observe(20);
			screen.stopObserver();		
				
		}catch(Exception e){
		
		}
				
	}	
	
	public static void doubleClickUsingLocation(int x, int y) throws SikuliException, Throwable{
			
			Settings.DelayBeforeMouseDown = 0.1f;
			Settings.MinSimilarity = 0.50; 
			Settings.WaitScanRate = 0.3f; 
			Settings.ObserveScanRate = 0.3f; 
			//String path = pathLocation + Image;
			Thread.sleep(2000);		
			try{
				
				Screen screen = new Screen();					
							
				Location loc = new Location(x, y);											
				//screen.setLocation(loc);	
				Region R = screen.setLocation(loc);
				R.mouseMove(loc);
				R.doubleClick(loc);				
			}catch(Exception e){
			
			}
					
		}	
	public static void HighlightLocation(int x, int y) throws SikuliException, Throwable{
		
		Settings.DelayBeforeMouseDown = 0.1f;
		Settings.MinSimilarity = 0.50; 
		Settings.WaitScanRate = 0.3f; 
		Settings.ObserveScanRate = 0.3f; 
		//String path = pathLocation + Image;
		Thread.sleep(2000);		
		try{
			
			Screen screen = new Screen();					
						
			Location loc = new Location(x, y);											
			screen.setLocation(loc).highlight();	
			//Region R = screen.setLocation(loc);
			//screen.mouseMove(loc);
			//screen.doubleClick(loc);				
		}catch(Exception e){
		
		}
				
	}		
	/*	
	public static void setValueUsingImage(int ofx, int ofy, String Image, String textValue) throws SikuliException, Throwable{
		
		Settings.OcrTextSearch = true;
		Settings.runningSetup = true;		
		Settings.runningSetup = true;
		Settings.UseImageFinder=true;
		Settings.ActionLogs=true;	
		Settings.OcrTextRead = true;		
		Settings.MinSimilarity = 0.50; 
		Settings.WaitScanRate = 0.3f; 
		Settings.ObserveScanRate = 0.3f; 		
		Integer x;
		Integer y;
		Thread.sleep(1000);
		try
		{
			
			Screen screen = new Screen();
			String pathloc = pathLocation + Image;
			//String pathReg = pathLocation + Image;
			Pattern pattern	= new Pattern(pathloc);	
			//Screen screen = new Screen();
			//Pattern pattern= new Pattern(path).similar(0.7f);	
			screen.onAppear(pathloc,new ObserverCallBack() {
	            @Override
	            public void appeared(ObserveEvent event) {	              
	            	
					if(event.getRegion().exists(pattern) != null){							
						Region 	region = event.getRegion().exists(pattern);				
						Location l = region.getTarget();	
						Integer x = l.getX()+ofx;
						Integer y = l.getY()+ofy;
						Location loc = new Location(x,y);
						Region R = region.setLocation(loc);
						
						
						
						
						try
						{
							
							R.mouseMove(loc);
							R.click(loc);							
							R.keyDown(Key.CTRL); 
							R.type("a"); 
							R.keyUp(Key.CTRL);					
							R.type(Key.DELETE);						
							R.type(loc,textValue);	
							
							region.stopObserver();
													
						
						} catch (Throwable e) {
							
							e.printStackTrace();
						}
						
												
					} 
					else {
                		ScreenshotMethods.takeScreenshot(BrowserMethods.driver1, "tempJPEGFilePlaceHolder", Image);
    					Assert.fail("does not exist");
    					CommonMethods.testStepPassFlag = false;
    					CommonMethods.closeAllBrowsers();	                		
                	}
	                	
	                }
				}
			);
			
			screen.observe(20);
			screen.stopObserver();		
			
			}catch (Exception e)
			{
				
			ScreenshotMethods.takeScreenshot(BrowserMethods.driver1, "tempJPEGFilePlaceHolder", Image);
			Assert.fail("does not exist");
			CommonMethods.testStepPassFlag = false;
			CommonMethods.closeAllBrowsers();				
				
			}

	}
	*/
	
public static void setValueUsingImage(int ofx, int ofy, String Image, String textValue) throws SikuliException, Throwable{
		
		Settings.OcrTextSearch = true;		
		Settings.OcrTextRead = true;		
		
		String path=null;
		String str = null;
		Region R1=null;
		Region R=null;
		String path1=null;
		Screen screen = null;
		Location l= null;
		Region region = null;
		Integer x;
		Integer y;
		Thread.sleep(1000);
		try
		{
			
			screen = new Screen(0);
			String pathloc = pathLocation + Image;			
			Pattern pattern	= new Pattern(pathloc);	
			
			screen.onAppear(pathloc,new ObserverCallBack() {
	            @SuppressWarnings("unused")
				@Override
	            public void appeared(ObserveEvent event) {	              
	            	Region region = event.getRegion().exists(pattern);
	            	region.setROI();
					if(region!= null){							
									
						Location l = region.getTarget();	
						Integer x = l.getX()+ofx;
						Integer y = l.getY()+ofy;
						Location loc = new Location(x,y);
						Region R = region.setLocation(loc);	
						R.setROI();
						
						
						try
						{
							
							R.mouseMove(loc);
							R.click(loc);							
							R.keyDown(Key.CTRL); 
							R.type("a"); 
							R.keyUp(Key.CTRL);					
							R.type(Key.DELETE);						
							R.type(loc,textValue);							
							Region R1 = loc.grow(250,40);
							String Imagenew = R1.saveScreenCapture(pathLocation);		
						    String str = clickElementUsingImage2(Imagenew);
						    System.out.println(str);
						    StringBuilder builder = new StringBuilder(str);
						    // removing last character from String
						   builder.deleteCharAt(str.length() - 1);
						  
						   
						    System.out.println(str);
						    
						    if (! builder.toString().equalsIgnoreCase(textValue)){
						    	R.keyDown(Key.CTRL); 
								R.type("a"); 
								R.keyUp(Key.CTRL);					
								R.type(Key.DELETE);						
								R.type(loc,textValue);		
						    	
						    }
							
							region.stopObserver();
													
						
						} catch (Throwable e) {
							
							e.printStackTrace();
						}
						
												
					} 
					else {
                	              		
                	}
	                	
	                }
				}
			);
			
			screen.observe(20);
			screen.stopObserver();		
			
			}catch (Exception e)
			{
				
					
				
			}

	}


@SuppressWarnings("static-access")
public static String clickElementUsingImage2(String Image) throws SikuliException, Throwable{	

	Settings.OcrTextSearch = true;
	Settings.runningSetup = true;			
	Settings.UseImageFinder=true;
	Settings.ActionLogs=true;
	//Settings.BundlePath.valueOf(pathLocation );	
	Settings.OcrTextRead = true;		
	Settings.MinSimilarity = 0.70; 
	Settings.WaitScanRate = 0.3f; 
	Settings.ObserveScanRate = 0.3f; 
	Settings.isWindows();
	Settings.getSikuliDataPath();
	String path=null;
	String str = null;
	Region R1=null;
	Region R=null;
	String path1=null;
	Screen screen = null;
	
	try				
	{
		screen = new Screen();			
		//path = Settings.BundlePath.valueOf(pathLocation)+Image;	
		//Tesseract1 instance = new Tesseract1();
		//instance.setDatapath("C:\\Users\\ei3754\\esi-sofea\\ws\\IntakeFT\\tessdata");
		
		
			
		
		 System.out.println(str);
			
		
       
	
	}catch (Exception e){		
	
		
			
	}
	return str;
	
	
}

	
	@SuppressWarnings("static-access")
	public static boolean clickElementUsingImage3(ScreenImage Image,Screen screen,Region region, String txt) throws SikuliException, Throwable{	
		//Settings.MinSimilarity = 0.90;  

		Settings.OcrTextSearch = true;
		Settings.runningSetup = true;			
		Settings.UseImageFinder=true;	
		Settings.OcrTextRead = true; 
		Settings.WaitScanRate = 0.3f; 
		Settings.ObserveScanRate = 0.3f; 
		Settings.isWindows();
		Settings.getSikuliDataPath();
		Settings.OcrLanguage = "eng";
		Settings.MinSimilarity = 0.50;
		boolean b = false;
		try				
		{
						
			screen.getScreen();	
			//TextRecognizer tr = TextRecognizer.class.cast(Image);			
			//Tesseract1 instance = new Tesseract1();			
			//instance.setDatapath("C:\\Users\\ei3754\\esi-sofea\\ws\\IntakeFT\\tessdata");			
			//String str = instance.doOCR(new File(Image));	
			TextRecognizer tr = TextRecognizer.getInstance();
			boolean a = tr.recognizeWord(Image).matches(txt);
			List<Match> match = region.listText();
			Thread.sleep(1000);			
			Match st = region.find(txt);
			Thread.sleep(1000);
			st.doubleClick();
			b = true;
			Thread.sleep(1000);			      
		
		}catch (Exception e){		
		
		
				
		}
		return b;	
		
	}



	public static void setValueUsingImage1(int ofx, int ofy, String Image, String textValue) throws SikuliException, Throwable{
		
		Settings.DelayBeforeMouseDown = 0.1f;
		Settings.MinSimilarity = 0.50; 
		Settings.WaitScanRate = 0.3f; 
		Settings.ObserveScanRate = 0.3f; 			
		Integer x;Integer y;
		
		
	
			try
			{
				Thread.sleep(1000);
				Screen screen = new Screen();
				String pathloc = pathLocation + Image;			
				Pattern pattern	= new Pattern(pathloc);											
				Region 	region = screen.exists(pattern);
				
				if(region.isValid()){	
					Location l = region.getTarget();	
					x = l.getX()+ofx;
					y = l.getY()+ofy;
					Location loc = new Location(x,y);
					Region R = region.setLocation(loc);							
					//R.mouseMove(loc);
					R.click(loc);							
					R.keyDown(Key.CTRL); 
					R.type("a"); 
					R.keyUp(Key.CTRL);					
					R.type(Key.DELETE);						
					R.type(loc,textValue);	
					
				
				}
		                	
			}catch (Exception e){
				
				
			}
			
		
		
	}

	
	public static void setValueUsingImage(int ofx, int ofy, String Image, String textValue,float sim) throws SikuliException, Throwable{
		
		
	
		Settings.DelayBeforeMouseDown = 0.1f;
		Settings.MinSimilarity = 0.50; 
		Settings.WaitScanRate = 0.3f; 
		Settings.ObserveScanRate = 0.3f; 	
				
		Integer x;
		Integer y;
			try
			{
			Screen screen = new Screen();
			String pathloc = pathLocation + Image;
			//String pathReg = pathLocation + Image;
			Pattern pattern	= new Pattern(pathloc);	
			//Pattern pattern= new Pattern(path).similar(0.7f);
			//Region region = screen.exists(pattern);	
		
			screen.onAppear(pathloc,new ObserverCallBack() {
	            @Override
	            public void appeared(ObserveEvent event) {	              
	            	
					if(event.getRegion().exists(pattern) != null){
						screen.stopObserver();
						screen.observe(20);	
						screen.stopObserver();
						Region 	region = event.getRegion().exists(pattern);				
						Location l = region.getTarget();		
						Integer x = l.getX()+ofx;
						Integer y = l.getY()+ofy;
						Location loc = new Location(x,y);
						region.setLocation(loc);
						
						try {
							region.mouseMove(loc);
							region.click(loc);	
						} catch (FindFailed e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
														
						region.keyDown(Key.CTRL); 
						region.type("a"); 
						region.keyUp(Key.CTRL);					
						region.type(Key.DELETE);						
						region.type(textValue);				
						
					} 
					
	                	
	                }
				}
			);
			
							
			}catch (Exception e)
			{
			
							
				
			}

	}	
	
	
	public static void setValueUsingImageLocation(int x, int y , String arg, String Image) throws Throwable{

		
		try		
			{
			
			Screen screen = new Screen();
			String pathloc = pathLocation + Image;				
			screen.onAppear(pathloc,new ObserverCallBack() {
	            @Override
	            public void appeared(ObserveEvent event) {		
					if(event.getRegion() != null){	
						Location loc = new Location(x,y);
						Region R = screen.setLocation(loc);
						screen.setROI(R);  
						//screen.setLocation(loc);
						try {
							R.mouseMove(loc);
							R.click(loc);			
							R.keyDown(Key.CTRL); 
							R.type("a"); 
							R.keyUp(Key.CTRL);			
							R.type(Key.DELETE);			
							R.type(loc,arg);
							R.stopObserver();
							
							
						}catch (Exception e){
							System.out.println(e);
							
						}
						
						
						
						
					}  
					else {
                		                		
                	}
	                	
	                }
				}
			);				
			screen.observe(20);	
			screen.stopObserver();				
			}catch(Exception e){
				
            		
					}		
	}	
			
		
		

	public static void setValueUsingImageOfSet(int x, int y ,int ofx, int ofy, String arg, String Image) throws Throwable{	
		
			try
			
			{
			
			
				
				String pathloc = pathLocation + Image;
				Screen screen = new Screen();
				Pattern pattern= new Pattern(pathloc).similar(0.7f);
				//Region region = screen.exists(pattern);	
				
				screen.onAppear(pathloc,new ObserverCallBack() {
		            @Override
		            public void appeared(ObserveEvent event) {	              
		
		            	if(event.getRegion().exists(pattern) != null){
		            		Region region = screen.exists(pattern);			
		        			Location l = region.getTarget();	
		        			Integer x = l.getX()+ofx;
		        			Integer y = l.getY()+ofy;
		        			
		        			Location loc = new Location(x+ofx, y+ofy);
		        			try {
								screen.mouseMove(loc);
								screen.click(loc);	
							} catch (FindFailed e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
		        					
		        			screen.keyDown(Key.CTRL); 
		        			screen.type("a"); 
		        			screen.keyUp(Key.CTRL);
		        			
		        			screen.type(Key.DELETE);
		        		
		        			screen.setLocation(loc).type(arg);
							
							screen.stopObserver();
							
						}  
		            	else {
	                		               		
	                	}
		                	
		                }
					}
				);
				screen.observe(20);
				screen.stopObserver();
				
			
		
			}	
	
			catch (Exception e)
			{
				
			}
		}	
			
		
		
	public static void clearValueUsingImage(int x, int y , String arg, String Image) throws Throwable{
			
			//Add image path  
			//Thread.sleep(000);
			
			
		
				try
				
				{	
					Robot robot = new Robot();
					Screen screen = new Screen();
					String pathloc = pathLocation + Image;
					//String pathReg = pathLocation + Image;
					Pattern pattern	= new Pattern(pathloc);		
					Region region	= screen.exists(pattern);					
					if (region!= null){	
						region.click(); 
						region.keyDown(Key.CTRL); 
						region.type("a"); 
						region.keyUp(Key.CTRL);
						Thread.sleep(1000);
						region.type(Key.DELETE);
						//Thread.sleep(2000);					
				    			
					}	
					
				}
		
				catch (Exception e)
				{
					
				}
					
		
			
			
		}


	
	public static void clickElementUsingLocation(int x, int y,int ofset1,int ofset2,String Image) throws Throwable{
		
		
		
		
		//WaitMethods.imagesyncAndCheckForPresenceOfElement(screen, pattern, 800);
		
			try
			{
			Screen screen = new Screen();
			String pathloc = pathLocation + Image;
			//String pathReg = pathLocation + Image;
			//Pattern pattern	= new Pattern(pathloc);	
				Pattern pattern= new Pattern(pathloc).similar(0.7f);
				//Region region = screen.exists(pattern);	
			
				screen.onAppear(pathloc,new ObserverCallBack() {
		            @Override
		            public void appeared(ObserveEvent event) {	              
		
						if(event.getRegion() != null){	
							
							screen.stopObserver();
							
						}
						else {
	                		           		
	                	}
		                	
		                }
					}
				);	
				screen.observe(20);
				screen.mouseMove(x-ofset1,y-ofset2);
				screen.click(x-ofset1,y-ofset2);
		    	 		
			}	
			

			catch (Exception e)
			{
				
				
			}
				
		}	
		
		
	
	
	
	public static void doubleClickElementUsingImage(String Image) throws Throwable{
		
		//Settings.UseImageFinder = true;
		Settings.MinSimilarity = 0.50; 
		Settings.WaitScanRate = 0.3f; 
		Settings.ObserveScanRate = 0.1f; 
		Settings.OcrTextRead = true;
		Settings.OcrTextSearch = true;
	
			
				Thread.sleep(1000);
				Screen screen = new Screen();
				String pathloc = pathLocation + Image;
				//String pathReg = pathLocation + Image;
				Pattern pattern	= new Pattern(pathloc);			
				//Pattern pattern	= new Pattern(path).similar(0.98f);
				
			try				
			{
				Region region	= screen.exists(pattern);
				if (region!=null){
					region.mouseMove(pattern);
					region.doubleClick(pattern);
				}					
				
			}catch (Exception e){		    			
		    			
			}
			
		
	}
	
public static void ClickElementUsingImage(String Image) throws Throwable{
		
		//Settings.UseImageFinder = true;
		Settings.MinSimilarity = 0.50; 
		Settings.WaitScanRate = 0.3f; 
		Settings.ObserveScanRate = 0.1f; 
		Settings.OcrTextRead = true;
		Settings.OcrTextSearch = true;
		//Thread.sleep(2000);
		//while(WaitMethods.alreadyWaitedTime < MaxWaitTime){	
			
		
		Screen screen = new Screen();
		String pathloc = pathLocation + Image;
		//String pathReg = pathLocation + Image;
		Pattern pattern	= new Pattern(pathloc);			
		//Pattern pattern	= new Pattern(path).similar(0.98f);
		
			try	
			
			{
				screen.wait(pattern, 20);
				Region region	= screen.exists(pattern);
				if (region!=null){
					region.highlight(1);
					//region.setROI(region);
					//region.mouseMove(pattern);
					region.click(pattern);
					//break;
					//region.doubleClick(pattern);
				}					
				
			}catch (Exception e){		    			
		    			
			}
			/*if (WaitMethods.alreadyWaitedTime < MaxWaitTime){
				WaitMethods.alreadyWaitedTime = WaitMethods.alreadyWaitedTime + 1000;
				
			}
			else{
				ScreenshotMethods.takeScreenshot(BrowserMethods.driver1, "tempJPEGFilePlaceHolder", Image);
				Assert.fail(Image+"does not exist");
				CommonMethods.testStepPassFlag = false;
				CommonMethods.closeAllBrowsers();					
				
			}		*/
		
	}


	public static void doubleClickElementUsingImage1(String Image) throws Throwable{
		
		Settings.MinSimilarity = 0.50; 
		Settings.WaitScanRate = 0.3f; 
		Settings.ObserveScanRate = 0.3f; 
		Settings.OcrTextRead = true;
		Settings.OcrTextSearch = true;
		//Thread.sleep(2000);
			try				
			{
				Screen screen = new Screen();
				String pathReg = pathRegion + Image;
				String pathloc = pathLocation + Image;
				
							
				Pattern pattern1	= new Pattern(pathReg);	
				Pattern pattern2	= new Pattern(pathloc);	
				
				
				screen.onAppear(pathReg, new ObserverCallBack() {
	              
	                @Override
	                public void appeared(ObserveEvent event) {  	                       
	                	try {	
	                    	//event.getRegion().wait(pattern1);
	    	                	if (event.getRegion().exists(pattern1) != null){    	    					
	    	                		Region R  = screen.exists(pattern1);  
	    	                		screen.setROI(R);  
	    	                		
	    	    					if (R!= null){	    	    					
	    	    					//R.mouseMove(pattern2);
		    	    					Region R2 = screen.exists(pattern2);
		    	    					if (R!= null){	
			    	    					R2.doubleClick(pattern2);
			    	    					R.stopObserver();
		    	    					}
	    	    					}
	    	                	}
	    	                	else {
	    	                		                		
	    	                	}
	        					
	                    	} catch (FindFailed e){  
	                    		 
	    						
	    					}        		
	            	}	         
	    			
	        	}				
	    		
	    		);
	    		
	    		screen.observe(16);
	    		screen.stopObserver();
	    			
	    		}
	    		
	    		catch (Exception e)
	    		
	    		{
	    		
	    		}
	    		
	    	}
	
	public static void ClickElementUsingImage1(String Image) throws Throwable{
		
		
		Settings.MinSimilarity = 0.50; 
		Settings.WaitScanRate = 0.3f; 
		Settings.ObserveScanRate = 0.3f; 
		Settings.OcrTextRead = true;
		Settings.OcrTextSearch = true;
		//Thread.sleep(8000);
		
			try				
			{
				Screen screen = new Screen();
				String pathReg = pathRegion + Image;
				String pathloc = pathLocation + Image;							
				Pattern pattern1 = new Pattern(pathReg);	
				Pattern pattern2 = new Pattern(pathloc);			
				
				screen.onAppear(pathReg, new ObserverCallBack() {
	              
	                @Override
	                public void appeared(ObserveEvent event) {  	                       
	                	try {    	                	    					
	    	    					
    	                		Region region  = screen.exists(pattern1);    	                		    	                		
    	    					if (region!= null){
    	    						//region.setROI(region);
        	                		region.highlight(1);
        	                		//region.wait(pattern2, 10);
    	    						Region R = region.find(pattern2); 
    	    						//R.highlight(1);
	    	    					R.click(pattern2);				
	    	    					
	    	    					screen.stopObserver();
	    	    					}
	    	                	
	    	                	else {
	    	                		              		
	    	                		}
	        					
                    	} catch (FindFailed e){  
                    		 						
    					}        		
	            	}	    			
	        	}				
	    		
	    		);
	    		
	    		screen.observe(3000);
	    		//observe(30);
	    		screen.stopObserver();
	    			
	    		}
	    		
	    		catch (Exception e)
	    		
	    		{
	    		 
	    			
	    		}
	    		
    	}
	
	public static void ClickElementUsingImage2(String Image) throws Throwable{
			//Settings.isRunningIDE =true;
			
			Settings.MinSimilarity = 0.50; 
			Settings.WaitScanRate = 0.3f; 
			Settings.ObserveScanRate = 0.3f; 
			Settings.OcrTextRead = true;
			Settings.OcrTextSearch = true;
			
	
			//Thread.sleep(2000);
				try				
				{
					Screen screen = new Screen();
					String pathReg = pathRegion + Image;
					String pathloc = pathLocation + Image;
					
								
					Pattern pattern1	= new Pattern(pathReg);	
					Pattern pattern2	= new Pattern(pathloc);	
					
					
					screen.onAppear(pathReg, new ObserverCallBack() {
		              
		                @Override
		                public void appeared(ObserveEvent event) {  	                       
		                	try {	
		                    	
		    	                	if (event.getRegion().exists(pattern1) != null){	    					
		    	    					
		    	                		Region R  = screen.exists(pattern1);    	                		
		    	    					if (R!= null){	
	    	    						Region R1  = screen.exists(pattern2);   	    						
		    	    					R1.highlight(2);
		    	    					R1.click(pattern2);
		    	    					event.getRegion().stopObserver();
		    	    					}
		    	                	}
		    	                	else {
		    	                	          		
		    	                	}
		        					
		                    	} catch (FindFailed e){  
		                    		 
		    						
		    					}        		
		            	}	         
		    			
		        	}				
		    		
		    		);
		    		
		    		screen.observe(30);
		    		screen.stopObserver();
		    			
		    		}
		    		
		    		catch (Exception e)
		    		
		    		{
		    		
		    			
		    		}
		    		
	    	}
	
		
	public static void mouseMoveToElementUsingImage1(String Image) throws Throwable{
			
			Settings.MinSimilarity = 0.50; 
			Settings.WaitScanRate = 0.3f; 
			Settings.ObserveScanRate = 0.3f; 
			Settings.OcrTextRead = true;
			Settings.OcrTextSearch = true;
				try				
				{
					Screen screen = new Screen();
					String pathReg = pathRegion + Image;
					String pathloc = pathLocation + Image;
								
					Pattern pattern1	= new Pattern(pathReg);	
					Pattern pattern2	= new Pattern(pathloc);	
					
					screen.onAppear(pathReg, new ObserverCallBack() {
		              
		                @Override
		                public void appeared(ObserveEvent event) {  	                       
		                	try {	
		                    	event.getRegion().wait(pattern1);
		    	                	if (event.getRegion().exists(pattern1) != null){	    					
		    	    					
		    	    					
		    	    					Region R = event.getRegion().exists(pattern1);
		    	    					//R.find(pattern2);
		    	    					//R.mouseMove(pattern2);
		    	    					R.doubleClick(pattern2);
		    	    					event.getRegion().stopObserver();
		    	                	}
		    	                	else {
		    	                		               		
		    	                	}
		        					
		                    	} catch (FindFailed e){  
		                    		
		    						
		    					}        		
		            	}	         
		    			
		        	}				
		    		
		    		);
		    		
		    		screen.observe(25);
		    		screen.stopObserver();
		    			
		    		}
		    		
		    		catch (Exception e)
		    		
		    		{
		    		
		    		}
		    		
		    	}




	public static void doubleClickElementUsingImage1(String Image,float sim) throws Throwable{
		
		Settings.MinSimilarity = 0.50; 
		Settings.WaitScanRate = 0.3f; 
		Settings.ObserveScanRate = 0.3f; 
		Settings.OcrTextRead = true;
		Settings.OcrTextSearch = true;
			try				
			{
				Screen screen = new Screen();
				String pathReg = pathRegion + Image;
				String pathloc = pathLocation + Image;
							
				Pattern pattern1	= new Pattern(pathReg);	
				Pattern pattern2	= new Pattern(pathloc).similar(sim);	
				
				screen.onAppear(pathReg, new ObserverCallBack() {
	              
	                @Override
	                public void appeared(ObserveEvent event) {  	                       
	                	try {	
	                    	event.getRegion().wait(pattern1);
	    	                	if (event.getRegion() != null){	    					
	    	    					
	    	    					
	    	    					Region R = event.getRegion().find(pattern1);
	    	    					R.find(pattern2);
	    	    					R.mouseMove(pattern2);
	    	    					R.doubleClick(pattern2);
	    	    					event.getRegion().stopObserver();
	    	                	}
	    	                	else {
	    	                		            		
	    	                	}
	        					
	                    	} catch (FindFailed e){  
	                    		
	    					}        		
	            	}	         
	    			
	        	}				
	    		
	    		);
	    		
	    		screen.observe(25);
	    		screen.stopObserver();
	    			
	    		}
	    		
	    		catch (Exception e)
	    		
	    		{
	    		
	    			
	    		}
	    		
	    	}
	

	public static void doubleClickElementFromListUsingImage(String Image) throws Throwable{
		

		//Settings.MinSimilarity = 0.50; 
		//Settings.WaitScanRate = 0.3f; 
		//Settings.ObserveScanRate = 0.3f; 
		//Thread.sleep(3000);	
		
		
			try				
			{	
				Screen screen = new Screen();
				String pathloc = pathLocation + Image;
				//String pathReg = pathLocation + Image;
				Pattern pattern	= new Pattern(pathloc);				
				screen.wait(pattern,20);	
				Region region	= screen.exists(pattern);
				if (region!= null){						
					screen.mouseMove(region);					
					screen.doubleClick(region);	
					
				}
				else {
            		           		
            	}
					
			}	
			catch (Exception e)
			{
				
					
					
				
				
			}	
	}
					
	
	
	
		       
		
		
				
	public static void beforeClickElementUsingImage(String Image) throws Throwable{
		
		Settings.MinSimilarity 			= 0.50;        // 0.7 default
		Settings.WaitScanRate 			= 0.3f; 		  	// 0.3f/sec default
		Settings.ObserveScanRate 	= 0.3f;  		// 0.3f/sec default
		Settings.OcrTextSearch         = true;	
		
			try				
			{
		
				Screen screen = new Screen();
			String pathloc = pathLocation + Image;
			//String pathReg = pathLocation + Image;
			Pattern pattern	= new Pattern(pathloc);	
				screen.onAppear(pathLocation,new ObserverCallBack() {
	                @Override
	                public void appeared(ObserveEvent event) {		                	
	                	if(screen.exists(pattern).isValid()){
	                		screen.stopObserver();
	                    	       	
	                	}
	                	else {
	                		                		
	                	}
	                }
				}
			
				);		
				screen.observe(20);
				screen.stopObserver();				
							
			}catch (Exception e){		
			
				
				
			}	
	}
		
	
	
	public static void beforeClickElementUsingImage1(String Image) throws Throwable{
	
	
		Settings.MinSimilarity = 0.50; 
		Settings.WaitScanRate = 0.3f; 
		Settings.ObserveScanRate = 1f; 
		Settings.OcrTextRead = true;
		Settings.OcrTextSearch = true;
		
			try				
			{
				
			
			Screen screen = new Screen();
			String pathloc = pathLocation+ Image;
			//String pathReg = pathLocation + Image;
			Pattern pattern	= new Pattern(pathloc);			
			screen.onAppear(pathLocation, new ObserverCallBack() {
                @Override
                public void appeared(ObserveEvent event) {  	                       
                	try {	
                		if(screen.exists(pattern).isValid()){  					
	    					event.getRegion().find(pattern);	    	    					
	    					event.getRegion().stopObserver();
    	                	}
                		else {
                    		                		
                    	}
        					
                	} catch (FindFailed e){  
                		System.out.println(e);
            		
                		
						
					}        		
            	}	         
    			
        	}				
    		
    		);				
			screen.observe(30);
			screen.stopObserver();				
				
			}
			
			catch (Exception e){
			
				
			}
		
			
	}
	
	public static void waitforImageToDisappear(String Image) throws Throwable{
		
		
		Settings.ObserveScanRate = 1f;
		//ObserveScanRate = 0.5;
		//Settings.MinSimilarity 				= 0.50;        
		//Settings.WaitScanRate 				= 0.3f; 
		
			try				
			{
			
			Screen screen = new Screen();
			String pathloc = pathLocation + Image;
			//String pathReg = pathLocation + Image;
			Pattern pattern	= new Pattern(pathloc);	
			Region region	= screen.exists(pattern);	
			
		
				region.onVanish(pathLocation,
				        new ObserverCallBack() {
	                @SuppressWarnings("unused")
					public void VANISH(ObserveEvent event) {
		                if(	event.getRegion().isValid()){
		                	
		                }
		                else {
	                			                		
	                	}
	        			
	                }
		        }              
				
			);
			region.observe(20);
			region.stopObserver(); 
			System.out.println("Region has been successfully located");	
			
			}
			
			catch (Exception e)
			{
				
				
			}
	
	
		}
	
	public static void SynchornizeApperanceOfNewWindow(String Image) throws Throwable{
		
		Settings.MinSimilarity = 0.50; 
		Settings.WaitScanRate = 0.3f; 
		Settings.ObserveScanRate = 0.3f; 
		Settings.OcrTextRead = true;
		Settings.OcrTextSearch = true;	
		Settings.experimental = true;
		
		
				
		try
		{	
				
			Screen screen = new Screen();
			String pathloc = pathLocation+ Image;
			//String pathReg = pathLocation + Image;
			Pattern pattern	= new Pattern(pathloc);		
			screen.onAppear(pathLocation,new ObserverCallBack() {
	            @Override
	            public void appeared(ObserveEvent event) {	 	            	
	            	if(screen.exists(pattern).isValid()){
	            		screen.stopObserver();						
					} 
	            	else {
                		              		
                	}
	                	
	                }
				}
			);	
			screen.observe(30);
			screen.stopObserver();
		
		}catch (Exception e){
					
		}
			
	}			
	
	

	public static void waitforImagetoAppearAnddoubleClick(String Image) throws Throwable{
			
			
			
			
				try				
					{
						
					Screen screen = new Screen();
					String pathloc = pathLocation+ Image;
					//String pathReg = pathLocation + Image;
					Pattern pattern	= new Pattern(pathloc);							
					screen.onAppear(pathLocation,new ObserverCallBack() {
		                @Override
		                public void appeared(ObserveEvent event) {
		                	if(screen.exists(pattern).isValid()){
		                	event.getRegion().mouseMove();		                	
		                	event.getRegion().doubleClick();
		                	screen.stopObserver();
		                	}
		                	else {
		                		             		
		                	}
		                	
		                }
					}
					);
					screen.observe(10);
					screen.stopObserver();				
					}
					
				catch (Exception e)
				{			
				
					
					
				}
	
			}
		
	
	public static void DoubleclickElementUsinglocation(int x, int y,String Image) throws Throwable{			
		
		try
		{
			Screen screen = new Screen();
			String pathloc = pathLocation+ Image;
			//String pathReg = pathLocation + Image;
			Pattern pattern	= new Pattern(pathloc);
			screen.onAppear(pathLocation,new ObserverCallBack() {
                @Override
                public void appeared(ObserveEvent event) {
                	if(screen.exists(pattern).isValid()){
                	
                	Location loc = 	new Location(x,y);
                	screen.setLocation(loc);
                	try {
						screen.mouseMove(loc);
						screen.doubleClick(loc);
	                	
					} catch (FindFailed e) {
					
						e.printStackTrace();
					}
                	screen.stopObserver();
                	}	
                	else {
                			
                	}
                	
                }
			}
		);
		screen.observe(10);
		screen.stopObserver();			
		
		}catch(Exception e){
			
			
		}
			
		
	}	
			
	
	
	
}










