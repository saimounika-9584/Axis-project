package Manipal.Axis;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class makeMytrip {
	public static void main(String[] args) throws InterruptedException {

		 
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\geckodriver-v0.34.0-win-aarch64.zip\\geckodriver.exe");
 
		WebDriver driver = new FirefoxDriver();
 
		driver.get("https://demoqa.com/browser-windows");
 
		driver.manage().window().maximize();
		// get the parent window handle
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		Thread.sleep(500);
		JavascriptExecutor js = (JavascriptExecutor)driver;

		  // vertical down scroll (x and y coordinates)

		  js.executeScript("window.scrollBy(0 , 400)", "");
		WebElement tab = driver.findElement(By.cssSelector("#tabButton"));
		tab.click();
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		java.util.Iterator<String>  itr = allWindows.iterator();
		while(itr.hasNext()) {
			String childwindow = itr.next();
			if (!parentwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
			WebElement text = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
			String txt = text.getText();
			System.out.println(txt);
		}
			driver.switchTo().window(parentwindow);
		}






 
 
	}
 


}



