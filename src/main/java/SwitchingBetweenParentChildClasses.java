import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SwitchingBetweenParentChildClasses {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/sinanyavas/Documents/selenium_downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.findElement(By.cssSelector("body > nav > div > a.gmail-nav__nav-link.gmail-nav__nav-link__sign-in")).click();

        driver.findElement(By.xpath("//*[@id=\"initialView\"]/footer/ul/li[1]/a")).click();
        System.out.println(driver.getTitle());

        Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentid = it.next();
        String childid = it.next();
        driver.switchTo().window(childid);
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        driver.switchTo().window(parentid);
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        driver.quit();
    }

}
