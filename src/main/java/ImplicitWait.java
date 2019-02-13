import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/sinanyavas/Documents/selenium_downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.tatilsepeti.com/");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("bolge")).click();
        driver.findElement(By.id("bolge")).sendKeys("Kaş, Antalya");

        //d.until(ExpectedConditions.elementToBeClickable(By.id("bolge")));
        driver.findElement(By.id("bolge")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#giris-tarihi")).click();

        //d.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-datepicker-div > div.ui-datepicker-group.ui-datepicker-group-last > div > a")));
        driver.findElement(By.cssSelector("#ui-datepicker-div > div.ui-datepicker-group.ui-datepicker-group-last > div > a")).click();
        driver.findElement(By.cssSelector("#ui-datepicker-div > div.ui-datepicker-group.ui-datepicker-group-last > div > a")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[1]/a")).click();

        Thread.sleep(1000);

        //d.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[1]/td[1]/a")));
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[1]/td[1]/a")).click();

        //d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='adultCount_1']")));

        for(int i = 1; i<4; i++){

            driver.findElement(By.className("ts-plus")).click();
        }

        System.out.println(driver.findElement(By.className("ts-plus")));

        //d.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#searchBtn")));
        driver.findElement(By.cssSelector("#searchBtn")).click();


        //d.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"HotelList\"]/article[1]/div/div[1]/a[1]")));
        driver.findElement(By.xpath("//*[@id=\"HotelList\"]/article[1]/div/div[1]/a[1]")).click();

        driver.quit();
    }
}
