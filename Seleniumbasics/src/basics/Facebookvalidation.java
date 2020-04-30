package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookvalidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/mounikakondamadugula/Documents/java/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https://www.facebook.com");
driver.findElement(By.id("email")).sendKeys("chinnu@hyjjgmail.com");
driver.findElement(By.id("pass")).sendKeys("mouni");
driver.findElement(By.id("u_0_b")).click();
String actualText = driver.findElement(By.cssSelector("#globalContainer > div.uiContextualLayerPositioner._572t.uiLayer > div > div > div")).getText();
System.out.println(actualText);
driver.quit();
	}

}
