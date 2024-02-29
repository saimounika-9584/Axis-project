package Practisesection;
public class BaseTest extends BaseTest {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/superaxis/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://webdriveruniversity.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement scrollingAround = driver.findElement(By.xpath("//h1[contains(text(),'POPUP & ALERTS')]"));
        scrollingAround.click();

        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        String url = driver.getCurrentUrl();

        WebElement javaScriptAlert = driver.findElement(By.xpath("//span[@id='button1']"));
        javaScriptAlert.click();



        Thread.sleep(3000);

        Alert alert1 = driver.switchTo().alert();
        alert1.dismiss();

        WebElement modalPopup = driver.findElement(By.xpath("//span[@id='button2']"));
        modalPopup.click();

        Thread.sleep(3000);

        WebElement popUpClose= driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        popUpClose.click();

        WebElement ajaxLoader = driver.findElement(By.xpath("//span[@id='button3']"));
        ajaxLoader.click();

        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'CLICK ME!')]"))).click();

        Thread.sleep(3000);

        driver.navigate().to(url);

        WebElement javascriptConfirmBox = driver.findElement(By.xpath("//span[@id='button4']"));
        javascriptConfirmBox.click();

        Thread.sleep(3000);
        
        alert1.accept();