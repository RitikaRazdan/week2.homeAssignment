package w2.homeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElemHyperlink {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://www.leafground.com/pages/Link.html");
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		
		System.out.println(driver.getTitle());
		
		System.out.println(	driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//h5[text()='HyperLink']")).click();
		
		System.out.println(driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
		
		driver.findElement(By.linkText("Verify am I broken?")).click();
		
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().contains("404"))
			System.out.println("Link is broken");
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).click();
		
		System.out.println(driver.getTitle());
		
		System.out.println(	driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//h5[text()='HyperLink']")).click();
		
		int numOfLinks = driver.findElements(By.tagName("a")).size();
		
		System.out.println(numOfLinks);

		driver.close();
		
		
	}

}
