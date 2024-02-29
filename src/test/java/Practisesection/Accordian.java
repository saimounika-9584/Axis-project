package Practisesection;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Accordian {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\Browserdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions cop = new ChromeOptions();
		cop.setBinary("C:\\Users\\DELL\\Downloads\\Browserdrivers\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(cop);
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();

		Thread.sleep(2000);
	   

	    WebElement accordian = driver.findElement(By.xpath("//h1[contains(text(),'ACCORDION & TEXT AFFECTS (APPEAR & DISAPPEAR)')]"));
	    accordian.click();

	    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));

	    WebElement accordianElement = driver.findElement(By.xpath("//button[@id='click-accordion']"));
	    WebElement hiddenTextdriver = driver.findElement(By.xpath("//p[@id='hidden-text']"));
	    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'LOADING COMPLETE.')]")));
	    accordianElement.click();

	}

}
