package testngtutorial;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_TestClass2 {
	
	
	@BeforeClass
	public void setUp() {
		System.out.println("\nTestNG_TestClass2 This runs once before class");
	}
	
	@AfterClass
	public void cleanUp() {
		System.out.println("\nTestNG_TestClass2 This runs once After class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\nTestNG_TestClass2 This runs once Before method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("\nTestNG_TestClass2 This runs once After method");
	}

	@Test
	public void testMethod1() {
		System.out.println("\nTestNG_TestClass2 Running Test -> testMethod1");

	}

	@Test
	public void testMethod2() {
		System.out.println("\nTestNG_TestClass2 Running Test -> testMethod2");
	}

}
