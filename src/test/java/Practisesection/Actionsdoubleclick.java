package Practisesection;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Actionsdoubleclick {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\Browserdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions cop = new ChromeOptions();
		cop.setBinary("C:\\Users\\DELL\\Downloads\\Browserdrivers\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(cop);
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();

		
		WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://webdriveruniversity.com/Actions/index.html#");
		
		driver1.manage().window().maximize();
		
		Thread.sleep(500);
        WebElement doubleClick = driver.findElement(By.xpath("//div[@id = 'double-click']"));
		
		Actions builder = new Actions(driver);
		
		Thread.sleep(1000);
		
		builder.doubleClick(doubleClick).perform(); 
        
        Alert alt = driver.switchTo().alert();
        
        alt.accept();

}
}
