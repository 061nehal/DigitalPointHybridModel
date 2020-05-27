package testCases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.browserEngine;
import utilities.userData;

public class logInObjectKeyword {

	public static WebDriver driver;


	public static void openBrowser()
	{ 
		driver=browserEngine.getBrowser("chrome");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);

	}

	public static void navigate()
	{ 	
		driver.get(userData.appURL);
	}
	public static void input_id()

	{
		driver.findElement(By.name("email")).sendKeys(userData.uid); 
	}

	public static void input_pw()
	{
		driver.findElement(By.name("password")).sendKeys(userData.pw);
	}

	public static void click_Login(){
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div[2]/div[3]/div[2]/button")).click();

	}


	public static void click_dropdown(){
		driver.findElement(By.xpath("//*[@id='navbar-right']/li/a")).click();
	}
	public static void click_Logout(){

		driver.findElement(By.xpath("//*[@id='navbar-right']/li/ul/li/a")).click();


	}

	public static void closeBrowser(){
	 driver.close();
	}

}
