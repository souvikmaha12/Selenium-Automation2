package DependencyPractise;
import java.util.*;
import java.io.*;
import org.testng.*;
import org.testng.annotations.*;
public class PaymentTest {
@Test(priority=1,groups= {"sanity","regression","functional"})
void paymentinrupees() {
	System.out.println("This is payment in rupees");
}
@Test(priority=2,groups= {"sanity","regression","functional"})
void paymentindollars() {
	System.out.println("This is payment in dollars");
}
}
