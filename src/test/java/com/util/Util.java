package com.util;

import org.sikuli.basics.Settings;
import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class Util {
	
	
	public static void open() {
		Screen s = new Screen();
		Settings.OcrTextRead 			= true;
		Settings.OcrTextSearch 			= true;
		Settings.OcrLanguage  			= "eng";
		Settings.MinSimilarity  			= 0.75;        // 0.7 default
		Settings.MoveMouseDelay 	= 1.1f;   		// 0.5f sec default
		Settings.WaitScanRate 			= 0.3f; 			// 0.3f/sec default
		Settings.ObserveScanRate 	= 0.3f;			// 0.3f/sec default
		try {
			//Closes the calculator if already opened
			if (Runtime.getRuntime().exec("calc") != null) {
				App.close("Calculator.exe");
			}
			
			//Opens the calculator
			Runtime.getRuntime().exec("calc");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}