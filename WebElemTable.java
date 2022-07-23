package w2.homeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElemTable {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://www.leafground.com/pages/table.html");
		
		int noOfColumns = driver.findElements(By.tagName("th")).size();
		
		System.out.println(noOfColumns);
		
		int noOfRows = driver.findElements(By.tagName("tr")).size();
		
		System.out.println(noOfRows);
		
		System.out.println(driver.findElement(By.xpath("//font[contains(text(),'Learn to interact with')]/following::font[contains(text(),'30')]")).getText());
		
		driver.findElement(By.xpath("//font[contains(text(),'Learn to interact with')]/following::font[contains(text(),'30')]/following::input")).click();

	}

}
