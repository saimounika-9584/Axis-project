package Practisesection;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Autotextcompletion {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\Browserdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    
	    WebDriver driver = new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;
	    driver.get("https://webdriveruniversity.com/");
	    driver.manage().window().maximize();

        Thread.sleep(2000);
        WebElement autoCompleteTextField = driver.findElement(By.xpath("//h1[contains(text(),'AUTOCOMPLETE TEXTFIELD')]"));
        autoCompleteTextField.click();

        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        String FoodItem = "Cookies";

        WebElement enterFoodItem = driver.findElement(By.xpath("//input[@name='food-item']"));
        enterFoodItem.sendKeys(FoodItem.substring(0,3));

        List<WebElement> dropDownOptions = driver.findElements(By.xpath("//input[@type='hidden']/parent::div"));
        if(dropDownOptions.size()==0){
            System.out.println("Food Item Not Found");
        }

        else{
            for (WebElement dropDownOption : dropDownOptions) {
                if (dropDownOption.getText().equalsIgnoreCase(FoodItem) || dropDownOption.getText().contains(FoodItem)) {
                    dropDownOption.click();
                    break;
                }
            }
        }

        WebElement submitButton = driver.findElement(By.xpath("//input[@id='submit-button']"));
        submitButton.click();

    }


}
