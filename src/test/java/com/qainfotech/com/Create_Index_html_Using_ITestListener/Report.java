package com.qainfotech.com.Create_Index_html_Using_ITestListener;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

//import IReporterReport.Reporter;
@Listeners(value=Interface1.class)
public class Report {
	public static DesiredCapabilities desiredCapabilities;
	Interface1 interface1;
	FirstPdf firstpdf;
	 @BeforeTest
	 public void Capabilities() {
		 desiredCapabilities = DesiredCapabilities.chrome();
		 desiredCapabilities.setCapability("idleTimeout",30000);
		 System.out.println("############3"+desiredCapabilities.toString());
	 }
	@Test
	  public void testRealReportOne() throws InterruptedException{
		System.out.println("Hello");
		//Thread.sleep(10000);
	      AssertJUnit.assertTrue(true);
	}

	  @Test
	  public void testRealReportTwo(){
		  System.out.println("Hello");
	      AssertJUnit.assertTrue(true);
	  }

	  //Test case depends on failed testcase= testRealReportTwo
	  //@Test
	@AfterMethod//(dependsOnMethods="testRealReportTwo")
	  public void testRealReportThree(ITestResult result, ITestContext context){
		  System.out.println("Nook2");
		  firstpdf.main1(null, result,context);
		  //interface1.start();
	  }  
	  @AfterTest
	  public void GenerateReport() {
		 //interface1.start();
	  }
 }
