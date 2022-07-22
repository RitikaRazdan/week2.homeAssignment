package w2.homeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {


	public static void main(String[] args) {
		
		//Download and set the path 	
		WebDriverManager.chromedriver().setup();
		
		//Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		
		//Maximise the window
		driver.manage().window().maximize();
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click on Create New Account button
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		//Enter the first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Swara");
		
		//Enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sharma");
		
		//Enter the mobile number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7032117792");
		
		//Enter the password
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Blacklady@03");
		
		//Select the day
		WebElement ele = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select day = new Select(ele);
		day.selectByVisibleText("11");
		
		//Select the month
		WebElement elem = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select month = new Select(elem);
		month.selectByVisibleText("Mar");
		
		//Select the month
		WebElement element = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select year = new Select(element);
		year.selectByVisibleText("1993");
		
		//Click on Female
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		//Click on Sign Up button
		//driver.findElement(By.xpath("//button[@name='websubmit']")).click();

	}

}
