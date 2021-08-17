package Week2.Day1Assigments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		
		
		driver.findElement(By.name("firstname")).sendKeys("TestFname");
		driver.findElement(By.name("lastname")).sendKeys("TestLname");
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("2345678");
		driver.findElement(By.id("password_step_input")).sendKeys("test123");
		
		

	
		WebElement date = driver.findElement(By.name("birthday_day"));
		 	 Select dtdrpDwn = new Select(date);
		 	 dtdrpDwn.selectByValue("12");
		 
	  WebElement month = driver.findElement(By.name("birthday_month"));
		 	 Select mnthdrpDwn = new Select(month);
		 	 mnthdrpDwn.selectByVisibleText("Jun");
		 
	  WebElement year = driver.findElement(By.name("birthday_year"));
		 	 Select yearDrpDwn = new Select(year);
		 	 yearDrpDwn .selectByValue("1989");
		 	 
		 	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		 	driver.findElement(By.xpath("//input[@name='sex']")).click();
		 	
		 	
		 	
		
	}

}
