package AssertionPractise;
import org.testng.*;
import org.testng.annotations.*;
public class A3 {
String expect="Orange";
String actual="Orange";
@Test
void title() {
	if(expect.equals(actual)) {
		System.out.println("Passed");
		Assert.assertTrue(true);
	}else {
		System.out.println("Failed");
		Assert.assertTrue(false);
	}
}
}
