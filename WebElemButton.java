package w2.homeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElemButton {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://www.leafground.com/pages/Button.html");
		
		driver.findElement(By.id("home")).click();
		
		System.out.println(driver.getTitle());
		
		System.out.println(	driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//h5[text()='Button']")).click();
		
		System.out.println(driver.findElement(By.xpath("//button[text()='Get Position']")).getLocation());
		
		System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
		
		System.out.println(driver.findElement(By.id("size")).getSize());
	
		driver.close();
		
		
	}

}
