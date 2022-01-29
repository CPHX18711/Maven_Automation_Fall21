package ActionItems;

import Day9_010822.Reusable_Actions;
import Reusable_Library.Reusable_Actions_Loggers;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class AI_6 {

    WebDriver driver;

    @BeforeSuite
    public void setDriver() {
        driver = Reusable_Actions.setDriver();
    }// end of before suite

    @Test
    public void GoogleSearchDataDriven() throws IOException, BiffException, WriteException {
        //Step 1: read the data from the excel sheet you created
        Workbook readableFile = Workbook.getWorkbook(new File("E"));
        //Step 2: locating the worksheet that you created for the workbook
        Sheet readableSheet = readableFile.getSheet(0);
        //will return the physical rows present on the sheet
        int rowCount = readableSheet.getRows();
        System.out.println("My readable row count is" + rowCount);

        //Step 3: create a writable file to mimic readable but you can also write back the results to this file
        WritableWorkbook writableFile = Workbook.createWorkbook(new File(""), readableFile);
        WritableSheet writableSheet = writableFile.getSheet(0);
        //will return the physical rows present on the sheet
        int rowCount2 = writableSheet.getRows();
        System.out.println("My writable row count is " + rowCount2);

        //generate the for/while loop
        int i = 1;
        while (i < rowCount2) {

            //accessing the values from the column and rows insterting as a variable on your code
            String countries = writableSheet.getCell(0, i).getContents();

            System.out.println("My values are " + countries);


            //increment
            i = i + 1;
        }//end of loop


        //store the countries list as a variable
        String countries = writableSheet.getCell(0, i).getContents();
        System.out.println("My values are " + countries);

        //navigate to google
        driver.navigate().to("https://www.google.com");
        //enter countries on my google search field
        Reusable_Actions.sendKeysMethod(driver, "//*[@name='q']", countries, "Search Field");
        //submit to google search button
        Reusable_Actions.submitMethod(driver, "//*[@name='btnK']", "Google Search Button");

        //capture the result
        String results = Reusable_Actions.getTextMethod(driver, "//*[@id='result-stats']", "Search Rsult");
        String[] arrayResults = results.split(" ");

        //Step 5: storing the values to the writable excel sheet
        Label label = new Label(1, i, arrayResults[1]);
        //I need to write back to the writable sheet
        writableSheet.addCell(label);

        //increment
        i = i + 1;
    }//end of loop

//Step 6: writing back to the writable file to see
    // writableFile.write();
    //  writableFile.close();

    @AfterSuite
    public void closeDriver() {
        driver.quit();
    }

    //your extentreport and extenttest command should be declared outside so it can be reusable among all annotations
    ExtentReports reports;
    ExtentTest logger;

    @BeforeSuite
    public void SetTheDriver() {
        driver = Reusable_Actions.setDriver();
        //set the path of the report once
        reports = new ExtentReports("src/main/java/HTML_Report/Automation_Report.html", true);
    }//end of precondition

    @Test()
    public void uspsTest() {
        logger = reports.startTest("Track a package on USPS");
        //navigate to usps
        logger.log(LogStatus.INFO, "Navigate express home page");
        driver.navigate().to("https://www.express.com");
        //hover to the quick tool tab
        Reusable_Actions_Loggers.mouseHover(driver, "//*[text()='Quick Tools']", logger, "Quck tools");
        //click on track a package
        Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Track a Package']", logger, "Track a Packgage");
        //enter your tracking number
        Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@id='tracking-input']", "1111111111", logger, "Track Field");
        //click on track button
        Reusable_Actions_Loggers.clickMethod(driver, "//*[@class='button tracking-btn']", logger, "Track Button");

        //end the logger
        reports.endTest(logger);
    }//end of test

    @AfterSuite
    public void endTest() {
        driver.quit();
        //write/log the informations back to the html report
        reports.flush();
    }//end of after suite


}//end of class
