import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class asssignment {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/sinanyavas/Documents/selenium_downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_ajax_ajaxcomplete");
        driver.manage().window().maximize();
        driver.switchTo().frame("iframeResult");
        WebDriverWait d=new WebDriverWait(driver, 20);
        d.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/button")));
        driver.findElement(By.xpath("/html/body/button")).click();

        System.out.println(driver.findElement(By.id("txt")).getText());
        driver.close();

    }
}
