package libprograms;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(libprograms.SampleListener.class)

public class Git_Check extends BaseClass {


@BeforeMethod
 public void setupMethod() throws Throwable {
	 startBrowser();
	 System.out.println(driver);
 }
 
// @Test
// public void test1() {
//	System.out.println("hi"); 
// }
// @Test()
// public void test2() {
//		System.out.println("bye"); 
//	 }
 @Test
 public void test4()  {
	 Assert.assertEquals('a','b', "a is not equal to b");
 }
 
 
@AfterMethod
public void tearDown() {
	driver.close();
}

}
