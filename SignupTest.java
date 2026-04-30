package DependencyPractise;
import java.io.*;
import java.util.*;
import org.testng.*;
import org.testng.annotations.*;
public class SignupTest {
@Test(priority=1,groups= {"regression"})
void signupbyemail() {
	System.out.println("This is sign up by email");
}
@Test(priority=1,groups= {"regression"})
void signupbyfacebook() {
	System.out.println("This is sign up by facebook");
}
@Test(priority=1,groups= {"regression"})
void signupbytwitter() {
	System.out.println("This is sign up by twitter");
}
}
