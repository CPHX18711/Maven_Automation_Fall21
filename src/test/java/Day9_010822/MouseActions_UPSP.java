package Day9_010822;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseActions_UPSP {

    public static void main(String[] args) throws InterruptedException {

        //setup chrome driver
        WebDriverManager.chromedriver().setup();
        //declare and define the chrome options
        ChromeOptions options = new ChromeOptions();
        //declare all the arguments you need
        //to maximize my driver
        options.addArguments("start-maximized");
        //set as incognito mode
        options.addArguments("incognito");
        //set as headless(running the driver on background)
        //options.addArguments("headless");
        //define the web driver you are using
        WebDriver driver = new ChromeDriver(options);

        //navigate to usps
        driver.navigate().to("https://www.usps.com");
        Thread.sleep(2000);

        //declare mouse actions
        Actions mouseAction = new Actions(driver);

        //hover over Send tab open up the drop down list
        try{
            WebElement sendTab = driver.findElement(By.xpath("//*[text()='Send']"));
        } catch (Exception e) {
            System.out.println("Unable to hover to Send tab" + e);
        }
//click on Look up ZIP Code from the dropdown
        try{
            WebElement zipCodeLookup = driver.findElement(By.xpath("//*[text()='Look Up a ZIP Code']"));
            mouseAction.moveToElement(zipCodeLookup).click().perform();
        } catch (Exception e) {
            System.out.println("Unable to hover to Send tab" + e);
        }

        //verify the welcome page title appears as expected
        String actualTitle = driver.getTitle();
        //by using if else to compare expected with actual title
        if(actualTitle.equals("Welcome | USPS")){
            System.out.println("Title matches " + actualTitle);
        } else {
            System.out.println("Title doesn't match. Actual title is " + actualTitle);
        }





    }//end of main




}//end of class
