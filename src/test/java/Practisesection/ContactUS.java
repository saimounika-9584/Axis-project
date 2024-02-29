package Practisesection;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ContactUS {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\Browserdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    ChromeOptions cop = new ChromeOptions();
	    cop.setBinary("C:\\Users\\DELL\\Downloads\\Browserdrivers\\chrome-win64\\chrome-win64\\chrome.exe");
	    WebDriver driver = new ChromeDriver(cop);
	    driver.get("https://webdriveruniversity.com/");
	    driver.manage().window().maximize();

	    Thread.sleep(2000);

	    //contact us

	    WebElement contactUs = driver.findElement(By.xpath("//h1[contains(text(),'CONTACT US')]"));
	    contactUs.click();

	    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    
	    WebElement firstName = driver.findElement(By.name("first_name"));
	    firstName.sendKeys("Kantam");

	    WebElement lastName = driver.findElement(By.name("last_name"));
	    lastName.sendKeys("Sai Mounika");

	    WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
	    email.sendKeys("kantamsaimounika6@gmail.com");

	    WebElement comments = driver.findElement(By.xpath("//textarea[@name='message']"));
	    comments.sendKeys("Good Website");

	    WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
	    submit.click();

	    
	}
}