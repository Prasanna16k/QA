package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadInSelenium {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\sel Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.filedropper.com/");
}
}