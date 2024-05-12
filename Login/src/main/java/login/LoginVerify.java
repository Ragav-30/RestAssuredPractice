package login;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginVerify {

	public static void main(String[] args) throws InterruptedException {
		Map<String, Object> prefs= new HashMap<String, Object>();
	prefs.put("profile.default_content_setting_values.notifications",1);
		
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("prefs", prefs);
		
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragav\\eclipse-workspace\\Login\\Driver\\chromedriver.exe");
 ChromeDriver driver= new ChromeDriver(option);
 driver.manage().window().maximize();
 driver.get("https://www.google.co.in/");
driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("fb"+Keys.ENTER);
Thread.sleep(3000);
driver.findElement(By.xpath("//h3[contains(text(),\"Facebook - log in or sign up\")]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("ragavan3062001@gmail.com");
driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("rockz001");
Thread.sleep(3000);
driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
driver.findElement(By.xpath("//*[@id=\":Riql9ad5bb9l5qq9papd5aq:\"]")).click();
	}

}
