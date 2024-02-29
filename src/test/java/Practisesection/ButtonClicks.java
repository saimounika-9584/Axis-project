package Practisesection;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class ButtonClicks {
	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\Browserdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    ChromeOptions cop = new ChromeOptions();
	    cop.setBinary("C:\\Users\\DELL\\Downloads\\Browserdrivers\\chrome-win64\\chrome-win64\\chrome.exe");
	    WebDriver driver = new ChromeDriver(cop);
	    driver.get("https://webdriveruniversity.com/");
	    driver.manage().window().maximize();

	    Thread.sleep(2000);

	    //Buttons handling

	    WebElement buttonClicks = driver.findElement(By.xpath("//h1[contains(text(),'BUTTON CLICKS')]"));
	    buttonClicks.click();

	    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));

	    WebElement clickMeButton1 = driver.findElement(By.xpath("//span[@id='button1']"));
	    clickMeButton1.click(); 
	    Thread.sleep(2000);

	   // WebElement closePopUp = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
	   // closePopUp.click();

	    driver.navigate().refresh(); 

	    WebElement clickMeButton2 = driver.findElement(By.cssSelector("#button2"));
	    clickMeButton2.click();
	    Thread.sleep(2000);

	    driver.navigate().refresh();

	    WebElement clickMeButton3 = driver.findElement(By.id("button3"));

	    Actions action = new Actions(driver);
	    action.moveToElement(clickMeButton3).click().perform();

	   
	}
}