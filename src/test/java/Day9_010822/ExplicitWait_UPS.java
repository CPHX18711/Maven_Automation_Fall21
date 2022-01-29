package Day9_010822;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ExplicitWait_UPS {


    public static void main(String[] args) {

        //declaring explicit wait
        //WebDriverWait wait = new WebDriverWait(driver,15);

        //click on Track
        try {
   //         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Tracking']"))).click();
        } catch (Exception e) {
            System.out.println("Unable to click on Track " + e);
        }

        //click on track a package
        try {
            //click on Track
         //   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Track a Package']"))).click();
        } catch (Exception e) {
            System.out.println("Unable to click on Track a Package " + e);
        }





    }//end of main
}//end of claSS
