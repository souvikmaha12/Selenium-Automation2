package AssertionPractise;
import org.testng.*;
import org.testng.annotations.*;
public class A2 {
@Test
void title() {
	String actual="Orange";
	String expect="Orange";
	Assert.assertEquals(expect,actual);
}
}
