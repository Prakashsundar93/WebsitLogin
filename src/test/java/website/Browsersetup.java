package website;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browsersetup {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		
		//EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com/?locale=en_GB");
	 WebElement Prakash= driver.findElement(By.id("email"));
		
		Prakash.sendKeys("facebook");
		Prakash.sendKeys(Keys.TAB);
	
	}
}

