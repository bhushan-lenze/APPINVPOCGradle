package demo;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class SampleTest {
    public WebDriver driver;
    @Test
    void testwebpage() {
        String directoryPath = System.getProperty("user.dir");
        String chromedriverpath=directoryPath + "\\src\\test\\java\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromedriverpath);
        //AWS deployed url execution
        String url="https://store.mosaiq.one/";
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        String currenturl=driver.getCurrentUrl();
        System.out.println(currenturl);
        //AWS deployed url execution

        //Locally available url execution
        /*String url="http://apps.mosaiq.one";
        driver.get(url);
        driver.manage().window().maximize();
        String currenturl=driver.getCurrentUrl();
        System.out.println(currenturl);
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        System.out.println("App Inventory Opened");
        driver.findElement(By.id("username")).sendKeys("u@g.com");
        driver.findElement(By.id("password")).sendKeys("123");
        driver.findElement(By.id("kc-login")).click();
        WebElement btnplus=driver.findElement(By.xpath("//*[@class='circle-button']"));
        wait.until(ExpectedConditions.elementToBeClickable(btnplus)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Name']")));
        driver.findElement(By.name("name")).sendKeys("Application");
        System.out.println("Create app page opened");*/
        //Locally available url execution

        driver.close();
        driver.quit();
    }
}
