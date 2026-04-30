package AnnotationPractise;

import org.testng.annotations.Test;

public class TestCase1 {
    @Test(priority=2)
	void openapp() {
		System.out.println("Opening Application");
	}
    @Test(priority=2)
	void login() {
		System.out.println("Login to Application");
	}
    @Test(priority=1)
	void logout() {
		System.out.println("Closing Application");
	}
}
