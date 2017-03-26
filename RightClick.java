package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\sel Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http:www.facebook.com");
	Actions action = new Actions(driver);
	action.contextClick(driver.findElement(By.xpath(".//*[@id='content']/div/div/div")));
	action.perform();
}
}
