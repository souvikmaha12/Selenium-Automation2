package AssertionPractise;
import java.util.*;
import java.io.*;
import org.testng.*;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
public class SoftAssertion {
	//@Test
/*void explain() {
	System.out.println("Testing1");
	System.out.println("Testing2");
	Assert.assertEquals(1,2);
	System.out.println("Testing3");
	System.out.println("Testing4");
}*/
	@Test
	void explain1() {
		System.out.println("Testing1");
		System.out.println("Testing2");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals("Souvik","Souvik");
		System.out.println("Testing3");
		System.out.println("Testing4");
		sa.assertAll();
	}
}
