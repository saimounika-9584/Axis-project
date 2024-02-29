package Practisesection;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\Browserdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    
	    WebDriver driver = new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;
	    driver.get("https://webdriveruniversity.com/");
	    driver.manage().window().maximize();

        Thread.sleep(10000);

        WebElement hiddenElements = driver.findElement(By.xpath("//h1[contains(text(),'HIDDEN ELEMENTS')]"));
        hiddenElements.click();
        Thread.sleep(10000);
        

        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        WebElement notDisplayed = driver.findElement(By.xpath("//div[@id='not-displayed']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('id','visibility-visible');",notDisplayed);

        WebElement clickMe1 = driver.findElement(By.xpath("//span[@id='button1']"));
        clickMe1.click();
        

        driver.navigate().refresh();

        WebElement visibilityHidden = driver.findElement(By.xpath("//div[@id='visibility-hidden']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('id','visibility-visible');",visibilityHidden);

        WebElement clickMe2 = driver.findElement(By.xpath("//span[@id='button2']"));
        clickMe2.click();
       

        driver.navigate().refresh();

        WebElement zeroOpacity = driver.findElement(By.xpath("//div[@id='zero-opacity']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('id','visibility-visible');",zeroOpacity);

        WebElement clickMe3 = driver.findElement(By.xpath("//span[@id='button3']"));
        clickMe3.click();
       

    }

}
