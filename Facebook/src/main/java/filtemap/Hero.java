package filtemap;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hero {
public static void main(String[] args) {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manikandan\\Downloads\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://the-internet.herokuapp.com/key_presses");
	
	Actions action=new Actions(driver);
	action.sendKeys(Keys.SPACE).build().perform();
	String text=driver.findElement(By.id("result")).getText();
	System.out.println(text);
}
}
