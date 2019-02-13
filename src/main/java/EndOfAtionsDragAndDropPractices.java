import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class EndOfAtionsDragAndDropPractices {

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "/Users/sinanyavas/Documents/selenium_downloads/chromedriver");
            WebDriver driver = new ChromeDriver();

            driver.get("http://www.qaclickacademy.com/practice.php");
            driver.manage().window().maximize();

            // Number of Links at the Practice Page
            List<WebElement> LinkCount = driver.findElements(By.tagName("a"));
            System.out.println(LinkCount.size());

            // number of links at the footer section
            // In order to do that we have t limit the scope of the page from full page to footer.
            // footerDriver.findelements By (List<WebElement>)

            WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
            List<WebElement> SubLinkCount = footerDriver.findElements(By.tagName("a"));
            System.out.println(SubLinkCount.size());

            // number of the links attached to the first column in footer section

            WebElement firstColumnFooterDriver = driver.findElement(By.cssSelector("#gf-BIG > table > tbody > tr > td:nth-child(1)"));
            List<WebElement> LinkCountFirstColumnFooter= firstColumnFooterDriver.findElements(By.tagName("a"));
            System.out.println(LinkCountFirstColumnFooter.size());

            // click eack link and validate the subpages are loading

            for(int i=0; i<LinkCountFirstColumnFooter.size(); i++){
                String ClickonLink = Keys.chord(Keys.COMMAND, Keys.ENTER);
                LinkCountFirstColumnFooter.get(i).sendKeys(ClickonLink);
            }
            Thread.sleep(2000);

            Set<String> ids = driver.getWindowHandles();
            Iterator<String> it = ids.iterator();

            while (it.hasNext()){
                driver.switchTo().window(it.next());
                System.out.println(driver.getTitle());

            }

            Thread.sleep(5000);
            driver.quit();
        }
}
