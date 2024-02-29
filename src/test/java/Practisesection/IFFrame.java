package Practisesection;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFFrame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\Browserdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    
	    WebDriver driver = new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;
	    driver.get("https://webdriveruniversity.com/");
	    driver.manage().window().maximize();

        Thread.sleep(2000);
        WebElement autoCompleteTextField = driver.findElement(By.xpath("//h1[contains(text(),'IFRAME')]"));
        autoCompleteTextField.click();

        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        driver.switchTo().frame("frame");

        WebElement products = driver.findElement(By.xpath("//a[contains(text(),'Our Products')]"));
        products.click();

        WebElement newLaptop = driver.findElement(By.xpath("//img[@id='laptop1']"));
        newLaptop.click();

        WebElement proceedButton = driver.findElement(By.xpath("//button[contains(text(),'Proceed')]"));
        proceedButton.click();

        WebElement contactUs = driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]"));
        contactUs.click();

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
