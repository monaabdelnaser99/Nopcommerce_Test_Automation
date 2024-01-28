package Test;

import Helper.Helper;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

//Runs each cucumber scenario found in the features as separated test(AbstractTestNG..)

public class TestBase extends AbstractTestNGCucumberTests {

    public static WebDriver driver;

    @BeforeSuite
    public void startDriver(){
       // driver=new EdgeDriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS) ;


    }
    @AfterSuite
    public void stopDriver() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    //take screenshot when test fail and add it in the screenshot folder
    @AfterMethod
    public void screenshotOnFailure(ITestResult result){
        if (result.getStatus()== ITestResult.FAILURE){
            System.out.println("Fail");
            System.out.println("Taking screenshot   ");
            Helper.captureScreenshot(driver, result.getName());

        }

    }
}
