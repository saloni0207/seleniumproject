package listenersClasses;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseClasses.Base1;

public class ListenerClass1 implements ITestListener{
	
	
	ExtentTest extentTest;
	public void onTestStart(ITestResult result) {
		extentTest= Base1.getAlreadyExsistTest();
		extentTest.log(Status.INFO, "Test: Started"+result.getName());
		System.out.println("Test started"+result.getName()+"From Listener");
	    
	  }

	 
	  public void onTestSuccess(ITestResult result) {
		  extentTest= Base1.getAlreadyExsistTest();
		  extentTest.log(Status.PASS, "Test: Passed"+result.getName());	
         System.out.println("Test Passed"+result.getName()+"From Listener"); 
	    
	  }

	 
	  public void onTestFailure(ITestResult result) {
		  extentTest= Base1.getAlreadyExsistTest();
		  extentTest.log(Status.FAIL, "Test: Failed"+result.getName());
			System.out.println("Test Failed"+result.getName()+"From Listener");
	  }

	  public void onTestSkipped(ITestResult result) {
		  extentTest= Base1.getAlreadyExsistTest();
		  extentTest.log(Status.SKIP, "Test: Skipped"+result.getName());
			System.out.println("Test Skipped"+result.getName()+"From Listener");
	  }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
