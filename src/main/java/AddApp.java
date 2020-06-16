import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalbande\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.get("https://apps.example.com/apps");
        driver.get("https://apps.example.com/apps");
        System.out.println("App Inventory Opened");
        driver.findElement(By.id("username")).sendKeys("22@g.com");
        driver.findElement(By.id("password")).sendKeys("123");
        driver.findElement(By.id("kc-login")).click();
        WebElement btnplus=driver.findElement(By.xpath("//*[@class='circle-button']"));
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(btnplus)).click();
        //driver.findElement(By.xpath("//*[@class='profile-photo-placeholder__button d-flex justify-content-center align-items-center']")).click();
        driver.close();
        driver.quit();


    }
}
