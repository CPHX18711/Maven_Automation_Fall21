package Day7_12252021;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class mortgage_calc_select_command {

    public static void main(String[] args) throws InterruptedException {


//webdriver manager to open by driver
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        //start maximized
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //options.addArguments("headless");
        //set the driver
        WebDriver driver = new ChromeDriver(options);

        //navigate to mortgage calc
        driver.navigate().to("https://www.mortgagecalculator.org");
        //driver.manage().window().fullscreen();
        Thread.sleep(2500);

        //scroll to the window of loan view
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        //scroll to the view by pixels
        jse.executeScript("scroll(0,450)");

        //clear and type your new home value
        WebElement homeVal = driver.findElement(By.xpath("//*[contains(@name,'homevalue')]"));
        homeVal.clear(); //clear any pre set values on the home value field

        //if the dropdown tag is not under select then I need to click on the drop down and click on the value
        //startMonth.click();
        //click on the value
        //driver.findElement(By.xpath("//*[text()='Nov']")).click();







    }//end of main


}//end of class
