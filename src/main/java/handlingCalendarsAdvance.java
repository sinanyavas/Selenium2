import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class handlingCalendarsAdvance {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/sinanyavas/Documents/selenium_downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hemenbilet.com/");
        driver.manage().window().maximize();
        //April 14

        driver.findElement(By.id("gidisTarih")).click();

        while (!driver.findElement(By.cssSelector("#ui-datepicker-div > div.ui-datepicker-group.ui-datepicker-group-first > div > div > span.ui-datepicker-month")).getText().contains("Ekim")){

            driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a")).click();
        }

        List<WebElement> monthList = driver.findElements(By.xpath("//td[@data-handler=\"selectDay\"]"));
        int pass = driver.findElements(By.xpath("//td[@data-handler=\"selectDay\"]")).size();

        for (int n = 0; n < pass; n++) {
            String hele = driver.findElements(By.xpath("//td[@data-handler=\"selectDay\"]")).get(n).getText();
            if (hele.equalsIgnoreCase("11")) {
                driver.findElements(By.xpath("//td[@data-handler=\"selectDay\"]")).get(n).click();
                break;
            }



//        List<WebElement> datesList=driver.findElements(By.className("ui-state-default"));
//        int count = driver.findElements(By.className("ui-state-default")).size();
//        System.out.println(count);
//
//        for(int i=0; i<count; i++)
//        {
//            String text = driver.findElements(By.className("ui-state-default")).get(i).getText();
//            if(text.equalsIgnoreCase(""))
//            {
//                driver.findElements(By.className("ui-state-default")).get(i).click();
//
//                break;
//            }
//
//        }



        }

        Thread.sleep(2000);
        driver.quit();
    }

}
