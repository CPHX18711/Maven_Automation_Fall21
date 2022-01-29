package ActionItems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AI_3 {


    public static void main(String[] args) throws InterruptedException {

        //set an array
        String[] country = new String[6];
        country[0] = "United States";
        country[1] = "China";
        country[2] = "Japan";
        country[3] = "Germany";
        country[4] = "India";
        country[5] = "France";

        //define webdriver
        //set the property of the chromedriver
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        //define the web driver you are using
        WebDriver driver = new ChromeDriver();

        for (int i = 0; i < country.length; i++){
            // open the bing website
            driver.navigate().to("https://www.bing.com");

            //maximize my browser
            driver.manage().window().maximize();

            //anytime when you go to a new page you should put some wait statement
            Thread.sleep(2000);

            //searching for country on bing search field
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(country[i]);

            //hit submit on bing search button
            driver.findElement(By.xpath("//*[@class='b_respl b_sbText']")).submit();

            // wait statement
            Thread.sleep(3000);

            //capture the search result and store it as a variable
            String result = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();
            //declaring the array variable to split the result
            String[] arrayResult = result.split(" ");
            //now print the search number only
            System.out.println("My search number for country " + country[i] + " is " + arrayResult[1]);



        }//end of for loop
        //define outside of loop
        driver.quit();




    }//end of main method
}//end of java class
