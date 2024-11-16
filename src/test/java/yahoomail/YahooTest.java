package yahoomail;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BaseBR;

public class YahooTest extends BaseBR {
	

	
	@Test
	public void Yahoo_Test1() {
		driver.get("https://www.yahoo.com/");
		String Url = driver.getCurrentUrl();
		String Title = driver.getTitle();
		System.out.println("Page Url: " + Url);
		System.out.println("Page Title: " + Title);
	}
	
	@Test
	public void Yahoo_Test2() {
		System.out.println("Yahoo Test2");
	}

}
