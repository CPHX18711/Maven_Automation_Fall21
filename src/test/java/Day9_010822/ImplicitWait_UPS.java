package Day9_010822;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


import java.util.concurrent.TimeUnit;

public class ImplicitWait_UPS {
    public static void main(String[] args) {

//setup chrome driver
        WebDriverManager.chromedriver().setup();
        //declare and 
//declare and define your global implicit wait for all web elements
        WebDriver driver;
      // driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //navigate to usps
      //  driver.navigate().to("https://www.ups.com/us/en/Home.page");
        //Thread.sleep(2000);
        //click on Track
     //   driver.findElement(By.xpath("//*[text()='Tracking']")).click();
        //click on track a package
    //    driver.findElement(By.xpath("//*[text()='Track a Package']")).click();






    }//end of main
}//end of class
