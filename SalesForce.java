package Week2.Day1Assigments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Filling the page 
		driver.findElement(By.name("UserFirstName")).sendKeys("TestFname");
		driver.findElement(By.name("UserLastName")).sendKeys("TestLname");
		driver.findElement(By.name("UserEmail")).sendKeys("Test@Lname.com");
		driver.findElement(By.name("CompanyName")).sendKeys("XYZ");
		driver.findElement(By.name("UserPhone")).sendKeys("9923232323");
		driver.findElement(By.className("checkbox-ui")).click();
		
	//drop dow
		WebElement jobTitle = driver.findElement(By.name("UserTitle"));
		Select jTitle = new Select (jobTitle );
		jTitle.selectByValue("IT_Manager_AP");
		
		WebElement emp = driver.findElement(By.name("CompanyEmployees"));
		Select em = new Select(emp);
		em.selectByIndex(5);
		
		WebElement country = driver.findElement(By.name("CompanyCountry"));
		Select cnty = new Select(country);
		cnty.selectByVisibleText("India");
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
