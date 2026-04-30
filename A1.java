package AssertionPractise;
import org.testng.*;
import org.testng.annotations.*;
public class A1 {
	@Test
void testtitle() {
	String actual="Orange";
	String expect="Oran";
	/*if(actual.equals(expect)) {
		System.out.println("Test passed");
	}else {
		System.out.println("Test Failed");
	}*/
	Assert.assertEquals(actual,expect);
}
}
