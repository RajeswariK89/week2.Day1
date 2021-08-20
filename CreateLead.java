package week2.day1;
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
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String dri=driver.getTitle();
		System.out.println(dri);
		driver.manage().window().maximize();	
		WebElement webUser=driver.findElement(By.id("username"));
		webUser.sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rajeswari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Prabhakaran");
		WebElement drop1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drpDwn1 = new Select(drop1);
		drpDwn1.selectByIndex(1);
		WebElement drop2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select  drpDwn2 = new Select(drop2);
		drpDwn2.selectByValue("9002");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Raje");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Prabha");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("All is Well");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("07/29/89");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Lead Analyst");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Benefits");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("2000");
		WebElement drop3 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select drpDwn3 = new Select(drop3);
		drpDwn3.selectByVisibleText("Aerospace");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("Lead Created Successfully");
				
	}

}
