package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("sorry u r tc is failed");
		ITestListener.super.onTestFailure(result);
		
	}
@Override
public void onTestStart(ITestResult result) {
	Reporter.log("Your TC start");
	ITestListener.super.onTestStart(result);
}
@Override
public void onTestSuccess(ITestResult result) {
	Reporter.log("Your TC passed");
	ITestListener.super.onTestSuccess(result);
}
@Override
public void onTestSkipped(ITestResult result) {
	Reporter.log("Your TC skiiped");
	ITestListener.super.onTestSkipped(result);
}

}
