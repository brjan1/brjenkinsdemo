package google;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BaseBR;

public class GoogleTest extends BaseBR {
	
	@Test
	public void Google_Test1() {
		driver.get("https://www.google.com");
		String Url = driver.getCurrentUrl();
		String Title = driver.getTitle();
		System.out.println("Page Url: " + Url);
		System.out.println("Page Title: " + Title);
	}
	
	@Test
	public void Google_Test2() {
		System.out.println("Google Test2");
	}

}
