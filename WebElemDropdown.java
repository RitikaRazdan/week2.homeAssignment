package w2.homeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElemDropdown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		//Select dropdown1
		
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		
		Select select1 = new Select(dropdown1);
		
		select1.selectByIndex(2);
		
		//Select dropdown2
		
		WebElement dropdown2 = driver.findElement(By.name("dropdown2"));
		
		Select select2 = new Select(dropdown2);
		
		select2.selectByVisibleText("Selenium");
		
		//Select dropdown3
		
		WebElement dropdown3 = driver.findElement(By.id("dropdown3"));
		
		Select select3 = new Select(dropdown3);
		
		select3.selectByValue("4");
		
		int options = driver.findElements(By.className("dropdown")).size();
		
		System.out.println(options);
		
		driver.findElement(By.xpath("(//div[@class='example'])[5]/select")).sendKeys("UFT/QTP");
	
		driver.findElement(By.xpath("(//div[@class='example'])[6]/select/option[3]")).click();
		

	}

}
