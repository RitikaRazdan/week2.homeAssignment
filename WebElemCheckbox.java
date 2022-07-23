package w2.homeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElemCheckbox {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		driver.findElement(By.xpath("//label[text()='Select the languages that you know?']/following::input[1]")).click();
		
		System.out.println(driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input[1]")).isSelected());
		
		driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following::input[2]")).click();
		
		System.out.println(driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following::input[2]")).isSelected());
		
		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[1]")).click();
		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[2]")).click();
		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[3]")).click();
		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[4]")).click();
		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[5]")).click();
		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[6]")).click();


	}

}
