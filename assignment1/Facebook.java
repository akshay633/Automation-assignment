package assignment1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy')]")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Akshay");
		
		driver.findElement(By.name("lastname")).sendKeys("Rajesh");
		
		driver.findElement(By.name("reg_email__")).sendKeys("8943452992");
		
		driver.findElement(By.id("password_step_input")).sendKeys("akshay1234");
		
		WebElement Day = driver.findElement(By.name("birthday_day"));
		
		Select date= new Select(Day);
		
		date.selectByValue("5");
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		
		Select month1= new Select(month);
		
		month1.selectByValue("10");
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		
		Select year1= new Select(year);
		
		year1.selectByValue("2010");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		
		
		
		
		
		
		

	}



}
