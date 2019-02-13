import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTatilbudur {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/sinanyavas/Documents/selenium_downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tatilbudur.com/");
        driver.manage().window().maximize();

        WebDriverWait d=new WebDriverWait(driver, 20);

        driver.findElement(By.xpath("//*[@id=\"key\"]")).sendKeys("Kaş");
        driver.findElement(By.xpath("//*[@id=\"key\"]")).sendKeys(Keys.ENTER);

        Thread.sleep(5000);
        driver.findElement(By.id("hotelSearchCheckIn")).click();

        Thread.sleep(5000);

        driver.findElement(By.xpath("/html/body/div[9]/div[1]/table/thead/tr[2]/th[3]")).click();
        driver.findElement(By.xpath("/html/body/div[9]/div[1]/table/thead/tr[2]/th[3]")).click();
        driver.findElement(By.xpath("/html/body/div[9]/div[1]/table/thead/tr[2]/th[3]")).click();

        driver.findElement(By.xpath("/html/body/div[9]/div[1]/table/tbody/tr[5]/td[6]")).click();
        driver.findElement(By.xpath("/html/body/div[9]/div[1]/table/tbody/tr[6]/td[5]")).click();

        driver.findElement(By.xpath("//*[@id=\"searchFormHotel\"]/div/div/div/div[3]/div/div[2]/div/div[1]")).click();

        Select s=new Select(driver.findElement(By.xpath("//*[@id=\"searchFormHotel\"]/div/div/div/div[3]/div/div[2]/div/div[2]/div[2]/div[1]/select")));
        s.selectByValue("4");

        driver.findElement(By.xpath("//*[@id=\"searchFormHotelSubmitBtn\"]")).click();

        d.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"hotelListArea\"]/section[1]/div[1]/div[2]/div[1]/h2/a")));
        driver.findElement(By.xpath("//*[@id=\"hotelListArea\"]/section[1]/div[1]/div[2]/div[1]/h2/a")).click();

        Thread.sleep(5000);

        driver.quit();

    }
}
