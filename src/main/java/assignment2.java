import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class assignment2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/sinanyavas/Documents/selenium_downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.qaclickacademy.com/practice.php");
        driver.manage().window().maximize();
        Thread.sleep(5000);


        WebElement optionDriver = driver.findElement(By.cssSelector("#checkbox-example > fieldset"));
        List<WebElement> inputCount = optionDriver.findElements(By.tagName("input"));
        System.out.println(inputCount.size());

        System.out.println(driver.findElement(By.cssSelector("#checkbox-example > fieldset")).getText());

        String n = driver.findElement(By.cssSelector("#checkbox-example > fieldset")).getText();

        for(int i = 0; i<inputCount.size(); i++){
            if(n == "Option2"){
                inputCount.get(i).click();
                Thread.sleep(3000);
                System.out.println(i);
            }
        }

        Thread.sleep(3000);



//        driver.findElement(By.id("checkBoxOption2")).click();
//
//        Thread.sleep(2000);
//
//        System.out.println(driver.findElement(By.cssSelector("#checkbox-example > fieldset > label:nth-child(3)")).getText());
//        Thread.sleep(2000);
//
//        Select s=new Select(driver.findElement(By.id("dropdown-class-example")));
//        s.selectByVisibleText("Option2");
//        Thread.sleep(5000);

        driver.close();


    }
}
