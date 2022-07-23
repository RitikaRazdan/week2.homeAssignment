package w2.homeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElemEdit {

	public static void main(String[] args) {
		

WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		driver.findElement(By.id("email")).sendKeys("ritika.razdan93@gmail.com");
		
		WebElement ele = driver.findElement(By.xpath("//input[@value='Append ']"));
		ele.sendKeys("Test");
		ele.sendKeys(Keys.TAB);
		ele.sendKeys(Keys.ENTER);
		
		System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
		
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		
		System.out.println(driver.findElement(By.xpath("//label[contains(text(),'Confirm that edit field is disabled')]/following::input")).isEnabled());
		
		driver.close();
		
		
		

	}

}
