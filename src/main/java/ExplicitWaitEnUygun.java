import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ExplicitWaitEnUygun
{
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "/Users/sinanyavas/Documents/selenium_downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.enuygun.com/ucak-bileti/");

        WebDriverWait d = new WebDriverWait(driver, 20);

        driver.findElement(By.cssSelector("#oneway-input")).click();

        driver.findElement(By.id("from-input")).sendKeys("IST");
        Thread.sleep(2000);
        driver.findElement(By.id("from-input")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("to-input")).sendKeys("ESB");
        Thread.sleep(1000);
        driver.findElement(By.id("to-input")).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("//*[@id=\"departure-date-input\"]")).click();

        d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-datepicker-div\"]")));

        driver.findElement(By.cssSelector("#ui-datepicker-div > div.ui-datepicker-group.ui-datepicker-group-last > div > a")).click();
        driver.findElement(By.cssSelector("#ui-datepicker-div > div.ui-datepicker-group.ui-datepicker-group-last > div > a")).click();

        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[1]/td[7]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[1]/td[1]/a")).click();

        driver.findElement(By.cssSelector("#flight-direct")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("#flight-direct")).isSelected());

        driver.findElement(By.id("select-passenger-btn")).click();
        for(int i = 1; i<5; i++)
        {
            driver.findElement(By.xpath("//*[@id=\"passenger-selector-dropdown\"]/div[1]/div[2]/button[2]")).click();
        }

        driver.findElement(By.xpath("//*[@id=\"flight-search-form\"]/div[4]/div[2]/button")).click();

        d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"SearchRoot\"]/div/div[2]/div[2]/div/div[2]/div[1]/div/div[2]/div[1]/div")));
        driver.findElement(By.xpath("//*[@id=\"SearchRoot\"]/div/div[2]/div[2]/div/div[2]/div[1]/div/div[2]/div[1]/div")).click();

        driver.close();
    }

}
