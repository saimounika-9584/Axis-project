package Practisesection4;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class Flightbookings {
	
	
	

		private static final WebElement Delhi = null;

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\Browserdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			ChromeOptions cop = new ChromeOptions();
			cop.setBinary("C:\\Users\\DELL\\Downloads\\Browserdrivers\\chrome-win64\\chrome-win64\\chrome.exe");
			WebDriver driver = new ChromeDriver(cop);
			driver.get("https://www.easemytrip.com/");
			driver.manage().window().maximize();

			Thread.sleep(2000);
			
			WebElement flights = driver.findElement(By.xpath("//span[contains(text(),'Flights')]"));
			flights.click();
			
			WebElement roundtrip = driver.findElement(By.xpath("//li[@id=\"rtrip\"]"));
			roundtrip.click();
			
			WebElement From = driver.findElement(By.xpath("//p[@id='pff']"));
			From.click();
			

			WebElement Typebox= driver.findElement(By.xpath("//input[@id=\"a_FromSector_show\"]"));
			
			Typebox.sendKeys("Hyderabad");
			
			WebElement Hyderabad = driver.findElement(By.xpath("//p[@class='autosrpt']"));
			Hyderabad.click();
			
			
			
			
			
			
		}
			
			
			

}
