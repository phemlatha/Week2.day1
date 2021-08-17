package Week2.Day1Assigments;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver() ;
driver.get ("http://leaftaps.com/opentaps"); // to load the URL

//To Get title and Print it 

String title = driver.getTitle();
System.out.println("" +title);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

// Login Page

WebElement WebUser = driver.findElement(By.id("username"));

WebUser.sendKeys("demosalesmanager");

driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElementByLinkText("CRM/SFA").click();

//Load  Create Lead page

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElementByLinkText("Create Lead").click();

// To Enter detaisl in Lead Page 

driver.findElement(By.id("createLeadForm_companyName")).sendKeys("test");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("testuser");

// to get values from input box ------

String fName = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
System.out.println(fName);
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("testcompany");


driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("5");
WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
Select sourceDrpDwn = new Select(source);
sourceDrpDwn.selectByIndex(4);
driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("testla");
driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("MR");
driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Chief");
driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("50000");
WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
Select industryDrpDwn = new Select (industry);
industryDrpDwn.selectByValue("IND_SOFTWARE");
WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
Select ownDrpDwn = new Select (ownership);
ownDrpDwn.selectByVisibleText("Corporation");

driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("testla");
driver.findElement(By.id("createLeadForm_description")).sendKeys("test");
driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("test");
WebElement marktCamp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
Select mktCamp = new Select (marktCamp);
mktCamp.selectByIndex(4);
driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("testlname");
driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("08/19/21");
driver.findElement(By.name("departmentName")).sendKeys("testdept");
WebElement prfCurrency = driver.findElement(By.id("createLeadForm_currencyUomId"));
Select pCurrency = new Select(prfCurrency);
pCurrency.selectByValue("CAD");
driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("5");
driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("s");

//Contact Information 

driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("600042");
driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("044");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("hema.it@gmail.com");
driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9962363636");
driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("afercare");
driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.google.com");

//Primary address
driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("testname");
driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("044");
driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600042");
driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("afercare");
driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("tester");
driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("addtest");

WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select statePrv = new Select (state);
statePrv.selectByValue("IN");

WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));

Select cnty = new Select (country);
cnty.selectByValue("IDN");
driver.findElement(By.className("smallSubmit")).click();
//driver.findElement(By.name("submitButton")).click();

//Get the TitlE  of View Page
String titleView = driver.getTitle();
System.out.println("" +titleView);

//Verify the title of view Page

String t1 = "View Lead | opentaps CRM";

if (t1.equals(titleView))
{
	System.out.println ("Expected  page reached" );
	}
else
{
	System.out.println ("Not the expected Page");
	}











//






//driver.close();
	}


}
