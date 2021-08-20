package week2.day1;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	//	driver.findElement(By.className("_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy")).click();
		driver.findElement(By.linkText("Create New Account")).click();
		System.out.println("done");
		driver.findElement(By.name("firstname")).sendKeys("Rajeswari");
		driver.findElement(By.name("lastname")).sendKeys("Prabhakaran");
		driver.findElement(By.name("reg_email__")).sendKeys("9940405294");
		driver.findElement(By.id("password_step_input")).sendKeys("PrajiSai");
		WebElement dobDrp = driver.findElement(By.id("day"));
		Select drpDwn1 = new Select(dobDrp);
		drpDwn1.selectByIndex(29);
		WebElement dobMnth = driver.findElement(By.id("month"));
		Select  drpDwn2 = new Select(dobMnth);
		drpDwn2.selectByValue("10");
		WebElement yearDrp = driver.findElement(By.id("year"));
		Select drpDwn3 = new Select(yearDrp);
		drpDwn3.selectByValue("1989");
		WebElement radio = driver.findElement(By.name("sex"));
		radio.click();
		System.out.println("Completed");
	
	}

}
