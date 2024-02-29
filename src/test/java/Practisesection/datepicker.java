package Practisesection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class datepicker {
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
		// Click on the date input field to open the date picker
        WebElement dateInput = driver.findElement(By.xpath("//div[@id = 'datepicker'] "));
        dateInput.click();

        Thread.sleep(500);

        
        WebElement selectedDate = driver.findElement(By.xpath("//td[contains(text(),'11')]"));
        selectedDate.click();

        Thread.sleep(500);

        // Close the browser
        driver.quit();
    }
}
	

        
