package com.qainfotech.com.Create_Index_html_Using_ITestListener;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
public class ScreenShot {

	WebDriver driver;
	public ScreenShot(WebDriver driver) throws IOException {
		//Convert web driver object to TakeScreenshot
		 String FilePath = System.getProperty("user.dir");
 		String FileName = "Krishna.pdf";
        TakesScreenshot scrShot =((TakesScreenshot)driver);
       //Call getScreenshotAs method to create image file
          File SrcFile1=scrShot.getScreenshotAs(OutputType.FILE);
            //Move image file to new destination
                File DestFile=new File(FilePath+"///"+FileName);
                //Copy file at destination
                FileUtils.copyFile(SrcFile1, DestFile);    
	}
}
