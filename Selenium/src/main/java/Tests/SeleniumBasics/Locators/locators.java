package Tests.SeleniumBasics.Locators;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
;

public class locators {
    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver/chromedriver");
        
        //Initialize the webdriver
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
      
        //Open the website
        driver.get("https://www.calculator.net/percent-calculator.html?cpar1=&cpar2=&cpar3=&ctype=1&x=85&y=5");

        //Maximize the webbrowser
        driver.manage().window().maximize();
      
        WebElement input1 = driver.findElement(By.id("cpar1"));
        WebElement input2 = driver.findElement(By.id("cpar2"));
        WebElement input3 = driver.findElement(By.id("cpar3"));
        
        //Locator by CLASS NAME
        String result = driver.findElement(By.className("h2result")).getText();
        
        //Locator by CSS Selector      
        WebElement loginBtn = driver.findElement(By.cssSelector("input[type=image]"));

        input1.sendKeys("80");
        input2.sendKeys("100");
        

    }
}
