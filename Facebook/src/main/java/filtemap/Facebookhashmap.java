package filtemap;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookhashmap {
	
	
	public static void main(String[] args) {
		
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manikandan\\Downloads\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");
	//String dcredentials=getuserInfo().get("customer");
	
   driver.findElement(By.id("email")).sendKeys(gtname("customer"));
	//driver.findElement(By.id("pass")).sendKeys();
	}
	public static HashMap<String, String> getuserInfo()
	{
	HashMap<String,String> usermap=new HashMap<String,String>();
	
	usermap.put("custommer", "8526481962:Kasi1947");
	usermap.put("admin","sujji:1000");
	usermap.put("child","suryanathan:1988");
		
	return usermap;
	}
public static String gtname(String role)
{
	String cre=getuserInfo().get(role);
	return cre.split(":")[0];
	
}
}