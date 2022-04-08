package groupingInTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestGroup2 {
 @Test (groups= "regression")
 public void TC1()
 {
	 Reporter.log("Runing TC1 ", true);}
 
 @Test 
 public void TC2()

 {Reporter.log("Runing TC2 ", true);
	 
 }
 @Test 
 public void TC3() {
	 Reporter.log("Runing TC3 ", true);
 }
 
 @Test(groups = "sanity")
 public void TC4 () {
	 Reporter.log("Runing TC4 ", true);
 }
 
 
 @Test
 public void TS5()
 {
	 Reporter.log("Runing TC5", true);
 }
 
 
 
 
 
 
 
 }
