package testRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\JavaClass\\OrangeHRM_cucumber\\src\\main\\java\\features\\OrangrHRM.feature"
,glue="stepDefinition",dryRun=true)



public class Runner {
public static WebDriver driver;
@BeforeClass
public static void start() {
	System.setProperty("wedriver.chrome.driver", "D:\\JavaClass\\CucumberConcepts\\featureFiles\\chromedriver.exe");
	driver=new ChromeDriver();
	
}
@AfterClass
public static void tearDown() {
	
}
}
