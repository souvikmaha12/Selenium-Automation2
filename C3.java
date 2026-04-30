package Annotatiom1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {
	@Test
void pqr() {
	System.out.println("This is pqr");
}
	@BeforeSuite
void bs() {
	System.out.println("This is before suit");
}
	@AfterSuite
void as() {
	System.out.println("This is after suit");
}
}
