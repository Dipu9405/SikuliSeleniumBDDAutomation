package com.SikuliBaseTest;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.sikuli.basics.Settings;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Location;
import org.sikuli.script.ObserveEvent;
import org.sikuli.script.ObserverCallBack;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;
import org.sikuli.script.SikuliException;

@SuppressWarnings({ "unused", "deprecation" })
public class SikuliMethods<event>{
	
	private static final String CommonMethods = null;
	WebDriver objWebdriver = null;
	//public Object handle;
	public static Object background;
	//public static Object region;
	protected static ObserveEvent evt;
	public static Integer MaxWaitTime = 8000;
	//Settings.MinSimilarity = 0.50;
	public static String pathScreenShot = "C:\\WorkSpace\\SikuliBaseTest-Framework\\LocationScreenShots\\TestResults\\Screenshots\\";
	public static String pathLocation ="C:\\WorkSpace\\SikuliBaseTest-Framework\\LocationScreenShots\\";
	public static String pathRegion = "C:\\WorkSpace\\SikuliBaseTest-Framework\\RegionScreenShots\\";
	

	// ---------------------------------------------- Screen class features -----------------------------------------

	

		
	
	

	public static void WaitUntillNewPageAppears(String Image) throws SikuliException, Throwable{
		
		
		
		
	
			try
			{	
				Thread.sleep(2000);
				Screen screen = new Screen();
				String pathloc = pathLocation + Image;			
				Pattern pattern	= new Pattern(pathloc);				
				Region region	= screen.exists(pattern);					
				if (region!= null){	
				screen.onAppear(region);
				System.out.println("Region found");				
		    	
		    	 
				}
			
			}catch (Exception e){
			
				
			}
				
				
			
			
		}

		
	
	public static void synchornizeElementListUsingImage(String Image, float sim) throws SikuliException, Throwable{
		
		
		
		
		
			try
			{	
				Screen screen = new Screen();
				String pathloc = pathLocation + Image;			
				Pattern pattern	= new Pattern(pathLocation).similar(sim);	
				screen.wait(pattern, 16);
				Region region	= screen.exists(pattern);					
				if (region!= null){	
					screen.onAppear(region);
					System.out.println("Region found");
				//region.click();
				//Thread.sleep(3000);
				
		    	 		
			}	
			}
			catch (Exception e)
			{
				
			}
			
			
		

		}
		
		
	   
		
	
	
	
	public static boolean synchornizeElementUsingImage(String Image){
		Settings.MinSimilarity = 0.50; 
		Settings.WaitScanRate = 0.3f; 
		Settings.ObserveScanRate = 0.3f; 					
		String pathloc = pathLocation + Image;			
				
			
			try{
				
			
				Screen screen = new Screen();				
				Pattern pattern= new Pattern(pathloc).similar(0.7f);
				//screen.wait(pattern,20);
				Thread.sleep(2000);
				Region region = screen.exists(pattern);
								
				if(null != region) {		
					
					System.out.println("Region found");
					return true;					
					 
					}
				
					
			}catch(Exception e){
				
			
			}			
			
			
		
			return false;
		}
	
	
	public static void synchornizeElementUsingImageAndclick(String Image){
		Settings.MinSimilarity = 0.50; 
		Settings.WaitScanRate = 0.3f; 
		Settings.ObserveScanRate = 0.3f; 					
		String pathloc = pathLocation + Image;			
			
			
			try{
				
			
				Screen screen = new Screen();				
				Pattern pattern= new Pattern(pathloc).similar(0.7f);
				screen.wait(pattern,30);	
				Region region = screen.exists(pattern);							
				if(null != region) {		
					screen.onAppear(region);
					System.out.println("Region found");
					region.click();						
					 
					}
				
					
			}catch(Exception e){
				
			
			}
			
			
			
		
		
		
			
	}
	
	
	
	
	public static boolean synchornizeElementUsingImageCustomTimeIntervel(String Image,double timeIntervel){
		Settings.MinSimilarity = 0.50; 
		Settings.WaitScanRate = 0.3f; 
		Settings.ObserveScanRate = 0.3f; 					
		String pathloc = pathLocation + Image;			
		
				
			
			try{
				Screen screen = new Screen();	
				Pattern pattern= new Pattern(pathloc).similar(0.7f);
				screen.wait(pattern,20);	
				Region region = screen.exists(pattern);							
				if(null != region) {	
					screen.onAppear(region);
					System.out.println("Region found");
					return true;					
					 
					}
				
					
			}catch(Exception e){
				
			
			}			
		
			
			
			
		
		
			return false;
		}
	
	
	
	public static boolean synchornizeElementUsingImage(String Image, float sim){
		Settings.MinSimilarity = 0.50; 
		Settings.WaitScanRate = 0.3f; 
		Settings.ObserveScanRate = 0.3f; 
		String pathloc = pathLocation + Image;			
		
		
		
			
			try{						
				Screen screen = new Screen();
				Pattern pattern= new Pattern(pathloc).similar(sim);
				screen.wait(pattern,20);	
				Region region = screen.exists(pattern);
								
				if(null != region) {					
					screen.onAppear(region);
					System.out.println("Region found");			
					return true;					
					 
					}
				
				
			}catch(Exception e){
				
			
			}			
			
		
			
		
			return false;
		
}
	public static void synchornizeElementUsingImageAndTakeScreenshots(String Image){
		int NOofTry = 1;
		Random rand = new Random();
		int random = rand.nextInt(10000);
		String FolderNamePFname ="TestResult"+random+1;
		
		
			
			
			
			try{
				
				Screen screen = new Screen();
				String pathloc = pathLocation + Image;			
				Pattern pattern= new Pattern(pathloc).similar(0.7f);
				screen.wait(pattern,20);	
				Region region	= screen.exists(pattern);					
				if (region!= null){	
				
				screen.wait(pattern, 1);
				
								
					
							
					 
					}
				
				
			}catch(Exception e){
				
			
			
			
			
		}
	
	}
	
	public static void mouseMoveAndclickElementUsingImage1(String Image) throws Throwable{
		// image matching using pattern class with CUSTOM SIMILARITY percentage
		
		Settings.MinSimilarity = 0.50; 
		Settings.WaitScanRate = 0.3f; 
		Settings.ObserveScanRate = 0.3f; 
		//Settings.OcrTextRead = true;
		//Settings.OcrTextSearch = true;
		Settings.isWindows();
		//Settings.ObserveMinChangedPixels = 9;
		Settings.experimental = true;
		//Settings.UseImageFinder = true;
		String pathReg = pathRegion + Image;
		String pathloc = pathLocation + Image;
		String Pth1 = "C:\\Users\\ei3754\\esi-sofea\\ws\\IntakeFT\\LocationScreenShots\\Highlighted Patient Info Tab.PNG";
		
		Screen screen 					= new Screen();

		// manually open patterncompare/mainimage.png full screen using MS photo viewer
		
			try{
				
				Pattern pattern 					= new Pattern(pathloc).similar(1f);
				//Pattern pattern1 					= new Pattern(Pth1).similar(1f);
				Region expectedRegion	= screen.exists(pattern);
				//Region expectedRegion1	= screen.exists(pattern1);
			  // expectedRegion.highlight(1);
				
				if(null != expectedRegion) {
					Location L = expectedRegion.getTarget();
					//expectedRegion.delayClick(3000);
					//expectedRegion.highlight();
					//Thread.sleep(3000);
					//expectedRegion.onChange().;
					//L.hover();
					//expectedRegion.
					L.click();
					expectedRegion.mouseMove(expectedRegion);
					Thread.sleep(1000);
					screen.click(expectedRegion);
					
					//expectedRegion.click();
					//click();
					//Thread.sleep(3000);
					
					 	
					}			
				
			}catch(Exception e){	
			
			}
				
			
			
			
			

						
			
		}
	public static void HighlightAndclickElementUsingImage1(String Image) throws Throwable{
		// image matching using pattern class with CUSTOM SIMILARITY percentage
		//Settings.MinSimilarity = 0.50; 
		Settings.WaitScanRate = 0.3f; 
		Settings.ObserveScanRate = 0.3f; 
		Settings.OcrTextRead = true;
		Settings.OcrTextSearch = true;
		String pathReg = pathRegion + Image;
		String pathloc = pathLocation + Image;
		Screen screen 					= new Screen();
		

			try{
			
				Pattern pattern 					= new Pattern(pathloc).similar(0.9f);
				Region expectedRegion	= screen.exists(pattern);
				
				
				if(null != expectedRegion) {
					//expectedRegion.delayClick(3000);
					expectedRegion.highlight();
					expectedRegion.click(pattern);
					//Thread.sleep(3000);
					
					 
					}			
				
			}catch(Exception e){	
			
			}
				
			
			
			

				
			
		}
	

	
	public static void setValueUsingImage1(String Image, String arg) throws Throwable{
		// image matching using pattern class with CUSTOM SIMILARITY percentage
		Robot robot = new Robot();
		Settings.MinSimilarity = 0.50; 
		Settings.WaitScanRate = 0.3f; 
		Settings.ObserveScanRate = 0.3f; 
		Settings.OcrTextRead = true;
		Settings.OcrTextSearch = true;
		String pathReg = pathRegion + Image;
		String pathloc = pathLocation + Image;
		Screen screen 					= new Screen();
			try{
			
				
				if(SikuliMethods.synchornizeElementUsingImage(Image)) {					
					Pattern pattern	= new Pattern(pathloc).similar(0.5f);
					screen.wait(pattern,20);	
					Region region	= screen.exists(pattern);					
					region.click(); 
					region.keyDown(Key.CTRL); 
					region.type("a"); 
					region.keyUp(Key.CTRL);
					Thread.sleep(1000);
					region.type(Key.DELETE);
					Thread.sleep(1000);
					region.type(arg);
					Thread.sleep(1000);			
					
					}
			
				else{						
								 
				}					
				
				
				
			}catch(Exception e)			
			{
			
			}				
		
	}

	public static void setValue(String Image, String arg) throws Throwable{
		// image matching using pattern class with CUSTOM SIMILARITY percentage
		Settings.MinSimilarity 				= 0.50;        // 0.7 default
		Settings.WaitScanRate 				= 0.3f; 		  	// 0.3f/sec default
		Settings.ObserveScanRate 		= 0.3f;  		// 0.3f/sec default
		String pathReg = pathRegion + Image;
		String pathloc = pathLocation + Image;
		Screen screen 					= new Screen();
	//	while(WaitMethods.alreadyWaitedTime < MaxWaitTime){
		// manually open patterncompare/mainimage.png full screen using MS photo viewer
			try{
				//Screen screen 					= new Screen();
				Pattern pattern 					= new Pattern(pathloc).similar(0.5f);
				Region expectedRegion	= screen.exists(pattern);
				if(null != expectedRegion) {expectedRegion.click(pattern);			
				//Thread.sleep(2000);			
				screen.click(pattern);			
				Thread.sleep(2000);
				
				}
			
				
				
			}catch(Exception e)			
			{
			
			}
			

			
		
	}

	public static void scrollElementUsingImage1(String Image,int NumTimesScrl) throws Throwable{
		// image matching using pattern class with CUSTOM SIMILARITY percentage
		Settings.MinSimilarity 				= 0.50;        // 0.7 default
		Settings.WaitScanRate 				= 0.3f; 		  	// 0.3f/sec default
		Settings.ObserveScanRate 		= 0.3f;  		// 0.3f/sec default
		String pathReg = pathRegion + Image;
		String pathloc = pathLocation + Image;
	
		
		
		
	
			try{
		
				Screen screen = new Screen();
				int NumofScrolls = 1;
			
				Robot robot = new Robot();
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				if(SikuliMethods.synchornizeElementUsingImage(Image)) {
					
					Pattern pattern	= new Pattern(pathloc).similar(0.5f);
					Region expectedRegion	= screen.exists(pattern);
					screen.wait(pattern,20);
					expectedRegion.click(pattern);
					while( NumofScrolls <= NumTimesScrl){
				
						
					robot.keyPress(KeyEvent.VK_PAGE_DOWN);	
					robot.keyRelease(KeyEvent.VK_PAGE_DOWN);						
				
					
					NumofScrolls =  NumofScrolls+1;
					Thread.sleep(2000);
					
					}					
					
					
					
					 
					}
				
			}catch(Exception e)			
			{
			
			}
			

			
		
	}

	
	public static void scrollAndClickElement(String Image,String Image1) throws Throwable{
		// image matching using pattern class with CUSTOM SIMILARITY percentage
		Settings.MinSimilarity 				= 0.50;        // 0.7 default
		Settings.WaitScanRate 				= 0.3f; 		  	// 0.3f/sec default
		Settings.ObserveScanRate 		= 0.3f;  		// 0.3f/sec default
		String pathloc = pathLocation + Image;
		String Pth1 = pathLocation + Image1;		
		
		
		
		
			try{			
				
				Screen screen = new Screen();	
					if(SikuliMethods.synchornizeElementUsingImage(Image,0.5f)){
						
						Pattern pattern	= new Pattern(pathloc).similar(0.5f);
						screen.wait(pattern,20);	
						Region expectedRegion	= screen.exists(pattern);						
						expectedRegion.click();					
						
						if(SikuliMethods.synchornizeElementUsingImage(Image1,0.5f)){
							
							Pattern pattern1	= new Pattern(Pth1).similar(0.5f);
							screen.wait(pattern1,20);
							Region expectedRegion1	= screen.exists(pattern1);							
							expectedRegion1.click();
												
							
							}
						
					} 
					
			
					}catch (Exception e)
					{
						
					}
						
						
					
				
				
			}
	
	public static void scrollAnddoubleClickElement1(String Image,String Image1) throws Throwable{
	
		
		// image matching using pattern class with CUSTOM SIMILARITY percentage
		Settings.MinSimilarity 				= 0.50;        // 0.7 default
		Settings.WaitScanRate 				= 0.3f; 		  	// 0.3f/sec default
		Settings.ObserveScanRate 		= 0.3f;  		// 0.3f/sec default
	    String pathloc = pathLocation + Image;
		String path1 = pathLocation + Image1;					
					
				Screen screen = new Screen();									
				Pattern pattern	= new Pattern(pathloc).similar(0.5f);							
				screen.wait(pattern,5);
				Region expectedRegion	= screen.exists(pattern);
				expectedRegion.mouseMove(pattern);
				expectedRegion.click(pattern);				
			
			
					try
					{
						screen.type(Key.PAGE_DOWN);
						Pattern pattern1	= new Pattern(path1).similar(0.9f);									
						screen.wait(pattern1,5);
						Region expectedRegion1	= screen.find(pattern1);
						if ( expectedRegion1 != null){
							expectedRegion1.mouseMove(pattern1);
							expectedRegion1.doubleClick(pattern1);
						
						
						}						
					}catch (Exception e)
					{	
					
		
		}
	}			
	
public static void scrollAnddoubleClickElement(String Image,String Image1) throws Throwable{
	
		
		
		Settings.MinSimilarity 				= 0.50;        
		Settings.WaitScanRate 				= 0.3f; 		  	
		Settings.ObserveScanRate 		= 0.3f;  	
		String pathloc = pathLocation + Image;
		String path1 = pathLocation + Image1;	
		
			
				try{
					
						Screen screen = new Screen();						
							
						Pattern pattern	= new Pattern(pathloc).similar(0.5f);
						screen.wait(pattern,20);
						Region expectedRegion	= screen.exists(pattern);
						if (expectedRegion!= null){
							expectedRegion.click();								
							Pattern pattern1= new Pattern(path1).similar(0.98f);
							screen.wait(pattern1,20);
							Region expectedRegion1	= screen.exists(pattern1);							
							expectedRegion1.mouseMove(pattern1);
							expectedRegion1.doubleClick(pattern1);
						}
						else {
							

							
						}
							
			
					}catch (Exception e)
					{
					
						
						
					}
					
				}	

				

	
	public static void scrollByArrowAndClickElement(String Image,String Image1) throws Throwable{
		// image matching using pattern class with CUSTOM SIMILARITY percentage
		Settings.MinSimilarity 				= 0.50;        // 0.7 default
		Settings.WaitScanRate 				= 0.3f; 		  	// 0.3f/sec default
		Settings.ObserveScanRate 		= 0.3f;  		// 0.3f/sec default
		String pathloc = pathLocation + Image;
		String path1 = pathLocation + Image1;		
		
		
			try{
				
				Screen screen = new Screen();					
				Robot robot = new Robot();
				if(SikuliMethods.synchornizeElementUsingImage(Image,0.5f)){
					
						Pattern pattern	= new Pattern(pathloc).similar(0.5f);	
						screen.wait(pattern,20);
						Region expectedRegion	= screen.exists(pattern);					
						expectedRegion.click();	
						
						//while(WaitMethods.alreadyWaitedTime < MaxWaitTime){
							robot.keyPress(KeyEvent.VK_PAGE_DOWN);	
							robot.keyRelease(KeyEvent.VK_PAGE_DOWN);							
							
							Pattern pattern1	= new Pattern(path1).similar(0.5f);
							screen.wait(pattern1,20);							
							//Region expectedRegion1	= screen.exists(pattern1);
							Region expectedRegion1	= screen.find(pattern1);
							if(expectedRegion1 != null){
							//Thread.sleep(2000); 
							//expectedRegion1.mouseMove(pattern1);
							expectedRegion1.click(pattern1);
																					
							}
							else{
								//WaitMethods.alreadyWaitedTime = WaitMethods.alreadyWaitedTime + 1000;
								
							}
							
						}
				
				
			}catch(Exception e)			
			{
					
			}	
							

	}
	
	
	public static void scrollByArrowAndClickElementUsingRegion(String Image1,String Image) throws Throwable{
	
		Settings.MinSimilarity 	= 0.50;        
		Settings.WaitScanRate = 0.3f; 		  	
		Settings.ObserveScanRate = 0.3f;		
		String pathloc1 = pathLocation + Image1;
		String pathloc = pathLocation + Image;
		String pathRegion = pathLocation + Image;		
		
		
			try{
				
				Screen screen = new Screen();					
				Robot robot = new Robot();
				if(SikuliMethods.synchornizeElementUsingImage(Image,0.5f)){
					
						Pattern pattern	= new Pattern(pathloc1).similar(0.5f);	
						screen.wait(pattern,20);
						Region expectedRegion	= screen.exists(pattern);					
						expectedRegion.click();	
						
						//while(WaitMethods.alreadyWaitedTime < MaxWaitTime){
							robot.keyPress(KeyEvent.VK_PAGE_DOWN);	
							robot.keyRelease(KeyEvent.VK_PAGE_DOWN);							
							Pattern pattern1	= new Pattern(pathRegion);												
							Region expectedRegion1	= screen.exists(pattern1);
							expectedRegion1.setROI(expectedRegion1);
							expectedRegion1.highlight(1);
							
							
							if(expectedRegion1 != null){
								Pattern pattern2 = new Pattern(pathloc);
								Region expectedRegion2	= screen.find(pattern2);	
								expectedRegion2.highlight(2);
								expectedRegion2.click(pattern2);
																									
							}
							else{
								//WaitMethods.alreadyWaitedTime = WaitMethods.alreadyWaitedTime + 1000;
								
							}
							
						}
				//}
				
			}catch(Exception e)			
			{
					
			
			}				

	}
	public static void scrollByArrowAndClickElementUsingRegion1(String Image,String Image1) throws Throwable{
		
		Settings.MinSimilarity 	= 0.50;        
		Settings.WaitScanRate = 0.3f; 		  	
		Settings.ObserveScanRate = 0.3f;		
		String pathloc = pathLocation + Image;
		String pathloc1 = pathLocation + Image1;
		//String pathRegion = pathLocation + Image;		
		
		
			try{
				
				Screen screen = new Screen();					
				Robot robot = new Robot();					
				Pattern pattern	= new Pattern(pathloc).similar(0.5f);	
				screen.wait(pattern,20);
				Region expectedRegion	= screen.exists(pattern);					
				expectedRegion.click();	
				
				for (int i = 1; i<=4; i++){
					robot.keyPress(KeyEvent.VK_PAGE_DOWN);	
					robot.keyRelease(KeyEvent.VK_PAGE_DOWN);							
					Pattern pattern1 = new Pattern(pathloc1);												
					Region expectedRegion1	= screen.exists(pattern1);	
					if(expectedRegion1!=null){
						screen.find(pattern1).highlight(1);
						break;
					}
					else{
						
					if(expectedRegion1==null & i>4){
						for (int j = 1; j<=4; j++){
						robot.keyPress(KeyEvent.VK_PAGE_UP);	
						robot.keyRelease(KeyEvent.VK_PAGE_UP);
						
						if(expectedRegion1!=null){
							screen.find(pattern1).highlight(1);
							break;
						
					}
					
				}
			
					}
					}
				}
				
			}catch(Exception e)			
			{
						
			
			}				
					
	}
	
	public static void scrollByArrowAndClickElement1(String Image1,String Image2) throws Throwable{
		// image matching using pattern class with CUSTOM SIMILARITY percentage
		//Settings.MinSimilarity 				= 0.50;        // 0.7 default
		Settings.WaitScanRate 				= 0.3f; 		  	// 0.3f/sec default
		Settings.ObserveScanRate 		= 0.3f;  		// 0.3f/sec default
		Settings.getOS();
		String path1 = pathLocation + Image1;
		String path2 = pathLocation + Image2;		
				
		Robot robot = new Robot();				
		Screen screen = new Screen();				
		Pattern pattern1	= new Pattern(path1).similar(0.5f);
		Pattern pattern2	= new Pattern(path2).similar(0.8f);
		//int pattern2	= BufferedImage.BITMASK;	
		
		screen.wait(pattern1,20);
		Region expectedRegion	= screen.exists(pattern1);
		
		if (expectedRegion != null){
			expectedRegion.mouseMove(pattern1);
			expectedRegion.click(pattern1);
			
			//while(WaitMethods.alreadyWaitedTime < WaitMethods.MaxWaitTime1){	
				
				try{	
					//WaitMethods.waitforTime(WaitMethods.alreadyWaitedTime);
					robot.keyPress(KeyEvent.VK_PAGE_DOWN);	
					robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
					screen.wait(pattern2,2);
					Region region = screen.exists(pattern2);
					
					
					
					if(region!=null){
						region.setROI(region);
						region.highlight(2);						
						region.mouseMove(pattern2);
						region.click(pattern2);
													
					}
			
				}catch(Exception e){
	
					
				}				
				/*	}
		
		 * if (WaitMethods.alreadyWaitedTime <WaitMethods.MaxWaitTime1) {
		 * WaitMethods.alreadyWaitedTime = WaitMethods.alreadyWaitedTime + 1000;
		 * 
		 * } else{
		 * 
		 * Assert.fail(Image1+"does not exist"); CommonMethods.testStepPassFlag = false;
		 * CommonMethods.closeAllBrowsers(); }
		 */			
		}		
		
				
		}

	
	
	//@SuppressWarnings("static-access")
	public static void scrollByArrowAndClickElement4(String Image1,String Image2) throws Throwable{
		
		
		Settings.MinSimilarity = 0.50;		
		Settings.isRunningIDE = true;
		Settings.ThrowException = true;
		Settings.WaitScanRate = 0.3f; 
		//Settings.ObserveScanRate 		= 0.3f; 
		Settings.OcrTextRead = true;
		Settings.OcrTextSearch= true;
		Settings.isWindows();		
		String path1 = pathLocation + Image1;
		String path2 = pathRegion + Image2;		
		Settings.OverwriteImages= true;	
		Region R = null;		
		Robot robot = new Robot();				
		Screen screen = new Screen();				
		Pattern pattern1	= new Pattern(path1).similar(0.5f);
		Pattern pattern2	= new Pattern(path2).similar(0.5f);	
		screen.wait(pattern1,20);
		Region expectedRegion	= screen.exists(pattern1);
		
		if (expectedRegion != null){
			expectedRegion.mouseMove(pattern1);
			expectedRegion.click(pattern1);
			
			//while(WaitMethods.alreadyWaitedTime < WaitMethods.MaxWaitTime1){	
				try{			
					robot.keyPress(KeyEvent.VK_PAGE_DOWN);	
					robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
					screen.wait(pattern2,10);
					R = screen.exists(pattern2);							
					if(R!=null){
						
						screen.setROI(R);								
						final File imageFile = new File(path2);								
						ScreenImage img1 = screen.capture(R);	
					
				
						if(ClickMethods.clickElementUsingImage3(img1,screen,R,"Submit")){
							
						}						
					}							
											           			
					
				}catch(Exception e){

				
					/*}				
			
			 * if (WaitMethods.alreadyWaitedTime <WaitMethods.MaxWaitTime1) {
			 * WaitMethods.alreadyWaitedTime = WaitMethods.alreadyWaitedTime + 1000;
			 * 
			 * } else{
			 * 
			 * Assert.fail(Image1+"does not exist"); CommonMethods.testStepPassFlag = false;
			 * CommonMethods.closeAllBrowsers(); }
			 */				
					
			}
				
		}

	
	}
	
	private static Object Pattern(File imageFile) {
		// TODO Auto-generated method stub
		return null;
	}



	public static void MatchElementUsingImage1(String Image){
		// image matching using pattern class with CUSTOM SIMILARITY percentage
		Settings.MinSimilarity 				= 0.50;        // 0.7 default
		Settings.WaitScanRate 				= 0.3f; 		  	// 0.3f/sec default
		Settings.ObserveScanRate 		= 0.3f;  		// 0.3f/sec default
		String pathloc = pathLocation + Image;
		Pattern pattern	= new Pattern(pathloc).similar(0.7f);	
		
		// manually open patterncompare/mainimage.png full screen using MS photo viewer
		
			try{
				Screen screen = new Screen();
				screen.waitVanish(pattern, 20);					
				
					System.out.println("Expected and actual result mmatches and test passed");
					screen.saveScreenCapture(pathScreenShot);					
					Thread.sleep(1000);
					//break;				
			
				
			}catch(Exception e)			
			{
				Screen screen = new Screen();
				screen.saveScreenCapture(pathScreenShot);								
				Assert.fail(Image+"does not exist");
				
			
			}				
		
	}

	public static boolean MatchElementReturnResult(String Image) throws Throwable{
		
		
		//Settings.ObserveScanRate = 1f;
		//ObserveScanRate = 0.5;
		Settings.MinSimilarity 				= 0.50;        
		Settings.WaitScanRate 				= 0.3f; 
		Screen screen = new Screen();
			try				
			{
				
			String pathloc = pathLocation + Image;		
			Pattern pattern	= new Pattern(pathloc).similar(0.7f);	
			
				screen.onAppear(pathloc,new ObserverCallBack() {
	                @Override
	                public void appeared(ObserveEvent event) {	              
		            	
						if(event.getRegion().exists(pattern) != null){							
							
							screen.saveScreenCapture(pathScreenShot);
		                	
							}
						else{
							
						}
					}
	                
				}
			);
			
						
			screen.stopObserver();			
			}
			
			catch (Exception e)
			{
				System.out.println("Expected and actual result does not mmatch and test failed");
				
				screen.saveScreenCapture(pathScreenShot);
				//screen.saveScreenCapture("C:\\Users\\ei3754\\esi-sofea\\ws\\IntakeFT\\LocationScreenShots\\TestResults\\Screenshots\\",Image);			
			}
			return true;
		}
	
	
	public static boolean MatchElementReturnResult1(String Image) throws Throwable{
		// image matching using pattern class with CUSTOM SIMILARITY percentage
		Settings.MinSimilarity 				= 0.50;    
		Settings.WaitScanRate 				= 0.3f; 	
		Settings.ObserveScanRate 		= 0.3f;  	
		String pathReg = pathRegion + Image;
		String pathloc = pathLocation + Image;
		
			
			try{
					
					Screen screen = new Screen();				
					Pattern pattern = new Pattern(pathloc).similar(0.7f);				
					Region expectedRegion	= screen.exists(pattern);
					screen.wait(pattern,20);
					if (expectedRegion!= null){	
						System.out.println("Expected and actual result mmatches and test passed");
						
						//initializeScreenshot1(String nameDocument)
						screen.saveScreenCapture(pathScreenShot);
						//screen.saveScreenCapture("C:\\Users\\ei3754\\esi-sofea\\ws\\IntakeFT\\LocationScreenShots\\TestResults\\Screenshots\\",Image);
						Thread.sleep(2000);			
						
					}
					else{
						
						//initializeScreenshot1(String nameDocument)
						screen.saveScreenCapture(pathScreenShot);
						//screen.saveScreenCapture("C:\\Users\\ei3754\\esi-sofea\\ws\\IntakeFT\\LocationScreenShots\\TestResults\\Screenshots\\",Image);
						Thread.sleep(2000);			
						
						
					}									
							
				
				}catch(Exception e)			
					{
						
					
					}
					
		return true;			
			
		}
	
	public static boolean MatchElementReturnResult(String Image, float sim) throws Throwable{
		// image matching using pattern class with CUSTOM SIMILARITY percentage
		Settings.MinSimilarity 				= 0.50;    
		Settings.WaitScanRate 				= 0.3f; 	
		Settings.ObserveScanRate 		= 0.3f;  	
		String pathReg = pathRegion + Image;
		String pathloc = pathLocation + Image;
	
		// manually open patterncompare/mainimage.png full screen using MS photo viewer
		
			
			try{
							
				Screen screen = new Screen();				
				Pattern pattern = new Pattern(pathloc).similar(sim);				
				Region expectedRegion	= screen.exists(pattern);
				screen.wait(pattern,20);
				if (expectedRegion!= null){	
				System.out.println("Expected and actual result mmatches and test passed");
				
				screen.saveScreenCapture(pathScreenShot);
				//screen.saveScreenCapture("C:\\Users\\ei3754\\esi-sofea\\ws\\IntakeFT\\LocationScreenShots\\TestResults\\Screenshots\\",ScreenshotMethods.screenshotFileName);
				}
											
							
				
			}catch(Exception e){
				Assert.fail(Image+"does not exist");
				
				
			}
				
			
		return true;			
			
		}
	
	public static void MatchElementUsingImage(String Image, float sim) throws Throwable{
		// image matching using pattern class with CUSTOM SIMILARITY percentage
		Settings.MinSimilarity 				= 0.50;        // 0.7 default
		Settings.WaitScanRate 				= 0.3f; 		  	// 0.3f/sec default
		Settings.ObserveScanRate 		= 0.3f;  		// 0.3f/sec default
		String pathReg = pathRegion + Image;
		String pathloc = pathLocation + Image;
		
		// manually open patterncompare/mainimage.png full screen using MS photo viewer
	
			try{
				
				
								
				
				Screen screen = new Screen();				
				Pattern pattern = new Pattern(pathloc).similar(sim);				
				Region expectedRegion	= screen.exists(pattern);
				screen.wait(pattern,20);
				if (expectedRegion!= null){	
				System.out.println("Expected and actual result mmatches and test passed");
				
				screen.saveScreenCapture(pathScreenShot);
				//screen.saveScreenCapture("C:\\Users\\ei3754\\esi-sofea\\ws\\IntakeFT\\LocationScreenShots\\TestResults\\Screenshots\\",ScreenshotMethods.screenshotFileName);
				}
				else{
									
				}
					
				
				
			}catch(Exception e)			
			{
			
			}
		
	}
	
	public static void MatchElementUsingImage(String Image) throws Throwable{
		

		//Settings.UseImageFinder = true;
		Settings.MinSimilarity = 0.50; 
		Settings.WaitScanRate = 0.3f; 
		Settings.ObserveScanRate = 0.1f; 
		Settings.OcrTextRead = true;
		Settings.OcrTextSearch = true;
		
			
				
				Screen screen = new Screen();
				String pathloc = pathLocation + Image;
				//String pathReg = pathLocation + Image;
				Pattern pattern	= new Pattern(pathloc);			
			
				Thread.sleep(2000);
			try				
			{
				Region region	= screen.exists(pattern);
				if (region!= null){	
					System.out.println("Expected and actual result mmatches and test passed");
					
					screen.saveScreenCapture(pathScreenShot);
					
				}					
				
			}catch (Exception e){		    			
		    			
			}
			
		
	}

		
		
			
		
		
		
		
		
		
		
		
	
	public static boolean MatchElementUsingImage1Return(String Image, float sim) throws Throwable{
		// image matching using pattern class with CUSTOM SIMILARITY percentage
		Settings.MinSimilarity 				= 0.50;        // 0.7 default
		Settings.WaitScanRate 				= 0.3f; 		  	// 0.3f/sec default
		Settings.ObserveScanRate 		= 0.3f;  		// 0.3f/sec default
		String pathloc = pathLocation + Image;
	
			
			
				
				Screen screen = new Screen();
				Pattern pattern = new Pattern(pathloc).similar(sim);				
				//Region expectedRegion	= screen.exists(pattern);
				//expectedRegion.observe(20);	
				
				try{
					
					screen.onAppear(pattern, new ObserverCallBack() {					
		                @Override
		                public void appeared(ObserveEvent event) {
		                	Region region = event.getRegion().exists(pattern);
			            	 if (region!= null){
			            		 region.setROI(region);
			            		 region.highlight(2);
			            		 
			            		screen.saveScreenCapture(pathScreenShot);			            		 
			        			
			        			event.getRegion().stopObserver();
			            	 }
			                	
			            }         
							
		            					
					}
				);
				screen.observe(20);
				screen.stopObserver();		
					
				
					
				}catch(Exception e)	
					
				{
					
				
				}	
			
		
		return true;	
	}

			
	public static void exactMatchElementUsingImage1(String Image) throws Throwable{
		// image matching using pattern class with CUSTOM SIMILARITY percentage
		Settings.MinSimilarity = 0.50; 
		Settings.WaitScanRate = 0.3f; 
		Settings.ObserveScanRate = 0.3f; 
		Settings.OcrTextRead = true;
		Settings.OcrTextSearch = true;
		String pathReg = pathRegion + Image;
		String pathloc = pathLocation + Image;
		Screen screen 					= new Screen();
		// manually open patterncompare/mainimage.png full screen using MS photo viewer
		
			try{
				
				
				Pattern pattern 					= new Pattern(pathloc).similar(1f);
				//screen.type(Key.PAGE_DOWN);
				//type(Key.PAGE_DOWN) 
				
				//Thread.sleep(3000);
				screen.wait(pattern,20);
				Region expectedRegion	= screen.exists(pattern);
				
				if(null != expectedRegion) {
					expectedRegion.saveScreenCapture();
					System.out.println("Expected and actual result mmatches and test passed");
					screen.saveScreenCapture("C:\\Users\\ei3754\\esi-sofea\\ws\\IntakeFT\\LocationScreenShots\\TestResults\\Screenshots\\",Image);
					
					
				}
				
				
			}catch(Exception e)			
			{
			
			}
			

		}			
		
	
	public static boolean exactMatchElementUsingImage1Return(String Image) throws Throwable{
		// image matching using pattern class with CUSTOM SIMILARITY percentage
		Settings.MinSimilarity = 0.50; 
		Settings.WaitScanRate = 0.3f; 
		Settings.ObserveScanRate = 0.3f; 
		Settings.OcrTextRead = true;
		Settings.OcrTextSearch = true;
		
		String pathReg = pathRegion + Image;
		String pathloc = pathLocation + Image;
	
		// manually open patterncompare/mainimage.png full screen using MS photo viewer
		
			try{
				
				Screen screen = new Screen();
				Pattern pattern = new Pattern(pathloc).similar(1f);
				screen.wait(pattern,20);
				Region expectedRegion	= screen.exists(pattern);
				
				if(null != expectedRegion) {
					expectedRegion.saveScreenCapture();
					System.out.println("Expected and actual result mmatches and test passed");
					screen.saveScreenCapture("C:\\Users\\ei3754\\esi-sofea\\ws\\IntakeFT\\LocationScreenShots\\TestResults\\Screenshots\\",Image);
				
					
				}
				
				
			}catch(Exception e)			
			{							
						 
			}					

			
		
		return true;	
	}

	
	public static void openURL(String Image){
		// image matching using pattern class with CUSTOM SIMILARITY percentage
		Settings.MinSimilarity 				= 0.50;        // 0.7 default
		Settings.WaitScanRate 				= 0.3f; 		  	// 0.3f/sec default
		Settings.ObserveScanRate 		= 0.3f;  		// 0.3f/sec default
		String pathReg = pathRegion + Image;
		String pathloc = pathLocation + Image;

		// manually open patterncompare/mainimage.png full screen using MS photo viewer
		try{
			Screen screen 					= new Screen();
			Pattern pattern 					= new Pattern(pathloc).similar(0.7f);
			screen.wait(pattern,20);
			Region expectedRegion	= screen.exists(pattern);
			if(null != expectedRegion) {
			expectedRegion.doubleClick(pattern);
		
			
			}
			
			
			
			else {System.out.println("ERROR :: Either required similarity is very high or image to be compared does not exists");}
		}catch(Exception e){}
	}
	
	
	public static void doubleclickElementUsingImage1(String Image,float sim) throws Throwable{

		Settings.MinSimilarity = 0.50; 
		Settings.WaitScanRate = 0.3f; 
		Settings.ObserveScanRate = 0.1f; 
		Settings.OcrTextRead = true;
		Settings.OcrTextSearch = true;
		
			try				
			{
			
			Screen screen = new Screen();
			//String pathReg = pathRegion + Image;
			String pathloc = pathLocation + Image;
			
			Pattern pattern	= new Pattern(pathloc).similar(sim);
			//screen.wait(pattern,20);
			//Region region	= screen.exists(pattern);
						
			
				screen.onAppear(pathloc, new ObserverCallBack() {
	                @Override
	                public void appeared(ObserveEvent event) {  	                       
	                
	                	try {
	                		Region R = event.getRegion().find(pattern);
		                	
			                	if (R!= null){			    					
			    					R.mouseMove(pattern);
			    					R.doubleClick(pattern);
			    					R.stopObserver();
			                	}
		    					
		                	} catch (FindFailed e){    						
								
							}   	            	}				
            	}				
				);				
				screen.observe(15);
				screen.stopObserver();					
				}				
				catch (Exception e)				
				{				
					
				}			
			}
	}
		
	