package testngtutorial;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_BeforeClassAnnotations {
	
	@BeforeClass
	public void setUp() {
		System.out.println("\n This runs once before class");
	}
	
	@AfterClass
	public void cleanUp() {
		System.out.println("\n This runs once After class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\n This runs once Before method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("\n This runs once After method");
	}

	@Test
	public void testMethod1() {
		System.out.println("\nRunning Test -> testMethod1");

	}

	@Test
	public void testMethod2() {
		System.out.println("\nRunning Test -> testMethod2");
	}

}
