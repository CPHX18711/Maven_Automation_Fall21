package ActionItems;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class AI_4 {

    public static void main(String[] args) throws InterruptedException {

    String[] zipcode = new String[3];
    zipcode[0] = "11221";
    zipcode[1] = "08520";
    zipcode[2] = "10466";

    //path to driver
        WebDriverManager.chromedriver().setup();
        //chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        WebDriver driver = new ChromeDriver(options);

        //navigate to weightwatchers workshop finder site
        driver.navigate().to("http://www.weightwatchers.com/us/find-a-workshop");
        //wait statement
        Thread.sleep(3000);
        try {
            //click studio link
            driver.findElement(By.xpath("//*[class-studio-2TdMR']")).click();
            //add location
            driver.findElement(By.xpath("//*[id=location-search']")).sendKeys(zipcode);

            WebElement searchField = driver.findElement(By.xpath("//*[@name-'p']"));
            searchField.sendKeys();
            searchField.submit();
            Thread.sleep(3000);
        }catch (Exception e){
        }//end of try catch


    }//end of main
}//end of class
