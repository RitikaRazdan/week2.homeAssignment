package w2.homeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElemImage {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://www.leafground.com/pages/Image.html");
		
		driver.findElement(By.xpath("//label[text()='Click on this image to go home page']/following::img")).click();
		
		System.out.println(driver.getTitle());
		
		System.out.println(	driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//h5[text()='Image']")).click();
		
		//Am I broken ?
		
		//System.out.println(driver.findElement(By.xpath("//label[text()='Am I Broken Image?']/following::img[1]")).isDisplayed());
		
		driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following::img[1]")).click();
		
		driver.close();
	}

}
