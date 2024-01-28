package Runner;

import Test.TestBase;
import io.cucumber.testng.CucumberOptions;
import org.example.PageBase;
import org.openqa.selenium.WebDriver;
@CucumberOptions(features = "src/test/java/Features"
        ,glue = {"steps"}
        ,plugin ={"pretty","html:target/cucumber-html-report"})
public class Runner extends TestBase {

}
