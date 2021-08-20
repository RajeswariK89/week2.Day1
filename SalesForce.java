package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByName("UserFirstName").sendKeys("Rajeswari");
		driver.findElementByName("UserLastName").sendKeys("Prabhakaran");
		driver.findElementByName("UserEmail").sendKeys("ktsraji@gmail.com");
		
		WebElement jobTitle = driver.findElement(By.name("UserTitle"));
	    Select selJobTitle = new Select(jobTitle);
	    selJobTitle.selectByValue("Developer");
	    
	    driver.findElementByName("CompanyName").sendKeys("Wipro");
	    
	    WebElement employees = driver.findElement(By.name("CompanyEmployees"));
	    Select selEmployees = new Select(employees);
	    selEmployees.selectByValue("950");
	    
	    driver.findElementByName("UserPhone").sendKeys("9940405294");
	    
	    WebElement country = driver.findElement(By.name("CompanyCountry"));
	    Select countryValue=new Select(country);
	    countryValue.selectByValue("IN");
	    
	    WebElement checkBox = driver.findElementByClassName("checkbox-ui");
	    checkBox.click();    
	    
		System.out.println("Completed");

	}

}
