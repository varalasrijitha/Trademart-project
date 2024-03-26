package Utilities;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting1 {
	 public ExtentSparkReporter reporter;//UI of the Report(title of the report,report name,theme)
	    public ExtentReports extent;//populate the common information about the user 
	    public ExtentTest test;//create the testcase entries into the report (pass/fail/skip)

	    public void onStart(ITestContext context) {
	       
	        //give the report target location
	        reporter=new ExtentSparkReporter(System.getProperty("user.dir")+"\\Reporting1\\newreport1.html");
	   
	        //title of the report
	        reporter.config().setDocumentTitle("Automation Testing Report");
	        //report name
	        reporter.config().setReportName("Functional Testing");
	        //set the Theme
	        reporter.config().setTheme(Theme.DARK);
	       
	        //user information
	       
	        extent=new ExtentReports();
	        extent.attachReporter(reporter);
	       
	        extent.setSystemInfo("Hostname", "LocalHost");
	        extent.setSystemInfo("Environment", "QA");
	        extent.setSystemInfo("Tester", "srijitha");
	        extent.setSystemInfo("OS", "Windows 10");
	    }
	   
	   public void onTestSuccess(ITestResult tr) {
	      
	        test=extent.createTest(tr.getName());//create the new entry to the report
	        test.log(Status.PASS,"Testcases is success:"+ tr.getName());
	    }
	   
	   public void onTestFailure(ITestResult tr) {
	        test=extent.createTest(tr.getName());
	        test.log(Status.FAIL, "Testcase is failed:" + tr.getName());
	        test.log(Status.FAIL, "exception is : "+ tr.getThrowable());
	        String Screenshotpath=System.getProperty("user.dir")+"\\Screenshots\\"+tr.getName()+".png";
			File f=new File(Screenshotpath);
			if(f.exists()) 
			{
				try 
				{
					test.fail("screenshot is below:"+test.addScreenCaptureFromPath(Screenshotpath));
				}
				catch(Exception e) 
				{
					e.printStackTrace();
				}
	    }
	   }
	   public void onTestSkip(ITestResult tr) {
	       test=extent.createTest(tr.getName());
	       test.log(Status.SKIP, "Testcase is Skipped: "+ tr.getName());
	   }
	   
	   public void onFinish(ITestContext context) {
	       extent.flush();
	   }

}




