package com.qainfotech.com.Create_Index_html_Using_ITestListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Interface1 implements ITestListener {
	public static String krishna[];
	FirstPdf pdf;
	
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestStart->"+result.getName());
//		System.out.println(str.length);
//		str[i]=result.getName();
		//pdf.onTestStart(result.getName());
//		i++;
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestSuccess->"+result.getName());
		 Report.desiredCapabilities.setCapability("passed",true);
//		System.out.println(str.length);
//		str[i]=result.getName();
//		i++;
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailure->"+result.getName());
//		System.out.println(str.length);
//		str[i]=result.getName();
//		i++;
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestSkipped->"+result.getName());
//		System.out.println(str.length);
		
//		str[i]=result.getName();
//		i++;
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailedButwithSuccessPercentage->"+result.getName());
//		System.out.println(str.length);
//		str[i]=result.getName();
//		i++;
		result.getStartMillis();
		result.getEndMillis();
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("onstart->"+context.getName());
//		System.out.println(str.length);
//		str[i]=context.getName();
//		i++;
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
		System.out.println("EndOfProgram->"+context.getName());
		String xmlTest=context.getCurrentXmlTest().toString();
		String getEndDate=context.getEndDate().toString();
		String getExcludedGroups=context.getExcludedGroups().toString();
		String getExcludedMethods =context.getExcludedMethods().toString();
		String getStartDate =context.getStartDate().toString();
		String getHost=context.getHost();
		String getFailedButWithinSuccessPercentageTests = context.getFailedButWithinSuccessPercentageTests().toString();
		String getFailedConfigurations=context.getFailedConfigurations().toString();
		String getFailedTests=context.getFailedTests().toString();
		String getIncludedGroups=context.getIncludedGroups().toString();
		String getPassedConfigurations=context.getPassedConfigurations().toString();
		String getPassedTests=context.getPassedTests().toString();
		String getSkippedConfigurations=context.getSkippedConfigurations().toString();
		String getSkippedTests=context.getSkippedTests().toString();
		String getSuite=context.getSuite().toString();
		System.out.println(context.getName()+xmlTest+getEndDate+getExcludedGroups+getExcludedMethods+getStartDate+getHost+getFailedButWithinSuccessPercentageTests+getFailedConfigurations+getFailedTests+getIncludedGroups+getPassedConfigurations+getPassedTests+getSkippedConfigurations);
	   // pdf.getData(context.getName(),xmlTest,getEndDate,getExcludedGroups,getExcludedMethods,getStartDate,getHost,getFailedButWithinSuccessPercentageTests,getFailedConfigurations,getFailedTests,getIncludedGroups,getPassedConfigurations,getPassedTests,getSkippedConfigurations, getSuite);
//		System.out.println(str.length);
//		str[i]=context.getName();
//		i++;
	}

//	public String[] Basicinformation() {
//		return str;
//	}
//	public ITestContext returnITestContext(ITestContext context) {
//		return context;
//	}
//	public ITestResult returnITestResult(ITestResult result) {
//		return result;
//	}
}
