package Practisesection;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Todo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\Browserdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions cop = new ChromeOptions();
		cop.setBinary("C:\\Users\\DELL\\Downloads\\Browserdrivers\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(cop);
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		WebElement toDoList = driver.findElement(By.xpath("//h1[contains(text(),'TO DO LIST')]"));
		toDoList.click();
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		WebElement removePracticeMagic = driver.findElement(By.xpath("//li[contains(text(),' Practice magic')]/span"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(removePracticeMagic).click().perform();

		WebElement removeBuyNewRobes = driver.findElement(By.xpath("//li[contains(text(),' Buy new robes')]/span"));
		Actions action2 = new Actions(driver);
		action2.moveToElement(removeBuyNewRobes).click().perform();

		WebElement removePotionClass = driver.findElement(By.xpath("//li[contains(text(),' Go to potion class')]/span"));
		Actions action3 = new Actions(driver);
		action3.moveToElement(removePotionClass).click().perform();

		WebElement addNewTodo = driver.findElement(By.xpath("//input[@placeholder='Add new todo']"));
		addNewTodo.sendKeys("Manipal Training");
		addNewTodo.sendKeys(Keys.ENTER);
		addNewTodo.sendKeys("Axis Training");
		addNewTodo.sendKeys(Keys.ENTER);
		// TODO Auto-generated method stub

	}

}
