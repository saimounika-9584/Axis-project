package Practisesection;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Fileupload {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\Browserdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    ChromeOptions cop = new ChromeOptions();
	    cop.setBinary("C:\\Users\\DELL\\Downloads\\Browserdrivers\\chrome-win64\\chrome-win64\\chrome.exe");
	    WebDriver driver = new ChromeDriver(cop);
	    driver.get("https://webdriveruniversity.com/");
	    driver.manage().window().maximize();

        Thread.sleep(2000);
       

        WebElement fileUpload = driver.findElement(By.xpath("//h1[contains(text(),'FILE UPLOAD')]"));
        fileUpload.click();

        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        WebElement chooseFile = driver.findElement(By.xpath("//input[@id='myFile']"));
        chooseFile.sendKeys("\"C:\\Users\\DELL\\Downloads\\summary 1.pdf\"");


        WebElement submitFile = driver.findElement(By.xpath("//input[@id='submit-button']"));
        submitFile.click();

    }
}