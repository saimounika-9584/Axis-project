package Practisesection;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Loginjava {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\Browserdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    ChromeOptions cop = new ChromeOptions();
	    cop.setBinary("C:\\Users\\DELL\\Downloads\\Browserdrivers\\chrome-win64\\chrome-win64\\chrome.exe");
	    WebDriver driver = new ChromeDriver(cop);
	    driver.get("https://webdriveruniversity.com/");
	    driver.manage().window().maximize();

	    //login functionality
	    Thread.sleep(2000);
	    WebElement loginPortal = driver.findElement(By.xpath("//h1[contains(text(),'LOGIN PORTAL')]"));
	    loginPortal.click();

	    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));

	    WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
	    userName.sendKeys("webdriver");

	    WebElement password = driver.findElement(By.id("password"));
	    password.sendKeys("webdriver123");

	    WebElement submitButton = driver.findElement(By.xpath("//button[@id='login-button']"));
	    submitButton.click();

	   
	}
}
